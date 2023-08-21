/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programa.para.pilhas.filas.e.listas.com.alocação.dinâmica.de.memória;

/**
 *
 * @author Guilherme Selau Pereira
 */
public class Lista {
    
    No inicio;
    No fim;
    int tam;

    public void inserirInicio(String info) {
        No no = new No();
        no.info = info;
        no.anterior = null;
        no.proximo = inicio;
        if (inicio != null) {
            inicio.anterior = no;
        }
        inicio = no;
        if (tam == 0) {
            fim = inicio;
        }
        tam++;
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
        tam--;
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
        if (tam == 0) {
            inicio = fim;
        }
        tam++;
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
        tam--;
        return out;
    }
}
