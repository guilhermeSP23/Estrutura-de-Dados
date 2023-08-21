/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programa.para.árvore.avl;

/**
 *
 * @author Guilherme Selau Pereira
 */
public class No {
    int height;
    int element;
    No left; 
    No right;
    int altura;

    public No (int element) {
        this.left = null;
        this.right = null;
        this.element = element;
        this.height = 0;
    }

    No() {
        this.left = null;
        this.right = null;
        this.element = 0;
        this.height = 0;
    }
}
