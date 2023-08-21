/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programa.para.pilhas.filas.e.listas.com.alocação.dinâmica.de.memória;

/**
 *
 * @author Guilherme Selau Pereira
 */
public class Lifo {
    
    No topo = null;
    int tam;
    String info;

    public void inserir(String elemento) {
        No no = new No();
        no.info = elemento;
        no.proximo = topo;
        topo = no;
        tam++;
    }

    public String remover() {
        info = topo.info;
        No aux = topo;
        topo = aux.proximo;
        aux = null;
        tam--;
        return info;
    }
}
