import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { AuthService } from 'src/app/auth/auth.service';
import { ChitarraElettrica, PreferitiPayload } from 'src/app/utils/interfacce';
import { ArticlesService } from './articles.service';
import { FavouritesService } from '../favourites/favourites.service';

@Component({
  selector: 'app-articles',
  templateUrl: './articles.component.html',
  styleUrls: ['./articles.component.scss']
})
export class ArticlesComponent implements OnInit {

  path: string = "";
  chitarre: ChitarraElettrica[] = [];
  preferiti: PreferitiPayload[] = [];
  loggato:boolean=false;

  constructor(private http: HttpClient, private as: AuthService, private router: Router, private ars: ArticlesService, private fs: FavouritesService) {

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

  public aggiungiPreferiti(c: ChitarraElettrica) {
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

  public rimuoviPreferiti(c: ChitarraElettrica) {
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

  public controllo(c: ChitarraElettrica) {
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


  getPreferiti() {
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
}

