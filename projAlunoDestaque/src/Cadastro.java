
import java.util.ArrayList;
/**
 *
 * @author Guilherme
 */
public class Cadastro {
   private ArrayList<Cartas> lista; 
   
   public Cadastro(){
       this.lista = new ArrayList<>();
       
   }

    public ArrayList<Cartas> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Cartas> lista) {
        this.lista = lista;
    }
    public void cadastrar(Cartas c){
        this.lista.add(c);
    }
    public void removerCartas(Cartas c){
        this.lista.remove(c);
    }
    public int verQuantidade(){
     return this.lista.size();
    }
    public Cartas pesquisarPorCodigo(int codigo){
        Cartas cartaEncontrada = null;
        for(int i=0; i<this.lista.size();i++){
            if(this.lista.get(i).getCodigo()==codigo){
           cartaEncontrada =  this.lista.get(i);
            }
        }
        return cartaEncontrada;
    }
    public Cartas pesquisarPorNome(String nome){
        Cartas cartaEncontrada = null;
        for(int i=0;i<this.lista.size();i++){
            if(this.lista.get(i).getNome().equalsIgnoreCase(nome)){
                cartaEncontrada = this.lista.get(i);
            }
        }
        return cartaEncontrada;
    }
    public ArrayList<Cartas> pesquisarPorNivel(byte nivel){
        ArrayList<Cartas> listaCartas = new ArrayList<>();
        for(int i=0;i<this.lista.size();i++){
            if(this.lista.get(i).getNivel()==nivel){
                listaCartas.add(this.lista.get(i));
            }
        }
        return listaCartas;
    } 
    public Cartas pesquisarPorAtaque(int ataque){
        Cartas cartaEncontrada = null;
        for(int i=0;i<this.lista.size();i++){
            if(this.lista.get(i).getAtaque()==ataque){
                cartaEncontrada = this.lista.get(i);
            }
        }
        return cartaEncontrada;
    }
    public Cartas pesquisarPorDefesa(int defesa){
        Cartas cartaEncontrada = null;
        for(int i=0;i<this.lista.size();i++){
            if(this.lista.get(i).getDefesa()==defesa){
                cartaEncontrada = this.lista.get(i);
            }
        }
        return cartaEncontrada;
    }
    public Cartas pesquisarPorRaridade(String raridade){
        Cartas cartaEncontrada = null;
        for(int i=0;i<this.lista.size();i++){
            if(this.lista.get(i).getRaridade().equalsIgnoreCase(raridade)){
                cartaEncontrada = this.lista.get(i);
            }
        }
        return cartaEncontrada;
    }
    public ArrayList<Cartas> pesquisarPorTipo(String tipoDeCarta){
        ArrayList<Cartas> listaCartas = new ArrayList<>();
        for(int i=0;i<this.lista.size();i++){
            if(this.lista.get(i).getTipoDeCarta().equalsIgnoreCase(tipoDeCarta)){
                listaCartas.add(this.lista.get(i));
            }
        }
        return listaCartas;
    }

     public int pesquisarIndicePeloCodigo(int codigo){
        int indiceEncontrado = -1;
         for(int i=0;i<this.lista.size() && indiceEncontrado==-1; i++){
            if(this.lista.get(i).getCodigo()==codigo){
                indiceEncontrado = i;
            }
        }
        return indiceEncontrado;
    }
}