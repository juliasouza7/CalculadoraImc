/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadoraimc;

import javax.swing.JFrame;

/**
 *
 * @author julia
 */
public class CalculadoraImc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         JFrame Janela = new JFrame();
        outro imc = new outro();
       
        Janela.add(imc);
       
        Janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Janela.setTitle("IMC");
        Janela.setSize(240,300);
        Janela.setVisible(true);
        Janela.setResizable(false);
        Janela.setLocationRelativeTo(null);
    }
    
}
