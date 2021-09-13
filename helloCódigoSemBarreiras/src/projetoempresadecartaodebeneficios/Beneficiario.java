package projetoempresadecartaodebeneficios;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Beneficiario {

    public String nomeBeneficiario;
    public String senhaBeneficiario;
    public InterfaceCartaoDeBeneficio vaIdentificador;
    public InterfaceCartaoDeBeneficio vrIdentificador;
    public InterfaceCartaoDeBeneficio vcIdentificador;
    private LocalDateTime dataDeCadastro;

    public Beneficiario(String nomeBeneficiario, String senhaBeneficiario, InterfaceCartaoDeBeneficio vaIdentificador,
                        InterfaceCartaoDeBeneficio vrIdentificador, InterfaceCartaoDeBeneficio vcIdentificador, LocalDateTime dataDeCadastro) {
        this.nomeBeneficiario = nomeBeneficiario;
        this.senhaBeneficiario = senhaBeneficiario;
        this.vaIdentificador = vaIdentificador;
        this.vrIdentificador = vrIdentificador;
        this.vcIdentificador = vcIdentificador;
        this.dataDeCadastro = dataDeCadastro;
    }

    //Cria uma lista com os beneficiários
    public static List<Beneficiario> listaBeneficiarios = new ArrayList<>();


    public static void cadastrarBeneficiario(String nomeBeneficiario, String senhaBeneficiario,
                                             InterfaceCartaoDeBeneficio vaIdentificador, InterfaceCartaoDeBeneficio vrIdentificador,
                                             InterfaceCartaoDeBeneficio vcIdentificador, LocalDateTime dataDeCadastro) {
        var beneficiario = new Beneficiario(nomeBeneficiario, senhaBeneficiario,
                vaIdentificador, vrIdentificador, vcIdentificador, dataDeCadastro);

        try (Scanner in = new Scanner(System.in)) {

            //TODO implementar o cadastro com base na versão antiga

            System.out.println("=======================================");
            System.out.println("Cadastro de beneficiário");
            System.out.println("=======================================");
            String continua;
            do {
                System.out.println("1 - Insira o nome do beneficiário:");
                System.out.println("Insira o nome do beneficiário:");
                beneficiario.nomeBeneficiario = in.nextLine().trim();
                System.out.println("\n---------------------------------------\n");
                System.out.println("2 - Insira sua senha: ");
                System.out.println("Insira a senha de 4 dígitos do cartão:");
                beneficiario.senhaBeneficiario = in.nextLine().trim();
                System.out.println("\n---------------------------------------\n");

                //Fabricar cartões por meio do enum para salvar em variavel

                InterfaceCartaoDeBeneficio valeAlimentacao = TiposDeCartaoDeBeneficio.VA.fabricar();
                beneficiario.vaIdentificador = valeAlimentacao;
                InterfaceCartaoDeBeneficio valeCombustivel = TiposDeCartaoDeBeneficio.VC.fabricar();
                beneficiario.vcIdentificador = valeCombustivel;
                InterfaceCartaoDeBeneficio valeRefeicao = TiposDeCartaoDeBeneficio.VR.fabricar();
                beneficiario.vrIdentificador = valeRefeicao;

                System.out.println("Seus três cartões foram criados: Vale Alimentação, Vale Combustível e Vale Refeição!");
                System.out.println("Aproveite todos os nossos benefícios!");
                System.out.println("\n---------------------------------------\n");
                beneficiario.dataDeCadastro = LocalDateTime.now();

                listaBeneficiarios.add(beneficiario);

                System.out.println("Deseja cadastrar outro beneficiário [s] [n]?");
                continua = in.nextLine().trim().toLowerCase();

            } while (!continua.equals("n"));

        }

    }


    public String getNomeBeneficiario() {
        return nomeBeneficiario;
    }

    public void setNomeBeneficiario(String nomeBeneficiario) {
        this.nomeBeneficiario = nomeBeneficiario;
    }

    public String getSenhaBeneficiario() {
        return senhaBeneficiario;
    }

    public void setSenhaBeneficiario(String senhaBeneficiario) {
        this.senhaBeneficiario = senhaBeneficiario;
    }

    public InterfaceCartaoDeBeneficio getVaIdentificador() {
        return vaIdentificador;
    }

    public void setVaIdentificador(InterfaceCartaoDeBeneficio vaIdentificador) {
        this.vaIdentificador = vaIdentificador;
    }

    public InterfaceCartaoDeBeneficio getVrIdentificador() {
        return vrIdentificador;
    }

    public void setVrIdentificador(InterfaceCartaoDeBeneficio vrIdentificador) {
        this.vrIdentificador = vrIdentificador;
    }

    public InterfaceCartaoDeBeneficio getVcIdentificador() {
        return vcIdentificador;
    }

    public void setVcIdentificador(InterfaceCartaoDeBeneficio vcIdentificador) {
        this.vcIdentificador = vcIdentificador;
    }

    public LocalDateTime getDataDeCadastro() {
        return dataDeCadastro;
    }

    public void setDataDeCadastro(LocalDateTime dataDeCadastro) {
        this.dataDeCadastro = dataDeCadastro;
    }

}