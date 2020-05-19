/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco_de_dados;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Lez82
 */
public class conexao {
    private static final String USUARIO = "root"; 
    private static final String SENHA = "caio2780";
    private static final String URL_BANCO = "jdbc:mysql://127.0.0.1:3306/crud?useTimezone=true&serverTimezone=UTC";
    
    public static Connection retornaConexao(){
        Connection conexao = null;
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexao = DriverManager.getConnection(URL_BANCO, USUARIO, SENHA );            
        }catch(SQLException e){
            System.err.println("Erro de Conexao:" + e.toString());
        } catch (ClassNotFoundException e) {            
            System.err.println("Classe Não Encontrada:" + e.toString());
        }
        
        return conexao;
    }
}
