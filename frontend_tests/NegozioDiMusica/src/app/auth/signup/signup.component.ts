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
    const expression: RegExp =/^(?=.{1,254}$)(?=.{1,64}@)[-!#$%&'*+/0-9=?A-Z^_`a-z{|}~]+(\.[-!#$%&'*+/0-9=?A-Z^_`a-z{|}~]+)*@[A-Za-z0-9]([A-Za-z0-9-]{0,61}[A-Za-z0-9])?(\.[A-Za-z0-9]([A-Za-z0-9-]{0,61}[A-Za-z0-9])?)*$/;
    const result: boolean = expression.test(f.value.email);
    if(result){
     console.log("email valida")
    }else{
      console.log("email non valida");
      controllo=false;
    }

    console.log(f.value);

    if(controllo==true){
      console.log("dati corretti")
      this.as.signup(f.value).subscribe( data=>{
        console.log(data);
        console.log("register eseguito correttamente")
      }, error=>{
        console.log("errore nel register",error);
      })
      this.r.navigate(["/auth/login"])
    }

  }
}
