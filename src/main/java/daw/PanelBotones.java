/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package daw;

import java.awt.GridLayout;
import javax.swing.JButton;

/**
 *
 * @author clara
 */
public class PanelBotones extends javax.swing.JPanel {

    /**
     * Creates new form PanelBotones
     */
    // Números del 0 al 9 y seis botones más para
    // suma, resta, multiplicacion, división, resultado y limpiar
    JButton[] grupoBotones = new JButton[16];

    public PanelBotones() {
        initComponents();
        creacionBotones();
    }

    private void creacionBotones() {

        // Creación de los botones
        for (int i = 0; i < 10; i++) {
            grupoBotones[i] = new JButton(Integer.toString(i));
        }
        grupoBotones[10] = new JButton("+");
        grupoBotones[11] = new JButton("-");
        grupoBotones[12] = new JButton("*");
        grupoBotones[13] = new JButton("/");
        grupoBotones[14] = new JButton("=");
        grupoBotones[15] = new JButton("C");

        // Establecemos el layout
        this.setLayout(new GridLayout(4, 4));

        for (JButton boton : grupoBotones) {
            this.add(boton);
        }
    }

    public JButton[] getgrupoBotones() {
        return grupoBotones;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
