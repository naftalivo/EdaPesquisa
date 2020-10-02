/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edapesquisa;

import java.util.Vector;
import javax.swing.JOptionPane;

/**
 *
 * @author Ivo
 */
public class Pesq_Sequencial {
    
    
    public static void main(String[] args) {
        int [] vector = {10,5,9,5,6,4,5,14,10};
        Vector pos = new Vector(2, 2);
       
       int chave, cont = 0;
    
       chave = Integer.parseInt(JOptionPane.showInputDialog("Introduza chave para pesquisa: "));
      
       while(cont != vector.length){  
           if (chave == vector[cont])
            pos.add(cont);
           
            cont++;  
        }
       
       if (pos.size() == 0)
           JOptionPane.showMessageDialog(null,"Chave nao encontrada");
       else{
           if(pos.size() == 1)
               JOptionPane.showMessageDialog(null,"Posicao "+pos);
           else{
           cont = 0;
           int aux;
           String str = "A chave se encontra nas posicoes: ";
            while(cont != pos.size()){
            aux = (Integer) pos.get(cont);
            str+="\n"+aux;
            cont++;
            
            }
             JOptionPane.showMessageDialog(null,str);
           }
       }
     
    }
    
}
