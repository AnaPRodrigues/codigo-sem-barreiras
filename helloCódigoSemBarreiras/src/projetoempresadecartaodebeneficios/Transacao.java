package projetoempresadecartaodebeneficios;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Transacao {

    private String identificadorUsuario;
    private String identificadorDaTransacao;
    private String identificadorDoCartao;
    private LocalDateTime dataHoraTransacao;
    private String identicadorDoEstabelecimento;
    private String localizacaoDoEstabelecimento;
    private String tipoDoEstabelecimento;
    private Double valorDaTransacao;

    private Beneficiario usuarioBeneficio;
    private Estabelecimento estabelecimento;
    private ValeAlimentacao valimentacao;
    private ValeCombustivel vcombustivel;

    //Cria uma lista para armazenar as transações do VA
    public static List<Transacao> listaTransacoesVA = new ArrayList<>();
    //Cria uma lista para armazenar as transações do VR
    public static List<Transacao> listaTransacoesVR = new ArrayList<>();
    //Cria uma lista para armazenar as transações do VC
    public static List<Transacao> listaTransacoesVC = new ArrayList<>();


    //TODO implementar o método de cadastro (tipo o do beneficiario)

    //TODO método para tirar o extrato (pessoa seleciona extrato do dia ou extrato da semana, ou extrato do mês)

    //Entrar com uma Transação no VA
    public void criarTransacaoVA() {
        String codigoEstabelecimento;

        var transacao = new Transacao();

        try (Scanner in = new Scanner(System.in)) {
            System.out.println("=======================================");
            System.out.println("Cadastro de Transação no Vale Alimentação");
            System.out.println("=======================================");
            String continua;
            do {
                //TODO criar metodo no main
                //transacao.identificadorUsuario = identificadorUsuario(Strin xxx);

                System.out.println("1 - Insira a que se refere esta transação:");
                transacao.identificadorDaTransacao = in.nextLine();

                System.out.println("\n---------------------------------------\n");
                transacao.identificadorDoCartao = "Vale Alimentação";

                System.out.println("Digite o código do estabelecimento onde foi efetuada a compra: " +
                        "[PO01] - Posto Delta" +
                        "[ME01] - Mercearia São José" +
                        "[SU01] - Supermercado ABC" +
                        "[PA01] - Padaria Sonhos" +
                        "[RE01] - Restaurante La Marmita");
                codigoEstabelecimento = in.nextLine();

                //Busca nome do Estabelecimento
                transacao.identicadorDoEstabelecimento = estabelecimento.buscaEstabelecimento(codigoEstabelecimento);

                //Busca localização do Estabelecimento
                transacao.localizacaoDoEstabelecimento = estabelecimento.buscaLocalizacaoEstabelecimento(codigoEstabelecimento);

                // TODO fazer as validações
                System.out.println("Qual o valor da transação?");
                transacao.valorDaTransacao = in.nextDouble();

                //Para validar a transação do VA
                if(valimentacao.validarTransacaoVA(transacao.valorDaTransacao)){
                    transacao.dataHoraTransacao = LocalDateTime.now();

                    listaTransacoesVA.add(transacao);

                }

                System.out.println("Deseja cadastrar outro beneficiário [s] [n]?");
                continua = in.nextLine().trim().toLowerCase();

            } while (!continua.equals("n"));
        }
    }

    //Busca estabelecimento para comparar (VA)
    String buscaEstabelecimentoVA(String estabelecimento){
        listaTransacoesVA.sort();
        int i = listaTransacoesVA.size() - 1;
        if(listaTransacoesVA.get(i).identicadorDoEstabelecimento.contains(estabelecimento)){
            return listaTransacoesVA.get(i).identicadorDoEstabelecimento;
        }
    }
    //Busca ultimo valor para comparar [VA]
    Double buscaUltimoValorVA (Double valor){
        listaTransacoesVA.sort();
        int i = listaTransacoesVA.size() - 1;
        if (listaTransacoesVA.get(i).valorDaTransacao.equals(valor)){
            return listaTransacoesVA.get(i).valorDaTransacao;
        }

    }

    //Criar uma Transação no [VC]
    public void criarTransacaoVC() {
        String codigoEstabelecimento;

        var transacao = new Transacao();

        try (Scanner in = new Scanner(System.in)) {
            System.out.println("=======================================");
            System.out.println("Cadastro de Transação no Vale Alimentação");
            System.out.println("=======================================");
            String continua;
            do {
                //TODO criar metodo no main
                //transacao.identificadorUsuario = identificadorUsuario(Strin xxx);

                System.out.println("1 - Insira a que se refere esta transação:");
                transacao.identificadorDaTransacao = in.nextLine();

                System.out.println("\n---------------------------------------\n");
                transacao.identificadorDoCartao = "Vale Combustível";

                System.out.println("Digite o código do estabelecimento onde foi efetuada a compra: " +
                        "[PO01] - Posto Delta" +
                        "[ME01] - Mercearia São José" +
                        "[SU01] - Supermercado ABC" +
                        "[PA01] - Padaria Sonhos" +
                        "[RE01] - Restaurante La Marmita");
                codigoEstabelecimento = in.nextLine();

                //Busca nome do Estabelecimento
                transacao.identicadorDoEstabelecimento = estabelecimento.buscaEstabelecimento(codigoEstabelecimento);

                //Busca localização do Estabelecimento
                transacao.localizacaoDoEstabelecimento = estabelecimento.buscaLocalizacaoEstabelecimento(codigoEstabelecimento);

                // TODO fazer as validações
                System.out.println("Qual o valor da transação?");
                transacao.valorDaTransacao = in.nextDouble();

                //Para validar a transação do VA
                if(vcombustivel.validarTransacaoVA(transacao.valorDaTransacao)){
                    transacao.dataHoraTransacao = LocalDateTime.now();

                    listaTransacoesVA.add(transacao);

                }

                System.out.println("Deseja cadastrar outro beneficiário [s] [n]?");
                continua = in.nextLine().trim().toLowerCase();

            } while (!continua.equals("n"));
        }
    }

    //Busca estabelecimento para comparar (VA)
    String buscaEstabelecimentoVA(String estabelecimento){
        listaTransacoesVA.sort();
        int i = listaTransacoesVA.size() - 1;
        if(listaTransacoesVA.get(i).identicadorDoEstabelecimento.contains(estabelecimento)){
            return listaTransacoesVA.get(i).identicadorDoEstabelecimento;
        }
    }
    //Busca ultimo valor para comparar VA
    Double buscaUltimoValorVA (Double valor){
        listaTransacoesVA.sort();
        int i = listaTransacoesVA.size() - 1;
        if (listaTransacoesVA.get(i).valorDaTransacao.equals(valor)){
            return listaTransacoesVA.get(i).valorDaTransacao;
        }

    }

    public String getIdentificadorDaTransacao() {
        return identificadorDaTransacao;
    }

    public void setIdentificadorDaTransacao(String identificadorDaTransacao) {
        this.identificadorDaTransacao = identificadorDaTransacao;
    }

    public String getIdentificadorDoCartao() {
        return identificadorDoCartao;
    }

    public void setIdentificadorDoCartao(String identificadorDoCartao) {
        this.identificadorDoCartao = identificadorDoCartao;
    }

    public LocalDateTime getDataHoraTransacao() {
        return dataHoraTransacao;
    }

    public void setDataHoraTransacao(LocalDateTime dataHoraTransacao) {
        this.dataHoraTransacao = dataHoraTransacao;
    }

    public String getIdenticadorDoEstabelecimento() {
        return identicadorDoEstabelecimento;
    }

    public void setIdenticadorDoEstabelecimento(String identicadorDoEstabelecimento) {
        this.identicadorDoEstabelecimento = identicadorDoEstabelecimento;
    }

    public String getLocalizacaoDoEstabelecimento() {
        return localizacaoDoEstabelecimento;
    }

    public void setLocalizacaoDoEstabelecimento(String localizacaoDoEstabelecimento) {
        this.localizacaoDoEstabelecimento = localizacaoDoEstabelecimento;
    }

    public String getTipoDoEstabelecimento() {
        return tipoDoEstabelecimento;
    }

    public void setTipoDoEstabelecimento(String tipoDoEstabelecimento) {
        this.tipoDoEstabelecimento = tipoDoEstabelecimento;
    }

    public Double getValorDaTransacao() {
        return valorDaTransacao;
    }

    public void setValorDaTransacao(Double valorDaTransacao) {
        this.valorDaTransacao = valorDaTransacao;
    }



}