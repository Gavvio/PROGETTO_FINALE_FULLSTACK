import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { AuthService } from 'src/app/auth/auth.service';
import { ArticoloPayload } from 'src/app/utils/interfacce';

@Injectable({
  providedIn: 'root'
})
export class FavouritesService {

  preferiti:ArticoloPayload[]=[];
  constructor(private http:HttpClient,private as:AuthService) { }

  getPreferiti():Observable<ArticoloPayload[]>{

    const headers = new HttpHeaders({
      'Content-Type': 'application/json',
      'Authorization': `Bearer ${this.as.token}`
    })

    return this.http.get<any>("https://gavioliapi.osc-fr1.scalingo.io/api/articolo/preferiti",{headers:headers});

  }

  aggiungiArticoloPreferiti(id:number):Observable<any>{

    const headers = new HttpHeaders({
      'Content-Type': 'application/json',
      'Authorization': `Bearer ${this.as.token}`
    })

    return this.http.post<any>(`https://gavioliapi.osc-fr1.scalingo.io/api/articolo/preferiti/${id}`,{},{headers:headers})

  }

  rimuoviArticoloPreferiti(id:number):Observable<any>{

    const headers = new HttpHeaders({
      'Content-Type': 'application/json',
      'Authorization': `Bearer ${this.as.token}`
    })

    return this.http.delete<any>(`https://gavioliapi.osc-fr1.scalingo.io/api/articolo/preferiti/${id}`,{headers:headers})

  }
}
