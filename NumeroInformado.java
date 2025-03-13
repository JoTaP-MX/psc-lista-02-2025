import java.util.Scanner;
public class NumeroInformado {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
         System.out.println("Digite um número: ");
         int N1 = scanner.nextInt();
         System.out.println("O número digitado foi: " + N1);
        scanner.close();
    }
}