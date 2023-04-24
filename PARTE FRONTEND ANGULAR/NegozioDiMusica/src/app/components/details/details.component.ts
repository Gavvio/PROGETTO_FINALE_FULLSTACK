import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { ArticlesService } from '../articles/articles.service';
import { ArticoloPayload } from 'src/app/utils/interfacce';
import { FavouritesService } from '../favourites/favourites.service';
import { AuthService } from 'src/app/auth/auth.service';
@Component({
  selector: 'app-details',
  templateUrl: './details.component.html',
  styleUrls: ['./details.component.scss']
})
export class DetailsComponent implements OnInit{
  articolo!:ArticoloPayload;
  preferiti: ArticoloPayload[] = [];
  loggato:boolean=false;
  constructor(private ar:ActivatedRoute,private ars:ArticlesService,private router:Router,private route:ActivatedRoute,private fs:FavouritesService,private as:AuthService){
  }
  ngOnInit(): void {
    this.loggato=this.as.isLoggedIn;

    this.route.paramMap.subscribe(param=>{
      let id:string=<string>param.get('id');
      this.ars.loadArticoloById(Number(id)).subscribe(data => {
        this.articolo=data;
       })
    })
    if(this.loggato){
      this.getPreferiti();
    }
  }


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

  public controllo(c: ArticoloPayload) {
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
}
