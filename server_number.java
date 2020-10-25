package lab4;

import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class server_number {
	public static void main(String args[]) {
		while(true) {
		try {
			ServerSocket ss=new ServerSocket(3000);
			System.out.println("Wait client connect...");
			Socket sc=ss.accept();
			System.out.println("connected!!!");			
			
			Scanner inFromCl=new Scanner(sc.getInputStream());
			PrintStream outToCl=new PrintStream(sc.getOutputStream());
			outToCl.println("say something...");
			
			String Cl=inFromCl.nextLine();		
			
			while(true){
				switch(Cl)
				{
				case "0":
					outToCl.println("không");
					break;
				case "1":
					outToCl.println("một");
					break;
				case "2":
					outToCl.println("hai");
					break;
				case "3":
					outToCl.println("ba");
					break;
				case "4":
					outToCl.println("bốn");
					break;
				case "5":
					outToCl.println("năm");
					break;
				case "6":
					outToCl.println("sáu");
					break;
				case "7":
					outToCl.println("bảy");
					break;
				case "8":
					outToCl.println("tám");
					break;
				case "9":
					outToCl.println("chín");
					break;
				case "end":
					break;	
				default:
					outToCl.println("không phải số nguyên");								
			}}
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
}
}
