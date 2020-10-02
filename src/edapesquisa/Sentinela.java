
package edapesquisa;
import javax.swing.JOptionPane;


public class Sentinela {
   
    
    public static void main(String[] args) {
       
       int chave, pos = 0;
      // boolean achou = false;
       chave = Integer.parseInt(JOptionPane.showInputDialog("Introduza chave para pesquisa: "));
      
       
       int [] vector = {10,9,15,21,7,19,10,14,chave};
       
       while((pos != vector.length)){
            
           if (chave == vector[pos])
               break;
           
            pos++;
          
        }
       
   
       if (pos == vector.length-1)
           JOptionPane.showMessageDialog(null,"Chave nao encontrada");
       else    
      JOptionPane.showMessageDialog(null,"Posicao "+pos);
    }
    
    
}
