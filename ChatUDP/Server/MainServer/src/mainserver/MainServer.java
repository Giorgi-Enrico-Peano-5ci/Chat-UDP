/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainserver;

import java.io.IOException;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author enric
 */
public class MainServer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException, InterruptedException{
        // TODO code application logic here
          new Runnable() {
                @Override
                public void run() {
                    try {
                        new GuiServer(7676);
                    } catch (SocketException | UnknownHostException ex) {
                        Logger.getLogger(MainServer.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }.run();
            
        
    }
    }
    

