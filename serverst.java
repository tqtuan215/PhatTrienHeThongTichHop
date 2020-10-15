package lab3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class serverst {
	public static void main(String[] args) {

		try {
			ServerSocket server = new ServerSocket(9000);
			System.out.println("Server da duoc tao");
			Socket client = server.accept();
			System.out.println("Client da ket noi den server");
			Scanner inFromClient = new Scanner(client.getInputStream());
			PrintStream outToClient = new PrintStream(client.getOutputStream());
			outToClient.println("Xin chao, ban muon in dao nguoc tu gi?");
			String tens = inFromClient.nextLine();
			String reverse = new StringBuffer(tens).reverse().toString();
			System.out.println("client: " +reverse);
			outToClient.println(tens+ " dao nguoc thanh "+reverse);
		}	
			 catch (IOException e) {
		// TODO Auto-generated catch block
				e.printStackTrace();		
		}
}
}

	
