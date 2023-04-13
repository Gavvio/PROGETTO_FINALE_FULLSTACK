import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { AuthService } from 'src/app/auth/auth.service';
import { ChitarraElettrica, ArticoloPayload, ChitarraClassica } from 'src/app/utils/interfacce';
import { ArticlesService } from './articles.service';
import { FavouritesService } from '../favourites/favourites.service';
import { CartService } from '../cart/cart.service';
import { NavbarComponent } from 'src/app/navbar/navbar.component';
import { SharedService } from 'src/app/navbar/shared.service';

@Component({
  selector: 'app-articles',
  templateUrl: './articles.component.html',
  styleUrls: ['./articles.component.scss']
})
export class ArticlesComponent implements OnInit {

  path: string = "";
  chitarre: ArticoloPayload[] = [];
  chitarreClass: ChitarraClassica[]=[];
  preferiti: ArticoloPayload[] = [];
  loggato:boolean=false;
  blocco:boolean=true;
  constructor(private http: HttpClient, private as: AuthService, private router: Router, private ars: ArticlesService, private fs: FavouritesService, private cs:CartService,private ss:SharedService) {

  }

  ngOnInit(): void {

   this.loggato=this.as.isLoggedIn;

    if (this.router.url == "/chitarre/chitarre_elettriche/stratocaster") {
      console.log("stratocaster")
      this.ars.loadChitarreElettricheStratocaster().subscribe(data => {
        this.chitarre = data;
        console.log(this.chitarre)
        this.path = "stratocaster";
      })
    } else if (this.router.url == "/chitarre/chitarre_elettriche/telecaster") {
      console.log("telecaster")
      this.ars.loadChitarreElettricheTelecaster().subscribe(data => {
        this.chitarre = data;
        console.log(this.chitarre)
        this.path = "telecaster";
      })
    } else if (this.router.url == "/chitarre/chitarre_elettriche/single_cut") {
      console.log("singlecut")
      this.ars.loadChitarreElettricheSingleCut().subscribe(data => {
        this.chitarre = data;
        console.log(this.chitarre)
        this.path = "singlecut";
      })
    } else if (this.router.url == "/chitarre/chitarre_elettriche/double_cut") {
      console.log("doublecut")
      this.ars.loadChitarreElettricheDoubleCut().subscribe(data => {
        this.chitarre = data;
        console.log(this.chitarre)
        this.path = "doublecut";
      })
    } else if (this.router.url == "/chitarre/chitarre_elettriche/semiacustiche") {
      console.log("semiacustiche")
      this.ars.loadChitarreElettricheSemiAcustiche().subscribe(data => {
        this.chitarre = data;
        console.log(this.chitarre)
        this.path = "semiacustiche";
      })
    } else if (this.router.url == "/chitarre/chitarre_elettriche/heavy") {
      console.log("heavy")
      this.ars.loadChitarreElettricheHeavy().subscribe(data => {
        this.chitarre = data;
        console.log(this.chitarre)
        this.path = "heavy";
      })
    } else if(this.router.url=="/chitarre/chitarre_classiche/1-8"){
      this.ars.loadChitarreClassicheUnOttavo().subscribe(data => {
        this.chitarre = data;
        console.log(this.chitarre)
        this.path = "1-8";
      })
    } else if(this.router.url=="/chitarre/chitarre_classiche/1-4"){
      this.ars.loadChitarreClassicheUnQuarto().subscribe(data => {
        this.chitarre = data;
        console.log(this.chitarre)
        this.path = "1-4";
      })
    } else if(this.router.url=="/chitarre/chitarre_classiche/1-2"){
      this.ars.loadChitarreClassicheUnMezzo().subscribe(data => {
        this.chitarre = data;
        console.log(this.chitarre)
        this.path = "1-2";
      })
    } else if(this.router.url=="/chitarre/chitarre_classiche/3-4"){
      this.ars.loadChitarreClassicheTreQuarti().subscribe(data => {
        this.chitarre = data;
        console.log(this.chitarre)
        this.path = "3-4";
      })
    } else if(this.router.url=="/chitarre/chitarre_classiche/7-8"){
      this.ars.loadChitarreClassicheSetteOttavi().subscribe(data => {
        this.chitarre = data;
        console.log(this.chitarre)
        this.path = "7-8";
      })
    } else if(this.router.url=="/chitarre/chitarre_classiche/4-4"){
      this.ars.loadChitarreClassicheQuattroQuarti().subscribe(data => {
        this.chitarre = data;
        console.log(this.chitarre)
        this.path = "4-4";
      })
    } else if(this.router.url=="/chitarre/chitarre_acustiche/dreadnought"){
      this.ars.loadChitarreAcusticheDreadnought().subscribe(data => {
        this.chitarre = data;
        console.log(this.chitarre)
        this.path = "dreadnought";
      })
    } else if(this.router.url=="/chitarre/chitarre_acustiche/jumbo"){
      this.ars.loadChitarreAcusticheJumbo().subscribe(data => {
        this.chitarre = data;
        console.log(this.chitarre)
        this.path = "jumbo";
      })
    } else if(this.router.url=="/chitarre/chitarre_acustiche/folk"){
      this.ars.loadChitarreAcusticheFolk().subscribe(data => {
        this.chitarre = data;
        console.log(this.chitarre)
        this.path = "folk";
      })
    } else if(this.router.url=="/chitarre/chitarre_acustiche/O-OO-OOO"){
      this.ars.loadChitarreAcusticheOoooo().subscribe(data => {
        this.chitarre = data;
        console.log(this.chitarre)
        this.path = "OOOOO";
      })
    } else if(this.router.url=="/chitarre/chitarre_da_viaggio"){
      this.ars.loadChitarreAcusticheDaViaggio().subscribe(data => {
        this.chitarre = data;
        console.log(this.chitarre)
        this.path = "daviaggio";
      })
    } else if(this.router.url=="/chitarre/chitarre_acustiche/roundback"){
      this.ars.loadChitarreAcusticheRoundback().subscribe(data => {
        this.chitarre = data;
        console.log(this.chitarre)
        this.path = "roundback";
      })
    }


    if(this.loggato){
      this.getPreferiti();
    }
  };

  /*this.http.get<ChitarraElettrica[]>("http://localhost:8080/api/articolo/chitarre_elettriche/stratocaster").subscribe(data=>{
      console.log(data);
      this.chitarre=data;
      this.path="stratocaster"
      console.log(this.chitarre)
    }, error=>{
      console.log("errore nel login",error);
    })*/

  public aggiungiPreferiti(c: ArticoloPayload) {
    this.fs.aggiungiArticoloPreferiti(c.id).subscribe(
      data => {
        console.log(data);
        console.log("articolo aggiunto correttamente")
        this.getPreferiti();
      }, error => {
        console.log("errore nel login", error);
      }
    )
  }

  public aggiungiCarrello(c: ArticoloPayload) {
    this.blocco=false;
    this.cs.aggiungiArticoloCarrello(c.id).subscribe(
      data => {
        console.log(data);
        console.log("articolo aggiunto correttamente al carrello")
        this.ss.sendChiamata();
      }, error => {
        console.log("errore", error);
      }
    )
  }

  public rimuoviPreferiti(c: ArticoloPayload) {
    this.fs.rimuoviArticoloPreferiti(c.id).subscribe(
      data => {
        console.log(data);
        console.log("articolo rimosso correttamente")
        this.getPreferiti();
      }, error => {
        console.log("errore nel login", error);
      }
    )
  }

 /* public rimuoviCarrello(c: ArticoloPayload) {
    this.cs.aggiungiArticoloCarrello(c.id).subscribe(
      data => {
        console.log(data);
        console.log("articolo aggiunto correttamente al carrello")
        this.nav.aggiornaCarrello();
      }, error => {
        console.log("errore", error);
      }
    )
  }*/

  public controllo(c: ArticoloPayload) {
    this.blocco=false;
    console.log("ok");
    let controllo: boolean = false;
    this.getPreferiti();
    for (let i = 0; i < this.preferiti.length; i++) {
      if (c.id == this.preferiti[i].id) {
        controllo = true;
      }
    }
    console.log(controllo);
    if (controllo == true) {
      this.rimuoviPreferiti(c);
    } else {
      this.aggiungiPreferiti(c);
    }
  }

  public coloreCuore(id: number) {
    let check: boolean = false;
    this.preferiti.forEach(elem => {
      if (elem.id == id)
        check = true;
    })
    return check;
  }


  public getPreferiti() {
    this.fs.getPreferiti().subscribe(
      data => {
        console.log(data);
        this.preferiti = data;
        console.log(this.fs.preferiti);
      }, error => {
        console.log("errore nel login", error);
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

