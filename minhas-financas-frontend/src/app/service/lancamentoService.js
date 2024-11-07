import ApiService from '../apiService'

import ErroValidacao from '../exception/ErroValidacao'

export default class LancamentoService extends ApiService {

    constructor(){
        super('/api/lancamentos')
    }

    obterListaMeses(){
        return  [
            { label: 'Selecione...', value: '' },
            { label: 'Janeiro', value: 1 },
            { label: 'Fevereiro', value: 2 },
            { label: 'Março', value: 3 },
            { label: 'Abril', value: 4 },
            { label: 'Maio', value: 5 },
            { label: 'Junho', value: 6 },
            { label: 'Julho', value: 7 },
            { label: 'Agosto', value: 8 },
            { label: 'Setembro', value: 9 },
            { label: 'Outubro', value: 10 },
            { label: 'Novembro', value: 11 },
            { label: 'Dezembro', value: 12 },
        ]
    }

    obterListaDiaVencRec(){
        return  [
            { label: 'Selecione...', value: '' },
            { label: 'Dia 1', value: 1 },
            { label: 'Dia 2', value: 2 },
            { label: 'Dia 3', value: 3 },
            { label: 'Dia 4', value: 4 },
            { label: 'Dia 5', value: 5 },
            { label: 'Dia 6', value: 6 },
            { label: 'Dia 7', value: 7 },
            { label: 'Dia 8', value: 8 },
            { label: 'Dia 9', value: 9 },
            { label: 'Dia 10', value: 10 },
            { label: 'Dia 11', value: 11 },
            { label: 'Dia 12', value: 12 },
            { label: 'Dia 13', value: 13 },
            { label: 'Dia 14', value: 14 },
            { label: 'Dia 15', value: 15 },
            { label: 'Dia 16', value: 16 },
            { label: 'Dia 17', value: 17 },
            { label: 'Dia 18', value: 18 },
            { label: 'Dia 19', value: 19 },
            { label: 'Dia 20', value: 20 },
            { label: 'Dia 21', value: 21 },
            { label: 'Dia 22', value: 22 },
            { label: 'Dia 23', value: 23 },
            { label: 'Dia 24', value: 24 },
            { label: 'Dia 25', value: 25 },
            { label: 'Dia 26', value: 26 },
            { label: 'Dia 27', value: 27 },
            { label: 'Dia 28', value: 28 },
            { label: 'Dia 29', value: 29 },
            { label: 'Dia 30', value: 30 },
            { label: 'Dia 31', value: 31 },
          
        ]
    }

    obterListaTipos(){
        return  [
            { label: 'Selecione...', value: '' },
            { label: 'Despesa' , value : 'DESPESA' },
            { label: 'Receita' , value : 'RECEITA' }
        ]

    }

    obterPorId(id){
        return this.get(`/${id}`);
    }

    alterarStatus(id, status){
        return this.put(`/${id}/atualiza-status`, { status })
    }

    validar(lancamento){
        const erros = [];

        if(!lancamento.ano){
            erros.push("Informe o Ano.")
        }

        if(!lancamento.mes){
            erros.push("Informe o Mês.")
        }

        if(!lancamento.vencRec){
            erros.push("Informe o Dia do vencimento/recebimento.")
        }

        if(!lancamento.descricao){
            erros.push("Informe a Descrição.")
        }

        if(!lancamento.valor){
            erros.push("Informe o Valor.")
        }

        if(!lancamento.tipo){
            erros.push("Informe o Tipo.")
        }

        if(erros && erros.length > 0){
            throw new ErroValidacao(erros);
        }
    }

    salvar(lancamento){
        return this.post('/', lancamento);
    }

    atualizar(lancamento){
        return this.put(`/${lancamento.id}`, lancamento);
    }

    consultar(lancamentoFiltro){
        let params = `?ano=${lancamentoFiltro.ano}`

        if(lancamentoFiltro.mes){
            params = `${params}&mes=${lancamentoFiltro.mes}`
        }

        if(lancamentoFiltro.vencRec){
            params = `${params}&vencRec=${lancamentoFiltro.vencRec}`
        }

        if(lancamentoFiltro.tipo){
            params = `${params}&tipo=${lancamentoFiltro.tipo}`
        }

        if(lancamentoFiltro.status){
            params = `${params}&status=${lancamentoFiltro.status}`
        }

        if(lancamentoFiltro.usuario){
            params = `${params}&usuario=${lancamentoFiltro.usuario}`
        }

        if(lancamentoFiltro.descricao){
            params = `${params}&descricao=${lancamentoFiltro.descricao}`
        }

        return this.get(params);
    }

    deletar(id){
        return this.delete(`/${id}`)
    }
}