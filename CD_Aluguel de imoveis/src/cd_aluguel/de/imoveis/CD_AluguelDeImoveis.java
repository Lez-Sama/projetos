/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cd_aluguel.de.imoveis;

import java.awt.BorderLayout;
import javax.swing.JFrame;

/**
 *
 * @author Lez82
 */
public class CD_AluguelDeImoveis {

     public static Meio meio = new Meio();
    public static void main(String[] args) {
        
        
        BorderLayout layout_janela = new BorderLayout();
        
        JFrame janela = new JFrame();
        janela.setLayout(layout_janela);
        janela.add(meio, BorderLayout.CENTER);
        janela.add(new Topo(), BorderLayout.NORTH);
        janela.add(new Rodape(), BorderLayout.SOUTH);
        janela.add(new Esquerda(), BorderLayout.EAST);
        janela.add(new Direita(), BorderLayout.WEST);
        janela.pack();
        janela.setVisible(true);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    }
    
}
