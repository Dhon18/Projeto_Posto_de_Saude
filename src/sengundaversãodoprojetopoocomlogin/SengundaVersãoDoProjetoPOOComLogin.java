package sengundaversãodoprojetopoocomlogin;
//IMPORTAÇÃO PARA USO DOS ARRAY LIST
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
public class SengundaVersãoDoProjetoPOOComLogin {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
    //ARRAY LIST PARA CLASS FUNCIONARIO
    ArrayList<Funcionarios> usuario = new ArrayList();
    //ARRAY LIST PARA CLASS PASCIENTE
    ArrayList<Pasciente> usuariopasciente = new ArrayList();
    ClassUsuariosCadastrados cadastradosuser = new ClassUsuariosCadastrados();

        //VARIAVEL I ESTA SENDO USADA EM TODOS OS LAÇOS FOR PARA CONSULTA E PESQUISA
        int i, id=0;
        //FOI DECLARADA ESTA VARIAVEL E DADO A CONDIÇÃO DE ENQUANTO FOSSE VERDADEIRO ELA CONTINUARIA
        //RODANDO MESMO APÓS SER EXECUTADO
        boolean constante = true;   
        while(constante){
       //ESTA PRIMEIRA PARTE FUNCIONA COMO LOGIN OU CADASTRAR USUARIO PARA QUE POSSA FAZER UM LOGIN
       //CASO O USUARIO NO LOGIN NÃO FOR IDENTIFICADO ELE NÃO ACESSARA O MENU PRINCIPAL
        System.out.println("***********************************");
        System.out.println("***********************************");
        System.out.println("1 - Cadastrar Usuario: ");
        System.out.println("2 - Logar: ");
        System.out.println("***********************************");
        System.out.println("***********************************");
        String menu = leia.nextLine();
        

        System.out.println("\n \n \n");
        //ESSA PRIMEIRA PARTE DO CÓDIGO OPÇÃO UM FARÁ O CADASTRO DO FUNCIONARIO PARA QUE POSSA CONSEGUIR
        // FAZER O LOGIN
        switch(menu){
            case "1":{
                System.out.println("\n \n \n");
                System.out.println("====CADASTRO DE FUNCIONARIO====");
                   
                
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
                case "2":{
                
                System.out.println("\n \n \n");
                System.out.println("====LOGIN DE FUNCIONARIO==== \n");
                
                
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
        System.out.println("6 - Cadastrar Pascientes: ");
        System.out.println("7 - Listar Todos os Pascientes");
        System.out.println("8 - Pesquisar Pascientes por CPF: ");
        System.out.println("9 - Atualizar Dados do Pascientes: ");
        System.out.println("10 - Remover Pascientes: ");
        System.out.println("11 - Sair");

        System.out.println("Digite o que Deseja ?: ");
        
        String menu1 = leia.nextLine();
        System.out.println("\n \n \n");
        
        //ABAIXO VEM AS OPÇÕES QUE ESTÃO NO MENU
        switch(menu1){
            case "1":{
                System.out.println("\n \n \n");
                System.out.println("====CADASTRO DE FUNCIONARIO====");
                
                System.out.println("Email: ");
                String email = leia.nextLine();
                
                System.out.println("Senha: ");
                String senha = leia.nextLine();
                
                System.out.println("CPF: ");
                String cpf = leia.nextLine();
                
                System.out.println("Nome completo: ");
                String nome = leia.nextLine();
                
                Funcionarios funcionario2 = new Funcionarios();
                funcionario2.setNome(nome);
                funcionario2.setEmail(email);
                funcionario2.setSenha(senha);
                funcionario2.setCpf(cpf);
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
                    System.out.println("A Senha do Funcionario " + i + " é:" + usuario.get(i).getSenha());
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
                        System.out.println("Senha: "+pegarinformacao.getSenha());
                        System.out.println("Nome: " +pegarinformacao.getNome());
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
                
                System.out.print("Digite uma nova senha de alteração: ");
                String atualizacaosenha = leia.nextLine();
                
                System.out.println("Digite un bovo nome de alteração: ");
                String atualizacaonome = leia.nextLine();
                
                Funcionarios funcionario = usuario.get(id);
                funcionario.setEmail(atualizacaoemail);
                funcionario.setSenha(atualizacaosenha);
                funcionario.setNome(atualizacaonome);
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
            case "11":{
                repitamenu = false;
                leia.nextLine();
                break;
                }
            case "6":{
                System.out.println("\n \n \n");
                System.out.println("====CADASTRO DE PASCIENTE====");
                
                System.out.println("Email: ");
                String email = leia.nextLine();
                
                System.out.println("Senha: ");
                String senha = leia.nextLine();
                
                System.out.println("CPF: ");
                String cpf = leia.nextLine();
                
                System.out.println("Nome completo: ");
                String nome = leia.nextLine();
                
                Pasciente pasciente = new Pasciente();
                pasciente.setNome(nome);
                pasciente.setEmail(email);
                pasciente.setSenha(senha);
                pasciente.setCpf(cpf);
                usuariopasciente.add(pasciente);
                System.out.println("\n \n \n");
                break;
            }
            case "7":{
                System.out.println("\n \n \n");
                System.out.println("====LISTA DE PASCIENTES CADASTRADOS NO SUS====");
                for( i = 0 ; i < usuariopasciente.size(); i++){
                    //Funcionarios pegarinformacao = usuario.get(i);
                    System.out.println("\n \n \n");
                    System.out.println("******************************************************");
                    System.out.println("Funcionario"+"["+i+"]"+"O Email do Funcionario " + i + " é:" + usuariopasciente.get(i).getEmail());
                    System.out.println("O CPF do Funcionario " + i + " é:" + usuariopasciente.get(i).getCpf());
                    System.out.println("O nome do Funcionario " + i + " é:" + usuariopasciente.get (i).getNome());
                    System.out.println("A Senha do Funcionario " + i + " é:" + usuariopasciente.get(i).getSenha());
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
                        System.out.println("====PASCIENTES ENCONTRADO NO SISTEMA====");
                        System.out.println("Email: "+pegarinformacaopasciente.getEmail());
                        System.out.println("Senha: "+pegarinformacaopasciente.getSenha());
                        System.out.println("Nome: " +pegarinformacaopasciente.getNome());
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
                System.out.println("===ATUALIZAR DADOS DO PASCIENTES====");
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
                
                System.out.print("Digite uma nova senha de alteração: ");
                String atualizacaosenhapasciente = leia.nextLine();
                
                System.out.println("Digite un novo nome de alteração: ");
                String atualizacaonomepasciente = leia.nextLine();
                
                Pasciente pegarinformacaopasciente2 = usuariopasciente.get(id);
                pegarinformacaopasciente2.setEmail(atualizacaoemailpasciente);
                pegarinformacaopasciente2.setSenha(atualizacaosenhapasciente);
                pegarinformacaopasciente2.setNome(atualizacaonomepasciente);
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
                                    }
                                }
                            }                                            
                        }
                    }
                }      
            }
        }       
    }