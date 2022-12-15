package Projeto_Posto_de_Saude;
public class Pasciente  extends Pessoa{
    
    private String data_Nascimento, nome_pai, nome_mae,numero_sus, responsavel_familia;

    public Pasciente() {
    }

    public Pasciente(String data_Nascimento, String nome_pai, String nome_mae, String numero_sus, String responsavel_familia, String email, String cpf, String nome, String sexo, String idade, String telefone) {
        super(email, cpf, nome, sexo, idade, telefone);
        this.data_Nascimento = data_Nascimento;
        this.nome_pai = nome_pai;
        this.nome_mae = nome_mae;
        this.numero_sus = numero_sus;
        this.responsavel_familia = responsavel_familia;
    }

    public String getData_Nascimento() {
        return data_Nascimento;
    }

    public void setData_Nascimento(String data_Nascimento) {
        this.data_Nascimento = data_Nascimento;
    }

    public String getNome_pai() {
        return nome_pai;
    }

    public void setNome_pai(String nome_pai) {
        this.nome_pai = nome_pai;
    }

    public String getNome_mae() {
        return nome_mae;
    }

    public void setNome_mae(String nome_mae) {
        this.nome_mae = nome_mae;
    }

    public String getNumero_sus() {
        return numero_sus;
    }

    public void setNumero_sus(String numero_sus) {
        this.numero_sus = numero_sus;
    }

    public String getResponsavel_familia() {
        return responsavel_familia;
    }

    public void setResponsavel_familia(String responsavel_familia) {
        this.responsavel_familia = responsavel_familia;
    }

    @Override
    public String toString() {
        return null;
    }
    
}
    
