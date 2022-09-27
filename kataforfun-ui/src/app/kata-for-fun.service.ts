import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Observable} from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class KataForFunService {

  private REST_API_RESSOURCE = 'http://localhost:8080/kata-for-fun';

  constructor(private httpClient: HttpClient) { }

  public convert(inputNumber: number): Observable<any>{
    return this.httpClient.get(`${this.REST_API_RESSOURCE}/${inputNumber}`);
  }

}
