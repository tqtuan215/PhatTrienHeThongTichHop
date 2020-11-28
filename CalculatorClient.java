import java.rmi.Naming;

public class CalculatorClient {
    public static void main(String[] args) {
        try {
            System.out.println("Finding object...");
            Calculator c = (Calculator)Naming.lookup("rmi://172.16.56.228:7777/MyCalculator");
            System.out.println(c.addNum(12, 13));
            System.out.println(c.tru(12, 13));
            System.out.println(c.nhan(12, 13));
            System.out.println(c.chia(12, 13));
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
