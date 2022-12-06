package sengundaversãodoprojetopoocomlogin;
import java.util.ArrayList;
public class ClassUsuariosCadastrados {

    //FUNÇÃO PARA PEGAR TODO O ARRAY LIST DE LOGININICIALCAD
    public ArrayList<LoginInicialCad> getUsuario1() {
        return usuario1;
    }

    //ARRAY LIST PARA CLASS LoginInicialCad, ELA SERA RESPONSAVEL POR ARMAZENAR TODAS AS INFORMAÇÕES
    //LOGININICIALCAD
    public void setUsuario1(ArrayList<LoginInicialCad> usuario1) {
        this.usuario1 = usuario1;
    }
    //RECEBIDA EM LoginInicialCad
    ArrayList<LoginInicialCad> usuario1 = new ArrayList();
    
    public void adcionafuncionarios(LoginInicialCad b){
    usuario1.add(b);
}
    
    
}