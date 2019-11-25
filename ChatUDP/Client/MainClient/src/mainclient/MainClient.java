/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainclient;


import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author enric
 */
public class MainClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws UnknownHostException  {
        // TODO code application logic here
        
        new Runnable(){
         
                  @Override
            public void run() {
                try{
                    new GuiClient();
                }catch(SocketException | UnknownHostException e){
                      Logger.getLogger(GuiClient.class.getName()).log(Level.SEVERE, null, e);
                }
            }
        }.run();
    }
    
}
