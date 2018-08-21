

/**
 *
 * @author Guilherme
 */
public class Cartas {
    private String nome;
    private int codigo;
    private byte nivel;
    private String tipoDeCarta;
    private String raridade;
    private int ataque;
    private int defesa;
    private Fornecedor fornecedor;
    private Data data;
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public byte getNivel() {
        return nivel;
    }
    public void setNivel(byte nivel) {
        this.nivel = nivel;
    }
    public String getTipoDeCarta() {
        return tipoDeCarta;
    }
    public void setTipoDeCarta(String tipoDeCarta) {
        this.tipoDeCarta = tipoDeCarta;
    }
    public String getRaridade() {
        return raridade;
    }
    public void setRaridade(String raridade) {
        this.raridade = raridade;
    }
    public int getAtaque() {
        return ataque;
    }
    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }
    public int getDefesa() {
        return defesa;
    }
    public void setDefesa(int defesa) {
        this.defesa = defesa;
    }
    public Fornecedor getFornecedor() {
        return fornecedor;
    }
    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }
    public Data getDataDeFabricacao() {
        return data;
    }
    public void setDataDeFabricacao(Data dataDeFabricacao) {
        this.data = dataDeFabricacao;
    }

    @Override
    public String toString() {
        return  "\nNome: " + nome + 
                "\ncodigo: " + codigo + 
                "\nNivel: " + nivel + 
                "\nTipo de carta: " + tipoDeCarta + 
                "\nRaridade: " + raridade + 
                "\nAtaque:" + ataque + 
                "\nDefesa: " + defesa + 
                "\nFornecedor: " + fornecedor + 
                "\nData: " + data;
    }

    
   
    }
