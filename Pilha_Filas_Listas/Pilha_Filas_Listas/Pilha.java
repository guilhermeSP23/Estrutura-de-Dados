package Pilha_Filas_Listas;

public class Pilha {

    No topo = null;
    int tamanho;
    String info;

    public void inserir(String elemento) {
        No no = new No();
        no.info = elemento;
        no.proximo = topo;
        topo = no;
        tamanho++;
    }

    public String remover() {
        info = topo.info;
        No aux = topo;
        topo = aux.proximo;
        aux = null;
        tamanho--;
        return info;
    }
}
