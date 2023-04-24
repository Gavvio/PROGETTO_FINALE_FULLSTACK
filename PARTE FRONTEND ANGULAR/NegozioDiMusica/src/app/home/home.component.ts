import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { AuthService } from '../auth/auth.service';
import { ArticlesService } from '../components/articles/articles.service';
import { SharedService } from '../navbar/shared.service';
import { Subscription } from 'rxjs';
import { ArticoloPayload } from '../utils/interfacce';
import { Router } from '@angular/router';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.scss']
})
export class HomeComponent implements OnInit {

  nome: string = "";
  tutti: ArticoloPayload[] = [];
  scelti: ArticoloPayload[] = [];
  sceltiId: number[] = [];
  nonadatti: number[] = [13,19,33,67];
  constructor(private http: HttpClient, private as: AuthService, private ars: ArticlesService, private ss: SharedService, private router: Router) {

  }
  ngOnInit() {
    if (this.as.isLoggedIn) {
      this.nome = this.as.nomeUtente;
    }

    this.ars.loadAllArticolo().subscribe(
      data => {
        this.tutti = data;
        this.scegliCasuali();
      }, error => {
        console.log("errore nel login", error);
      }
    )
  }

  public test() {
    this.ss.sendChiamata();
  }

  scegliCasuali() {
    for (let i = 0; i < 10; i++) {
      let mom = Math.floor(Math.random() * (108 - 1 + 1))+1
      var controllo = true;
      this.nonadatti.forEach(elemNonAdatto => {
        if (mom == elemNonAdatto) {
          i--;
          controllo = false;
        }
      })
      if (controllo == true) {
        this.sceltiId.forEach(elem => {
          if (mom == elem) {
            i--;
            controllo = false;
          }
        });
      }
      if (controllo == true) {
        this.sceltiId.push(mom);
      }
    }
    this.sceltiId.forEach(elem => {
      this.scelti.push(this.tutti[elem-1])
    })
  }

  public dettaglio(id: number) {

    this.router.navigate([`/articolo/${id}`]);

  }
}
