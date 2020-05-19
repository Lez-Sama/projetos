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
public class CD_imoveis {
    private int id;
    public int numero_do_imovel;
    public int numero_unidade_consumidora;
    public String tipo;
    public String caracteristicas;
    public String endereco;
    public double valor_mensal;
    public boolean alugada;
    
    public void setId(int id){
        this.id = id;
    }
    public int getId() {
        return this.id;
    }
    
}
