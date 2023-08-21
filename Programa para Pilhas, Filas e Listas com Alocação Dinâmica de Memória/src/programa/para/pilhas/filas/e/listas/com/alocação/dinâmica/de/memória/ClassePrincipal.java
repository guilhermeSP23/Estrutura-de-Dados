/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package programa.para.pilhas.filas.e.listas.com.alocação.dinâmica.de.memória;

import java.util.Scanner;

/**
 *
 * @author Guilherme Selau Pereira
 */
public class ClassePrincipal {

    static Scanner key = new Scanner(System.in);
    static boolean VerificadorDeNumeros;
    static Lifo pilha = new Lifo();
    static Fifo fila = new Fifo();
    static Lista lista = new Lista();

    public static void Menu() {
        System.out.println("=================================================="
                + "\nSelecione algumas das estrutura de dados a seguir:"
                + "\n(1) - Pilha"
                + "\n(2) - Fila"
                + "\n(3) - Lista"
                + "\n(0) - Saída");
                System.out.println("====================");
                System.out.print("Qual operação deseja: ");
        String opcao = key.next();

        int op = validadarEntrada(opcao, 3);

        if (VerificadorDeNumeros == true) {
            switch (op) {
                case 1:
                    MenuLifo();
                    break;
                case 2:
                    MenuFifo();
                    break;
                case 3:
                    MenuLista();
                    break;
                case 0:
                    System.out.println("Saindo do sistema");
                    break;
            }
        } else {
            System.out.println("Número incorreto!");
            Menu();
        }

    }

    public static void MenuLifo() {
                    System.out.println(" ----------------------------------\n"
                    + " ======== Pilhas (LIFO) ======== "
                    + "\n ----------------------------------"
                + "\nSelecione uma opcao:"
                + "\n[1] - Inserir na pilha"
                + "\n[2] - Remover da pilha"
                + "\n[0] - Saída");
                System.out.println();
                System.out.print("Qual operação deseja: ");
        String opcao = key.next();

        int op = validadarEntrada(opcao, 7);

        if (VerificadorDeNumeros == true) {
            switch (op) {
                case 1:
                    System.out.println("Informe o elemento que deseja inserir");
                    String elemento = key.next();
                    pilha.inserir(elemento);
                    System.out.println("Valor " + elemento + " inserido com sucesso no topo da pilha!");
                    MenuLifo();
                    break;
                case 2:
                    System.out.println("O valor " + pilha.remover() + " contido no topo da pilha foi removido com sucesso!");
                    MenuLifo();
                    break;
                case 0:
                    System.out.println("Saindo do sistema");
                    break;
            }
        } else {
            System.out.println("Número incorreto!");
            MenuLifo();
        }
    }

    public static void MenuFifo() {
                    System.out.println(" ----------------------------------\n"
                    + "======== Filas (FIFO) ======="
                    + "\n ----------------------------------"
                + "\nSelecione uma opcao:"
                + "\n[1] - Inserir na Fila"
                + "\n[2] - Remover da Fila"
                + "\n[0] - Saída");
                System.out.println();
                System.out.print("Qual operação deseja: ");
        String opcao = key.next();

        int op = validadarEntrada(opcao, 7);

        if (VerificadorDeNumeros == true) {

            switch (op) {
                case 1:
                    System.out.println("Informe o elemento que deseja inserir");
                    String elemento = key.next();
                    fila.inserir(elemento);
                    System.out.println("Valor " + elemento + " inserido com sucesso na fila!");
                    MenuFifo();
                    break;
                case 2:
                    System.out.println("O valor " + fila.remover() + " foi removido com sucesso!");
                    MenuFifo();
                    break;
                case 0:
                    System.out.println("Saindo do sistema");
                    break;
            }
        } else {
            System.out.println("Número incorreto!");
            MenuFifo();
        }

    }

    public static void MenuLista() {
                    System.out.println(" ----------------------------------\n"
                    + "  ======== Listas ======= "
                    + "\n ----------------------------------"
                + "\nSelecione uma opcao:"
                + "\n[1] - Inserir no inicio"
                + "\n[2] - Inserir no fim"
                + "\n[3] - Remover do inicio"
                + "\n[4] - Remover do fim"
                + "\n[0] - Saída");
                System.out.println();
                System.out.print("Qual operação deseja: ");
        String opcao = key.next();

        int op = validadarEntrada(opcao, 9);

        if (VerificadorDeNumeros == true) {
            String elemento;
            int indice;

            switch (op) {
                case 1:
                    System.out.println("Informe o valor para o inicio da lista");
                    elemento = key.next();
                    lista.inserirInicio(elemento);
                    System.out.println("Valor " + elemento + " inserido com sucesso no inicio da lista!");
                    MenuLista();
                    break;
                case 2:
                    System.out.println("Informe o valor para o fim da lista");
                    elemento = key.next();
                    lista.inserirFim(elemento);
                    System.out.println("Valor " + elemento + " inserido com sucesso no final da lista!");
                    MenuLista();
                    break;
                case 3:
                    System.out.println("O valor (" + lista.retirarInicio() + ") foi removido do inicio da lista!");
                    MenuLista();
                    break;
                case 4:
                    System.out.println("O valor (" + lista.retirarFim() + ") foi removido do final da lista!");
                    MenuLista();
                    break;
                case 0:
                    System.out.println("Saindo do sistema");
                    break;
            }
        } else {
            System.out.println("Número incorreto!");
            MenuFifo();
        }
    }

    protected static int validadarEntrada(String opcao, int tamMenu) {
        if (opcao.matches("[0-9]*")) {
            VerificadorDeNumeros = true;
        } else {
            VerificadorDeNumeros = false;
            System.out.println("O valor informado não e um número ou não e um número inteiro positivo!");
            return 0;
        }

        if (opcao.contains(" ")) {
            VerificadorDeNumeros = false;
        }

        int op = Integer.parseInt(opcao);
        if (VerificadorDeNumeros == true) {

            if (op < 0 || op > tamMenu) {
                VerificadorDeNumeros = false;
                System.out.println("Número invalido!");
            }
        } else {
            VerificadorDeNumeros = true;
            return op;
        }
        return op;
    }

    
    
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        Menu();
    }
    
}
