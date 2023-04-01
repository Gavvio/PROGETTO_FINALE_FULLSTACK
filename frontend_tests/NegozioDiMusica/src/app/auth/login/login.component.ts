import { Component } from '@angular/core';
import { NgForm } from '@angular/forms';
import { AuthService } from '../auth.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.scss']
})
export class LoginComponent {
  constructor(private as:AuthService){
  }
  onSubmit(f: NgForm) {
    console.log(f.value);

    this.as.signin(f.value).subscribe(data=>{
      console.log(data)
    })
  }
}
