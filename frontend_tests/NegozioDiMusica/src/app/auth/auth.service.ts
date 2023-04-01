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
}*/

export interface SigninData {
  email: string,
  password: string
}

export interface AuthResponse {
  accessToken: string,
  email: string
}



@Injectable({
  providedIn: 'root'
})
export class AuthService {
  /*
    authSubj = new BehaviorSubject<null|AuthResponse>(null)
    authObs = this.authSubj.asObservable()
      isLoggedIn$ = this.authObs.pipe(map(user => !!user));
    loggedObs = this.authObs.pipe(map((res)=>{
      if(res) {return true}
      return false
    }))
    jwtHelper = new JwtHelperService
  */
  url = "http://localhost:8080/api/auth/"
  autoLogoutTimer: any;

  constructor(private http: HttpClient, private router: Router) { }

  signup(data: {}) {
    console.log(data)
    console.log(this.url)
    return this.http.post<any>(this.url + "signup", data)
  }

  signin(data: {}) {
    console.log(data)
    return this.http.post<any>(this.url + "signin", data)
  }




}
