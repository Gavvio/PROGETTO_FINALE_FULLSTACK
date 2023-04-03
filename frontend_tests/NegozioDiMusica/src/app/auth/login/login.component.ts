import { Component } from '@angular/core';
import { NgForm } from '@angular/forms';
import { AuthService } from '../auth.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.scss']
})
export class LoginComponent {
  constructor(private as:AuthService, private router:Router){
  }
  onSubmit(f: NgForm) {

    this.as.signin(f.value).subscribe(data=>{
      console.log("accesso eseguito",data);
      this.tornaHome();
    }, error=>{
      console.log("errore nel login",error);
    })


  }

  tornaHome(){
    this.router.navigate(["/"])
  }
}
