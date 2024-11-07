import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';
import { ClienteService } from '../servico/cliente.service';
import { Cliente } from '../modelo/Cliente';

@Component({
  selector: 'app-principal',
  templateUrl: './principal.component.html',
  styleUrl: './principal.component.css',
})
export class PrincipalComponent {

  dataSource:any[]=[];

  // Objeto do tipo Cliente
  cliente = new Cliente();

  // Variável para visibilidade dos botões
  btnCadastro:boolean = true;

  // Variável para visibilidade tabela
  tabela:boolean = true;

  // JSON Clientes
  clientes: Cliente[] = [];


  // Construtor
  constructor(private servico:ClienteService){}

  // Método de seleção
  selecionar():void{
    this.servico.selecionar().subscribe(retorno => this.clientes = retorno);
  }

  // Método de cadastro
  cadastrar():void{
    this.servico.cadastrar(this.cliente)
    .subscribe(retorno => {

      // Cadastrar o cliente no vetor
      this.clientes.push(retorno); });

      // Limpar formulário
      this.cliente = new Cliente();

      // Mensagem
      alert('Cliente cadastrado com sucesso!');
  }

  // Método para selecionar um cliente específico
  selecionarCliente(posicao:number):void{

    // Selecionar cliente no vetor
    this.cliente = this.clientes[posicao];

    // Visibilidade dos botões
    this.btnCadastro = false;

    // Visibilidade da tabela
    this.tabela = false;
  }

  // Método para editar clientes
  editar():void{

    this.servico.aditar(this.cliente)
    .subscribe(retorno => {

      // Obter posição do vetor onde está o cliente
      let posicao = this.clientes.findIndex(obj => {
        return obj.codigo == retorno.codigo;
      });

      // Alterar os dados do cliente no vetor
      this.clientes[posicao] = retorno;

      // Limpar formulário
      this.cliente = new Cliente();

      // Visibilidade dos botões
      this.btnCadastro = true;

      // Visibilidade da tabela
      this.tabela = true;

      // Mensagem
      alert('Cliente alterado com sucesso')

    });
  }

  // Método para editar clientes
  remover():void{

    this.servico.remover(this.cliente.codigo)
    .subscribe(retorno => {

      // Obter posição do vetor onde está o cliente
      let posicao = this.clientes.findIndex(obj => {
        return obj.codigo == this.cliente.codigo;
      });

      // Remover cliente do vetor
      this.clientes.splice(posicao, 1);

      // Limpar formulário
      this.cliente = new Cliente();

      // Visibilidade dos botões
      this.btnCadastro = true;

      // Visibilidade da tabela
      this.tabela = true;

      // Mensagem
      alert('Cliente removido com sucesso')

    });
  }

  // Método cancelar
  cancelar():void{

     // Limpar formulário
     this.cliente = new Cliente();

     // Visibilidade dos botões
     this.btnCadastro = true;

     // Visibilidade da tabela
     this.tabela = true;

  }

  // Método de inicialização
  ngOnInit() {
    this.selecionar();
    this.dataSource=[
      {
        id:0,
        nome:this.cliente.nome,
        idade:this.cliente.idade,
        cidade:this.cliente.cidade
      }
    ]
  }
}
