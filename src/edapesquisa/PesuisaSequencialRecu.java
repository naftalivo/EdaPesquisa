/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edapesquisa;

import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author Ivo
 */
public class PesuisaSequencialRecu {
   
    
    public static void main(String[] args) {
       
       
       int chave, pos;
       
       
       chave = Integer.parseInt(JOptionPane.showInputDialog("Introduza chave para pesquisa: "));
      
       
       pos = pesquisar(chave,0);
       if (pos == -1)
           JOptionPane.showMessageDialog(null,"Chave nao encontrada");
       else    
            JOptionPane.showMessageDialog(null,"Posicao "+pos);
    }
     
    public static int pesquisar(int chave,int pos){
        int [] vector =  {16,9,15,21,7,19,10,14};
//        {7,9,10,14,15,16,19,21} Array ordenado || pode apagar O Arrays.sort(vetor)
        Arrays.sort(vector);
        
        if (pos == vector.length){
            return -1;
                       
        }
        if (chave == vector[pos])
            return pos;

        return pesquisar(chave,pos+1);
         
      
        
    }
    
}
