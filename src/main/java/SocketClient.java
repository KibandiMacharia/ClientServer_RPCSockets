
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author KIBANDI
 */
public class SocketClient {
    public static void main(String[] args) throws IOException{
        Scanner sc= new Scanner(System.in);//create scanner object
        //initialize variables
        int adm_no;
        //initialize the socket
        try {
            Socket socket = new Socket("127.0.0.1",1234); //arguments are ip address of computer and port numbers
        } catch (IOException ex) {
            Logger.getLogger(SocketClient.class.getName()).log(Level.SEVERE, null, ex);
        }/*
        Scanner sc1=new Scanner(s.getInputStream());
        System.out.println("Enter your student number");//prompt client to enter admission number
        adm_no=sc.nextInt();//save the input as admi_no variable
        PrintStream p=new PrintStream(s.getOutputStream());//pass admission number to the socket
        p.println(adm_no);*/
        
        PrintWriter out = null;
        BufferedReader in = null;
        
        BufferedReader stdIn = new BufferedReader(new InputStreamReader(System.in));
        String fromServer;
        String fromUser;

        while ((fromServer = in.readLine()) != null) {
            System.out.println("Server: " + fromServer);
            if (fromServer.equals("Bye."))
                break;
		    
            fromUser = stdIn.readLine();
	    if (fromUser != null) {
                System.out.println("Client: " + fromUser);
                out.println(fromUser);
	    }
        }

        out.close();
        in.close();
        stdIn.close();
        //socket.close();
        
    }
}
