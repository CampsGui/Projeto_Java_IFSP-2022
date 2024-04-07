/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplointerfacearduino;

import gnu.io.SerialPortEvent;
import gnu.io.SerialPortEventListener;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.TooManyListenersException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Vera Lúcia da Silva
 */
public class SupervisorioLampada extends javax.swing.JFrame implements SerialPortEventListener {

    /**
     * Creates new form SupervisorioLampada
     */
    //Variáveis Porta Serial
    private ConectaSerial conectaSerial;
    private BufferedReader input = null; // Entrada de dados
    private String leituraSerial;
    
    public SupervisorioLampada() {
        //Cria objeto da classe Conecta serial
        conectaSerial = new ConectaSerial();
         
        initComponents();
        
        //Seta o painel interno como invisivel
        jPanel1.setVisible(false);
        jMenuItem2.setEnabled(false);
        pack();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblLampada = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        tf_valorSensor = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        tf_sensor = new javax.swing.JTextField();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Supervisório Lâmpada");
        setBounds(new java.awt.Rectangle(100, 100, 400, 300));
        setMinimumSize(new java.awt.Dimension(400, 300));

        jPanel1.setPreferredSize(new java.awt.Dimension(400, 300));

        lblLampada.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLampada.setIcon(new javax.swing.ImageIcon(getClass().getResource("/exemplointerfacearduino/imagens/LampadaAcesa.jpg"))); // NOI18N
        lblLampada.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/exemplointerfacearduino/imagens/BotaoLigado.jpg"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/exemplointerfacearduino/imagens/BotaoDesLigado.jpg"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel1.setText("Status da Lâmpada:");

        tf_valorSensor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_valorSensorActionPerformed(evt);
            }
        });

        jLabel2.setText("Status do Sensor:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(106, 106, 106)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(tf_sensor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tf_valorSensor, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addComponent(lblLampada)))
                .addContainerGap(100, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addComponent(lblLampada)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tf_valorSensor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tf_sensor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jMenu4.setText("Porta Serial");

        jMenuItem1.setText("Conectar");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem1);

        jMenuItem2.setText("Desconectar");
        jMenuItem2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem2);

        jMenuBar2.add(jMenu4);

        jMenu5.setText("Sobre");

        jMenuItem3.setText("Sobre o Programa");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem3);

        jMenuBar2.add(jMenu5);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
         if(conectaSerial.conecta())
        {
            try {
                // Evento que escuta a Porta Serial.
                conectaSerial.getPorta().addEventListener(this);
                conectaSerial.getPorta().notifyOnDataAvailable(true);
            } catch (TooManyListenersException ex) {
                Logger.getLogger(SupervisorioLampada.class.getName()).log(Level.SEVERE, null, ex);
            }

           jPanel1.setVisible(true);
           jMenuItem2.setEnabled(true);
           jMenuItem1.setEnabled(false); 
            pack();
        }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        conectaSerial.desconecta();
        jMenuItem2.setEnabled(false);
        jMenuItem1.setEnabled(true); 
        jPanel1.setVisible(false);
        pack();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "Este programa apresenta um exemplo de conecção entre o Arduino e a Interface Java...");
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        conectaSerial.enviaDados('1');
        tf_valorSensor.setText("Sensor Ligado!");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        conectaSerial.enviaDados('0');
        tf_valorSensor.setText("Sensor Desligado!");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void tf_valorSensorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_valorSensorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_valorSensorActionPerformed

        //Atualiza Interface com os dados do Arduino
    public void atualizaInterface(String leitura){
        tf_valorSensor.setText(leitura);
        if(leitura == "Acesa")
        {
          lblLampada.setIcon(new javax.swing.ImageIcon(getClass().getResource("/exemplointerfacearduino/imagens/LampadaLigada.png")));  
        }
        else
            if(leitura == "Apagada")
            {
               lblLampada.setIcon(new javax.swing.ImageIcon(getClass().getResource("/exemplointerfacearduino/imagens/LampadaDeslig.jpg"))); 
            }
        pack();
    }
    
    /*
    Método da Interface SerialPortEventListener
    Este metodo verifia os eventos da porta serial 
    */
     @Override
     public void serialEvent(SerialPortEvent spe) {    
        try {
            switch(spe.getEventType()) { // Havendo evento na porta serial.
                case SerialPortEvent.DATA_AVAILABLE: // Caso tenha algum dado na porta de evento serial.
                    if(input == null) { // Se objeto de entrada for vazio:
                        input = new BufferedReader(
                                new InputStreamReader(conectaSerial.getPorta().getInputStream())); // Instancia o objeto.
                    } // fim do if
                    if(input.ready()){
                        leituraSerial = input.readLine(); // Ler os caracteres a cada quebra de linha enviado pelo Arduino.                        
                        atualizaInterface(leituraSerial);
                    } // fim do if(input.ready())
                 /*   else {
                        input = new BufferedReader(
                                new InputStreamReader(conectaSerial.getPorta().getInputStream())); // Instancia o objeto.
                    } // fim do else*/
                    break;
            } // fim do switch
        } catch(Exception e) {
            e.printStackTrace();
        }
         System.out.println("Dados Lidos: "+leituraSerial);
    } // fim de serialEvent
    
    
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
            java.util.logging.Logger.getLogger(SupervisorioLampada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SupervisorioLampada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SupervisorioLampada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SupervisorioLampada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SupervisorioLampada().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblLampada;
    private javax.swing.JTextField tf_sensor;
    private javax.swing.JTextField tf_valorSensor;
    // End of variables declaration//GEN-END:variables
}
