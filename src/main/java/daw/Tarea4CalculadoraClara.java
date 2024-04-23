/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package daw;

import javax.swing.JFrame;

/**
 *
 * @author clara
 */
public class Tarea4CalculadoraClara {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculadora");
        frame.setBounds(250, 250, 0, 0);
        frame.add(new PanelPrincipal());
        // Para que no se redimensione
        frame.setResizable(false);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();

    }
}
