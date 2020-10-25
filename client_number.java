package lab4;

import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class client_number {

	public static void main(String[] args) {
		try {
			Socket sc=new Socket("localhost",3000);
			System.out.println("Client !!");
			
			Scanner inFromSv=new Scanner(sc.getInputStream());
			PrintStream outToSv=new PrintStream(sc.getOutputStream());
			
			System.out.println("Server: "+inFromSv.nextLine());
			Scanner scan = new Scanner(System.in);
			while(true){
			String num=scan.nextLine();
			outToSv.println(num);
			System.out.println("Server: "+inFromSv.nextLine());
			}
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
