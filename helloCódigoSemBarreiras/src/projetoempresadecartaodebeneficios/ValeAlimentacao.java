package projetoempresadecartaodebeneficios;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class ValeAlimentacao extends CartaoDeBeneficio implements InterfaceCartaoDeBeneficio {

    public Transacao transacaoVa;
    public Beneficiario beneficiario;
    int index = 0;


    public void validarTransacaoVA(Double valor) {

        String compararEstabelecimento = transacaoVa.getTipoDoEstabelecimento();
        Double comparaValor = transacaoVa.getValorDaTransacao();

        //Regra específica do VA: Verifica se é posto de combustível
        if (transacaoVa.getIdenticadorDoEstabelecimento().equals("Posto Delta")) {
            System.out.println("Não é possível usar este benefício neste estabelecimento!");

            //Verifica se é valor negativo
        } else if (transacaoVa.getValorDaTransacao() < 0) {
            System.out.println("Digite um valor maior que zero!");

            //Verifica a validade do cartão
        } else if (!Ferramentas.verificaValidade(beneficiario.getDataDeCadastro()) {
            System.out.println("Cartão vencido! Não é possível realizar essa transação!");

            //Verifica se saldo é suficiente para transação
        } else if (transacaoVa.getValorDaTransacao() > this.saldoCartao) {
            System.out.println("Você não tem saldo suficiente para realizar esta operação!");


        } else if (!Ferramentas.verificaTempoSegundos(transacaoVa.getDataHoraTransacao()) &&
                transacaoVa.getIdenticadorDoEstabelecimento().equals(transacaoVa.buscaEstabelecimentoVA(compararEstabelecimento)) &&
                transacaoVa.getValorDaTransacao().equals(transacaoVa.buscaUltimoValorVA(comparaValor)){

        } else if () {
            System.out.println("Você não pode realizar mais que duas compras em 1 minuto!");

        } else {
            this.saldoCartao -= valor;
            this.saldoCartao += valor * 0.015;

            System.out.printf("Compra efetuada com sucesso!%n");
            System.out.printf("Você recebeu R$%.2f de cashback.", valor * 0.015);
            System.out.printf("Seu saldo atual: R$%.2f.", this.saldoCartao);
        }

    }

    @Override
    public void criaDataDeCadastro() {

    }

    @Override
    public void criaDataDeValidade() {

    }
}

