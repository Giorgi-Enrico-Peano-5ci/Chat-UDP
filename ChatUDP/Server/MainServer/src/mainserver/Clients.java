/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainserver;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 *
 * @author enric
 */
public class Clients {
     int porta;
    InetAddress indirizzo;
    String ip = "localhost";

      public Clients(InetAddress addr, int port) throws UnknownHostException {
        this.porta = port;
        addr = InetAddress.getByName(ip);
    }
      
       Clients(int port) {
        this.porta = port;
    }
}

    

