package projetoempresadecartaodebeneficios;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class ValeAlimentacao extends CartaoDeBeneficio implements InterfaceCartaoDeBeneficio {

    public ValeAlimentacao(String identificadorCartao, Double saldoCartao, LocalDate dataDoCadastro,
                           LocalDate validadeCartao, String nomeBeneficiario) {
        super(identificadorCartao, saldoCartao, dataDoCadastro, validadeCartao, nomeBeneficiario);
    }

    int index = 0;


    @Override
    public void adicionarTransacao(Double valor, Integer identificadorEstabelecimento, String tipoEstabelecimento) {

        Transacao transacao = new Transacao();
        index = transacoesCartao.size() - 1;

        //Regra específica do VA: Verifica se é posto de combustível
        if (tipoEstabelecimento.equals("Posto_combustível")) {
            System.out.println("Não é possível usar este benefício neste estabelecimento!");

            //Verifica se é valor negativo
        } else if (valor < 0) {
            System.out.println("Digite um valor maior que zero!");

            //Verifica a validade do cartão
        } else if (!Ferramentas.verificaValidade(transacao.[index].localDataTransacao) {
            System.out.println("Cartão vencido! Não é possível realizar essa transação!");

            //Verifica se saldo é suficiente para transação
        } else if (valor > this.saldoCartao) {
            System.out.println("Você não tem saldo suficiente para realizar esta operação!");

        } else if (Ferramentas.verificaTempoSegundos(transacao[index].localDataTransacao) &&
                verificaEstabalecimento(pega registro ultimo estabelecimento) &&
                verificaValor (pega registro valor ultima compra)) {

        } else if () {
            System.out.println("Você não pode realizar mais que duas compras em 1 minuto!");

        } else {
            this.saldoCartao -= valor;
            this.saldoCartao += valor * 0.015;

            //TODO adiciona essa transação no arraylist de transações do usuário

            System.out.printf("Compra efetuada com sucesso!%n");
            System.out.printf("Você recebeu R$%.2f de cashback.", valor * 0.015);
            System.out.printf("Seu saldo atual: R$%.2f.", this.saldoCartao);
        }

    }

    @Override
    public void mostrarSaldo() {

        System.out.printf("Seu saldo atual é: R$%.2f.", this.saldoCartao);
    }

    @Override
    public void criaDataDeCadastro() {

    }

    @Override
    public void criaDataDeValidade() {

    }
}

