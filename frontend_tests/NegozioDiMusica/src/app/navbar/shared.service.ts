import { Injectable } from '@angular/core';
import { Observable, Subject } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class SharedService {

  private subject = new Subject<any>();

  constructor() { }

  sendChiamata(){
    this.subject.next("ok");
  }

  getChiamata():Observable<any>{
    return this.subject.asObservable();
  }
}
