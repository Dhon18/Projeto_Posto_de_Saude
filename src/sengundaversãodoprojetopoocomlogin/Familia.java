/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sengundaversãodoprojetopoocomlogin;

import java.util.Calendar;

/**
 *
 * @author dhona
 */
public class Familia {

    private  String prof_resp;
    private  Calendar data_cadastro;
    private  String logradouro;
    private  String numero;
    private  String bairro;
    private  String município;
    private  String cep;
    private  String telefone;
    private  String nome_Resp_Fam;//ver como ligar ao cadstro de de pacientes
    private  int quant_membros;
    private  float renda_fam;
    private  String cond_moradia;//substituir pelo eneum (próprio ,alugado, cedido)
    private  String locacao;//criar opção(urbana ou rural)
    private  String abastec_agua;//(poço, cisterna, Rio ou encanada)
    private  String agua_p_cons;//(filtrado, fervido, sem tratamento)
    private  String pets;//iniciar com false
    private  int quant_pets;//iniciar com 0
    private  int tipo_do_pets;// (felino, cão, ave )
    
    public Familia() {
    }
    /**
     *
     * @param prof_resp
     * @param data_cadastro
     * @param logradouro
     * @param numero
     * @param bairro
     * @param município
     * @param cep
     * @param telefone
     * @param nome_Resp_Fam
     * @param quant_membros
     * @param renda_fam
     * @param cond_moradia
     * @param locacao
     * @param abastec_agua
     * @param agua_p_cons
     * @param pets
     * @param quant_pets
     * @param tipo_do_pets
     */
    public Familia(String prof_resp, Calendar data_cadastro, String logradouro, String numero, String bairro, String município, String cep, String telefone, String nome_Resp_Fam, int quant_membros, float renda_fam, String cond_moradia, String locacao, String abastec_agua, String agua_p_cons, String pets, int quant_pets, int tipo_do_pets) {
        this.prof_resp = prof_resp;
        this.data_cadastro = data_cadastro;
        this.logradouro = logradouro;
        this.numero = numero;
        this.bairro = bairro;
        this.município = município;
        this.cep = cep;
        this.telefone = telefone;
        this.nome_Resp_Fam = nome_Resp_Fam;
        this.quant_membros = quant_membros;
        this.renda_fam = renda_fam;
        this.cond_moradia = cond_moradia;
        this.locacao = locacao;
        this.abastec_agua = abastec_agua;
        this.agua_p_cons = agua_p_cons;
        this.pets = pets;
        this.quant_pets = quant_pets;
        this.tipo_do_pets = tipo_do_pets;
    }

    
    public String getProf_resp() {
        return prof_resp;
    }

    public void setProf_resp(String prof_resp) {
        this.prof_resp = prof_resp;
    }

    public Calendar getData_cadastro() {
        return data_cadastro;
    }

    public void setData_cadastro(Calendar data_cadastro) {
        this.data_cadastro = data_cadastro;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getMunicípio() {
        return município;
    }

    public void setMunicípio(String município) {
        this.município = município;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getNome_Resp_Fam() {
        return nome_Resp_Fam;
    }

    public void setNome_Resp_Fam(String nome_Resp_Fam) {
        this.nome_Resp_Fam = nome_Resp_Fam;
    }

    public int getQuant_membros() {
        return quant_membros;
    }

    public void setQuant_membros(int quant_membros) {
        this.quant_membros = quant_membros;
    }

    public float getRenda_fam() {
        return renda_fam;
    }

    public void setRenda_fam(float renda_fam) {
        this.renda_fam = renda_fam;
    }

    public String getCond_moradia() {
        return cond_moradia;
    }

    public void setCond_moradia(String cond_moradia) {
        this.cond_moradia = cond_moradia;
    }

    public String getLocacao() {
        return locacao;
    }

    public void setLocacao(String locacao) {
        this.locacao = locacao;
    }

    public String getAbastec_agua() {
        return abastec_agua;
    }

    public void setAbastec_agua(String abastec_agua) {
        this.abastec_agua = abastec_agua;
    }

    public String getAgua_p_cons() {
        return agua_p_cons;
    }

    public void setAgua_p_cons(String agua_p_cons) {
        this.agua_p_cons = agua_p_cons;
    }

    public String getPets() {
        return pets;
    }

    public void setPets(String pets) {
        this.pets = pets;
    }

    public int getQuant_pets() {
        return quant_pets;
    }

    public void setQuant_pets(int quant_pets) {
        this.quant_pets = quant_pets;
    }

    public int getTipo_do_pets() {
        return tipo_do_pets;
    }

    public void setTipo_do_pets(int tipo_do_pets) {
        this.tipo_do_pets = tipo_do_pets;
    }

    @Override
    public String toString() {
        return ", quantidade de pets = " +
                "Cadastro de fam{" + "profissional responsável = " + prof_resp + ", data do cadastro = " + data_cadastro + ", logradouro = " + logradouro +
                ", numero = " + numero + ", bairro = " + bairro + ", munic\u00edpio = " + município + ", cep = " + cep + ", telefone = " + telefone +
                ", nome_Resp_Fam=" + nome_Resp_Fam + ", quant_membros=" + quant_membros + ", renda_fam=" + renda_fam + ", cond_moradia = " + cond_moradia +
                ", locacao=" + locacao + ", abastec_agua = " + abastec_agua + ", agua_p_cons = " + agua_p_cons + ", pets = " + pets + quant_pets + ", tipo de pets = " + tipo_do_pets + '}';
    }
}


    
