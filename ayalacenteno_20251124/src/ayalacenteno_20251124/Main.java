/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ayalacenteno_20251124;

/**
 *
 * @author UFG
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        GrafoRecursivo grafo = new GrafoRecursivo(4);
        
        grafo.insertarNodo('A');//indice 0
        grafo.insertarNodo('B');//indice 1
        grafo.insertarNodo('C');//indice 2
        grafo.insertarNodo('D');//indice 3
        
        grafo.conectar(0, 1);//Arista A,B
        grafo.conectar(0, 2);//Arista A,C
        grafo.conectar(1, 3);//Arista B,D
        grafo.conectar(2, 3);//Arista C,D
        
        System.out.println("Recorrido o Depth First Search(DFS) desde el nodo A");
        
        grafo.dfs(0);
        //teoricamente el recorrido es
        // A -> B ->(Adyacente) D ->(Adyacente)(retrocede y vuelve a la raiz, y luego C que no es adyacente) C
        
        
    }
    
}
