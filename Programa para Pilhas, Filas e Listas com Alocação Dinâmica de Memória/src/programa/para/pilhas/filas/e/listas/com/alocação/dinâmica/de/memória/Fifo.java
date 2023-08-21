/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programa.para.pilhas.filas.e.listas.com.alocação.dinâmica.de.memória;

/**
 *
 * @author Guilherme Selau Pereira
 */
public class Fifo {
    
     No inicio = null;
    No fim;
    int tam = 0;
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
        tam++;
    }

    public String remover() {
        if (inicio != null) {
            info = inicio.info;
            No aux = inicio;
            inicio = aux.proximo;
            aux = null;
            this.tam--;
            return info;
        } else if (inicio == null && fim != null) {
            info = fim.info;
            this.fim = null;
            this.tam--;
            return info;
        }
        return "";
    }
}
