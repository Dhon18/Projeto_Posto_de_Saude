package sengundaversãodoprojetopoocomlogin;
public abstract class Pessoa {
 
    
     private String email, senha, cpf, nome, sexo, idade, telefone, funcao, carga_horaria, registro_profissional, especializacao;
     private String data_Nascimento, nome_pai, nome_mae,numero_sus, responsavel_familia;
     
    public Pessoa() {
    }

    public Pessoa(String email, String senha, String cpf, String nome, String sexo, String idade, String telefone, String funcao, String carga_horaria, String registro_profissional, String especializacao, String data_Nascimento, String nome_pai, String nome_mae, String numero_sus, String responsavel_familia) {
        this.email = email;
        this.senha = senha;
        this.cpf = cpf;
        this.nome = nome;
        this.sexo = sexo;
        this.idade = idade;
        this.telefone = telefone;
        this.funcao = funcao;
        this.carga_horaria = carga_horaria;
        this.registro_profissional = registro_profissional;
        this.especializacao = especializacao;
        this.data_Nascimento = data_Nascimento;
        this.nome_pai = nome_pai;
        this.nome_mae = nome_mae;
        this.numero_sus = numero_sus;
        this.responsavel_familia = responsavel_familia;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
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

    

    

    
    
    
}