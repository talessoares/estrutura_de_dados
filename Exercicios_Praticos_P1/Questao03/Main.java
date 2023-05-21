import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);

    System.out.println("Qual posição fibonacci você deseja saber? ");
    int n = input.nextInt();

    for (int i = 0; i < n; i++) {
        System.out.print("(" + (i+1)+ "):" + fibonacci(i) + "\t");
    }
    
    }

    public static int fibonacci(int n) {
        if (n < 2) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        } 
    }

}