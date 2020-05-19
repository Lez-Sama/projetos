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
public class CD_inquilino extends CD_Proprietario{
    private int numero_do_imovel;
    private String data_chegada;
    private String data_saida;
    
    public CD_inquilino(){}
    public void setNumero_do_imovel(int numero_do_imovel){
        this.numero_do_imovel=numero_do_imovel;
    }
    public void setData_chegada(String data_chegada){
        this.data_chegada=data_chegada;
    }
    public void setData_saida(String data_saida){
        this.data_saida=data_saida;
    }
    
    public int getNumero_do_imovel(){
        return this.numero_do_imovel;
    }
    public String getData_chegada(){
        return this.data_chegada;
    }
    public String getData_Saida(){
        return this.data_saida;
    }
    
}
    
