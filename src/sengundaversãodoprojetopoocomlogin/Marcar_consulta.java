package sengundaversãodoprojetopoocomlogin;
public class Marcar_consulta {
    private String data_consulta, data_retorno,profissional;

    public Marcar_consulta() {
    }

    public Marcar_consulta(String data_consulta, String data_retorno, String profissional) {
        this.data_consulta = data_consulta;
        this.data_retorno = data_retorno;
        this.profissional = profissional;
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

    @Override
    public String toString() {
        return "Marcar_consulta{" + "data_consulta=" + data_consulta + ", data_retorno=" + data_retorno + ", profissional=" + profissional + '}';
    }
    
            
    
}
