/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetoedd;

import java.util.Scanner;

/**
 *
 * @author Guilherme Selau Pereira
 */
public class GuilhermeSelauPereira_ExeVetor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner key = new Scanner(System.in);
        int op = 1;
        int pos_livre = 0;
        int valor = 0;
        int total = 0;
        int vetor[] = new int[20];

        while(op!=0){
            
            System.out.println("====================");
                System.out.println("1 - criar o vetor vazio ou zerar o vetor");
		System.out.println("2 - inserir um valor no vetor utilizando uma estratégia para que o próximo elemento vazio receba este novo valor");
		System.out.println("3 - apagar um valor do vetor - indicando o valor e procurar qual o elemento que deverá ser zerado");
		System.out.println("4 - consultar se existe determinado valor no vetor - para saber qual o elemento que contém esse valor");
		System.out.println("5 - consultar quantos valores significativos já ocupam o vetor");
                System.out.println("6 - consultar qual o maior valor armazenado no vetor e indicar qual o elemento que contém esse valor");
                System.out.println("7 - consultar qual o menor valor armazenado no vetor e indicar qual o elemento que contém esse valor");
                System.out.println("8 - apresentar uma listagem dos valores armazenados no vetor");
                System.out.println("0 - Sair do sistema");
            System.out.println("====================");
                
                System.out.print("Qual operação deseja: ");
                op = key.nextInt();
            
                
                if(op==1){
                        for (int limpar = 0; limpar < vetor.length; limpar++) {
                            vetor[limpar] = 0;
                        }
                        System.out.println("Vetor zerado!");                 
                }
                else if(op==2){
                        System.out.printf("Digite um valor para o vetor: ");
                        vetor[pos_livre] = key.nextInt();
                        pos_livre++;
                    
                }
                else if(op==3){
                    if(pos_livre==0){
                        System.out.println("Vetor não possui valores!");
                    }else{
                        boolean existe = false;
                        System.out.print("Qual valor deseja apagar: ");
                        int apagar = key.nextInt();
                        for (int i = 0; i < vetor.length; i++) {			
                                if(vetor[i] == apagar) {
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
                    
                }
                else if(op==4){
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
                    
                }
                else if(op==5){
                    if(pos_livre==0){
                        System.out.println("Vetor não possui valores!");
                    }else{
                        for (int quant=0; quant<pos_livre; quant++) {
                            System.out.println("Posição "+quant+" tem "+vetor[quant]);
                        }
                        System.out.println("O vetor tem "+pos_livre+" valores");
                    }
                }
                else if(op==6){
                    if(pos_livre==0){
                        System.out.println("Vetor não possui valores!");
                    }else{
                        int valorMaximo = vetor[0];
                        int index = 0;
                        for(int maior = 0; maior < vetor.length; maior++){
                            if (vetor[maior] > valorMaximo){
                                valorMaximo = vetor[maior];
                                index = maior;
                            }
                        }
                        System.out.println("Maior valor é "+valorMaximo+" no indice "+index);
                    }
                }
                else if(op==7){
                    if(pos_livre==0){
                        System.out.println("Vetor não possui valores!");
                    }else{
                        int menorValor = vetor[0];
                        int index = 0;
                        for (int menor = 0; menor < vetor.length; menor++) {
                            if(vetor[0] == 0 && vetor[menor + 1] != 0) {
                                menorValor = vetor[menor + 1];
                                break;
                            }
                            if (menorValor > vetor[menor] && vetor[menor] != 0) {
                                menorValor = vetor[menor];
                                index = menor;
                            }
                        }
                        System.out.println("O menor valor é "+menorValor+" no indice "+index);
                    }
                }
                else if(op==8){
                    if(pos_livre==0){
                        System.out.println("Vetor não possui valores!");
                    }else{
                        for (int j=0; j<vetor.length; j++) {
                            System.out.println("Posição "+j+" tem "+vetor[j]);
                        }
                    }
                                       
                }
                else if(op==0){
                  System.out.println("Saindo do sistema");
		}else {
                    System.out.println("Opção inexistente");
		  }
		}
                    System.out.println("Sistema fechado!");
  
    }
    
}
