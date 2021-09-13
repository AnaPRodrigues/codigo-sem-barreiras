package projetoempresadecartaodebeneficios;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Transacao {

    private String identificadorDaTransacao;
    private String identificadorDoCartao;
    private LocalDateTime dataHoraTransacao;
    private String identicadorDoEstabelecimento;
    private String localizacaoDoEstabelecimento;
    private String tipoDoEstabelecimento;
    private Double valorDaTransacao;

    private Beneficiario listaBeneficio;
    private Estabelecimento listaEstabeleciomento;

    //Cria uma lista para armazenar as transações do VA
    public static List<Transacao> listaTransacoesVA = new ArrayList<>();
    //Cria uma lista para armazenar as transações do VR
    public static List<Transacao> listaTransacoesVR = new ArrayList<>();
    //Cria uma lista para armazenar as transações do VC
    public static List<Transacao> listaTransacoesVC = new ArrayList<>();

    public Transacao(String identificadorDaTransacao, String identificadorDoCartao, LocalDateTime dataHoraTransacao,
                     String identicadorDoEstabelecimento, String localizacaoDoEstabelecimento,
                     String tipoDoEstabelecimento, Double valorDaTransacao) {
        this.identificadorDaTransacao = identificadorDaTransacao;
        this.identificadorDoCartao = identificadorDoCartao;
        this.dataHoraTransacao = dataHoraTransacao;
        this.identicadorDoEstabelecimento = identicadorDoEstabelecimento;
        this.localizacaoDoEstabelecimento = localizacaoDoEstabelecimento;
        this.tipoDoEstabelecimento = tipoDoEstabelecimento;
        this.valorDaTransacao = valorDaTransacao;
    }


    //TODO implementar o método de cadastro (tipo o do beneficiario)

    //TODO método para tirar o extrato (pessoa seleciona extrato do dia ou extrato da semana, ou extrato do mês)

    public void criarTransacaoVA() {
        var transacao = new Transacao(Spring identificadorDaTransacao, String identificadorDoCartao, LocalDateTime dataHoraTransacao,
                String identicadorDoEstabelecimento, String localizacaoDoEstabelecimento,
                String tipoDoEstabelecimento, Double valorDaTransacao);

        try (Scanner in = new Scanner(System.in)) {
            System.out.println("=======================================");
            System.out.println("Cadastro de Transação no Vale Alimentação");
            System.out.println("=======================================");
            String continua;
            do {
                System.out.println("1 - Insira a que se refere esta transação:");
                transacao.identificadorDaTransacao = in.nextLine();
                System.out.println("\n---------------------------------------\n");
                transacao.identificadorDoCartao = "Vale Alimentação";
                transacao.dataHoraTransacao = LocalDateTime.now();
                System.out.println("Em qual estabelecimento foi gasto:" +
                        "1 - Posto Delta" +
                        "2 - Mercearia São José" +
                        "3 - Supermercado ABC" +
                        "4 - Padaria Sonhos" +
                        "5 - Restaurante La Marmita");
                transacao.identicadorDoEstabelecimento = listaEstabeleciomento.



            } while (continua);
        }
    }

    public Long getIdentificadorDaTransacao() {
        return identificadorDaTransacao;
    }

    public void setIdentificadorDaTransacao(Long identificadorDaTransacao) {
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