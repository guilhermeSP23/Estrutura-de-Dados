/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arvore;

import java.util.Scanner;

/**
 *
 * @author Guilherme
 */
public class AVLTest {
     public static void main(String[] args) {
        AVLTree tree = new AVLTree();
        Scanner sc = new Scanner(System.in); 
        
        /*tree.inserirNo(8);   
        tree.inserirNo(3);
        tree.inserirNo(6);
        tree.inserirNo(2);
        tree.inserirNo(7);
        tree.inserirNo(9);
        tree.inserirNo(1);
        tree.inserirNo(0);
        tree.inserirNo(4);
        tree.inserirNo(5);
        tree.imprimirArvore();*/
        int option;
         
        do      
        {  
            System.out.println("=======================================");
            System.out.println("\nQual operação deseja:\n");  
            System.out.println("1. Inserir");
            System.out.println("2. Exibir a árvore");   
            System.out.println("3. Procurar");  
            System.out.println("4. Verificar se a árvore está vazia");  
            System.out.println("5. Remover todos os Nós da árvore");  
            System.out.println("6. Mostrar em post-ordem");  
            System.out.println("7. Mostrar em pre-ordem");  
            System.out.println("8. Mostrar em ordem");  
            System.out.println("0. Sair"); 
            System.out.println("=======================================");  
  
            option = sc.nextInt();   

            switch (option)  
            {  
                case 1 :   
                    System.out.println("Inserir elemento ");  
                    tree.inserirNo(sc.nextInt() );                       
                    break;     
                case 2 :   
                    tree.imprimirArvore();
                    break;      
                case 3 :   
                    System.out.println("Procurar elemento");  
                    System.out.println(tree.encontrarNo(sc.nextInt()));  
                    break;                                                  
                case 4 :   
                    tree.imprimirArvore();  
                    break;       
                case 5 :   
                    tree.removerNo((sc.nextInt()));  
                    System.out.println("\nArvore limpada com sucesso");  
                    break;  
                /*case 6 :   
                    System.out.println("\nMostrar em Post ordem");  
                    avlTree.postorder();  
                    break;  
                case 7 :   
                    System.out.println("\nMostrar em Pre ordem");  
                    avlTree.preorder();  
                    break;  
                case 8 :   
                    System.out.println("\nMostrar em ordem");  
                    avlTree.inorder();  
                    break;*/
                case 0 :     
                    break;    
                default :   
                    System.out.println("\n ");  
                    break;      
            }  
                            
        } while (option != 0);  
        
        
        
    }
}
