package projetoempresadecartaodebeneficios;

import java.time.LocalDate;

public class ValeCombustivel extends CartaoDeBeneficio implements InterfaceCartaoDeBeneficio {

    public Transacao transacaoVc;
    public Beneficiario beneficiario;
    int index = 0;

    @Override
    public void validarTransacaoVC(Double valor) {

        String compararEstabelecimento = transacaoVc.getTipoDoEstabelecimento();
        Double comparaValor = transacaoVc.getValorDaTransacao();

        //Regra específica 1 do VC: Verifica se é posto de combustível
        if (!transacaoVc.getIdenticadorDoEstabelecimento().equals("Posto Delta")) {
            System.out.println("Não é possível usar este benefício neste estabelecimento!");

            //Verifica se é valor negativo
        } else if (transacaoVc.getValorDaTransacao() < 0) {
            System.out.println("Digite um valor maior que zero!");

            //Verifica a validade do cartão
        } else if (!Ferramentas.verificaValidade(beneficiario.getDataDeCadastro()){
            System.out.println("Cartão vencido! Não é possível realizar essa transação!");

            //Verifica se saldo é suficiente para transação
        } else if (transacaoVc.getValorDaTransacao() > this.saldoCartao) {
            System.out.println("Você não tem saldo suficiente para realizar esta operação!");

        } else if (!Ferramentas.verificaTempoSegundos(transacaoVc.getDataHoraTransacao()) &&
                transacaoVc.getIdenticadorDoEstabelecimento().equals(transacaoVc.buscaEstabelecimentoVA(compararEstabelecimento)) &&
                transacaoVc.getValorDaTransacao().equals(transacaoVc.buscaUltimoValorVA(comparaValor)) {
            System.out.println("Você só pode realizar uma transação de mesmo valor a cada 30 segundos!");

        } else if () {
            System.out.println("Você não pode realizar mais que duas compras em 1 minuto!");

            ////Regra específica 2 do VC: Uma compra a cada 2 minutos
        } else if (!verificaTempoDoisMinutos(pega registro datahora da ultima compra)) {
            System.out.println("Você só pode realizar uma transação a cada 2 minutos!");

        } else {
            this.saldoCartao -= valor;
            //Regra específica 3 do VC: Desconta R$1 de taxa do saldo.
            this.saldoCartao -= 1.00;

            //TODO adiciona essa transação no arraylist de transações do usuário

            System.out.println("Compra efetuada com sucesso!");
            System.out.println("Você pagou uma taxa de R$1,00 pelo abastecimento.");
            System.out.printf("Seu saldo atual: R$%.2f.", this.saldoCartao);
        }

        @Override
        public void mostrarSaldo () {

            System.out.printf("Seu saldo atual é: R$%.2f.", this.saldoCartao);
        }
    }


    @Override
    public void criaDataDeCadastro() {

    }

    @Override
    public void criaDataDeValidade() {

    }
}
