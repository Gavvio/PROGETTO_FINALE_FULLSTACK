import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { AuthService } from '../auth/auth.service';
import { ArticlesService } from '../components/articles/articles.service';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.scss']
})
export class HomeComponent implements OnInit{

  constructor(private http:HttpClient,private as: AuthService,private ars:ArticlesService){

  }
  ngOnInit(){
    console.log(this.as.isLoggedIn);
    console.log(this.as.nomeUtente);
    console.log(this.as.autoLogoutTimer);
    console.log(new Date());


  }


}
