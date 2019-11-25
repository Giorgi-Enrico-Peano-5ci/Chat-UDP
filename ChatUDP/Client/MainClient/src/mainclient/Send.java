/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainclient;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author enric
 */
public class Send implements Runnable{

     DatagramSocket socket;
    InetAddress ip;
    int porta;

    public Send(DatagramSocket socket, InetAddress ip, int porta) {
        this.socket = socket;
        this.ip = ip;
        this.porta = porta;
    }
    
    
   @Override
    public void run() {
        byte[] buffer;
        String messaggio;
        Scanner tastiera = new Scanner(System.in);
        DatagramPacket userDatagram;

        try {
            
            do {

                messaggio = tastiera.nextLine();

                buffer = messaggio.getBytes("UTF-8");

                userDatagram = new DatagramPacket(buffer, buffer.length, ip, porta);

                socket.send(userDatagram);
            } while (messaggio.compareTo("quit") != 0);
        } catch (IOException ex) {
            Logger.getLogger(MainClient.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    }
    

