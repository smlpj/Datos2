package lab02;

import java.util.LinkedList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Sergio
 */
public class Kruskal {
    /**
     * Metodo que crea el arbol de expansión minima por el algoritmo de Kruskal
     * @param g Grafo al que aplicarle el algoritmo
     * @return Arbol de expansión minima
     */
    public static Grafo kruskal(Grafo g) {
        boolean[] visitados = new boolean[g.Nodos.size()];
        Grafo K = new Grafo();

        kruskal2(g, K, visitados);

        return K;
    }
    /**
     * Metodo que continua el algoritmo de Kruskal
     * @param g Grafo original
     * @param K Grafo inicialmente vacio
     * @param visitados Lista de booleanos con tamaño igual a la lista de nodos de g
     * @return El grafo K parcialmente terminado o terminado
     */
    private static Grafo kruskal2(Grafo g, Grafo K, boolean[] visitados) {
        Arista menor = AristaMenor(g, visitados);
        Arista menorInv = new Arista(menor.destino, menor.origen, menor.distancia);
        int indexOr = g.Nodos.indexOf(menor.origen);
        int indexDes = g.Nodos.indexOf(menor.destino);

        if (indexOr == -1 && indexDes == -1) {//Esto ocurre cuando hay nodos aislados
            Aislado(g, visitados, K);
        } else if (visitados[indexOr] && !visitados[indexDes]) { //Solo se ha visitado el nodo origen de la arista
            Nodo n = new Nodo(menor.origen.nombre, menor.origen.x, menor.origen.y);
            Nodo m = new Nodo(menor.destino.nombre, menor.destino.x, menor.destino.y);
            m.addArista(menorInv);
            K.addNodo(m);
            K.Nodos.get(index(K, n)).addArista(menor);
            visitados[indexDes] = true;
        } else if (!visitados[indexOr] && visitados[indexDes]) {//Solo se ha visitado el nodo destino de la arista
            Nodo n = new Nodo(menor.destino.nombre, menor.destino.x, menor.destino.y);
            Nodo m = new Nodo(menor.origen.nombre, menor.origen.x, menor.origen.y);
            m.addArista(menor);
            K.addNodo(m);
            K.Nodos.get(index(K, n)).addArista(menorInv);
            visitados[indexOr] = true;
        } else if (!visitados[indexOr] && !visitados[indexDes]) {//No se han visitado ambos nodos
            Nodo n = new Nodo(menor.origen.nombre, menor.origen.x, menor.origen.y);
            Nodo m = new Nodo(menor.destino.nombre, menor.destino.x, menor.destino.y);
            n.addArista(menor);
            m.addArista(menorInv);
            K.addNodo(n);
            K.addNodo(m);
            visitados[indexOr] = true;
            visitados[indexDes] = true;
        }
        if (K.Nodos.size() == g.Nodos.size()) {
            return K;
        } else {
            return kruskal2(g, K, visitados);
        }

    }
    /**
     * Metodo que encuentra los nodos aislados del grafo, los marca como visitados y los agrega al grafo K
     * @param G Grafo original
     * @param visitados lista de booleanos del mismo tamaño de la lista de nodos en G
     * @param K Grafo en el que se crea el arbol de Kruskal
     */
    private static void Aislado(Grafo G, boolean[] visitados, Grafo K) {
        for (Nodo n : G.Nodos) {
            if (n.Aristas.isEmpty()) {
                K.addNodo(n);
                visitados[G.Nodos.indexOf(n)] = true;
            }
        }
    }
    /**
     * Busca el indice del nodo equivalente en la lista de nodos del grafo
     * @param K El grafo
     * @param N Nodo con el que comparar
     * @return indice del nodo dentro de la lista de nodos en K
     */
    private static int index(Grafo K, Nodo N) {
        for (Nodo i : K.Nodos) {
            if (N.nombre.equals(i.nombre)) {
                return K.Nodos.indexOf(i);
            }
        }
        return -1;
    }
    /**
     * Busca la menor arista entre todos los nodos de un grafo
     * @param g El grafo
     * @param visitados lista de booleanos con el mismo tamaño a la lista de nodos de g
     * @return La arista menor
     * @return Arista con origen y destino nulos si encuentra un nodo aislado
     */
    private static Arista AristaMenor(Grafo g, boolean[] visitados) {
        Arista menor = new Arista();
        int min = Integer.MAX_VALUE;
        for (Nodo n : g.Nodos) {
            if (!visitados[g.Nodos.indexOf(n)] && !n.Aristas.isEmpty()) {
                for (Arista a : n.Aristas) {
                    if (a.distancia <= min) {
                        min = a.distancia;
                        menor = a;
                    }
                }
            }
        }
        return menor;
    }
}
