/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programa.para.árvore.avl;

/**
 *
 * @author Guilherme Selau Pereira
 */
public class AVL {
    private No root = null;

    public AVL() {
        this.root = null;
    }

    public void remover() {
        this.root = null;
        
    }
    public No removerNo(No no, int v){  
        if (this.root == null){
            return no;
        }
        if (v < no.element){
            no.left = removerNo(no.left, v);
        }else if (v > no.element){
            no.right = removerNo(no.right, v);
        }else{
            if ((no.left == null) || (no.right == null)){
                No temp = null;
                if (no.left == null){
                    temp = no.right;
                }else{
                    temp = no.left;
                }
                if (temp == null){  
                    temp = no;
                    no = null;
                }else{
                    no = temp;
                }
            }else{
                No temp = noMenorValor(no.right);
                no.element = temp.element;
                no.right = removerNo(no.right, temp.element);
            }
        }
        if (no == null){
            return no;
        }
        no = reequilibrar(no);
        return no;
    }
    private No noMenorValor(No node) {
        No atual = node;
        /* loop down to find the leftmost leaf */
        while (atual.left != null) {
            atual = atual.left;
        }
        return atual;
    }
    
    private No reequilibrar(No z) {
        atualizarAltura(z);
        int equilibrio = getEquilibrio(z);
        if (equilibrio > 1) {
            if (altura(z.right.right) > altura(z.right.left)) {
                z = rotacionarEsquerda(z);
            } else {
                z.right = rotacionarDireita(z.right);
                z = rotacionarEsquerda(z);
            }
        } else if (equilibrio < -1) {
            if (altura(z.left.left) > altura(z.left.right)) {
                z = rotacionarDireita(z);
            } else {
                z.left = rotacionarEsquerda(z.left);
                z = rotacionarDireita(z);
            }
        }
        return z;
    }
    
    
    private No rotacionarDireita(No y) {
        No x = y.left;
        No z = x.right;
        x.right = y;
        y.left = z;
        atualizarAltura(y);
        atualizarAltura(x);
        return x;
    }
    
    
    
     private No rotacionarEsquerda(No y) {
        No x = y.right;
        No z = x.left;
        x.left = y;
        y.right = z;
        atualizarAltura(y);
        atualizarAltura(x);
        return x;
    }

    private void atualizarAltura(No n) {
        n.altura = 1 + Math.max(altura(n.left), altura(n.right));
    }

    private int altura(No n) {
        if(n != null){
            return n.altura;
        }
        return -1;
    }

    public int getEquilibrio(No n) {
        return (n == null) ? 0 : altura(n.right) - altura(n.left);
    }

    public boolean isEmpty() {
        if (this.root == null) {
            return true;
        } else {
            return false;
        }
    }

    public No getRootNode() {
        return this.root;
    }

    public boolean inserir(int element) {
        this.root = insert(element, this.root);
        return true;
    }

    public boolean searchElement(int element) {
        if (search(this.root, element) == 0) {
            return false;
        } else {
            return true;
        }
    }

    public void inorder() {
        inorder(this.root);
    }

    public void preorder() {
        preorder(this.root);
    }

    public void postorder() {
        postorder(this.root);
    }
   
    public void displayTree() {
        if (isEmpty()) {
            System.out.println("Árvore vazia!");
            return;
        }
        String separator = String.valueOf("  |--->");
        System.out.println(this.root.element + "(" + this.root.height + ")");
        displaySubTree(this.root.left, separator);
        displaySubTree(this.root.right, separator);
    }
    
    public No balancear(No no) {
        if (getFactor(no) == 2) {
            if (getFactor(no.left) > 0) {
                no = rightRotation(no);
            } else {
                no = doubleRightRotation(no);
            }
        } else if (getFactor(no) == -2) {
            if (getFactor(no.right) < 0) {
                no = leftRotation(no);
            } else {
                no = doubleLeftRotation(no);
            }
        }
        no.height = maxHeight(height(no.left), height(no.right)) + 1;
        return no;
    }

    private static int height(No no) {
        if (no == null) {
            return -1;
        } else {
            return no.height;
        }
    }

    private static int maxHeight(int leftHeight, int rightHeight) {
        if (leftHeight > rightHeight) {
            return leftHeight;
        } else {
            return rightHeight;
        }
    }

    private int getFactor(No t) {
        return height(t.left) - height(t.right);
    }

    private No insert(int insertElement, No no) {
        if (no == null) {
            no = new No(insertElement);
        } else if (insertElement < no.element) {
            no.left = insert(insertElement, no.left);
        } else if (insertElement > no.element) {
            no.right = insert(insertElement, no.right);
        }
        no = balancear(no);
        return no;
    }
    
    private static No rightRotation(No no) {  
        No noAux = no.left;  
        no.left = noAux.right;  
        noAux.right = no;  
        no.height = maxHeight(height(no.left), height(no.right)) + 1;  
        noAux.height = maxHeight(height(noAux.left), no.height) + 1;  
        return noAux;  
    }

    private static No leftRotation(No no) {
        No noAux = no.right;  
        no.right = noAux.left;  
        noAux.left = no;  
        no.height = maxHeight( height( no.left ), height( no.right ) ) + 1;  
        noAux.height = maxHeight( height( noAux.right ), no.height ) + 1;  
        return noAux;
    }

    private static No doubleRightRotation(No no) {
        no.left = leftRotation(no.left);
        return rightRotation(no);
    }

    private static No doubleLeftRotation(No no) {
        no.right = rightRotation(no.right);
        return leftRotation(no);
    }

    protected int search(No no, int findElement) {
        while (no != null) {
            if (findElement == no.element) {
                return 1;
            } else if (findElement < no.element) {
                no = no.left;
            } else {
                no = no.right;
            }
        }
        return 0;
    }   

    protected void inorder(No no) {
        if (no != null) {
            inorder(no.left);
            System.out.print(no.element + " - ");
            inorder(no.right);
        }
    }

    protected void preorder(No no) {
        if (no != null) {
            System.out.print(no.element + " - ");
            preorder(no.left);
            preorder(no.right);
        }
    }

    protected void postorder(No no) {
        if (no != null) {
            postorder(no.left);
            postorder(no.right);
            System.out.print(no.element + " - ");
        }
    }

    protected No searchFather(int element) {
        No noRoot = this.root;
        No prev = null;
        while (noRoot != null && !(noRoot.element == element)) {
            prev = noRoot;
            if (noRoot.element < element) {
                noRoot = noRoot.right;
            } else {
                noRoot = noRoot.left;
            }
        }
        if (noRoot != null && noRoot.element == element) {
            return prev;
        }
        return null;
    }

    private void displaySubTree(No node, String separator) {

        if (node != null) {

            No father = this.searchFather(node.element);
            if (node.equals(father.left) == true) {
                System.out.println(separator + node.element + "(" + node.height + ")" + " (ESQ)");
            } else {
                System.out.println(separator + node.element + "(" + node.height + ")" + " (DIR)");
            }
            displaySubTree(node.left, "     " + separator);
            displaySubTree(node.right, "     " + separator);
        }
    }

}
