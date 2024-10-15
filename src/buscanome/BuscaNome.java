
package buscanome;

import java.util.Scanner;


public class BuscaNome {

    
    public static void main(String[] args) {
        // TODO code application logic here
        String vetorNomes[] = new String[2];     
        String nomes;  
        
        
        System.out.println("Insira a quantidade de nomes que deverá haver no vetor: ");     
        int qtNomes = new Scanner(System.in).nextInt();     
        
           
        for (int i = 0; i < vetorNomes.length; i++) {         
            System.out.println("Insira os nomes: ");         
            nomes = new Scanner(System.in).nextLine();         
            vetorNomes[i] = nomes;  
            
        }     System.out.println("Insira o nome que deseja procurar!");     
              String nomeP = new Scanner(System.in).nextLine();   
              
                for (int j = 0; j < vetorNomes.length; j++) {         
                 if (nomeP.equals(vetorNomes[j])) {             
                     System.out.println("ACHEI...o nome é: " + nomeP + " e sua posição é: " + (j + 1));         
                }else if ((j+1) == qtNomes) {     
                    System.out.println("NÃO ACHEI");}    
                }

    }
    
}
