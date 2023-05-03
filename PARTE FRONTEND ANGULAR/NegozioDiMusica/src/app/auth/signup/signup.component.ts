import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { NgModel,FormGroup, FormControl,Validators,FormBuilder} from '@angular/forms';
import { AuthService } from '../auth.service';
import { HttpClient } from '@angular/common/http';
import { Router } from '@angular/router';

@Component({
  selector: 'app-signup',
  templateUrl: './signup.component.html',
  styleUrls: ['./signup.component.scss']
})
export class SignupComponent implements OnInit{
  occhio:boolean=false;
  inputType:string="password"
  password!:HTMLInputElement;
  requiredForm!:FormGroup;
  constructor(private as: AuthService, private http:HttpClient,private r : Router,private fb:FormBuilder){
    this.mioForm()
  }

  mioForm(){
    this.requiredForm=this.fb.group({
      name:['', Validators.required],
      surname:['', Validators.required],
      email:['',[Validators.required,Validators.email]],
      password:['', Validators.required],
    })
  }

ngOnInit(): void {
  this.password=<HTMLInputElement>document.querySelector("#passwordInputRegister");
}

  // onSubmit(f: NgForm) {
  //   let controllo=true;
  //   if(f.value.name=="" || f.value.surname=="" || f.value.email==""|| f.value.password==""){
  //     controllo=false;
  //     console.log("inserisci dati")
  //   }
  //   const expression: RegExp =/^(?=.{1,254}$)(?=.{1,64}@)[-!#$%&'*+/0-9=?A-Z^_`a-z{|}~]+(\.[-!#$%&'*+/0-9=?A-Z^_`a-z{|}~]+)*@[A-Za-z0-9]([A-Za-z0-9-]{0,61}[A-Za-z0-9])?(\.[A-Za-z0-9]([A-Za-z0-9-]{0,61}[A-Za-z0-9])?)*$/;
  //   const result: boolean = expression.test(f.value.email);
  //   if(result){
  //    console.log("email valida")
  //   }else{
  //     console.log("email non valida");
  //     controllo=false;
  //   }

  //   console.log(f.value);

  //   if(controllo==true){
  //     console.log("dati corretti")
  //     this.as.signup(f.value).subscribe( data=>{
  //       console.log(data);
  //       console.log("register eseguito correttamente")
  //     }, error=>{
  //       //console.log("errore nel register",error);
  //     })
  //     this.r.navigate(["/auth/login"])
  //   }

  // }

  onSubmit() {
    console.log(this.requiredForm.value);


      console.log("dati corretti")
      this.as.signup(this.requiredForm.value).subscribe( data=>{
        console.log(data);
        console.log("register eseguito correttamente")
      }, error=>{

      })
      this.r.navigate(["/auth/login"])


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
