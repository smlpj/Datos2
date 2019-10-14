package lab02;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.net.URL;
import java.util.Scanner;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author HP 14CK0011LA
 */
public class Ventana extends javax.swing.JFrame {

    /**
     * Creates new form Ventana
     */
    public Ventana() {
        initComponents();
        DibujarOriginal.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Pruebas = new javax.swing.JButton();
        EliminarNodo = new javax.swing.JButton();
        KRUSKAL = new javax.swing.JButton();
        Mensajes = new javax.swing.JLabel();
        PRIM = new javax.swing.JButton();
        Adyacencia = new javax.swing.JButton();
        mapa1 = new lab02.Mapa();
        DibujarOriginal = new javax.swing.JButton();
        guardarprincipal = new javax.swing.JButton();
        abrirprincipal = new javax.swing.JButton();
        guardarKruskal = new javax.swing.JButton();
        abrirKruskal = new javax.swing.JButton();
        guardarPrim = new javax.swing.JButton();
        abrirPrim = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
        });

        jLabel1.setText("Click derecho para agregar nodo");

        jLabel2.setText("Click izquierdo para seleccionar un nodo ");

        Pruebas.setText("Boton de pruebas ");
        Pruebas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PruebasActionPerformed(evt);
            }
        });

        EliminarNodo.setText("Eliminar nodo");
        EliminarNodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarNodoActionPerformed(evt);
            }
        });

        KRUSKAL.setText("Kruskal");
        KRUSKAL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KRUSKALActionPerformed(evt);
            }
        });

        PRIM.setText("Prim");
        PRIM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PRIMActionPerformed(evt);
            }
        });

        Adyacencia.setText("Añadir adyacencia");
        Adyacencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdyacenciaActionPerformed(evt);
            }
        });

        mapa1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                mapa1MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                mapa1MouseReleased(evt);
            }
        });

        javax.swing.GroupLayout mapa1Layout = new javax.swing.GroupLayout(mapa1);
        mapa1.setLayout(mapa1Layout);
        mapa1Layout.setHorizontalGroup(
            mapa1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        mapa1Layout.setVerticalGroup(
            mapa1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 307, Short.MAX_VALUE)
        );

        DibujarOriginal.setText("Original");
        DibujarOriginal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DibujarOriginalActionPerformed(evt);
            }
        });

        guardarprincipal.setText("Guardar");
        guardarprincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarprincipalActionPerformed(evt);
            }
        });

        abrirprincipal.setText("Abrir");
        abrirprincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abrirprincipalActionPerformed(evt);
            }
        });

        guardarKruskal.setText("Guardar");
        guardarKruskal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarKruskalActionPerformed(evt);
            }
        });

        abrirKruskal.setText("Abrir");
        abrirKruskal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abrirKruskalActionPerformed(evt);
            }
        });

        guardarPrim.setText("Guardar");
        guardarPrim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarPrimActionPerformed(evt);
            }
        });

        abrirPrim.setText("Abrir");
        abrirPrim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abrirPrimActionPerformed(evt);
            }
        });

        jLabel3.setText("Grafo principal");

        jLabel4.setText("Árbol de expansión mínima (Prim)");

        jLabel5.setText("Árbol de expansión mínima (Kruskal)");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(mapa1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(30, 30, 30)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(208, 208, 208)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(KRUSKAL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Adyacencia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(PRIM, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(EliminarNodo))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(DibujarOriginal, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 114, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(Pruebas)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(Mensajes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(abrirprincipal)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(guardarprincipal))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(abrirKruskal)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(guardarKruskal))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(abrirPrim)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(guardarPrim)))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mapa1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Pruebas)
                        .addComponent(Adyacencia))
                    .addComponent(EliminarNodo))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Mensajes, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(KRUSKAL))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(PRIM)
                            .addComponent(DibujarOriginal))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(guardarprincipal)
                    .addComponent(abrirprincipal)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(27, 27, 27)
                        .addComponent(jLabel5))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(abrirPrim)
                                .addComponent(guardarPrim))
                            .addGap(36, 36, 36))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(abrirKruskal)
                            .addComponent(guardarKruskal))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    static Grafo g = new Grafo();
    Nodo Seleccionado1 = null, Seleccionado2 = null;
    boolean addEdge = false;
    File FileNodos = new File("nodos.txt");
    File FileAdyacencias = new File("adyacencias.txt");
    File FileNodosPrim = new File("nodosPrim.txt");
    File FileAdyacenciasPrim = new File("adyacenciasPrim.txt");
    File FileNodosKruskal = new File("nodosKruskal.txt");
    File FileAdyacenciasKruskal = new File("adyacenciasKruskal.txt");


    private void PruebasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PruebasActionPerformed

        System.out.println("VERTICES");
        g.MostrarNodos();

        System.out.println("ADYACENCIAS:");
        g.Mostrar_adyacencias();

        System.out.println("MATRIZ ADYACENCIAS");
        g.GenerarMatrizAdyancencia();

        System.out.println("MATRIZ DISTANCIAS");
        g.GenerarMatrizDistancia();

        System.out.println("CICLOS");
        System.out.println("" + g.VerificarCiclo());

        if (Seleccionado1 != null) {
            System.out.println("CONEXOS A PARTIR DE " + Seleccionado1.nombre);
            System.out.println(Grafo.NodosConexos(g, Seleccionado1));
        }
    }//GEN-LAST:event_PruebasActionPerformed
    /**
     * Boton que permite eliminar un Nodo seleccionado, si no hay seleccionado,
     * se debe seleccionar.
     */
    private void EliminarNodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarNodoActionPerformed
        if (Seleccionado1 != null) { //Si hay un nodo seleccionado, se elimina este.
            EliminarAdyacencias(Seleccionado1);
            g.Nodos.remove(Seleccionado1);
            repaint();
            Seleccionado1 = null;
        } else {
            Mensajes.setText("<html>Debe seleccionar un nodo</html>");
        }
    }//GEN-LAST:event_EliminarNodoActionPerformed

    /**
     * Metodo que ejecuta el algoritmo de Kruskal.
     *
     * @param evt
     */
    private void KRUSKALActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KRUSKALActionPerformed
        if (!this.g.Nodos.isEmpty()) {
            Grafo K = Kruskal.kruskal(this.g);
            Graphics graphics = mapa1.getGraphics();
            graphics.clearRect(0, 0, mapa1.getWidth(), mapa1.getWidth());
            mapa1.paint(graphics);
            paintGraph(graphics, K);
            /*System.out.println("ADYACENCIAS: ");
            K.Mostrar_adyacencias();*/
            DibujarOriginal.setVisible(true);
        } else {
            Mensajes.setText("<html>El grafo esta vacio</html>");
        }
    }//GEN-LAST:event_KRUSKALActionPerformed

    private void PRIMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PRIMActionPerformed
        if (Seleccionado1 != null) {
            if (!Seleccionado1.Aristas.isEmpty()) {
                Grafo P = Prim.prim(Seleccionado1);
                Graphics g = mapa1.getGraphics();
                g.clearRect(0, 0, mapa1.getWidth(), mapa1.getHeight());
                mapa1.paint(g);
                paintGraph(g, P);
                System.out.println("ADYACENCIAS: ");
                P.Mostrar_adyacencias();
                DibujarOriginal.setVisible(true);
            } else {
                Mensajes.setText("<html>Ha seleccionado un nodo sin aristas</html>");
            }
        } else {
            Mensajes.setText("<html>No se ha seleccionado un nodo</html>");
        }
    }//GEN-LAST:event_PRIMActionPerformed

    private void AdyacenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdyacenciaActionPerformed
        if (addEdge == false) {
            addEdge = true;
            Adyacencia.setBackground(Color.GREEN);
        } else {
            addEdge = false;
            Adyacencia.setBackground(null);
        }
    }//GEN-LAST:event_AdyacenciaActionPerformed

    private void mapa1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mapa1MousePressed
        Mensajes.setText("");
    }//GEN-LAST:event_mapa1MousePressed

    /**
     * Contiene el todo el proceso a seguir en el evento de hacer click
     * izquierdo en el mapa
     *
     * @param x Posicion horizontal del panel
     * @param y Posicion vertical del panel
     */
    private void MapaClickIzq(int x, int y) {
        Nodo n = ClickNodo(x, y);
        if (n != null) {
            paintNodo(n, true);

            int index1 = -1, index2 = -1;
            if (Seleccionado1 == null) {
                Seleccionado1 = n;
            } else if (addEdge == false) {
                if (Seleccionado1 != n) {
                    paintNodo(Seleccionado1, false);
                    Seleccionado1 = n;
                }
            } else {
                Seleccionado2 = n;
                index1 = g.Nodos.indexOf(Seleccionado1);    //Posicion de origen en la lista de nodos
                index2 = g.Nodos.indexOf(Seleccionado2);    //Posicion de destino en la lista de nodos
                int distancia;
                try {
                    distancia = Integer.parseInt(JOptionPane.showInputDialog("Distancia entre los dos nodos: "));
                } catch (Exception e) {
                    distancia = -1;
                }
                if (distancia >= 0) {
                    Arista a = new Arista(Seleccionado1, Seleccionado2, distancia);
                    Arista b = new Arista(Seleccionado2, Seleccionado1, distancia);
                    g.Nodos.get(index1).addArista(a);   //Agrega la arista al nodo en la lista de nodos del grafo
                    g.Nodos.get(index2).addArista(b);
                    paintArista(a.origen, a.destino, Color.BLACK, a.distancia);
                } else {
                    Mensajes.setText("<html>El valor colocado para la arista no es válido<br/>Tiene que ser un numero mayor o igual a cero</html>");
                }
                paintNodo(Seleccionado1, false);
                paintNodo(Seleccionado2, false);
                Seleccionado1 = null;
                Seleccionado2 = null;
            }
        }
    }

    /**
     * Metodo que valida el nombre para un nuevo nodo y lo crea.
     *
     * @param nombre
     * @param x
     * @param y
     */
    private void verificarNombre(String nombre, int x, int y) {
        if (nombre != "" || nombre != null) {     //Verifica que se haya colocaldo un nombre
            boolean NodoExiste = false;
            for (Nodo k : g.Nodos) {
                if (nombre.toLowerCase().equals(k.getNombre().toLowerCase())) {
                    NodoExiste = true;
                    break;
                }
            }
            if (NodoExiste == false) {   //Verifica que no exista un nodo con el mismo nombre
                Nodo n = new Nodo(nombre);
                g.addNodo(n);
                n.setX(x);
                n.setY(y);
                paintNodo(n, false);
            } else {
                Mensajes.setText("<html>El nodo ya existe.</html>");
            }
        } else {
            Mensajes.setText("<html>No se ingresó un nombre.</html>");
        }
    }

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        Mensajes.setText("");
    }//GEN-LAST:event_formMousePressed

    private void mapa1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mapa1MouseReleased
        int x, y;
        x = evt.getX();
        y = evt.getY();

        if (evt.getButton() == MouseEvent.BUTTON3) {
            if (ClickNodo(x, y) != null) {
                Mensajes.setText("<html>No se puede colocar un nodo en esta posición</html>");
            } else {
                String nombre = JOptionPane.showInputDialog("Digite el nombre del nodo");
                if (nombre != null) {
                    verificarNombre(nombre, x, y);
                } else {
                    Mensajes.setText("<html>No se ha creado el nodo</html>");
                }
            }
        } else if (evt.getButton() == MouseEvent.BUTTON1) {
            MapaClickIzq(x, y);
        }
    }//GEN-LAST:event_mapa1MouseReleased

    private void DibujarOriginalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DibujarOriginalActionPerformed
        mapa1.paint(mapa1.getGraphics());
        paintGraph(mapa1.getGraphics(), g);
        DibujarOriginal.setVisible(false);
    }//GEN-LAST:event_DibujarOriginalActionPerformed

    private void abrirprincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abrirprincipalActionPerformed
        AbrirArchivo(g,FileNodos, FileAdyacencias);
    }//GEN-LAST:event_abrirprincipalActionPerformed

    private void guardarprincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarprincipalActionPerformed
        GuardarArchivo(g,FileNodos, FileAdyacencias);
    }//GEN-LAST:event_guardarprincipalActionPerformed

    private void guardarKruskalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarKruskalActionPerformed
        GuardarArchivo(Kruskal.kruskal(g),FileNodosKruskal, FileAdyacenciasKruskal);
    }//GEN-LAST:event_guardarKruskalActionPerformed

    private void abrirKruskalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abrirKruskalActionPerformed
        AbrirArchivo(Kruskal.kruskal(g),FileNodosKruskal, FileAdyacenciasKruskal);
    }//GEN-LAST:event_abrirKruskalActionPerformed

    private void abrirPrimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abrirPrimActionPerformed
       AbrirArchivo(Prim.prim(Seleccionado1),FileNodosPrim, FileAdyacenciasPrim);
    }//GEN-LAST:event_abrirPrimActionPerformed

    private void guardarPrimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarPrimActionPerformed
        GuardarArchivo(Prim.prim(Seleccionado1),FileNodosPrim, FileAdyacenciasPrim);
    }//GEN-LAST:event_guardarPrimActionPerformed

    /**
     * Metodo que elimina un nodo especifico de las listas de arista de todos
     * los Nodos que se encuentran en el grafo.
     *
     * @param eliminar nodo que se va a eliminar
     */
    public void EliminarAdyacencias(Nodo eliminar) {
        int cont = 0;
        while (cont < g.Nodos.size()) {
            g.Nodos.get(cont).eliminarArista(eliminar);
            cont++;
        }

    }

    /**
     * Metodo que verifica si se le ha hecho click a un nodo.
     *
     * @param x Posicion en x
     * @param y Posicion en y
     * @return Nodo al que se le hizo click
     */
    public Nodo ClickNodo(int x, int y) {
        for (Nodo nodo : g.Nodos) {
            int x1 = nodo.x + nodo.getNombre().length() * 12;
            if (x > nodo.getX() && x < x1 && y > nodo.getY() && y < nodo.getY() + 25) {
                return nodo;
            }
        }
        return null;
    }

    /**
     * Metodo que dibuja un nodo.
     *
     * @param n Nodo a dibujar
     * @param selec true si el nodo esta seleccionado, false si no lo está
     */
    private void paintNodo(Nodo n, boolean selec) {
        Graphics graphics = mapa1.getGraphics();
        URL url = getClass().getResource("/Imagenes/post-it-note.png");
        Image papel = new ImageIcon(url).getImage();
        if (selec) {
            url = getClass().getResource("/Imagenes/Thumbtack_green.png");
        } else {
            url = getClass().getResource("/Imagenes/Thumbtack_red.png");
        }
        Image chinche = new ImageIcon(url).getImage();
        graphics.drawImage(papel, n.getX(), n.getY(), n.getNombre().length() * 12, 25, rootPane);
        graphics.drawImage(chinche, n.getX(), n.getY() - 10, 12, 12, rootPane);
        graphics.setColor(Color.BLACK);
        graphics.setFont(new Font("Kristen ITC", Font.PLAIN, 12));
        graphics.drawString(n.getNombre(), n.getX() + 10, n.getY() + 15);
    }

    /**
     * Metodo que dibuja la arista que conecta a dos nodos.
     *
     * @param n1 Nodo origen
     * @param n2 Nodo destino
     */
    private void paintArista(Nodo n1, Nodo n2, Color color, int distancia) { //Modifiqué los parametros para que dibujara el peso
        Graphics graphics = mapa1.getGraphics();
        graphics.setColor(color);
        graphics.drawLine(n1.getX(), n1.getY(), n2.getX(), n2.getY());
        int x = mitadAristaX(n1, n2);
        int y = mitadAristaY(n1, n2);
        String texto = Integer.toString(distancia);
        graphics.setColor(Color.YELLOW);
        graphics.fillOval(x - 10, y - 15, texto.length() * 8 + 10, 20);
        graphics.setColor(color);
        graphics.drawOval(x - 10, y - 15, texto.length() * 8 + 10, 20);
        graphics.drawString(Integer.toString(distancia), x, y);
    }

    /**
     *
     * @param n1 Nodo origen
     * @param n2 Nodo destino
     * @return Centro de la coordenada vertical
     */
    private int mitadAristaY(Nodo n1, Nodo n2) {
        int y;
        if (n1.getY() < n2.getY()) {
            y = n1.getY() + (n2.getY() - n1.getY()) / 2;
        } else if (n1.getY() > n2.getY()) {
            y = n2.getY() + (n1.getY() - n2.getY()) / 2;
        } else {
            y = n1.getY();
        }
        return y;
    }

    /**
     *
     * @param n1 Nodo origen
     * @param n2 Nodo destino
     * @return Centro de las coordenadas horizontales de la linea
     */
    private int mitadAristaX(Nodo n1, Nodo n2) {
        int x;
        if (n1.getX() < n2.getX()) {
            x = n1.getX() + (n2.getX() - n1.getX()) / 2;
        } else if (n1.getX() > n2.getX()) {
            x = n2.getX() + (n1.getX() - n2.getX()) / 2;
        } else {
            x = n1.getX() + 10;
        }
        return x;
    }

    /**
     * Metodo que dibuja todo el grafo.
     *
     * @param g
     */
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        for (Nodo nodo : this.g.Nodos) {
            paintNodo(nodo, false);
            for (Arista aristas : nodo.getArista()) {
                paintArista(aristas.origen, aristas.destino, Color.BLACK, aristas.distancia);
            }
        }

    }

    /**
     * Metodo que dibuja un grafo cualquiera
     *
     * @param g Graphics en donde dibujar
     * @param grafo Grafo a dibujar
     */
    public void paintGraph(Graphics g, Grafo grafo) {
        for (Nodo nodo : grafo.Nodos) {
            paintNodo(nodo, false);
            for (Arista aristas : nodo.getArista()) {
                paintArista(aristas.origen, aristas.destino, Color.BLACK, aristas.distancia);
            }
        }
    }

    public void GuardarNodos(Grafo g, File file) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(file))) {
            for (Nodo nodo : g.Nodos) {
                String nombre = nodo.getNombre();
                int x = nodo.getX();
                int y = nodo.getY();
                bw.write(nombre + "," + x + "," + y);
                bw.newLine();
            }
        } catch (Exception e) {

        }
    }

    public void GuardarAdyacencias(Grafo g, File file) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(file))) {
            for (Nodo nodo : g.Nodos) {
                for (Arista arista : nodo.getArista()) {
                    String origen = arista.getOrigen().getNombre();
                    String destino = arista.getDestino().getNombre();
                    double distancia = arista.getDistancia();
                    bw.write(origen + "," + destino + "," + distancia);
                    bw.newLine();
                }

            }
        } catch (Exception e) {

        }
    }

    public void AbrirNodos(Grafo g, File file) {
        try (Scanner lector = new Scanner(file)) {
            while (lector.hasNextLine()) {
                String linea = lector.nextLine();
                String[] info = linea.split(",");
                Nodo n = new Nodo(info[0]);
                n.setX(Integer.parseInt(info[1]));
                n.setY(Integer.parseInt(info[2]));
                g.addNodo(n);

            }
        } catch (Exception e) {
        }
    }

    public void AbrirAdyacencias(Grafo g, File file) {     
        try (Scanner lector = new Scanner(file)) {
            while (lector.hasNextLine()) {
                String linea = lector.nextLine();
                String[] info = linea.split(",");
                Nodo origen = g.BuscarNodo(info[0]);
                Nodo destino = g.BuscarNodo(info[1]);
                Arista a = new Arista(origen, destino, (int) Double.parseDouble(info[2]));
                origen.addArista(a);

            }
        } catch (Exception e) {
        }
    }

    public void AbrirArchivo(Grafo g, File nodos, File adyacencias) {
        AbrirNodos(g, nodos);
        AbrirAdyacencias(g, adyacencias);
        repaint();
    }

    public void GuardarArchivo(Grafo g, File nodos, File adyacencias) {
        GuardarNodos(g,nodos);
        GuardarAdyacencias(g, adyacencias);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Adyacencia;
    private javax.swing.JButton DibujarOriginal;
    private javax.swing.JButton EliminarNodo;
    private javax.swing.JButton KRUSKAL;
    private javax.swing.JLabel Mensajes;
    private javax.swing.JButton PRIM;
    private javax.swing.JButton Pruebas;
    private javax.swing.JButton abrirKruskal;
    private javax.swing.JButton abrirPrim;
    private javax.swing.JButton abrirprincipal;
    private javax.swing.JButton guardarKruskal;
    private javax.swing.JButton guardarPrim;
    private javax.swing.JButton guardarprincipal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private lab02.Mapa mapa1;
    // End of variables declaration//GEN-END:variables

}
