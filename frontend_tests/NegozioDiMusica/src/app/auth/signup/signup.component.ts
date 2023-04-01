import { Component } from '@angular/core';
import { NgForm } from '@angular/forms';
import { AuthService } from '../auth.service';
import { HttpClient } from '@angular/common/http';
import { Router } from '@angular/router';

@Component({
  selector: 'app-signup',
  templateUrl: './signup.component.html',
  styleUrls: ['./signup.component.scss']
})
export class SignupComponent {
  constructor(private as: AuthService, private http:HttpClient,private r : Router){}

  onSubmit(f: NgForm) {
    let controllo=true;
    if(f.value.name=="" || f.value.surname=="" || f.value.email==""|| f.value.password==""){
      controllo=false;
      console.log("inserisci dati")
    }
    console.log(f.value);

    if(controllo==true){
      console.log("dati corretti")
      this.as.signup(f.value).subscribe((data)=>{

      })
      this.r.navigate(["/auth/login"])
    }

  }
}
