/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programa.com.objeto.que.cria.manipula.um.vetor.de.inteiros;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Guilherme Selau Pereira
 */
public class ClasseObjeto {
    
    int n, escolha, pos_livre = 0, vetor[];
	int maior, menor, valor;
        int ContBubbleSort = 0, ContInsertionSort = 0, ContSelectionSort = 0, ContQuickSort = 0;
        private boolean estaOrdenado = false;

    public ClasseObjeto(int num) {
		vetor = new int[num];
		for(int i = 0; i < vetor.length; i++) {
			vetor[i] = 0;
		}		
	}
     public boolean retornaOrdenado() {

        return estaOrdenado;
    }
    
    
    
    
	
	public void abrirMenu() {
		System.out.println("\n   --------------------------");
		System.out.println("       MENU DE SELEÇÃO ");
		System.out.println("   --------------------------");
		System.out.println("   [1] - Preencher o vetor do objeto com números pseudo-randômicos, em uma distribuição que minimize a possibilidade de valores duplicados.");
                System.out.println("   [2] - Preencher o vetor do objeto com números pseudo-randômicos em ordem crescente");
		System.out.println("   [3] - Informar o total de elementos válidos no vetor do objeto");
		System.out.println("   [4] - Informar o maior e o menor valores existentes no vetor do objeto");
		System.out.println("   [5] - Listar todo o conteúdo do vetor do objeto");
                System.out.println("   [6] - Zerar o vetor");
		System.out.println("   [11] - Inserir um valor no vetor do objeto em uma determinada posição.");	
		System.out.println("   [12] - Apagar um valor do vetor do objeto, informando o valor a ser removido");
		System.out.println("   [13] - Apagar um valor do vetor do objeto, informando a posição do valor a ser removido.");
		System.out.println("   [21] - Consultar a existência de um valor no vetor do objeto, utilizando busca sequencial");	
		System.out.println("   [22] - Consultar a existência de um valor no vetor do objeto, utilizando busca binária");	
		System.out.println("   [31] - Ordenar o vetor do objeto, utilizando o método Bubblesort");	
		System.out.println("   [32] - Ordenar o vetor do objeto, utilizando o método Insertionsort");	
		System.out.println("   [33] - Ordenar o vetor do objeto, utilizando o método Selectionsort");
		System.out.println("   [34] -  Ordenar o vetor do objeto, utilizando o método Quicksort");
                System.out.println("   [40] - Total de comparações");
		System.out.println("   [0] - Encerrar o programa ");
		System.out.println("  \n   Digite a sua opção: ");		
	}
        
        
        public void escolhaMenu(int n) {
		escolha = n;
	}
        
        public void Zerar(){
            for (int limpar = 0; limpar < vetor.length; limpar++) {
                    vetor[limpar] = 0;
            }
             System.out.println("Vetor zerado!");   
        }
	
	public void aleatorios() {
		Random num = new Random(654321);
		for(int i = 0; i < vetor.length; i++) {
			if(vetor[i] == 0) {
				vetor[i] = num.nextInt(1 + 1000);
				pos_livre++;
			}else {
				continue;
			}
		}		
	}
        public void inserirNaPosicao(int pos, int num) {
		for(int i = 0; i < vetor.length; i++) {
			if(i == pos) {
				if(vetor[i] == 0) {
					vetor[i] = num;
					System.out.println("O valor "+ num+ " foi incluído na posição "+ i+"\n");
					pos_livre++;
				}else {
					vetor[i] = num;
					System.out.println("O valor "+ num+ " foi incluído na posição "+ i+"\n");
				}
			}
		}
	}
			
	public static void troca(int v[], int i, int j) {
		int aux = v[i];
		v[i] = v[j];
		v[j] = aux;
	}
	
	public void maior () {
		maior = vetor[0];
		for(int i = 1; i < vetor.length; i++) {
			if(vetor[i] > maior) {
				maior = vetor[i];
			}
		}		
	}			
	
	public void menor () {
		for(int vet:vetor) {
			if(vet == 0) {
				continue;
			}else {
				menor = vet;
				break;
			}
		}
		for(int i = 0; i < vetor.length; i++) {
			if(vetor[i] < menor && vetor[i] != 0) {
				menor = vetor[i];
			}
		}
		
	}
	
	public void listar() {
		for (int i = 0; i < vetor.length; i++) {
			System.out.println(" vetor "+"["+ i +"]"+ " => "+ vetor[i]);			
		}
	
	}
	
	public void apagar(int num) {
		boolean existe = false;
		for (int i = 0; i < vetor.length; i++) {			
			if(vetor[i] == num) {
				existe = true;
				System.out.println("O valor "+ vetor[i]+ " foi excluído da posição "+ i+"\n");	
				vetor[i]=0;
				pos_livre--;
			}			
		}
		if(existe == false) {
			System.out.println("Valor não encontrado");
		}								
	}
	
	public void apagarDaPosicao(int pos) {
		for (int i = 0; i < vetor.length; i++) {			
			if(i == pos && vetor[i]==0) {
				System.out.println("Posição vazia! ");
			}else if(i == pos && vetor[i]!=0) {
				System.out.println("O valor "+ vetor[i]+ " foi excluído na posição "+ i+"\n");	
				vetor[i]=0;
				pos_livre--;
			}
		}									
	}	
	
	public void buscaSequencial(int num) {
		boolean vazio = true;
	
		for(int i=0; i<vetor.length; i++) {
			if (vetor[i] == num) {						
				System.out.println("O valor "+ vetor[i]+ " se encontra na posição "+ i);
				vazio = false;
				break;
			}
		}
		if (vazio== true) {
			System.out.println("Valor não encontrado! ");
		}
	}
	
	public static int buscaBinariaRecursiva(int v[], int num) {
		return buscaRecursiva(v, num, 0, v.length - 1);		
	}
	
	public static int buscaRecursiva(int v[], int num, int menor, int maior) {
		int meio = (menor + maior) / 2;
		if (menor > maior) {
			return -1;
		}
		if(v[meio] == num) {
			return meio;
		}
		if(v[meio] < num) {
			return buscaRecursiva(v, num, meio + 1, maior);
		}
		else {
			return buscaRecursiva( v, num, menor, meio - 1);
		}		
	}
        public void BubbleSort() {
		for(int ultimo = vetor.length -1; ultimo > 0; ultimo--) {
			for(int i = 0; i < ultimo; i++) {
				if(vetor[i] > vetor[i+1]) {
					troca(vetor, i, i+1);
                                        ContBubbleSort++;
				}
			}
                        
		}
                estaOrdenado = true;
                
	}
	
	 public void insertionSort() {

        int a, b;

        for(int i = 1; i < vetor.length; i++) {

            a = vetor[i];
            b = i - 1;

            while(b >= 0 && vetor[b] > a) {

                vetor[b + 1] = vetor[b];
                b = b - 1;
                ContInsertionSort++;
            }

            vetor[b + 1] = a;
        }
        estaOrdenado = true;
    }
	
	public void selectionSort() {
        int aux;
        int menor;
        for(int i = 0; i < vetor.length; i++) {
             menor = i;

            for(int j = i + 1; j < vetor.length; j++) {

                if(vetor[j] < vetor[menor]) {

                    menor = j;
                }

            }
            aux = vetor[i];
            vetor[i] = vetor[menor];
            vetor[menor] = aux;
            ContSelectionSort++;

        }
        estaOrdenado = true;
    }
        public void ordenarVetorDeInteiros(int[] vetor) {
            quickSort(vetor, 0, vetor.length - 1);
        }
        private void quickSort(int[] vetor, int inicio, int fim) {
            if(fim > inicio) {
              int indexPivo = dividir(vetor, inicio, fim);
              quickSort(vetor, inicio, indexPivo - 1);
              quickSort(vetor, indexPivo + 1, fim);
              ContQuickSort++;
            }
        }
        private int dividir(int[] vetor, int inicio, int fim) {
            int pivo, pontEsq, pontDir = fim;
            pontEsq = inicio + 1;
            pivo = vetor[inicio];

            while(pontEsq <= pontDir) {
              while(pontEsq <= pontDir && vetor[pontEsq] <= pivo) {
                pontEsq++;
              }
              while(pontDir >= pontEsq && vetor[pontDir] > pivo) {
                pontDir--;
              }
              if(pontEsq < pontDir) {
                trocar(vetor, pontDir, pontEsq);
                pontEsq++;
                pontDir--;
              }
              ContQuickSort++;
            }

            trocar(vetor, inicio, pontDir);
            return pontDir;
        }
        private void trocar(int[] vetor, int i, int j) {
            int temp = vetor[i];
            vetor[i] = vetor[j];
            vetor[j] = temp;
            ContQuickSort++;
        }
        
        
	
	public boolean retornaValor (int n) {
		boolean contem = false;
		for(int i = 0; i < vetor.length; i++) {
			if(i == n) {
				if(vetor[i] != 0) {
				valor = vetor[i];
				contem = true;
				}
			}else {
				continue;
			}			
		}
		return contem;
	}
         public boolean retornaValorVetor () {
        Scanner key = new Scanner(System.in);
            if(pos_livre==0){
                        System.out.println("Vetor não possui valores!");
                    }else{
                        int valorConsulta = 0;
                        int elementoConsulta = 0;
                        int index = 0;
                        System.out.print("Qual valor deseja procurar: ");
                        valorConsulta = key.nextInt();
                        for (int i = 0; i < vetor.length; i++) {
                            if (vetor[i] == valorConsulta) {
                                index = i;
                                System.out.println("O elemento "+valorConsulta+" existe no vetor e está na posição " + index);
                                break;
                            }
                            if(vetor[i] != valorConsulta) {
                                elementoConsulta++;
                            }
                            if(elementoConsulta == valor) {
                                System.out.println("Este elemento não existe no vetor.");
                            }
                        }
                    }
        return false;
    }
	
	public int informaTamanho() {
		return vetor.length;
	}
	
	public int informaOcupados() {
		return pos_livre;
	}


    public int TotalOrdenacaoBubbleSort(){
        return ContBubbleSort;
    }
    public int TotalOrdenacaoInsertionSort(){
        return ContInsertionSort;
    }
    public int TotalOrdenacaoSelectionSort(){
        return ContSelectionSort;
    }
    public int TotalOrdenacaoQuickSort(){
        return ContQuickSort;
    }
	
	
}
