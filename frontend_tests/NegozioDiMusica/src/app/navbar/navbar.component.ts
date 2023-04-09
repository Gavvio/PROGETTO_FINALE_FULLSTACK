import { Component, ElementRef, OnInit, ViewChild } from '@angular/core';
import { AuthService } from '../auth/auth.service';
import { NavigationEnd, NavigationStart, Router } from '@angular/router';
import { ArticlesService } from '../components/articles/articles.service';
import { ArticoloPayload } from '../utils/interfacce';

@Component({
  selector: 'app-navbar',
  templateUrl: './navbar.component.html',
  styleUrls: ['./navbar.component.scss']
})
export class NavbarComponent implements OnInit {

  closebutton!:HTMLButtonElement;
  closebuttoncanvas!:HTMLButtonElement;
  input!:HTMLInputElement;
  name: string = "";
  saluto: string = "";
  loggato: boolean = false;
  tutti: ArticoloPayload[] = [];
  selezionati: ArticoloPayload[] = [];
  constructor(private as: AuthService, private router: Router, private ars: ArticlesService) {
    this.router.events.subscribe((event)=>{
      if(event instanceof NavigationStart){
        console.log("ok");
        this.chiudiModale();
      }
      else if(event instanceof NavigationEnd){
        console.log("circa ok")
      }
    });
   }


  ngOnInit() {

    if (this.as.isLoggedIn) {
      const date: Date = new Date();
      let ora = date.getHours();
      if (ora >= 6 && ora < 12) {
        this.saluto = "Buongiorno";
      }
      else if (ora >= 12 && ora < 17) {
        this.saluto = "Buon Pomeriggio";
      }
      else if (ora >= 17 && ora < 23) {
        this.saluto = "Buona Sera";
      }
      else {
        this.saluto = "Buonanotte";
      }
      this.name = this.as.nomeUtente;
    }
    this.loggato = this.as.isLoggedIn;
    this.ars.loadAllArticolo().subscribe(
      data => {
        console.log(data);
        this.tutti=data;
      }, error => {
        console.log("errore nel login", error);
      }
    )

    this.closebutton=<HTMLButtonElement>document.querySelector("#closebutton");
    this.closebuttoncanvas=<HTMLButtonElement>document.querySelector("#chiudiOffCanvas")
    this.input=<HTMLInputElement>document.querySelector("#input_vero");
  }

  public ricerca(event:any){
    this.selezionati=[];
    this.tutti.forEach(uno=>{
      if(uno.marca.toLowerCase().includes(event.target.value.toLowerCase()) || uno.modello.toLowerCase().includes(event.target.value.toLowerCase())){
        this.selezionati.push(uno);
      }
    })
  }

  public dettaglio(id:number){
    this.closebutton.click();
    this.input.value="";
    this.selezionati=[];
    this.router.navigate([`/articolo/${id}`]);
  }

  public chiudiModale(){
    this.closebuttoncanvas.click();
    console.log("ma che cazz")
  }

  public focus(){
    this.input.value="";
    this.input.focus();
    this.selezionati=[];
  }


  public logout() {
    console.log("ao");
    this.as.logOut();
  }

}
