package Pilha_Filas_Listas;

public class Fila {

    No inicio = null;
    No fim;
    int tamanho = 0;
    String info;

    public void inserir(String elemento) {
        No no = new No();
        no.info = elemento;
        if (inicio == null) {
            inicio = no;
            fim = no;
        } else {
            fim.proximo = no;
            fim = fim.proximo;
        }
        tamanho++;
    }

    public String remover() {
        if (inicio != null) {
            info = inicio.info;
            No aux = inicio;
            inicio = aux.proximo;
            aux = null;
            this.tamanho--;
            return info;
        } else if (inicio == null && fim != null) {
            info = fim.info;
            this.fim = null;
            this.tamanho--;
            return info;
        }
        return "";
    }
}
