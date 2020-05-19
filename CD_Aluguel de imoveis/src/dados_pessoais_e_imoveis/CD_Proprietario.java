/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dados_pessoais_e_imoveis;

/**
 *
 * @author Lez82
 */
public class CD_Proprietario {
    private String nome;
    private long cpf;
    private long contato;   
    private String nome_usuario;
    private int senha;
    
    public CD_Proprietario(){}
    public void setNome(String nome){
        this.nome=nome;
    }
    public void setCpf(long cpf){
        this.cpf=cpf;
    }
    public void setContato(long contato){
        this.contato=contato;
    }
    public void setNome_usuario(String nome_usuario){
        this.nome_usuario=nome_usuario;
    }
    public void setSenha(int senha){
        this.senha=senha;
    }
    
    public String getNome(){
        return this.nome;
    }
    public long getCpf(){
        return this.cpf;
    }
     public long getContato(){
        return this.contato;
    }
      public String getNome_usuario(){
        return this.nome_usuario;
    }
       public int getSenha(){
        return this.senha;
    }
    
}
