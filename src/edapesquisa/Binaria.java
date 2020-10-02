/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edapesquisa;

import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class Binaria {
    
    public static void main(String[] args) {
       
        
        
       
       
       int chave, pos;
       
        chave = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduza a chave: "));
        pos = pesquisar(chave);
       
       if (pos == -1)
           JOptionPane.showMessageDialog(null,"Chave nao encontrada");
       else    
            JOptionPane.showMessageDialog(null,"Posicao "+pos);
     
    }
    static int cont=0;
    
    public static int pesquisar(int chave){
      
        int [] vector = {4,6,15,17,21,25,28,35,40};
        int inicio = 0;
        int fim = vector.length-1;
        int meio =  (inicio+fim)/2;
        
        //if(chave >= vector[0])&&(chave <=)
//        while(cont !=  vector.length){
//            if(chave == vector[meio])
//                return meio;
//            if (chave > vector[meio])
//                inicio = meio;
//            if (chave < vector[meio])
//                fim = meio;
//            
//           meio =  (inicio+fim)/2;
//           cont++;
//        }
        
        
            
        do{
            
            if(chave == vector[meio])
                return meio;
            if (chave > vector[meio])
                inicio = meio+1;
            if (chave < vector[meio])
                fim = meio-1;
            
           meio =  (inicio+fim)/2;
          
            
        }while(inicio <= fim);
        
       return -1; 
    }
    
}
