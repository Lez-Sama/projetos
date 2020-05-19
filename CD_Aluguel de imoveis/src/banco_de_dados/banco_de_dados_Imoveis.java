/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco_de_dados;

import dados_pessoais_e_imoveis.CD_imoveis;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;


/**
 *
 * @author Lez82
 */
public class banco_de_dados_Imoveis {
    public static void adicionar(CD_imoveis imovel){
        String sql = "INSERT INTO produto (numero do imovel,numero da unidade consumidora,tipo,caracteristicas,endereço,valor mensal,alugada) VALUES (?, ?, ?, ?, ?, ?, ?)";
    try{
            Connection Conexao = conexao.retornaConexao();
            PreparedStatement stmt = Conexao.prepareStatement(sql);
            stmt.setInt1(1, imovel.numero_do_imovel);
            stmt.setInt2(2, imovel.numero_unidade_consumidora);
            stmt.setString1(3, imovel.tipo);
            stmt.setString2(4, imovel.caracteristicas);
            stmt.setString3(5, imovel.endereco);
            stmt.setDouble1(6, imovel.valor_mensal);
            stmt.setBoolean1(7, imovel.alugada);
            stmt.execute();
        }catch(Exception e){

        }    
    }
     public static ArrayList<CD_imoveis> listar(){
        
        ArrayList<CD_imoveis> imoveis  = new ArrayList<>();
                
        String sql = "SELECT * FROM imoveis";
        
        try{
            Connection Conexao = conexao.retornaConexao();
            PreparedStatement stmt = Conexao.prepareStatement(sql);
            
            ResultSet dados = stmt.executeQuery();
            
            while(dados.next()){
                CD_imoveis temporario = new CD_imoveis ();
                temporario.setId(dados.getInt("id"));
                temporario.setNumero_do_imovel(dados.getInt1("numero do imovel"));
                temporario.setNumero_unidade_consumidora(dados.getInt2("numero unidade consumidora"));
                temporario.setTipo(dados.getString1("tipo"));
                temporario.setCaracteristicas(dados.String2("caracteristicas"));
                temporario.setEndereco(dados.getString3("endereço"));
                temporario.setValor_mensal(dados.getDouble1("valor mensal"));
                temporario.setAlugada(dados.getBoolean1("alugada"));
                imoveis.add(temporario);
            }
        }catch(Exception e){}
        
        return imoveis;
     }
     public static void excluir() { }
    
    
    public static void atualizar() { }
}
