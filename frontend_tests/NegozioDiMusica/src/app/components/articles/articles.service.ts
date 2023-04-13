import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { ArticoloPayload, ChitarraClassica, ChitarraElettrica } from 'src/app/utils/interfacce';

@Injectable({
  providedIn: 'root'
})
export class ArticlesService {

  url:string="http://localhost:8080/api/articolo/"
  stratocasters:ChitarraElettrica[]=[];

  constructor(private http:HttpClient) { }

  public loadArticoloById(id:number):Observable<ArticoloPayload>{
    return this.http.get<ArticoloPayload>(this.url+`${id}`)
  }

  public loadAllArticolo():Observable<ArticoloPayload[]>{
    return this.http.get<ArticoloPayload[]>(this.url+"all")
  }

  public loadChitarreElettricheStratocaster():Observable<ArticoloPayload[]>{
    return this.http.get<ArticoloPayload[]>(this.url+"chitarre_elettriche/stratocaster")
  }

  public loadChitarreElettricheTelecaster():Observable<ArticoloPayload[]>{
    return this.http.get<ArticoloPayload[]>(this.url+"chitarre_elettriche/telecaster")
  }

  public loadChitarreElettricheSingleCut():Observable<ArticoloPayload[]>{
    return this.http.get<ArticoloPayload[]>(this.url+"chitarre_elettriche/singlecut")
  }

  public loadChitarreElettricheDoubleCut():Observable<ArticoloPayload[]>{
    return this.http.get<ArticoloPayload[]>(this.url+"chitarre_elettriche/doublecut")
  }

  public loadChitarreElettricheSemiAcustiche():Observable<ArticoloPayload[]>{
    return this.http.get<ArticoloPayload[]>(this.url+"chitarre_elettriche/semiacustiche")
  }

  public loadChitarreElettricheHeavy():Observable<ArticoloPayload[]>{
    return this.http.get<ArticoloPayload[]>(this.url+"chitarre_elettriche/heavy")
  }

  public loadChitarreClassicheUnOttavo():Observable<ArticoloPayload[]>{
    return this.http.get<ArticoloPayload[]>(this.url+"chitarre_classiche/1-8")
  }

  public loadChitarreClassicheUnQuarto():Observable<ArticoloPayload[]>{
    return this.http.get<ArticoloPayload[]>(this.url+"chitarre_classiche/1-4")
  }

  public loadChitarreClassicheUnMezzo():Observable<ArticoloPayload[]>{
    return this.http.get<ArticoloPayload[]>(this.url+"chitarre_classiche/1-2")
  }

  public loadChitarreClassicheTreQuarti():Observable<ArticoloPayload[]>{
    return this.http.get<ArticoloPayload[]>(this.url+"chitarre_classiche/3-4")
  }

  public loadChitarreClassicheSetteOttavi():Observable<ArticoloPayload[]>{
    return this.http.get<ArticoloPayload[]>(this.url+"chitarre_classiche/7-8")
  }

  public loadChitarreClassicheQuattroQuarti():Observable<ArticoloPayload[]>{
    return this.http.get<ArticoloPayload[]>(this.url+"chitarre_classiche/4-4")
  }

  public loadChitarreAcusticheDreadnought():Observable<ArticoloPayload[]>{
    return this.http.get<ArticoloPayload[]>(this.url+"chitarre_acustiche/dreadnought")
  }

  public loadChitarreAcusticheJumbo():Observable<ArticoloPayload[]>{
    return this.http.get<ArticoloPayload[]>(this.url+"chitarre_acustiche/jumbo")
  }

  public loadChitarreAcusticheFolk():Observable<ArticoloPayload[]>{
    return this.http.get<ArticoloPayload[]>(this.url+"chitarre_acustiche/folk")
  }

  public loadChitarreAcusticheOoooo():Observable<ArticoloPayload[]>{
    return this.http.get<ArticoloPayload[]>(this.url+"chitarre_acustiche/ooooo")
  }

  public loadChitarreAcusticheRoundback():Observable<ArticoloPayload[]>{
    return this.http.get<ArticoloPayload[]>(this.url+"chitarre_acustiche/roundback")
  }

  public loadChitarreAcusticheDaViaggio():Observable<ArticoloPayload[]>{
    return this.http.get<ArticoloPayload[]>(this.url+"chitarre_acustiche/daviaggio")
  }

}
