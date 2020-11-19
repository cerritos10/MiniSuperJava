/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author cerri
 */
public class Inicio extends javax.swing.JPanel implements Runnable{
    String hora,minutos,segundos;
    Thread hilo;
    /**
     * Creates new form Inicio
     */
    public Inicio() {
        initComponents();
        lblFecha.setText(fecha());
        lblFecha.setText(fecha());
        hilo=new Thread(this);
        hilo.start();
        setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblHora = new javax.swing.JLabel();
        lblFecha = new javax.swing.JLabel();

        setBackground(new java.awt.Color(28, 33, 53));

        lblHora.setBackground(new java.awt.Color(255, 255, 255));
        lblHora.setFont(new java.awt.Font("Consolas", 1, 54)); // NOI18N
        lblHora.setForeground(new java.awt.Color(255, 255, 255));
        lblHora.setText("00:00:00");

        lblFecha.setBackground(new java.awt.Color(255, 255, 255));
        lblFecha.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        lblFecha.setForeground(new java.awt.Color(255, 255, 255));
        lblFecha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFecha.setText("Fecha");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(392, 392, 392)
                        .addComponent(lblHora))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(202, 202, 202)
                        .addComponent(lblFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 587, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(279, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(188, 188, 188)
                .addComponent(lblHora)
                .addGap(26, 26, 26)
                .addComponent(lblFecha)
                .addContainerGap(345, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    public void hora(){
    Calendar calendario=new GregorianCalendar();
    Date horaactual= new Date();
    calendario.setTime(horaactual);
    hora=calendario.get(Calendar.HOUR_OF_DAY)>9?""+calendario.get(Calendar.HOUR_OF_DAY):"0"+calendario.get(Calendar.HOUR_OF_DAY);
    minutos=calendario.get(Calendar.MINUTE)>9?""+calendario.get(Calendar.MINUTE):"0"+calendario.get(Calendar.MINUTE);
    segundos=calendario.get(Calendar.SECOND)>9?""+calendario.get(Calendar.SECOND):"0"+calendario.get(Calendar.SECOND);
}
public void run(){
    Thread current = Thread.currentThread();
    while(current==hilo){
        hora();
        lblHora.setText(hora+":"+minutos+":"+segundos);
    }
}
 public static String fecha(){
        Date fecha= new Date();
        SimpleDateFormat formatofecha= new SimpleDateFormat("EEEE ',' dd 'de' MMMM 'de' yyyy");
        return formatofecha.format(fecha);
                
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblFecha;
    private javax.swing.JLabel lblHora;
    // End of variables declaration//GEN-END:variables
}
