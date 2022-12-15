package Projeto_Posto_de_Saude;
public class LoginInicialCad {
   
    private String nome1, senha2;

    public LoginInicialCad() {
    }

    public LoginInicialCad(String nome1, String senha2) {
        this.nome1 = nome1;
        this.senha2 = senha2;
    }

    public String getNome1() {
        return nome1;
    }

    public void setNome1(String nome1) {
        this.nome1 = nome1;
    }

    public String getSenha2() {
        return senha2;
    }

    public void setSenha2(String senha2) {
        this.senha2 = senha2;
    }
}