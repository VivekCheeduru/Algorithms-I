import java.util.Scanner;

public class HelloGoodbye {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String x=scan.next();
        String y=scan.next();
        System.out.println("Hello "+x+" and "+y+".");
        System.out.println("Goodbye "+y+" and "+x+".");
    }
}
