import java.util.Scanner;
public class NumeroInformado {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
         System.out.println("Digite um número: ");
         double N1 = scanner.nextDouble();
         System.out.println("O número digitado foi: " + N1);
        scanner.close();
    }
}