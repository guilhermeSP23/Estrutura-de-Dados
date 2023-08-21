package Pilha_Filas_Listas;

public class Lista {

    No inicio;
    No fim;
    int tamanho;

    public void inserirInicio(String info) {
        No no = new No();
        no.info = info;
        no.anterior = null;
        no.proximo = inicio;
        if (inicio != null) {
            inicio.anterior = no;
        }
        inicio = no;
        if (tamanho == 0) {
            fim = inicio;
        }
        tamanho++;
    }

    public String retirarInicio() {
        if (inicio == null) {
            return null;
        }
        String out = inicio.info;
        inicio = inicio.proximo;
        if (inicio != null) {
            inicio.anterior = null;
        } else {
            fim = null;
        }
        tamanho--;
        return out;
    }

    public void inserirFim(String info) {
        No no = new No();
        no.info = info;
        no.proximo = null;
        no.anterior = fim;
        if (fim != null) {
            fim.proximo = no;
        }
        fim = no;
        if (tamanho == 0) {
            inicio = fim;
        }
        tamanho++;
    }

    public String retirarFim() {
        if (fim == null) {
            return null;
        }
        String out = fim.info;
        fim = fim.anterior;
        if (fim != null) {
            fim.proximo = null;
        } else {
            inicio = null;
        }
        tamanho--;
        return out;
    }
}
