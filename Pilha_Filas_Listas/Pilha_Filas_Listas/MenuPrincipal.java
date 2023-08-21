package Pilha_Filas_Listas;

import java.util.Scanner;

/*
**
Nome: Maicon Roberto Lima da Matta  
Mat:2019012037  
Curso: Análise e Desenvolvimento de Sistemas
Disciplina: Estrutura de Dados
Professor: Andre
**
 */

public class MenuPrincipal {

    static Scanner EntradaPorTeclado = new Scanner(System.in);
    static boolean vericia_numero;
    static Pilha pilha = new Pilha();
    static Fila fila = new Fila();
    static Lista lista = new Lista();

    public static void imprimeMenu() {
        System.out.println("=================================================="
                + "\nSelecione algumas das estrutura de dados a seguir:"
                + "\n[1] Pilha"
                + "\n[2] Fila"
                + "\n[3] Lista"
                + "\n[0] Sair"
                + "\nInforme o número de acordo com a opcao:");
        String opcao = EntradaPorTeclado.next();

        int op = validadorDeEntrada(opcao, 3);

        if (vericia_numero == true) {
            switch (op) {
                case 1:
                    imprimeMenuPilha();
                    break;
                case 2:
                    imprimeMenuFila();
                    break;
                case 3:
                    imprimeMenuLista();
                    break;
                case 0:
                    System.out.println("Saida realizada com sucesso");
                    break;
            }
        } else {
            System.out.println("Numero incorreto!");
            imprimeMenu();
        }

    }

    public static void imprimeMenuPilha() {
                    System.out.println(" ----------------------------------\n"
                    + "    **** Pilhas ***** "
                    + "\n ----------------------------------"
                + "\nSelecione uma opcao:"
                + "\n[1] Inserir na pilha"
                + "\n[2] Remover da pilha"
                + "\n[0] Sair"
                + "\nInforme o numero de acordo com a opcao:");
        String opcao = EntradaPorTeclado.next();

        int op = validadorDeEntrada(opcao, 7);

        if (vericia_numero == true) {
            switch (op) {
                case 1:
                    System.out.println("Informe o elemento que deseja inserir");
                    String elemento = EntradaPorTeclado.next();
                    pilha.inserir(elemento);
                    System.out.println(">>> Elemento " + elemento + " inserido com sucesso no topo da pilha! <<<");
                    imprimeMenuPilha();
                    break;
                case 2:
                    System.out.println(">>> O elemento (" + pilha.remover() + ") contido no topo da pilha foi removido!");
                    imprimeMenuPilha();
                    break;
                case 0:
                    System.out.println("Saida realizada com sucesso");
                    break;
            }
        } else {
            System.out.println("Numero incorreto!");
            imprimeMenuPilha();
        }
    }

    public static void imprimeMenuFila() {
                    System.out.println(" ----------------------------------\n"
                    + "    **** Filas ***** "
                    + "\n ----------------------------------"
                + "\nSelecione uma opcao:"
                + "\n[1] Inserir na Fila"
                + "\n[2] Remover da Fila"
                + "\n[0] Sair"
                + "\nInforme o numero de acordo com a opcao:");
        String opcao = EntradaPorTeclado.next();

        int op = validadorDeEntrada(opcao, 7);

        if (vericia_numero == true) {

            switch (op) {
                case 1:
                    System.out.println("Informe o elemento que deseja inserir");
                    String elemento = EntradaPorTeclado.next();
                    fila.inserir(elemento);
                    System.out.println(">>> Elemento " + elemento + " inserido com sucesso no final da fila! <<<");
                    imprimeMenuFila();
                    break;
                case 2:
                    System.out.println(">>> O elemento (" + fila.remover() + ") foi removido da fila!");
                    imprimeMenuFila();
                    break;
                case 0:
                    System.out.println("Saida realizada com sucesso");
                    break;
            }
        } else {
            System.out.println("Numero incorreto!");
            imprimeMenuFila();
        }

    }

    public static void imprimeMenuLista() {
                    System.out.println(" ----------------------------------\n"
                    + "    **** Listas ***** "
                    + "\n ----------------------------------"
                + "\nSelecione uma opcao:"
                + "\n[1] Inserir no inicio"
                + "\n[2] Inserir no fim"
                + "\n[3] Remover do inicio"
                + "\n[4] Remover do fim"
                + "\n[0] Sair"
                + "\nInforme o numero de acordo com a opcao:");
        String opcao = EntradaPorTeclado.next();

        int op = validadorDeEntrada(opcao, 9);

        if (vericia_numero == true) {
            String elemento;
            int indice;

            switch (op) {
                case 1:
                    System.out.println("Informe o elemento que deseja inserir no inicio");
                    elemento = EntradaPorTeclado.next();
                    lista.inserirInicio(elemento);
                    System.out.println(">>> Elemento " + elemento + " inserido com sucesso no inicio da lista! <<<");
                    imprimeMenuLista();
                    break;
                case 2:
                    System.out.println("Informe o elemento que deseja inserir no fim");
                    elemento = EntradaPorTeclado.next();
                    lista.inserirFim(elemento);
                    System.out.println(">>> Elemento " + elemento + " inserido com sucesso no final da lista! <<<");
                    imprimeMenuLista();
                    break;
                case 3:
                    System.out.println(">>> O elemento (" + lista.retirarInicio() + ") foi removido do inicio da lista!");
                    imprimeMenuLista();
                    break;
                case 4:
                    System.out.println(">>> O elemento (" + lista.retirarFim() + ") foi removido do final da lista!");
                    imprimeMenuLista();
                    break;
                case 0:
                    System.out.println("Saida realizada com sucesso");
                    break;
            }
        } else {
            System.out.println("Numero incorreto!");
            imprimeMenuFila();
        }
    }

    protected static int validadorDeEntrada(String opcao, int tamanho_do_menu) {
        if (opcao.matches("[0-9]*")) {
            vericia_numero = true;
        } else {
            vericia_numero = false;
            System.out.println("O dado informado nao e um numero!\nOu nao e um numero inteiro positivo!");
            return 0;
        }

        if (opcao.contains(" ")) {
            vericia_numero = false;
        }

        int op = Integer.parseInt(opcao);
        if (vericia_numero == true) {

            if (op < 0 || op > tamanho_do_menu) {
                vericia_numero = false;
                System.out.println("Voce informou um numero invalido!");
            }
        } else {
            vericia_numero = true;
            return op;
        }
        return op;
    }

    public static void main(String[] args) {
        imprimeMenu();
    }
}
