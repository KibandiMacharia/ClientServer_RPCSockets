
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author KIBANDI
 */
public class SocketServer {
    public static void main(String[] args) throws IOException{
        int adm_no;
        ServerSocket ss=new ServerSocket(1234);
        Socket s=ss.accept();
        Scanner sc= new Scanner(System.in);//create scanner object
        adm_no=sc.nextInt();
        System.out.println("Connected");
    }
}
