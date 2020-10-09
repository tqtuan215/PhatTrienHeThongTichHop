import java.util.Scanner;
public class zoo {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.print("MENU\n");
	
	
	int so;
	do{
	System.out.println("\n\nDanh sách các con thú:\n1. Sư tử\n2. Rắn\n3. Khỉ\nVui lòng chọn thú cần xem(Chọn 0 để Thoát): ");
	so = scanner.nextInt();
	switch (so) {
	 case 0:
		 break;
	 case 1:
		 System.out.println("Sư tử Leo nặng 300 cân và ăn 5 cân thịt mỗi ngày."); 
		 break;
	 case 2:
		 System.out.println("Con rắn Boa nặng 50 cân và dài 5 mét." );
		 break;
	 case 3:
		 System.out.println("Con khỉ George nặng 150 cân và thích ăn chuối");
		 break;
	 default:
			System.out.println("vui lòng nhập từ 1 đến 3"); 
		 break;
	}}while(so!=0);



}}
