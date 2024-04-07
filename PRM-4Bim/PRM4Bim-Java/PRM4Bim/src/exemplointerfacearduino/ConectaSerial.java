/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplointerfacearduino;

import gnu.io.CommPortIdentifier;
import gnu.io.NoSuchPortException;
import gnu.io.SerialPort;
import java.io.IOException;
import java.io.OutputStream;
import javax.swing.JOptionPane;

/**
 *
 * @author Vera Lúcia da Silva
 */
public class ConectaSerial {
    
  private SerialPort port;
  private OutputStream serialOut = null;
  private int taxa;
  private String portaCOM;
 
  /**
   * Construtor da classe ControlePorta
   * @param portaCOM - Porta COM que será utilizada para enviar os dados para o arduino
   * @param taxa - Taxa de transferência da porta serial geralmente é 9600
   */
  public ConectaSerial()
  {
      taxa = 9600;
      portaCOM = "COM3";
  }
  
  public SerialPort getPorta()
  {
      return port;
  }
  
  public boolean conecta()
    {
      boolean statusPorta = false;
      try {
         //Define uma variável portId do tipo CommPortIdentifier para realizar a comunicação serial
          CommPortIdentifier portId = null;
          try {
              //Tenta verificar se a porta COM informada existe
               portId = CommPortIdentifier.getPortIdentifier(this.portaCOM);
          }catch (NoSuchPortException npe) {
              //Caso a porta COM não exista será exibido um erro 
              JOptionPane.showMessageDialog(null, "Porta COM não encontrada.",
                  "Porta COM: "+portaCOM, JOptionPane.PLAIN_MESSAGE);
          }
          //Abre a porta COM 
          port = (SerialPort) portId.open("Comunicação serial", this.taxa);
          serialOut = port.getOutputStream();
          port.setSerialPortParams(this.taxa, //taxa de transferência da porta serial 
                               SerialPort.DATABITS_8, //taxa de 10 bits 8 (envio)
                               SerialPort.STOPBITS_1, //taxa de 10 bits 1 (recebimento)
                               SerialPort.PARITY_NONE); //receber e enviar dados
          statusPorta = true;
       }catch (Exception e) {
          e.printStackTrace();
          JOptionPane.showMessageDialog(null, "Não foi possível fechar porta COM.",
                "Abrir porta COM: "+portaCOM+" Erro: "+e.getMessage(), JOptionPane.PLAIN_MESSAGE);
       }
       return statusPorta;
    }
  
    public void desconecta()
    {
      try {
        if(serialOut != null)
        {
           serialOut.close();
           port.close();
        }
      }catch (IOException e) {
         JOptionPane.showMessageDialog(null, "Não foi possível fechar porta COM.",
                "Fechar porta COM: "+portaCOM, JOptionPane.PLAIN_MESSAGE);
      }
    }
    public void enviaDados(int opcao){
      try {
        if(serialOut !=null)
           serialOut.write(opcao);//escreve o valor na porta serial para ser enviado
      } catch (IOException ex) {
         JOptionPane.showMessageDialog(null, "Não foi possível enviar o dado. ",
                "Enviar dados", JOptionPane.PLAIN_MESSAGE);
    }
  } 
}
