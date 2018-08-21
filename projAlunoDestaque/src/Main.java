
import java.util.ArrayList;
import javax.swing.JOptionPane;


/**
 *
 * @author Guilherme
 */
public class Main {
    public static void main(String[] args) {
       Cadastro c1 = new Cadastro();
        
       
       byte op;
       do{
           op=(Byte.parseByte(JOptionPane.showInputDialog("MENU\n"
           +"1 - Cadastrar a carta\n"
           +"2 - Remover a carta\n"
           +"3 - Ver quantidade de cadastros\n"
           +"4 - Pesquisar por código\n"
           +"5 - Pesquisar por nome\n"
           +"6 - Pesquisar por nível\n"
           +"7 - Pesquisar por ataque da carta\n"
           +"8 - Pesquisar por defesa da carta\n"
           +"9 - Pesquisar por raridade da carta\n"
           +"10 - Editar\n"
           +"0 - Sair \n"
           )));
           switch(op){
               case 1:
                   Cartas c2 = new Cartas();
                   
                   int codigo;
                   if(c1.getLista().isEmpty()){
                       codigo = 1;
                   }else{
                       int codigoFinal = c1.getLista().get(c1.getLista().size()-1).getCodigo();
                       codigo = codigoFinal +1;
                   }
                   c2.setCodigo(codigo);
                   
                   do{
                   c2.setNome(JOptionPane.showInputDialog("Digite o nome:"));
                   if(c2.getNome().length()<2){
                       JOptionPane.showInputDialog(null,"ERRO");
                   }
                   }while(c2.getNome().length()<2);
                   
                   do{
                   c2.setCodigo(Integer.parseInt(JOptionPane.showInputDialog("Digite o código")));
                   if(c2.getCodigo()<0){
                       JOptionPane.showInputDialog(null,"ERRO");
                   }
                   }while(c2.getCodigo()<0);
                   
                   do{
                   c2.setNivel(Byte.parseByte(JOptionPane.showInputDialog("Digite o nível da carta:")));
                   if(c2.getNivel()<0 && c2.getNivel()>12){
                       JOptionPane.showInputDialog(null,"ERRO");
                   }
                   }while(c2.getNivel()<0);
                   
                   do{
                   c2.setTipoDeCarta(JOptionPane.showInputDialog("Digite o tipo da carta:"));
                   if(c2.getTipoDeCarta().length()<0){
                       JOptionPane.showInputDialog(null,"ERRO");
                   }
                   }while(c2.getTipoDeCarta().length()<0);
                   
                   do{
                   c2.setRaridade(JOptionPane.showInputDialog("Digite a raridade da carta:"));
                   if(c2.getRaridade().length()<0){
                       JOptionPane.showInputDialog(null,"ERRO");
                   }
                   }while(c2.getRaridade().length()<0);
                   
                   do{
                   c2.setAtaque(Integer.parseInt(JOptionPane.showInputDialog("Digite o ataque da carta:")));
                   if(c2.getAtaque()<0){
                       JOptionPane.showInputDialog(null,"ERRO");
                   }
                   }while(c2.getAtaque()<0);
                   
                   do{
                   c2.setDefesa(Integer.parseInt(JOptionPane.showInputDialog("Digite a defesa da carta:")));
                   if(c2.getDefesa()<0){
                       JOptionPane.showInputDialog(null,"ERRO");
                   }
                   }while(c2.getDefesa()<0);
                   Fornecedor f1 = new Fornecedor();
                   
                   do{
                   f1.setEmail(JOptionPane.showInputDialog("Digite o e-mail do fornecedor:"));
                   if(f1.getEmail().length()<=0){
                       JOptionPane.showInputDialog(null,"ERRO");
                   }
                   }while(f1.getEmail().length()<=0);
                   
                   do{
                   f1.setTelefone(JOptionPane.showInputDialog("Digite o telefone do fornecedor:"));
                   if(f1.getTelefone().length()<8){
                       JOptionPane.showInputDialog(null,"ERRO");
                   }
                   }while(f1.getTelefone().length()<8);
                   Endereco e1 = new Endereco();
                   do{
                   e1.setRua(JOptionPane.showInputDialog("Digite a rua do fornecedor:"));
                   if(e1.getRua().length()<0){
                       JOptionPane.showInputDialog(null,"ERRO");
                   }
                   }while(e1.getRua().length()<0);
                   
                   do{
                   e1.setNumero(Integer.parseInt(JOptionPane.showInputDialog("Digite a número da empresa do fornecedor:")));
                   if(e1.getNumero()<2){
                       JOptionPane.showInputDialog(null,"ERRO");
                   }
                   }while(e1.getNumero()<2);
                   
                   do{
                   e1.setCidade(JOptionPane.showInputDialog("Digite a cidade do fornecedor:"));
                   if(e1.getCidade().length()<0){
                       JOptionPane.showInputDialog(null, "ERRO");
                   }
                   }while(e1.getCidade().length()<0);
                   
                   do{
                   e1.setEstado(JOptionPane.showInputDialog("Digite o estado do fornecedor:"));
                   if(e1.getEstado().length()<0){
                       JOptionPane.showInputDialog(null,"ERRO");
                   }
                   }while(e1.getEstado().length()<0);
                   
                   do{
                   e1.setCep(JOptionPane.showInputDialog("Digite o CEP do fornecedor:"));
                   if(e1.getCep().length()!=8){
                       JOptionPane.showInputDialog(null,"ERRO");
                   }
                   }while(e1.getCep().length()!=8);
                   Data d1 = new Data();
                   boolean erroData;
                            do{
                            d1.setDia(Byte.parseByte(JOptionPane.showInputDialog("Digite o dia de fabricação da carta")));


                            d1.setMes(Byte.parseByte(JOptionPane.showInputDialog("Digite o mes de fabaricação da carta")));


                            d1.setAno(Integer.parseInt(JOptionPane.showInputDialog("Digite o ano de fabricação da carta")));

                            erroData = d1.verificarErro();
                            if(erroData){
                            JOptionPane.showMessageDialog(null, "Data inválida");
                            }
                            }while(erroData);

                   f1.setEndereco(e1);
                   c2.setDataDeFabricacao(d1);
                   c2.setFornecedor(f1);
                   c1.cadastrar(c2);
       
                   JOptionPane.showInputDialog("Cadastro efetuado com sucesso!");
                   break;
               case 2:
                   if(c1.getLista().isEmpty()){
                       JOptionPane.showInputDialog(null, "Não há cadastros");
                   }else{
                       codigo = Integer.parseInt(JOptionPane.showInputDialog("Informe o código da carta que deseja remover:"));
                       Cartas achei = c1.pesquisarPorCodigo(codigo);
                       if(achei==null){
                           JOptionPane.showInputDialog(null, "Não há cartas com este código");
                       }else{
                           byte op2 = Byte.parseByte(JOptionPane.showInputDialog("Tem certeza que deseja remover a carta?1-Sim\n2-Não"));
                           switch(op2){
                               case 1:
                                   c1.removerCartas(achei);
                                   JOptionPane.showInputDialog(null, "Carta removida com sucesso!");
                                   break;
                               case 2:
                                   JOptionPane.showInputDialog(null, "Operação cancelada!");
                                   break;
                               default:
                                   JOptionPane.showInputDialog(null,"Erro");
                           }
                           JOptionPane.showInputDialog(null,achei);
                       }
                   }
                   break;
               case 3:
                   if(c1.getLista().isEmpty()){
                       JOptionPane.showInputDialog(null,"Não há cadastros");
                   }else{
                       if(c1.verQuantidade()==1){
                           JOptionPane.showInputDialog(null,"Há um cadastro");
                       }else{
                           JOptionPane.showInputDialog(null, "Há " +c1.verQuantidade() + "cadastros");
                       }
                   }
                   break;
               case 4:
                   if(c1.getLista().isEmpty()){
                       JOptionPane.showInputDialog(null, "Não há cadastros");
                   }else{
                        codigo =  Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o código da carta: "));
                        Cartas achei = c1.pesquisarPorCodigo(codigo);
                        if(achei==null){
                            JOptionPane.showInputDialog(null,"Não há cartas com este número");
                        }else{
                            JOptionPane.showInputDialog(null,achei);
                        }
                   }
                   break;
               case 5:
                   if(c1.getLista().isEmpty()){
                       JOptionPane.showInputDialog(null,"Não há cadastros");
                   }else{
                       String nome = JOptionPane.showInputDialog(null, "Digite o nome da carta:");
                       Cartas achei = c1.pesquisarPorNome(nome);
                       if(achei==null){
                           JOptionPane.showInputDialog(null,"Não há cartas com este nome");
                       }else{
                           JOptionPane.showInputDialog(null, achei);
                       }
                   }
                   break;
               case 6:
                   if(c1.getLista().isEmpty()){
                       JOptionPane.showInputDialog(null, "Não há cadastros");
                   }else{
                       byte nivel = Byte.parseByte(JOptionPane.showInputDialog(null,"Digite no nível da carta:"));
                       ArrayList<Cartas> achadas = c1.pesquisarPorNivel(nivel);
                       if(achadas==null){
                           JOptionPane.showInputDialog(null,"Não há cartas com este nível");
                       }else{
                           JOptionPane.showInputDialog(null,achadas);
                       }
                   }
                   break;
               case 7:
                   if(c1.getLista().isEmpty()){
                       JOptionPane.showInputDialog(null,"Não há cadastros");
                   }else{
                       int ataque = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o ataque da carta:"));
                       Cartas achei = c1.pesquisarPorAtaque(ataque);
                       if(achei==null){
                           JOptionPane.showInputDialog(null,"Não há cartas com este ataque");
                       }else{
                           JOptionPane.showInputDialog(null, achei);
                       }
                   }
                   break;
               case 8:
                   if(c1.getLista().isEmpty()){
                       JOptionPane.showInputDialog(null,"Não há cadastros");
                   }else{
                       int defesa = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite a defesa:"));
                       Cartas achei = c1.pesquisarPorDefesa(defesa);
                       if(achei==null){
                       JOptionPane.showInputDialog(null,"Não há cartas com esta defesa");
                   }else{
                        JOptionPane.showInputDialog(null,achei);        
           }
       }
                   break;
               case 9:
                   if(c1.getLista().isEmpty()){
                       JOptionPane.showInputDialog(null,"Não há cadastros");
                   }else{
                       String raridade = JOptionPane.showInputDialog(null,"Digite a raridade da carta:");
                       Cartas achei = c1.pesquisarPorRaridade(raridade);
                       if(achei==null){
                           JOptionPane.showInputDialog(null, "Não há cartas com esta raridade");
                       }else{
                           JOptionPane.showInputDialog(null, achei);
                       }
                   }
                   break;
               case 10:
                  if(c1.getLista().isEmpty()){
                      JOptionPane.showInputDialog(null,"Não há cadastros");
                  }else{
                      codigo = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o código de quem deseja editar:"));
                      int indiceEncontrado = c1.pesquisarIndicePeloCodigo(codigo);
                      if(indiceEncontrado==-1){
                          JOptionPane.showInputDialog(null,"Não há cartas registradas com este código");
                      }else{
                          byte op3 = Byte.parseByte(JOptionPane.showInputDialog(null,"Oque deseja editar nas informações da carta?1-Tipo da carta\n2-Raridade da carta\n3-Nível da carta"));
                          switch(op3){
                              case 1:
                                  c1.getLista().get(indiceEncontrado).setTipoDeCarta(JOptionPane.showInputDialog(null, "Digite o novo tipo da carta:"));
                                  JOptionPane.showInputDialog(null, "Tipo editado com sucesso");
                                  break;
                              case 2:
                                  c1.getLista().get(indiceEncontrado).setRaridade(JOptionPane.showInputDialog(null, "Digite a nova raridade da carta:"));
                                  JOptionPane.showInputDialog(null,"Raridade editada com sucesso");
                                  break;
                              case 3:
                                  c1.getLista().get(indiceEncontrado).setNivel(Byte.parseByte(JOptionPane.showInputDialog(null,"Digite o nível da carta:")));
                                  JOptionPane.showInputDialog(null,"Nível editado com sucesso");
                                  break;
                              default:
                                  JOptionPane.showInputDialog(null,"ERRO");
                                         
                          }
                      }                      
                  }
                   break;
               case 0:
                   op = Byte.parseByte(JOptionPane.showInputDialog("Deseja mesmo sair?\n1-Continuar\n0-Sair"));
                   break;
               default:
                   JOptionPane.showInputDialog(null, "Opção inválida");
                          
    }   
}while(op!=0);
        System.out.println("                   &&&\n" +
"                                      &&   &&\n" +
"  &&&&.                         &&&  .&&&&&\n" +
"      &&     &&&                   &&&&&&&&&\n" +
" &&&&&&&&&  &         &`           &&       &&\n" +
"      .&&&&&          &&&;        &8\n" +
"  .&&&:     &&        &` &      &&\n" +
"             8&&      &   `&   &&\n" +
"               &&    .&_ oO_&.-.-.\n" +
"                 && ( __     -/--'\n" +
"                  &&~ .'-__-'&\n" +
"                   &&&~`'\\`&\n" +
"                     &&&~` _&\n" +
"                      &&&&` &&\n" +
"                       &&8&&&&\n" +
"                       &&&&&&&\n" +
"                   &  &&&&&&&\n" +
"                 &&;&&&&&&&\n" +
"                &&&&&&&&&&     ~~~\n" +
"         .~~~~~ `&&&&&&&&&    ~~~~\n" +
"     ~~~~~~~~~;!&&&&&&&&&&~/~~~~~~~~~\n" +
"  ~~~~~~~~\\~~~~&/`      \\`~~~~~~~~~~~~\n" +
"   ~~~~~~~~             `~~~~~~~~~~\n" +
"    ~~~~~~              ~~~~~~~\n" +
"    ~~~~                ~~~~       BP");
        System.out.println("THATS IT FOLKS");
//Eu otei um desenho do patolino meio que dizendo que "Isso é tudo, pessoal" para simbolizar o final do programa kk
//Obrigado por esses 2 meses, sora 
}
    
}
