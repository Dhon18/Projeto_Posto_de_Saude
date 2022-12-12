package sengundaversãodoprojetopoocomlogin;
public class Funcionarios  extends Pessoa implements Interface {
    
   private String funcao;
   private String carga_horaria;
   private String registro_profissional;
   private String especializacao;
   private double val_hora;

    public Funcionarios() {
        
    }

    
    public Funcionarios(String funcao, String carga_horaria, String registro_profissional, String especializacao, double salario, String email, String cpf, String nome, String sexo, String idade, String telefone) {
        super(email, cpf, nome, sexo, idade, telefone);
        this.funcao = funcao;
        this.carga_horaria = carga_horaria;
        this.registro_profissional = registro_profissional;
        this.especializacao = especializacao;
        this.val_hora = val_hora;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public String getCarga_horaria() {
        return carga_horaria;
    }

    public void setCarga_horaria(String carga_horaria) {
        this.carga_horaria = carga_horaria;
    }

    public String getRegistro_profissional() {
        return registro_profissional;
    }

    public void setRegistro_profissional(String registro_profissional) {
        this.registro_profissional = registro_profissional;
    }

    public String getEspecializacao() {
        return especializacao;
    }

    public void setEspecializacao(String especializacao) {
        this.especializacao = especializacao;
    }

    public double getVal_hora() {
        return val_hora;
    }

    public void setVal_hora(double val_hora) {
        this.val_hora = val_hora;
    }

    @Override
    public double calculaSalario() {
        double novo_sala = 0;
        novo_sala = Double.parseDouble((carga_horaria))*val_hora*4;
        
        return novo_sala;
    }

    @Override
    public String toString() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   
   

    

}