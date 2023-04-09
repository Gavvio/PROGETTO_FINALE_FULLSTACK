import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { ArticoloPayload, ChitarraElettrica } from 'src/app/utils/interfacce';

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

  public loadChitarreElettricheStratocaster():Observable<ChitarraElettrica[]>{
    return this.http.get<ChitarraElettrica[]>(this.url+"chitarre_elettriche/stratocaster")
  }

  public loadChitarreElettricheTelecaster():Observable<ChitarraElettrica[]>{
    return this.http.get<ChitarraElettrica[]>(this.url+"chitarre_elettriche/telecaster")
  }

  public loadChitarreElettricheSingleCut():Observable<ChitarraElettrica[]>{
    return this.http.get<ChitarraElettrica[]>(this.url+"chitarre_elettriche/singlecut")
  }

  public loadChitarreElettricheDoubleCut():Observable<ChitarraElettrica[]>{
    return this.http.get<ChitarraElettrica[]>(this.url+"chitarre_elettriche/doublecut")
  }

  public loadChitarreElettricheSemiAcustiche():Observable<ChitarraElettrica[]>{
    return this.http.get<ChitarraElettrica[]>(this.url+"chitarre_elettriche/semiacustiche")
  }

  public loadChitarreElettricheHeavy():Observable<ChitarraElettrica[]>{
    return this.http.get<ChitarraElettrica[]>(this.url+"chitarre_elettriche/heavy")
  }



}
