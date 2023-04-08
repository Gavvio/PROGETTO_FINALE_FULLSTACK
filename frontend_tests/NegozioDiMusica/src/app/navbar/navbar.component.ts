import { Component, OnInit } from '@angular/core';
import { AuthService } from '../auth/auth.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-navbar',
  templateUrl: './navbar.component.html',
  styleUrls: ['./navbar.component.scss']
})
export class NavbarComponent implements OnInit{

  name:string="";
  saluto:string="";
  loggato:boolean=false;
  constructor(private as:AuthService,private router:Router){}
  ngOnInit(){

    if(this.as.isLoggedIn){
      const date:Date=new Date();
     let ora=date.getHours();
      if(ora>=6 && ora<12){
        this.saluto="Buongiorno";
      }
      else if(ora>=12 && ora<17){
        this.saluto="Buon Pomeriggio";
      }
      else if(ora>=17 && ora<23){
        this.saluto="Buona Sera";
      }
      else{
        this.saluto="Buonanotte";
      }
      this.name=this.as.nomeUtente;
    }
    this.loggato=this.as.isLoggedIn;
  }
  public logout(){
    console.log("ao");
    this.as.logOut();
  }
}
