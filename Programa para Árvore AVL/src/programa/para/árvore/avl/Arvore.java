/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package programa.para.árvore.avl;

import java.util.Scanner;

/**
 *
 * @author Guilherme Selau Pereira
 */
public class Arvore {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner key = new Scanner(System.in);  
  
        AVL arvo = new AVL();   
        
        int op;
         
        do      
        {  
            System.out.println("=======================================");
            System.out.println("\nQual operação deseja:\n");  
            System.out.println("1. Inserir");
            System.out.println("2. Exibir a árvore");    
            System.out.println("3. Remover todos os Nós da árvore");  
            System.out.println("0. Sair"); 
            System.out.println("=======================================");  
  
            op = key.nextInt();   

            switch (op)  
            {  
                case 1 :   
                    System.out.println("Inserir elemento na árvore ");  
                    arvo.inserir(key.nextInt() );                       
                    break;     
                case 2 : 
                    System.out.println("ÁRVORE ");  
                    arvo.displayTree();
                    break;            
                case 3 :   
                    arvo.remover(); 
                    System.out.println("\nArvore limpa");  
                    break;  
                case 0 :  
                    System.out.println("\nSaindo do Sistema!");
                    break;    
                default :   
                    System.out.println("\n ");  
                    break;      
            }  
                            
        } while (op != 0);     
    }
    
}
