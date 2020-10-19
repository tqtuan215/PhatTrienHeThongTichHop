package lab3;

import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
public class server {
public static void main(String[] args) {

try {
	ServerSocket ss = new ServerSocket(9541);
	System.out.println("Server da duoc tao");
	Socket client = ss.accept();
	System.out.println("Client da ket noi den server");
	Scanner inFromClient = new Scanner(client.getInputStream());
	PrintStream outToClient = new PrintStream(client.getOutputStream());
	outToClient.println("Xin chao, ban muon tim sach gi?");
	String tens = inFromClient.nextLine();
	System.out.println("client: " + tens);
	String fileName = "D:\\sach.txt";//bạn hãy thay đổi đường dẫn tới file của bạn
	String S = new String(Files.readAllBytes(Paths.get(fileName)),StandardCharsets.UTF_8);
		if(S.contains(tens))
			outToClient.println("Co sach " + tens);
		else
			outToClient.println("Rat tiec khong co sach " + tens);
		
     } 
	
	
	 catch (IOException e) {
		e.printStackTrace();
}
}
}