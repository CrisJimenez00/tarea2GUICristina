/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea2;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

/**
 *
 * @author cristina
 */
public class Saludo extends JPanel {

    //atributos
    private JButton botonNombre, botonApellidos;
    private JTextArea texto;

    //Constructor
    public Saludo() {
        initComponents();
    }

    private void initComponents() {

        //Creamos los botones
        botonNombre = new JButton("Nombre");
        botonApellidos = new JButton("Apellidos");

        //Le ponemos tamaño al area de texto y le ponemos color
        texto = new JTextArea(1, 25);
        texto.setBackground(Color.green);

        this.setLayout(new FlowLayout());

        //Añadimos los elementos al panel
        this.add(botonNombre);
        this.add(botonApellidos);
        this.add(texto);

        //Usamos clases anonimas para darle funcionalidad cuando le damos al botón 
        botonNombre.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                texto.setBackground(Color.white);
                texto.setText("Cristina");
            }
        });

        botonApellidos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                texto.setBackground(Color.cyan);
                texto.setText("Jiménez");
            }
        });
    }

    public static void main(String[] args) {
        //Construimos la ventana
        JFrame frame = new JFrame("Ventana Cristina Jiménez");

        //La ventana no se puede redimensionar
        frame.setResizable(false);

        //Posición de la ventana
        frame.setLocationRelativeTo(null);

        //Incluimos el panel en la ventana
        frame.add(new Saludo());

        //Ajusta el frame al contenido
        frame.pack();

        //Hacemos visible la ventana
        frame.setVisible(true);

        //Acción por defecto al pulsar el botón de cierre de la ventana
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
