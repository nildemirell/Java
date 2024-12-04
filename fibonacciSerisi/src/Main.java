import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.print("Eleman sayısı girin :");
        int n = input.nextInt();
        int a = 0;
        int b = 1 ;
        System.out.println("Fibonacci Serisi : " +a+ " "+ b);
        for(int i =2 ; i <=n ; i++) {
            int c = a + b ;
            System.out.print(" " + c);
            a = b ;
            b =c ;


        }
    }

}
