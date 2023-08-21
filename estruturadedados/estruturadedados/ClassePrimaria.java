/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estruturadedados;
import java.util.Scanner;
/**
 *
 * @author 2018007112
 */
public class ClassePrimaria {
    public static int numInt(int n){
		if(n <= 0) {
			System.out.println("Digite somente numeros inteiros positivos!\n");
		}		
		return n;
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int op, pos, num;
		
		EstruturaDeDados vetor = new EstruturaDeDados(50);
		vetor.abrirMenu();
		vetor.escolhaMenu(input.nextInt());	
		
		while(vetor.escolha != 0) {
			if(vetor.escolha == 2) {
				vetor.aleatorios();//ver questao dos numeros repetidos				
			}
			if(vetor.escolha == 3) {
				vetor.aleatorios();
				vetor.BubbleSort();				
			}
			if(vetor.escolha == 4) {
				System.out.println("O vetor tem "+vetor.informaOcupados()+" elementos.\n");				
			}
			if(vetor.escolha == 5) {
				vetor.maior();
				vetor.menor();				
				if(vetor.maior != vetor.menor) {
					System.out.println("O maior valor é "+vetor.maior+" e o menor valor é "+ vetor.menor+"\n");				
				}else if (vetor.pos_livre == 1) {
					System.out.println("O vetor tem somente 1 valor armazenado!\n");
				}else if (vetor.pos_livre == 0) {
					System.out.println("O vetor está vazio!\n");
				}				
			}
			if(vetor.escolha == 6) {
				vetor.listar();
			}
			if(vetor.escolha == 7) {
				System.out.println("Digite a posição deseja incluir:"); pos = input.nextInt();
				System.out.println("Digite o valor que deseja incluir:"); 
				numInt(num = input.nextInt());	
				if(num > 0) {
					vetor.inserirNaPosicao(pos, num);
				}else {
					continue;
				}
			}
			if(vetor.escolha == 8) {
				System.out.println("Digite o valor que deseja excluir:"); 	
				vetor.apagar(num = input.nextInt());
			}
			if(vetor.escolha == 9) {
				System.out.println("Digite a posição deseja excluir:");
				vetor.apagarDaPosicao(pos = input.nextInt());
			}
			if(vetor.escolha == 10) {
				System.out.println("Digite o valor que deseja consultar:"); 
				vetor.buscaSequencial(num=input.nextInt());
			}
			if(vetor.escolha == 11) {				
				vetor.BubbleSort();
				System.out.println("Qual valor deseja consultar?");
				int resultado = vetor.buscaBinariaRecursiva(vetor.vetor,num = input.nextInt());				
				if(resultado == -1) {
					System.out.println("Valor não encontrado!\n ");
				}else {
					System.out.println("O valor "+num+" está na posição "+ resultado+"\n");
				}
			}
			if(vetor.escolha == 12) {
				vetor.BubbleSort();
			}
			if(vetor.escolha == 13) {
				vetor.insertionSort(vetor.vetor);
			}
			if(vetor.escolha == 14) {
				vetor.selectionSort(vetor.vetor);
			}
			if(vetor.escolha == 15) {
				System.out.println("Digite a posição deseja consultar:");
				vetor.retornaValor(pos = input.nextInt());
				if(vetor.retornaValor(pos)==true) {
					System.out.println("O valor "+vetor.valor+" está na posição "+pos+"\n");					
				}else {
					System.out.println("A posição "+pos+" está vazia!\n ");
				}
			}
			if(vetor.escolha == 16) {
				System.out.println(" O vetor tem "+vetor.informaTamanho()+" posições\n");
			}
			vetor.abrirMenu();
			vetor.escolhaMenu(input.nextInt());
		}
		System.out.println("Aplicação com vetores finalizada!");
	}
}
