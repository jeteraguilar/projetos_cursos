import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Cliente } from '../modelo/Cliente';
import { Observable } from 'rxjs';


@Injectable({
  providedIn: 'root',
})
export class ClienteService {
  // Url da api
  private url:string = 'http://localhost:8080';

  // Construtor
  constructor(private http:HttpClient) {}

  // Método para selecionar todos os clientes
  selecionar():Observable<Cliente[]>{
    return this.http.get<Cliente[]>(this.url);
  }

  // Método para cadastrar todos os clientes
  cadastrar(obj:Cliente):Observable<Cliente>{
    return this.http.post<Cliente>(this.url, obj);
  }

   // Método para editar clientes
   aditar(obj:Cliente):Observable<Cliente>{
    return this.http.put<Cliente>(this.url, obj);
  }

  // Método para editar clientes
  remover(codigo:number):Observable<void>{
   return this.http.delete<void>(this.url + '/' + codigo);
 }

}
