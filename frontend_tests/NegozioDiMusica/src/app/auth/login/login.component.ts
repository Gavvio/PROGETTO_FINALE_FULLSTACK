import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { AuthService } from '../auth.service';
import { Router } from '@angular/router';
import { User } from 'src/app/utils/interfacce';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.scss']
})
export class LoginComponent implements OnInit{
  occhio:boolean=false;
  inputType:string="password"
  password!:HTMLInputElement;
  constructor(private as:AuthService, private router:Router){
  }
ngOnInit(): void {
this.password=<HTMLInputElement>document.querySelector("#passwordInput");
}

  onSubmit(f: NgForm) {

    this.as.signin(f.value).subscribe(data=>{
      console.log("accesso eseguito",data);
      const user={} as User;
      user.name=data.name;
      user.accessToken=data.accessToken;
      let date=new Date();
      date.setHours(date.getHours()+1);
      localStorage.setItem('user',JSON.stringify(user));
     localStorage.setItem('date',date.toString())
      console.log(user);
      this.as.token=data.accessToken;
      this.as.isLoggedIn=true;
      this.as.autoLogoutTimer=date;
      this.tornaHome();
    }, error=>{
      console.log("errore nel login",error);
    })


  }



  tornaHome(){
    this.router.navigate(["/"]).then(()=>{
      window.location.reload();
    }
    )
  }

  occhioCambia(){

    if(this.occhio){
      this.occhio=false
      console.log(this.password)
      this.password.type="password"
    }else{
      this.occhio=true
      console.log(this.password)
      this.password.type="text"
    }
  }
}
