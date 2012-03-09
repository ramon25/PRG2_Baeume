/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package prg2_bäume;

/**
 *
 * @author ramon
 */
/**
 * ETH Z¸rich; Leitprogramm; Bin‰re Suchb‰ume ----- 
 * Das ist die Klasse eines einzelnen Knotens des Bin‰ren Suchbaums. 
 * @author Bjˆrn Steffen, Timur Erdag, Christina Class
 * @version 1.0 
 */
public class BinSearchTree {
    private int key;
    private BinSearchTree left, right;
    
    public BinSearchTree( int key ) {
        this.key = key;
        left=null;
        right=null;
    }
    
    public BinSearchTree( int key, BinSearchTree left, BinSearchTree right ) {
        this.key = key;
        this.left = left;
        this.right = right;
    }
    
    /**
     * getter Methode f¸r den Schl¸ssel
     * @return den Schl¸sselwert
     */
    public int getKey()
    {
        return key;
    }
    
    /**
     * setter Methode f¸r den Schl¸ssel
     * @param value der neue Schl¸sselwert
     */
    public void setKey(int value)
    {
        key = value;
    }
    
    
    /**
     * getter Methode f¸r das rechte Kind
     * @return rechtes Kind
     */
    public BinSearchTree getRight()
    {
        return right;
    }
    
    /**
     * setter Methode f¸r das rechte Kind
     * @param newRight Referenz auf neues rechtes Kind
     */
    public void setRight(BinSearchTree newRight)
    {
        right=newRight;
    }
    
    /**
     * getter Methode f¸r das linke Kind
     * @return linkes Kind
     */
    public BinSearchTree getLeft()
    {
        return left;
    }
    
    /**
     * setter Methode f¸r das linke Kind
     * @param newLeft Referenz auf neues linkes Kind
     */
    public void setLeft(BinSearchTree newLeft)
    {
        left=newLeft;
    }
    
    /**
     * Inorder Ausgabe f¸r den bin‰ren Suchbaum
     * @param node Wurzelknoten des bin‰ren Suchbaums, der mit inorder ausgegeben werden soll
     */  
    public void inorder(BinSearchTree node) {
        if (node != null) {
            inorder (node.getLeft());
            System.out.print (" " + node.getKey() + " ");
            inorder (node.getRight());
        }
    }
 

   
    /** 
     * Die Methode gibt zur¸ck, ob der ¸bergebene Wert im Baum vorhanden ist.
     * @param node die Wurzel des Suchbaumes
     * @param key der Suchschl¸ssel
     * @return ob die Suche erfolgreich war
     */
    // Implementiere diese Methode nach den Vorgaben der Aufgabe 4.3.
    // Geben Sie true zur¸ck, wenn der Wert gefunden wurde,
    // false sonst.
    public boolean search(BinSearchTree node, int key) {
        boolean end = false;
        if (node != null) {
            if (key < node.getKey()) {
                end = search(node.getLeft(),key);
            }
            else {
                if (key > node.getKey()) {
                    end = search(node.getRight(),key);
                }
                else {
                    end = true;
                }
            }
                
        }
        else {
            end = false;
        }
        
        return end;
    }

     
    /**
     * Diese Methode f¸gt einen neuen Knoten mit dem Schl¸ssel key in den
     * bin‰ren Suchbaum ein.
     * Aufruf dieser Methode f¸r einen Baum mit Wurzel root mit dem Wert 10: 
     * root = insert (root, 10);
     * @param node Wurzel des Baumes
     * @param Schl¸sselwert, den der neue Knoten haben soll
     * @return die neue Wurzel des Baumes.  
     */
    // Implementieren Sie diese Methode nach den Vorgaben der Aufgabe.
    // Geben Sie zur Kontrolle den Wert jedes besuchten Knoten aus!

    public BinSearchTree insert(BinSearchTree node, int key) 
    {
        if (node != null) {
            if (key < node.getKey()) {
                System.out.print(node.getKey() + " ");
                insert(node.getLeft(),key);
            }
            else {
                System.out.print(node.getKey() + " ");
                insert(node.getRight(),key);
            }
        }
        else {
            node = new BinSearchTree(key);
        }
        return node;
    }


    /**
     * Diese Methode lˆscht alle Knoten mit dem Schl¸ssel key in dem
     * bin‰ren Suchbaum. (Aufgabe 4.13. (Additum))
     * Aufruf dieser Methode f¸r einen Baum mit Wurzel root mit dem Schl¸sselwert 10: 
     * root = delete(root, 10);
     * @param node Wurzel des Baumes
     * @param Schl¸sselwert, den der neue Knoten haben soll
     * @return die neue Wurzel des Baumes.  
     */   
    // Als Additum kann auch das Lˆschen implementiert werden
    // als //# taucht immer die Zeile des Pseudocodes in der Musterlˆsung des Leitprogramms auf
    public BinSearchTree delete(BinSearchTree node, int key) 
    {
        return node;
    }
}

