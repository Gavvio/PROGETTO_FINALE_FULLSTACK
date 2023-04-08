import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { AuthService } from 'src/app/auth/auth.service';
import { PreferitiPayload } from 'src/app/utils/interfacce';

@Injectable({
  providedIn: 'root'
})
export class FavouritesService {

  preferiti:PreferitiPayload[]=[];
  constructor(private http:HttpClient,private as:AuthService) { }

  getPreferiti():Observable<PreferitiPayload[]>{

    const headers = new HttpHeaders({
      'Content-Type': 'application/json',
      'Authorization': `Bearer ${this.as.token}`
    })

    return this.http.get<any>("http://localhost:8080/api/articolo/preferiti",{headers:headers});

  }

  aggiungiArticoloPreferiti(id:number):Observable<any>{

    const headers = new HttpHeaders({
      'Content-Type': 'application/json',
      'Authorization': `Bearer ${this.as.token}`
    })

    return this.http.post<any>(`http://localhost:8080/api/articolo/preferiti/${id}`,{},{headers:headers})

  }

  rimuoviArticoloPreferiti(id:number):Observable<any>{

    const headers = new HttpHeaders({
      'Content-Type': 'application/json',
      'Authorization': `Bearer ${this.as.token}`
    })

    return this.http.delete<any>(`http://localhost:8080/api/articolo/preferiti/${id}`,{headers:headers})

  }
}
