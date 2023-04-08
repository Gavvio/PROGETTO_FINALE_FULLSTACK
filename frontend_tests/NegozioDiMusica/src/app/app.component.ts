import { Component, OnInit } from '@angular/core';
import { AuthService } from './auth/auth.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss']
})
export class AppComponent implements OnInit{
  title = 'NegozioDiMusica';
  constructor(private as:AuthService){

  }

  ngOnInit(): void {
    if(localStorage.getItem('user')){
      const user=JSON.parse(localStorage.getItem('user')!);
      this.as.token=user.accessToken;
      this.as.nomeUtente=user.name;
      this.as.autoLogoutTimer=new Date(localStorage.getItem('date')!);
      this.as.isLoggedIn=true;
      if(new Date(localStorage.getItem('date')!)<new Date()){
        this.as.logOut();
      }
    }
  }
}
