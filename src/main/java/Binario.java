import java.util.Scanner;
public class Binario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa el no");
        int num = scanner.nextInt();
        int [] arreglo = new int [8];
        int n;
        int i;
        while(n==0){
            n = num;
            i = 0;
            n=n/2;
            arreglo[i]=n%2;
        }
    }
}
