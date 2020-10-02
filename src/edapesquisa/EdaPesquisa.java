/* PESQUISA SEQUENCIAL
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edapesquisa;

import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class EdaPesquisa {

    
    public static void main(String[] args) {
       
       
       int chave, pos;
       
       
       chave = Integer.parseInt(JOptionPane.showInputDialog("Introduza chave para pesquisa: "));
       
       pos = pesquisa(chave);
       if (pos == -1)
           JOptionPane.showMessageDialog(null,"Chave nao encontrada");
       else    
      JOptionPane.showMessageDialog(null,"Posicao "+pos);
    }
    
    public static int pesquisa(int chave){
        int [] vector =  {2,10,9,15,21,7,19,14};
//        Array | vetor ordenado = {2,7,9,10,14,15,19,21}
//        Arrays.sort(vector);
        int cont = 0;
        while(cont != vector.length){
            if(chave == vector[cont])
                return cont;
            
            cont++;
            
        }
        
        return -1;
    }
    
}
