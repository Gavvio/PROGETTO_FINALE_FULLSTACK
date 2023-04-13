import { Component, OnInit } from '@angular/core';
import { ArticoloPayload } from 'src/app/utils/interfacce';
import { CartService } from './cart.service';
import { Router } from '@angular/router';
import { SharedService } from 'src/app/navbar/shared.service';

@Component({
  selector: 'app-cart',
  templateUrl: './cart.component.html',
  styleUrls: ['./cart.component.scss']
})
export class CartComponent implements OnInit{
  carrello:ArticoloPayload[]=[]
  blocco:boolean=true;
  saldo:number=0;
  constructor(private cs:CartService,private router:Router,private ss:SharedService){}

  ngOnInit(): void {
    this.getCarrello();
  }

  public eliminaCarrello(id:number){
    this.blocco=false;
    this.cs.rimuoviArticoloCarrello(id).subscribe(data=>{
      this.getCarrello();
      this.ss.sendChiamata();
    });
  }

  public dettaglio(id:number){
    if(this.blocco==true){
      this.router.navigate([`/articolo/${id}`]);
    }
    this.blocco=true;
  }

  public getCarrello(){
    this.cs.getCarrello().subscribe(data=>{
      this.carrello=data
      this.saldo=0;
      data.forEach(elem=>{
        this.saldo+=elem.prezzo;
      })
     })
  }

  public acquisto(){
    this.carrello.forEach(elem=>{
      this.eliminaCarrello(elem.id);
    });
    this.router.navigate(["/"]);
  }


}
