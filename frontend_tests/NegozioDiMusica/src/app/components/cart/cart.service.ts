import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { ArticoloPayload } from 'src/app/utils/interfacce';
import { AuthService } from 'src/app/auth/auth.service';

@Injectable({
  providedIn: 'root'
})
export class CartService {
  url:string="http://localhost:8080/api/articolo/"
  articoli:ArticoloPayload[]=[];

  constructor(private http:HttpClient,private as:AuthService) { }

  public getCarrello():Observable<ArticoloPayload[]>{
    const headers = new HttpHeaders({
      'Content-Type': 'application/json',
      'Authorization': `Bearer ${this.as.token}`
    })
    return this.http.get<ArticoloPayload[]>(this.url+"carrello",{headers:headers})
  }

  aggiungiArticoloCarrello(id:number):Observable<any>{

    const headers = new HttpHeaders({
      'Content-Type': 'application/json',
      'Authorization': `Bearer ${this.as.token}`
    })

    return this.http.post<any>(this.url+`carrello/${id}`,{},{headers:headers})

  }

  rimuoviArticoloCarrello(id:number):Observable<any>{

    const headers = new HttpHeaders({
      'Content-Type': 'application/json',
      'Authorization': `Bearer ${this.as.token}`
    })

    return this.http.delete<any>(this.url+`carrello/${id}`,{headers:headers})

  }

  rimuoviArticoliCarrello(ids:number[]){

    let mom:string=ids.toString();
    console.log(mom);

    const headers = new HttpHeaders({
      'Content-Type': 'application/json',
      'Authorization': `Bearer ${this.as.token}`
    })

    return this.http.delete<any>(this.url+`carrello/articoli/${mom}`,{headers:headers})

  }

}
