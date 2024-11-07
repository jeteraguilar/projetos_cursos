import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

import { CadastroPf } from '../';
import { environment as env } from '../../../environments/environment';

@Injectable()
export class CadastrarPfService {

  private readonly PATH: string = 'cadastrar-pf';

  constructor(private http: HttpClient) { }

  cadastrar(cadastroPf: CadastroPf): Observable<any> {
  	  return this.http.post(env.baseApiUrl + this.PATH, cadastroPf);
  }

}
