/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Guilherme
 */
public class Fornecedor {
    private String nomeDoFornecedor;
    private String telefone;
    private String email;
    private Endereco endereco;

    public Fornecedor(){
        this.nomeDoFornecedor = "Ilusões industriais";
    }
    
    public String getNome() {
        return nomeDoFornecedor;
    }

    public void setNome(String nome) {
        this.nomeDoFornecedor = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "\nNome do fornecedor: " + nomeDoFornecedor + 
                "\nTelefone: " + telefone + 
                "\nEmail: " + email + 
                "\nEndereço: " + endereco;
    }

    
    } 


    
    
