import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-prima-scelta',
  templateUrl: './prima-scelta.component.html',
  styleUrls: ['./prima-scelta.component.scss']
})
export class PrimaSceltaComponent implements OnInit{
  path:string="";
constructor(private router:Router){}
ngOnInit(){
if(this.router.url=="/chitarre")
{
  this.path="chitarre"
}
if(this.router.url=="/bassi")
{
  this.path="bassi"
}
if(this.router.url=="/batterie")
{
  this.path="batterie"
}
if(this.router.url=="/tastiere")
{
  this.path="tastiere"
}
if(this.router.url=="/microfoni")
{
  this.path="microfoni"
}
if(this.router.url=="/luci")
{
  this.path="luci"
}
}
}
