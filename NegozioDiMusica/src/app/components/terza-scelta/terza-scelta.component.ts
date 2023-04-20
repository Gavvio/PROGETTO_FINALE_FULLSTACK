import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-terza-scelta',
  templateUrl: './terza-scelta.component.html',
  styleUrls: ['./terza-scelta.component.scss']
})
export class TerzaSceltaComponent implements OnInit{
path:string="";
constructor(private router:Router){

}

ngOnInit(){

if(this.router.url=="/chitarre/corde/corde_elettrica"){
this.path="corde_chitarra_elettrica"
}
else if(this.router.url=="/chitarre/corde/corde_classica"){
  this.path="corde_chitarra_classica"
}
else if(this.router.url=="/chitarre/corde/corde_acustica"){
  this.path="corde_chitarra_acustica"
}
else if(this.router.url=="/bassi/corde/corde_basso_elettrico"){
  this.path="corde_basso_elettrico"
}

}
}
