import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Router } from '@angular/router';
import { BehaviorSubject, catchError, map, throwError } from 'rxjs';
import { JwtHelperService } from '@auth0/angular-jwt';

/*
export interface SignupData {
  name: string,
  surname: string,
  email: string,
  password: string
}

export interface SigninData {
  email: string,
  password: string
}

export interface AuthResponse {
  accessToken: string,
  email: string
}
*/



@Injectable({
  providedIn: 'root'
})
export class AuthService {
  //url = "http://localhost:8080/api/auth/"
  url="https://gaviolapi.osc-fr1.scalingo.io/api/auth/"
  autoLogoutTimer: Date=new Date();
  isLoggedIn:boolean=false;
  token="";
  nomeUtente:string="";

  constructor(private http: HttpClient, private router: Router) { }

  signup(data: {}) {
    return this.http.post<any>(this.url + "signup", data)
  }

  signin(data: {}) {
    return this.http.post<any>(this.url + "signin", data)
  }

  logOut(){
    localStorage.removeItem('user')
    localStorage.removeItem('date')
    this.isLoggedIn=false;
    this.nomeUtente="";
    this.token="";
    console.log("utente sloggato correttamente")
    this.router.navigate(["/"]).then(()=>{
      window.location.reload();
    });
  }

}
