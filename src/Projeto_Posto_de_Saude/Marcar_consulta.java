package Projeto_Posto_de_Saude;
public class Marcar_consulta {
    private String data_consulta, data_retorno,profissional, nome_pac;

    public Marcar_consulta() {
    }

    public Marcar_consulta(String data_consulta, String data_retorno, String profissional, String nome_pac) {
        this.data_consulta = data_consulta;
        this.data_retorno = data_retorno;
        this.profissional = profissional;
        this.nome_pac = nome_pac;
    }


    public String getData_consulta() {
        return data_consulta;
    }

    public void setData_consulta(String data_consulta) {
        this.data_consulta = data_consulta;
    }

    public String getData_retorno() {
        return data_retorno;
    }

    public void setData_retorno(String data_retorno) {
        this.data_retorno = data_retorno;
    }

    public String getProfissional() {
        return profissional;
    }

    public void setProfissional(String profissional) {
        this.profissional = profissional;
    }

    public String getNome_pac() {
        return nome_pac;
    }

    public void setNome_pac(String nome_pac) {
        this.nome_pac = nome_pac;
    }

    @Override
    public String toString() {
        return "Marcar_consulta{" + "data_consulta=" + data_consulta + ", data_retorno=" + data_retorno + ", profissional=" + profissional + ", nome_pac=" + nome_pac + '}';
    }

    
    
            
    
}
