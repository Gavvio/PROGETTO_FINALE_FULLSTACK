import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { AuthService } from 'src/app/auth/auth.service';
import { ArticoloPayload } from 'src/app/utils/interfacce';
import { FavouritesService } from './favourites.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-favourites',
  templateUrl: './favourites.component.html',
  styleUrls: ['./favourites.component.scss']
})
export class FavouritesComponent implements OnInit{

preferiti:ArticoloPayload[]=[];
blocco:boolean=true;

constructor(private http:HttpClient,private as: AuthService,private fs:FavouritesService,private router:Router){

}

ngOnInit(): void {
   this.getPreferiti();
}

public controllo(c:ArticoloPayload){
  this.blocco=false;
  console.log("ok");
  let controllo:boolean=false;
this.getPreferiti();
for(let i=0;i<this.preferiti.length;i++){
  if(c.id==this.preferiti[i].id){
    controllo=true;
  }
}
console.log(controllo);
if(controllo==true){
  this.rimuoviPreferiti(c);
}else{
  this.aggiungiPreferiti(c);
}
}

public aggiungiPreferiti(c:ArticoloPayload){
  this.fs.aggiungiArticoloPreferiti(c.id);
}

public rimuoviPreferiti(c:ArticoloPayload){
  this.fs.rimuoviArticoloPreferiti(c.id).subscribe(
    data=>{
      console.log(data);
      console.log("articolo rimosso correttamente")
      this.getPreferiti();
    }, error=>{
      console.log("errore nel login",error);
    }
  );
}

public coloreCuore(id:number){
  let check:boolean=false;
  this.preferiti.forEach(elem=>{
    if(elem.id==id)
    check=true;
  })
  return check;
}


getPreferiti(){
  this.fs.getPreferiti().subscribe(
    data=>{
      console.log(data);
      this.preferiti=data;
      console.log(this.fs.preferiti);
    }, error=>{
      console.log("errore nel login",error);
    }
  );
}

public dettaglio(id:number){
  if(this.blocco==true){
    this.router.navigate([`/articolo/${id}`]);
  }
  this.blocco=true;
}
}
