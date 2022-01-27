/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serverattendee;

/**
 *
 * @author Nasr
 */
public class ServerAttendee {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ServerroomTcp s = new ServerroomTcp();
        s.setTitle("Server of Company");
        s.setLocationRelativeTo(null);
        s.setVisible(true);
    }
    
}
