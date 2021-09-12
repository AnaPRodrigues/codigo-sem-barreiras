package projetoempresadecartaodebeneficios;

import java.time.LocalDate;
import java.util.ArrayList;

public abstract class CartaoDeBeneficio {

    //Crias as variáveis necessárias para classe
    protected String identificadorCartao;
    protected Double saldoCartao = 1000.0;
    protected LocalDate dataDoCadastro;
    protected LocalDate validadeCartao;
    protected String nomeBeneficiario;

    public CartaoDeBeneficio(String identificadorCartao, Double saldoCartao, LocalDate dataDoCadastro,
                                LocalDate validadeCartao, String nomeBeneficiario) {
        this.identificadorCartao = identificadorCartao;
        this.saldoCartao = saldoCartao;
        this.dataDoCadastro = dataDoCadastro;
        this.validadeCartao = validadeCartao;
        this.nomeBeneficiario = nomeBeneficiario;
    }

    public void mostrarSaldo() {

        System.out.printf("%s, seu saldo atual é: %.2f.%n", this.nomeBeneficiario, saldoCartao);
    }

    void adicionarTransacao (Double valor) {

    }

}