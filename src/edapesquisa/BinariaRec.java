
package edapesquisa;
import javax.swing.JOptionPane;



public class BinariaRec {
    
    public static void main(String[] args) {
       
       int chave, pos;
        int [] vector = {4,6,15,17,21,25,28,35,40};
        int inicio = 0;
        int fim = vector.length;
        int meio =  9/2;
       
       chave = Integer.parseInt(JOptionPane.showInputDialog("Rec;Introduza a chave: "));
        pos = pesquisar(chave, 4);
       
       if (pos == -1)
           JOptionPane.showMessageDialog(null,"Chave nao encontrada");
       else   
            JOptionPane.showMessageDialog(null,"Posicao "+pos);
       
     
    }
    static int inicio = 0;
    static int fim = 9,cont = 0;
    
    
    public static int pesquisar(int chave, int meio){
        int [] vector = {4,6,15,17,21,25,28,35,40};
       
        
//        if(cont != vector.length){
//          if(chave == vector[meio])
//            return meio;
//          if (chave > vector[meio])
//            //inicio = meio+1;
//            return pesquisar(chave,meio+1);
//          if (chave < vector[meio])
//           // fim = meio-1;
//            return pesquisar(chave,meio-1);
//          cont++; 
//          meio =  (inicio+fim)/2;
//            
//          return pesquisar(chave,meio);
//                
//        }
     
        if((meio >= 0)&&(meio<= vector.length-1)) {
            System.out.println(meio);
            if(chave == vector[meio])
                return meio;
            if (chave > vector[meio])
                return pesquisar(chave,meio+1);
            if (chave < vector[meio])
                return pesquisar(chave,meio-1);

        }       
        
        return -1;
          
    
        
    }
    
}
