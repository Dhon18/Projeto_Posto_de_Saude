package Projeto_Posto_de_Saude;
//IMPORTAÇÃO PARA USO DOS ARRAY LIST
import java.util.ArrayList;
import java.util.Calendar;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.*;
import static Projeto_Posto_de_Saude.Cad_fam.adicinar;
public class Projeto_Posto_de_Saude {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
    ArrayList<Marcar_consulta> MC = new ArrayList();    
    //ARRAY LIST PARA CLASS FUNCIONARIO
    ArrayList<Funcionarios> usuario = new ArrayList();
    //ARRAY LIST PARA CLASS PASCIENTE
    ArrayList<Pasciente> usuariopasciente = new ArrayList();
    
    ClassUsuariosCadastrados cadastradosuser = new ClassUsuariosCadastrados();
    Familia nova_fam = null;

        //VARIAVEL I ESTA SENDO USADA EM TODOS OS LAÇOS FOR PARA CONSULTA E PESQUISA
        int i, id=0, mar=0;
        int menu = 0;
        //FOI DECLARADA ESTA VARIAVEL E DADO A CONDIÇÃO DE ENQUANTO FOSSE VERDADEIRO ELA CONTINUARIA
        //RODANDO MESMO APÓS SER EXECUTADO
        
        boolean constante = true;   
        while(constante){
            
       //ESTA PRIMEIRA PARTE FUNCIONA COMO LOGIN OU CADASTRAR USUARIO PARA QUE POSSA FAZER UM LOGIN
       //CASO O USUARIO NO LOGIN NÃO FOR IDENTIFICADO ELE NÃO ACESSARA O MENU PRINCIPAL
        try{
        //COMANDO PARA LIMPAR O BULFER DO TECLADO PARA NÃO BUGAR NO LAÇO
        leia = new Scanner(System.in);
        System.out.println("***********************************");
        System.out.println("***********************************");
        System.out.println("1 - Cadastrar Usuario: ");
        System.out.println("2 - Logar: ");
        System.out.println("***********************************");
        System.out.println("***********************************");
        menu = leia.nextInt();
        }catch(InputMismatchException e){
                    System.out.println("====ERRO DE ENTRADA====");
                    System.out.println("DIGITE UM VALOR INTEIRO DAS POSIÇÕES ACIMA");
                    menu = 7;
        }

        System.out.println("\n \n \n");
        //ESSA PRIMEIRA PARTE DO CÓDIGO OPÇÃO UM FARÁ O CADASTRO DO FUNCIONARIO PARA QUE POSSA CONSEGUIR
        // FAZER O LOGIN
        switch(menu){
            case 1:{
                leia = new Scanner(System.in);
                System.out.println("\n \n \n");
                System.out.println("====CADASTRO DE USUARIO====");
                   
                
                System.out.println("***********************************");
                System.out.println("***********************************");
                System.out.println("Nome completo: ");
                String nome1 = leia.nextLine();
                System.out.println("Senha: ");
                String senha2 = leia.nextLine();               
                System.out.println("***********************************");
                System.out.println("***********************************");

                LoginInicialCad funcionario = new LoginInicialCad();
                funcionario.setNome1(nome1);
                funcionario.setSenha2(senha2);               
                cadastradosuser.adcionafuncionarios(funcionario);
                
                System.out.println("\n \n \n");
                break;
                
            }
             
            //ESSA É A OPÇÃO DOIS CASO FOR FAZER O LOGIN DO FUNCIONARIO CADASTRADO
            //SÓ CONSEGUIRA ACESSAR SE CASO FOR ACHADO NA LISTA DE CADASTRO DO FUNCIONARIO
                case 2:{
                leia = new Scanner(System.in);
                System.out.println("\n \n \n");
                System.out.println("====LOGIN DE USUARIO==== \n");
                
                
                System.out.println("***********************************");
                System.out.println("***********************************");
                System.out.println("Digite o Nome completo: ");
                String nome1 = leia.nextLine();          
                System.out.println("Digite a Senha: ");
                String senha2 = leia.nextLine();
                System.out.println("***********************************");
                System.out.println("***********************************");

                
                //ESSA PARTE É RESPONSAVEL POR FAZER A BUSCA DO LOGIN DO USUARIO
                //CASO SEJA VERDADEIRO ELE TERÁ O ACESSO PERMITIDO, CASO CONTRARIO
                //ELE RETORNA PARA O LOGIN NOVAMENTE
                for( i = 0 ; i < cadastradosuser.getUsuario1().size() ; i++){
                    LoginInicialCad funcionario1 = cadastradosuser.getUsuario1().get(i);
                    
                    if(senha2.equals(funcionario1.getSenha2()) && nome1.equals(funcionario1.getNome1())){
                        System.out.println("Acesso Permitido!!");
                      
   //FOI DECLARADA ESTA VARIAVEL E DADO A CONDIÇÃO DE ENQUANTO FOSSE VERDADEIRO ELA CONTINUARIA
   //RODANDO MESMO APÓS SER EXECUTADO                     
   boolean repitamenu = true;   
   while(repitamenu){
       
       //ESTE É O MENU PRINCIPAL PARA A ESCOLHA DO FUNCIONARIO
        System.out.println("1 - Cadastrar Funcionario: ");
        System.out.println("2 - Listar Todos os Funcionario: ");
        System.out.println("3 - Pesquisar Funcionario por CPF: ");
        System.out.println("4 - Atualizar Dados do Funcionario: ");
        System.out.println("5 - Remover Funcionario: ");
        System.out.println("**************************************");
        System.out.println("6 - Cadastrar Pascientes: ");
        System.out.println("7 - Listar Todos os Pacientes");
        System.out.println("8 - Pesquisar Pacientes por CPF: ");
        System.out.println("9 - Atualizar Dados do Pacientes: ");
        System.out.println("10 - Remover Pacientes: ");
        System.out.println("**************************************");
        System.out.println("11 - Cadastrar Familia: ");
        System.out.println("12 - Marcar consulta: ");
        //Marcar data de retorno dentro da opção 12 só que na primeira marcação deixa o campo retorno 00/00/0000
        System.out.println("13 - Marcar Retorno");
        System.out.println("14 - Sair");
        System.out.println("Digite o que Deseja ?: ");
        String menu1 = leia.nextLine();
        System.out.println("\n \n \n");
        
        //ABAIXO VEM AS OPÇÕES QUE ESTÃO NO MENU
        switch(menu1){
            case "1":{
                System.out.println("\n \n \n");
                System.out.println("====CADASTRO DE FUNCIONARIO====");
                
                
                System.out.println("Nome completo: ");
                String nome = leia.nextLine();
                
                System.out.println("Email: ");
                String email = leia.nextLine();
                
                System.out.println("Sexo: ");
                String sexo = leia.nextLine();
                
                System.out.println("Idade: ");
                String idade = leia.nextLine();
                
                System.out.println("CPF: ");
                String cpf = leia.nextLine();
                
                System.out.println("Telefone: ");
                String telefone = leia.nextLine();
                
                System.out.println("*******************");
                System.out.println("DADOS PROFICIONAIS");
                System.out.println("*******************");
                
               
               
                
                System.out.println("Funcao 1(Clinico) 2 (DENTISTA): ");
                int funcao = leia.nextInt();
                T_funcionario t_funcionario = T_funcionario.values()[funcao-1];
                
                
                
                System.out.println("Carga Horária: ");
                String carga_horaria = leia.nextLine();
                System.out.println("Registro Profissional: ");
                String registro_profissional = leia.nextLine();
                System.out.println("Especialização: ");
                String especializacao = leia.nextLine();
               
                //T_funcionario t_funcionario = T_funcionario.DENTISTA;

                
                
                Funcionarios funcionario2 = new Funcionarios();
                funcionario2.setSexo(sexo);
                funcionario2.setIdade(idade);
                funcionario2.setNome(nome);
                funcionario2.setEmail(email);
                funcionario2.setCpf(cpf);
                funcionario2.setTelefone(telefone);
                //funcionario2.setFuncao(funcao);
                funcionario2.setTFuncionario(t_funcionario);

                funcionario2.setCarga_horaria(carga_horaria);
                funcionario2.setRegistro_profissional(registro_profissional);
                funcionario2.setEspecializacao(especializacao);
                funcionario2.setTFuncionario(t_funcionario);
                usuario.add(funcionario2);
                System.out.println("\n \n \n");
                break;
                
            }
            case "2":{
                System.out.println("\n \n \n");
                System.out.println("====LISTA DE FUNCIONARIOS CADASTRADOS NO SUS====");
                for( i = 0 ; i < usuario.size(); i++){
                    System.out.println("\n \n \n");
                    System.out.println("******************************************************");
                    System.out.println("Funcionario"+"["+i+"]"+"O Email do Funcionario " + i + " é:" + usuario.get(i).getEmail());
                    System.out.println("O CPF do Funcionario " + i + " é:" + usuario.get(i).getCpf());
                    System.out.println("O nome do Funcionario " + i + " é:" + usuario.get (i).getNome());
                    System.out.println("O sexo do Funcionario " + i + " é:" + usuario.get(i).getSexo());
                    System.out.println("A idade do Funcionario é " + i + " é:" + usuario.get(i).getIdade());
                    System.out.println("O telefone do funcionario é " + i + " é:" + usuario.get(i).getTelefone());
                    System.out.println("A Função do funcionario é " + i + " é:" + usuario.get(i).getT_Funcionario().name());
                    System.out.println("******************************************************");
                    System.out.println("\n \n \n");
                }
                
                break;
            }
            case "3":{
                System.out.println("===PROCURAR FUNCIONARIO POR CPF====");
                System.out.println("Digite o CPF: ");
                String cpf = leia.nextLine();
                for( i = 0 ; i < usuario.size() ; i++){
                    Funcionarios pegarinformacao = usuario.get(i);
                    if(cpf.equals(pegarinformacao.getCpf())){
                        System.out.println("\n \n \n");
                        System.out.println("******************************************************");
                        System.out.println("====FUNCIONARIO ENCONTRADO NO SISTEMA====");
                        System.out.println("Email: "+pegarinformacao.getEmail());
                        System.out.println("Idade: "+pegarinformacao.getIdade());
                        System.out.println("Nome: " +pegarinformacao.getNome());
                        System.out.println("Sexo: " +pegarinformacao.getSexo());
                        System.out.println("CPF: " +pegarinformacao.getCpf());
                        System.out.println("Telefone: " +pegarinformacao.getTelefone());
                        System.out.println("");
                        System.out.println("******************************************************");
                        System.out.println("\n \n \n");
                        break;
                    }else{
                        System.out.println("\n \n \n");
                        System.out.println("******************************************************");
                        System.out.println("====FUNCIONARIO NÃO ENCONTRADO NO SISTEMA====");
                        System.out.println("******************************************************");
                        System.out.println("\n \n \n");
                    }
                }
                break;
            }
            case "4":{
                System.out.println("\n \n \n");
                System.out.println("===ATUALIZAR DADOS DO FUNCIONARIO====");
                System.out.println("\n \n \n");
                
                for( i = 0 ; i < usuario.size() ; i++){
                    Funcionarios pegarinformacao = usuario.get(i);
                    System.out.println("["+i+"]" + pegarinformacao.getEmail());
                }
                try{
                System.out.println("\n \n \n");
                System.out.println("QUAL NUMERO DO FUNCIONARIO VOCÊ DESEJA ATUALIZAR OS DADOS?");
                id = leia.nextInt();
                leia.nextLine();
                System.out.println("\n \n \n");
                }catch(InputMismatchException e){
                    System.out.println("====ERRO DE ENTRADA====");
                    System.out.println("DIGITE UM VALOR INTEIRO DAS POSIÇÕES ACIMA");
                }catch(ArrayIndexOutOfBoundsException e){ //Informa que estourou o limite do vetor   
                System.out.println("====VOCÊ ESTOUROU O LIMITE MAXIMO DO VETOR====");
                leia = new Scanner(System.in);
                int b=1;
                }
                
                System.out.print("Digite um novo email de alteração: ");
                String atualizacaoemail = leia.nextLine();
                
                System.out.print("Digite um novo sexo de alteração: ");
                String atualizacaosexo = leia.nextLine();
                
                System.out.println("Digite um novo nome de alteração: ");
                String atualizacaonome = leia.nextLine();
                
                System.out.println("Digite uma nova idade de alteração: ");
                String atualizacaoidade = leia.nextLine();
                
                System.out.println("Digite um novo CPF para alteração: ");
                String atualizacaocpf = leia.nextLine();
                
                System.out.println("Digite um novo Telefone para alteração: ");
                String atualizacaotelefone = leia.nextLine();
                
                Funcionarios funcionario = usuario.get(id);
                funcionario.setEmail(atualizacaoemail);
                funcionario.setSexo(atualizacaosexo);
                funcionario.setNome(atualizacaonome);
                funcionario.setIdade(atualizacaoidade);
                funcionario.setCpf(atualizacaocpf);
                funcionario.setTelefone(atualizacaotelefone);
                System.out.println("\n \n \n");
                System.out.println("******************************************************");
                System.out.println("******************************************************");
                System.out.println("====FUNCIONARIO ATUALIZADO COM SUCESSO====");
                System.out.println("******************************************************");
                System.out.println("******************************************************");
                System.out.println("\n \n \n");
                break;
            }
            case "5":{
                System.out.println("\n \n \n");
                System.out.println("====REMOVER UM FUNCIONARIO====");
                for( i = 0 ; i < usuario.size() ; i++){
                    Funcionarios pegarinformacao = usuario.get(i);
                    System.out.println("["+i+"]" + pegarinformacao.getEmail());
                }
                System.out.println("QUAL NUMERO DE FUNCIONARIO VOCÊ DESEJA REMOVER?");
                id = leia.nextInt();
                usuario.remove(id);
                break;
            }
            /*case "11":{
                repitamenu = false;
                leia.nextLine();
                break;
                }
            */
            
            
//**********************************************************************************************************************
            
            
            case "6":{
                System.out.println("\n \n \n");
                System.out.println("====CADASTRO DE PASCIENTE====");
                
                System.out.println("Email: ");
                String email = leia.nextLine();
                
                System.out.println("CPF: ");
                String cpf = leia.nextLine();
                
                System.out.println("Nome completo: ");
                String nome = leia.nextLine();
                
                System.out.println("Data de Nasciemnto: ");
                String data_Nascimento = leia.nextLine();
                
                System.out.println("Nome Pai: ");
                String nome_pai = leia.nextLine();
                
                System.out.println("Nome da Mãe: ");
                String nome_mae = leia.nextLine();
                
                System.out.println("N° SUS: ");
                String numero_sus = leia.nextLine();
                
                System.out.println("Nome do Responsavel pela Familia: ");
                String responsavel_familia = leia.nextLine();
                
                Pasciente pasciente = new Pasciente();
                pasciente.setNome(nome);
                pasciente.setEmail(email);
                pasciente.setCpf(cpf);              
                pasciente.setData_Nascimento(data_Nascimento);
                pasciente.setNome_pai(nome_pai);
                pasciente.setNome_mae(nome_mae);
                pasciente.setNumero_sus(numero_sus);
                pasciente.setResponsavel_familia(responsavel_familia);
                usuariopasciente.add(pasciente);
                System.out.println("\n \n \n");
                break;
            }
            case "7":{
                System.out.println("\n \n \n");
                System.out.println("====LISTA DE PACIENTES CADASTRADOS NO SUS====");
                for( i = 0 ; i < usuariopasciente.size(); i++){
                    //Funcionarios pegarinformacao = usuario.get(i);
                    System.out.println("\n \n \n");
                    System.out.println("******************************************************");
                System.out.println("Funcionario"+"["+i+"]"+"O Email do Funcionario " + i + " é:" + usuariopasciente.get(i).getEmail());
                System.out.println("O CPF do Pasciente " + i + " é:" + usuariopasciente.get(i).getCpf());
                System.out.println("O nome do Pasciente " + i + " é:" + usuariopasciente.get (i).getNome());
                System.out.println("Data de Nascimento " + i + " é:" + usuariopasciente.get(i).getData_Nascimento());
                System.out.println("Nome do Pai " + i + " é:" + usuariopasciente.get(i).getNome_pai());
                System.out.println("Nome da Mãe " + i + " é:" + usuariopasciente.get(i).getNome_mae());
                System.out.println("N° SUS " + i + " é:" + usuariopasciente.get(i).getNumero_sus());
                System.out.println("Responsável pela familia " + i + " é:" + usuariopasciente.get(i).getResponsavel_familia());
                    System.out.println("******************************************************");
                    System.out.println("\n \n \n");
                }
                
                break;
            }
            case "8":{
                System.out.println("===PROCURAR PASCIENTES POR CPF====");
                System.out.println("Digite o CPF: ");
                String cpf = leia.nextLine();
                for( i = 0 ; i < usuariopasciente.size() ; i++){
                    Pasciente pegarinformacaopasciente = usuariopasciente.get(i);
                    if(cpf.equals(pegarinformacaopasciente.getCpf())){
                        System.out.println("\n \n \n");
                        System.out.println("******************************************************");
                        System.out.println("====PASCIENTE ENCONTRADO NO SISTEMA====");
                        System.out.println("Email: "+pegarinformacaopasciente.getEmail());
                        System.out.println("CPF: "+pegarinformacaopasciente.getCpf());
                        System.out.println("Nome: " +pegarinformacaopasciente.getNome());
                        System.out.println("Data de Nascimento: " +pegarinformacaopasciente.getData_Nascimento());
                        System.out.println("Nome da Mãe: " +pegarinformacaopasciente.getNome_mae());
                        System.out.println("Nome do Pai: " +pegarinformacaopasciente.getNome_pai());
                        System.out.println("N° SUS: " +pegarinformacaopasciente.getNumero_sus());
                        System.out.println("Nome: " +pegarinformacaopasciente.getResponsavel_familia());
                        System.out.println("******************************************************");
                        System.out.println("\n \n \n");
                        break;
                    }else{
                        System.out.println("\n \n \n");
                        System.out.println("******************************************************");
                        System.out.println("====PASCIENTES NÃO ENCONTRADO NO SISTEMA====");
                        System.out.println("******************************************************");
                        System.out.println("\n \n \n");
                    }
                }
                break;
            }
            case "9":{
                System.out.println("\n \n \n");
                System.out.println("===ATUALIZAR DADOS DO PACIENTES====");
                System.out.println("\n \n \n");
                
                for( i = 0 ; i < usuariopasciente.size() ; i++){
                    Pasciente pegarinformacaopasciente = usuariopasciente.get(i);
                    System.out.println("["+i+"]" + pegarinformacaopasciente.getEmail());
                }
                
                System.out.println("\n \n \n");
                System.out.println("QUAL NUMERO DO PASCIENTES VOCÊ DESEJA ATUALIZAR OS DADOS?");
                id = leia.nextInt();
                leia.nextLine();
                System.out.println("\n \n \n");
                
                System.out.print("Digite um novo email de alteração: ");
                String atualizacaoemailpasciente = leia.nextLine();
                
                System.out.print("Digite uma nova cpf de alteração: ");
                String atualizacaocpfpasciente = leia.nextLine();
                
                System.out.println("Digite un novo nome de alteração: ");
                String atualizacaonomepasciente = leia.nextLine();
                
                System.out.println("n° sus: ");
                String atualizacaonumerosuspasciente = leia.nextLine();
                
                System.out.println("Nome da Mãe: ");
                String atualizacaonomemaepasciente = leia.nextLine();
                
                System.out.println("Nome do Pai: ");
                String atualizacaonomepaipasciente = leia.nextLine();
                
                System.out.println("Telefone: ");
                String atualizacaotelefonepasciente = leia.nextLine();
                
                System.out.println("Data de Nascimento: ");
                String atualizacaodatadenascimentopasciente = leia.nextLine();
                
                System.out.println("Responsável pela Familia: ");
                String atualizacaoresponsavelfamiliapasciente = leia.nextLine();
                
                //Esta nome pegarinformacaopasciente2 é um metodo que está ligada a classe Pasciente
                Pasciente pegarinformacaopasciente2 = usuariopasciente.get(id);
                pegarinformacaopasciente2.setEmail(atualizacaoemailpasciente);
                pegarinformacaopasciente2.setCpf(atualizacaocpfpasciente);
                pegarinformacaopasciente2.setNome(atualizacaonomepasciente);
                pegarinformacaopasciente2.setNumero_sus(atualizacaonumerosuspasciente);
                pegarinformacaopasciente2.setNome_mae(atualizacaonomemaepasciente);
                pegarinformacaopasciente2.setNome_pai(atualizacaonomepaipasciente);
                pegarinformacaopasciente2.setTelefone(atualizacaotelefonepasciente);
                pegarinformacaopasciente2.setData_Nascimento(atualizacaodatadenascimentopasciente);
                pegarinformacaopasciente2.setResponsavel_familia(atualizacaoresponsavelfamiliapasciente);
                
                
                System.out.println("\n \n \n");
                System.out.println("******************************************************");
                System.out.println("******************************************************");
                System.out.println("====PASCIENTES ATUALIZADO COM SUCESSO====");
                System.out.println("******************************************************");
                System.out.println("******************************************************");
                System.out.println("\n \n \n");
                break;
            }
            case "10":{
                System.out.println("\n \n \n");
                
                System.out.println("====REMOVER UM PASCIENTES====");
                
                for( i = 0 ; i < usuariopasciente.size() ; i++){
                    Pasciente pegarinformacaopasciente2 = usuariopasciente.get(i);
                    System.out.println("["+i+"]" + pegarinformacaopasciente2.getEmail());
                }
                System.out.println("QUAL NUMERO DE PASCIENTES VOCÊ DESEJA REMOVER?");
                id = leia.nextInt();
                usuariopasciente.remove(id);
                break;
                                        }
            
            case "11":{
                //leia = new Scanner(System.in);
                System.out.println("\n \n \n");
                System.out.println("====CADASTRAR FAMÍLIA====");
                System.out.println("---------------------------");
                System.out.println("Data do cadastro");
                
                Calendar c = Calendar.getInstance();
                System.out.print(c.get(Calendar.DAY_OF_MONTH)+"/");
                System.out.print(c.get(Calendar.MONTH)+"/");
                System.out.print(c.get(Calendar.YEAR)+"/");
                System.out.println("\n \n \n");
                System.out.println("Responsável pelo cadastro :");
                String prof_resp = leia.nextLine();
                System.out.println("Responsável pela familia:");
                String nome_Resp_Fam = leia.nextLine();
                // String nome_Resp_Fam;//ver como ligar ao cadstro de de pacientes
                System.out.println("Logradouro :");  
                String logradouro = leia.nextLine();
                System.out.println("bairro");
                String bairro = leia.nextLine();
                System.out.println("Numero");
                String numero= leia.nextLine();
                System.out.println("Municipio");
                String município= leia.nextLine();
                System.out.println("CEP");
                String cep = leia.nextLine();
                System.out.println("Telefone");
                String telefone= leia.nextLine();
                System.out.println("Quantas pessoas habitam na residência?");
                int quant_membros = leia.nextInt();
                System.out.println("Qual a renda da família ?");
                float renda_fam = leia.nextFloat();
                System.out.println("Sua casa é próprio ,alugado, cedido?");
                String cond_moradia = leia.nextLine();
                //substituir pelo enum (próprio ,alugado, cedido)
                System.out.println("Locação urbana ou rural?");
                String locacao = leia.nextLine();
                System.out.println("O abastecimento de agua é poço, cisterna, Rio ou encanada?");
                String abastec_agua = leia.nextLine();
                System.out.println("A àgua para consumo é filtrado, fervido, ou sem tratamento ?");
                String agua_p_cons = leia.nextLine();
                System.out.println("Exístem animais na residencia? sim/nao");
                String pets = leia.nextLine();
                //if(("s".equals(pets))||("S".equals(pets))){
                    System.out.println("Quantos pets?");
                    int quant_pets = leia.nextInt();
                    System.out.println("qual/quais o tipo/os de pet/s ?1 felino, 2 cão, 3 ave, 4 outro");
                    int tipo_do_pets = leia.nextInt();
                //CHAMADA DO MÉTODO CADASTRA FAMÍLIA 
                nova_fam = new Familia ();
                Cad_fam.adicinar(nova_fam);
                System.out.println(nova_fam);
    
            }
//*************************************************************************************************
            case "12":{
                Marcar_consulta marcar = new Marcar_consulta();
                System.out.println("=====MARCAR CONSULTA=====");
                System.out.println("\n");
                
                System.out.println("Nome do Paciente: ");
                String nome_pasciente = leia.nextLine();
                
                System.out.println("Data da Consulta: ");
                String data_de_consulta = leia.nextLine();
                
                System.out.println("Especialista: ");
                String especialista = leia.nextLine();
                
                System.out.println("Data de Retorno: ");
                String data_retornar = leia.nextLine();
                
                marcar.setNome_pac(nome_pasciente);
                marcar.setData_consulta(data_de_consulta);
                marcar.setProfissional(especialista);
                marcar.setData_retorno(data_retornar);
                MC.add(marcar);
                break;
            }
            case "13":{
                System.out.println("=====MARCAR DATA DE RETORNO=====");
                System.out.println("\n \n \n");
                //Marcar_consulta marcar = new Marcar_consulta();
                for( i = 0 ; i < MC.size() ; i++){
                    Marcar_consulta pegainformarc = MC.get(i);
                    System.out.println("["+i+"]" + pegainformarc.getNome_pac());
                }
                try{
                System.out.println("\n \n \n");
                System.out.println("QUAL O PACIENTE VOCÊ DESEJA AGENDAR RETORNO?");
                mar = leia.nextInt();
                leia.nextLine();
                System.out.println("\n \n \n");
                
                }catch(InputMismatchException e){
                    System.out.println("====ERRO DE ENTRADA====");
                    System.out.println("DIGITE UM VALOR INTEIRO DAS POSIÇÕES ACIMA");
                }catch(ArrayIndexOutOfBoundsException e){ //Informa que estourou o limite do vetor   
                System.out.println("====VOCÊ ESTOUROU O LIMITE MAXIMO DO VETOR====");
                leia = new Scanner(System.in);
                int b=1;
                }
                 
                System.out.println("Digite a data de Retorno: ");
                String atualizacaonome = leia.nextLine();
                
                Marcar_consulta marcar = MC.get(mar);
                marcar.setData_retorno(atualizacaonome);
                System.out.println("\n \n \n");
                System.out.println("******************************************************");
                System.out.println("******************************************************");
                System.out.println("====PACIENTE AGENDADO====");
                System.out.println("******************************************************");
                System.out.println("******************************************************");
                System.out.println("\n \n \n");
                break;
              
            }        
            case "14":{
                repitamenu = false;
                leia.nextLine();
                break;
                }
                                    }
                                }
                            }                                            
                        }
                    }
                }      
            }
        }       
    }