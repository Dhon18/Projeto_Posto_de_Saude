/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Projeto_Posto_de_Saude;

import java.util.ArrayList;

/**
 *
 * @author dhona
 */
public class Cad_fam {
    
    private static ArrayList <Familia> familia = new ArrayList<>();

    public static ArrayList<Familia> getFamilia() {
        return familia;
    }
    static public void adicinar(Familia f){
            familia.add(f);
        }
        
    static public String listar(){
        String saida = "";
        int i = 1;
        for(Familia f:familia){
            saida += "Familia N°"+(i++)+"=====\n";
            saida += f.toString() +"\n";
        }
            return saida; //+= f. ""
            
    }
    //pesquisa familia por meio do nome do reponsável
    static public int pesquisar(String nome_Resp_Fam){
    
        for(Familia f:familia){
            if(f.getNome_Resp_Fam().equalsIgnoreCase(nome_Resp_Fam)){
        //dizer aqui o que deve ser feito
  
            }
        }
            return 0;//modifica pelo retorno correto
    }
       
    //pesquisa familia cadastradas pelo mesmo agente
    static public boolean cancelar_cadstro(String nome_Resp_Fam){

        for(Familia f:familia){
            if(f.getNome_Resp_Fam().equalsIgnoreCase(nome_Resp_Fam)){
                familia.add(f);
                return true;
            }
        }
                return true;
    }

    @Override
    public String toString() {
        return "Cad_fam{" +  '}';
    }
    
    
}
