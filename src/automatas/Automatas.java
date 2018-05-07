package automatas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author Jhonatan
 */
public class Automatas extends JFrame {

    //La Gramatica
    private JLabel lblGramatica;
    private JLabel lblRegla1;
    private JLabel lblRegla2;
    private JLabel lblRegla3;
    private JLabel lblRegla4;
    private JLabel lblRegla5;
    private JLabel lblRegla6;
    private JLabel lblRegla7;

    //Ingresar Cadena
    private JTextField txtCadena;
    //Mostrar Cadena
    private JLabel lblCadena;
    //Automata
    private JLabel imgInicio;
    private JLabel imgFlecha1;
    private JLabel imgFlecha2;
    private JLabel imgFlecha3;
    private JLabel imgFlecha4;
    private JLabel imgFlecha5;
    private JLabel imgFlecha6;
    private JLabel imgFlecha7;
    private JLabel imgEstadoA;
    private JLabel imgEstadoB;
    private JLabel imgFinal;
    //Validacion
    private JLabel lblValidacion;
    //Contenedor
    private JPanel Contenedor;
    //Boton
    private JButton btnLeer;
    private JButton btnValidar;

    public Automatas() {
        this.setResizable(false);
        this.setTitle("Gramatica Regular");
        //this.setVisible(true);
        this.setSize(1000, 500);
        this.setLayout(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        Componentes();
    }

    private void Componentes() {
        //Automata
        Icon icoInicio = new ImageIcon(getClass().getResource("/Img/S.png"));
        Icon icoLinea1 = new ImageIcon(getClass().getResource("/Img/Linea1.png"));
        Icon icoLinea2 = new ImageIcon(getClass().getResource("/Img/Linea2.png"));
        Icon icoLinea3 = new ImageIcon(getClass().getResource("/Img/Linea3.png"));
        Icon icoLinea4 = new ImageIcon(getClass().getResource("/Img/Linea4.png"));
        Icon icoLinea5 = new ImageIcon(getClass().getResource("/Img/Linea5.png"));
        Icon icoLinea6 = new ImageIcon(getClass().getResource("/Img/Linea6.png"));
        Icon icoLinea7 = new ImageIcon(getClass().getResource("/Img/Linea7.png"));
        Icon icoEstadoA = new ImageIcon(getClass().getResource("/Img/A.png"));
        Icon icoEstadoB = new ImageIcon(getClass().getResource("/Img/B.png"));
        Icon icoFinal = new ImageIcon(getClass().getResource("/Img/Z.png"));

        //Elementos
        lblGramatica = new JLabel("GRAMATICA");
        lblRegla1 = new JLabel("1 S -> ( A");
        lblRegla2 = new JLabel("2 A -> ( B");
        lblRegla3 = new JLabel("3 A -> ) A");
        lblRegla4 = new JLabel("4 A -> )");
        lblRegla5 = new JLabel("5 B -> ) B");
        lblRegla6 = new JLabel("6 B -> ( A");
        lblRegla7 = new JLabel("7 B -> )");

        lblCadena = new JLabel();

        imgInicio = new JLabel(icoInicio);
        imgFlecha1 = new JLabel(icoLinea1);
        imgFlecha2 = new JLabel(icoLinea2);
        imgFlecha3 = new JLabel(icoLinea3);
        imgFlecha4 = new JLabel(icoLinea4);
        imgFlecha5 = new JLabel(icoLinea5);
        imgFlecha6 = new JLabel(icoLinea6);
        imgFlecha7 = new JLabel(icoLinea7);
        imgEstadoA = new JLabel(icoEstadoA);
        imgEstadoB = new JLabel(icoEstadoB);
        imgFinal = new JLabel(icoFinal);

        txtCadena = new JTextField("Ingrese la Cadena");
        lblValidacion = new JLabel();

        btnLeer = new JButton("Leer Cadena");
        btnLeer.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                btnLeerActionPerformed(ae);
            }
        });

        btnValidar = new JButton("Validar");
        btnValidar.setEnabled(false);
        btnValidar.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                btnValidarActionPerformed(ae);
            }
        });
        //Contenedor
        Contenedor = new JPanel();
        //Agregando Elementos al Contenedor
        Contenedor.add(lblGramatica);
        Contenedor.add(lblRegla1);
        Contenedor.add(lblRegla2);
        Contenedor.add(lblRegla3);
        Contenedor.add(lblRegla4);
        Contenedor.add(lblRegla5);
        Contenedor.add(lblRegla6);
        Contenedor.add(lblRegla7);

        Contenedor.add(lblCadena);
        Contenedor.add(lblValidacion);
        //Automata
        Contenedor.add(imgInicio);
        Contenedor.add(imgFlecha1);
        Contenedor.add(imgFlecha2);
        Contenedor.add(imgFlecha3);
        Contenedor.add(imgFlecha4);
        Contenedor.add(imgFlecha5);
        Contenedor.add(imgFlecha6);
        Contenedor.add(imgFlecha7);
        Contenedor.add(imgEstadoA);
        Contenedor.add(imgEstadoB);
        Contenedor.add(imgFinal);

        Contenedor.add(txtCadena);

        Contenedor.add(btnLeer);
        Contenedor.add(btnValidar);

        setContentPane(Contenedor);
        Contenedor.setLayout(null);
        //Ordenado de Elementos
        lblGramatica.reshape(20, 10, 100, 20);
        lblRegla1.reshape(20, 40, 100, 20);
        lblRegla2.reshape(20, 60, 100, 20);
        lblRegla3.reshape(20, 80, 100, 20);
        lblRegla4.reshape(20, 100, 100, 20);
        lblRegla5.reshape(20, 120, 100, 20);
        lblRegla6.reshape(20, 140, 100, 20);
        lblRegla7.reshape(140, 40, 100, 20);
        lblCadena.reshape(20, 420, 800, 20);
        txtCadena.reshape(20, 170, 150, 20);
        lblValidacion.reshape(20, 400, 800, 20);
        //OrdenandoAutomata
        imgInicio.reshape(200, 200, 100, 100);
        imgFlecha1.reshape(300, 200, 100, 100);
        imgFlecha1.setVisible(false);
        imgEstadoA.reshape(400, 200, 100, 100);
        imgEstadoA.setVisible(false);
        imgFlecha2.reshape(420, 130, 100, 100);
        imgFlecha2.setVisible(false);
        imgFlecha3.reshape(500, 150, 100, 100);
        imgFlecha3.setVisible(false);
        imgFlecha4.reshape(500, 250, 100, 100);
        imgFlecha4.setVisible(false);
        imgEstadoB.reshape(600, 200, 100, 100);
        imgEstadoB.setVisible(false);
        imgFlecha5.reshape(620, 270, 100, 100);
        imgFlecha5.setVisible(false);
        imgFlecha6.reshape(700, 200, 100, 100);
        imgFlecha6.setVisible(false);
        imgFlecha7.reshape(700, 200, 100, 100);
        imgFlecha7.setVisible(false);
        imgFinal.reshape(800, 200, 100, 100);

        btnLeer.reshape(20, 200, 150, 20);
        btnValidar.reshape(20, 230, 150, 20);

    }

    //Variables
    private String Cadena;
    private char[] Caracteres;
    private int Abiertos = 0, Cerrados = 0;

    private void btnLeerActionPerformed(ActionEvent ae) {
        Cadena = txtCadena.getText();
        Caracteres = Cadena.toCharArray();
        btnLeer.setEnabled(false);
        btnValidar.setEnabled(true);
    }

    private void btnValidarActionPerformed(ActionEvent ae) {
                boolean A = false;
        String aux = "";
        
        if ((Caracteres[Caracteres.length - 1] == ')') && (Caracteres[0] == '(')) {
            
            for (int i = 0; i < Caracteres.length; i++) {
                aux = aux + Caracteres[i];
                //Inicio
                if ((Caracteres[i] == '(') && (i == 0) && (A == false)) {
                    lblValidacion.setText(lblValidacion.getText() + "S=>"+aux+"A");
                    lblCadena.setText(lblCadena.getText() + "Regla1, ");
                    A = true;
                    Abiertos++;
                    imgFlecha1.setVisible(true);
                    imgEstadoA.setVisible(true);
                    continue;
                }
                //Reglas A
                if ((Caracteres[i] == '(') && (i != 0) && (A == true)) {
                    lblValidacion.setText(lblValidacion.getText() + "=>"+aux+"B");
                    lblCadena.setText(lblCadena.getText() + "Regla2, ");
                    A = false;
                    Abiertos++;
                    imgFlecha3.setVisible(true);
                    imgEstadoB.setVisible(true);
                    
                    continue;
                }
                if ((Caracteres[i] == ')') && (i != Caracteres.length - 1) && (A == true)) {
                    lblValidacion.setText(lblValidacion.getText() + "=>"+aux+"A");
                    lblCadena.setText(lblCadena.getText() + "Regla3, ");
                    A = true;
                    Cerrados++;
                    imgFlecha2.setVisible(true);
                    continue;
                }
                if ((Caracteres[i] == ')') && (i == Caracteres.length - 1) && (A == true)) {
                    lblValidacion.setText(lblValidacion.getText() + "=>"+aux);
                    lblCadena.setText(lblCadena.getText() + "Regla 4.");
                    A = false;
                    Cerrados++;
                    imgFlecha7.setVisible(true);
                    //imgEstadoB.setVisible(true);
                    continue;
                }
                //Reglas B 
                if ((Caracteres[i] == ')') && (i != Caracteres.length - 1) && (A == false)) {
                    lblValidacion.setText(lblValidacion.getText() + "=>"+aux+"B");
                    lblCadena.setText(lblCadena.getText() + "Regla5, ");
                    A = false;
                    Cerrados++;
                    imgFlecha5.setVisible(true);
                    continue;
                }
                if ((Caracteres[i] == '(') && (i != Caracteres.length - 1) && (A == false)) {
                    lblValidacion.setText(lblValidacion.getText() + "=>"+aux+"A");
                    lblCadena.setText(lblCadena.getText() + "Regla6, ");
                    A = true;
                    Abiertos++;
                    imgFlecha4.setVisible(true);
                    continue;
                }
                if ((Caracteres[i] == ')') && (i == Caracteres.length - 1) && (A == false)) {
                    lblValidacion.setText(lblValidacion.getText() + "=>"+aux);
                    lblCadena.setText(lblCadena.getText() + "Regla7.");
                    A = false;
                    Cerrados++;
                    imgFlecha6.setVisible(true);
                }
            }

            if (Abiertos == Cerrados) {

                JOptionPane.showMessageDialog(null, "La cadena Pertenece");
            } else {
                JOptionPane.showMessageDialog(null, "La cadena no Pertenece");
            }
        } else {
            JOptionPane.showMessageDialog(null, "La cadena no Pertenece");
        }

    }

    public static void main(String[] args) {
        // TODO code application logic here
        Automatas Inicio = new Automatas();
        Inicio.setVisible(true);
    }

}
