import java.util.Scanner;
public class Operações {
    public static void main(String[] args){
     
     Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero: ");
         int numero1 = scanner.nextInt();
        System.out.println("Digite outro numero: ");
         int numero2 = scanner.nextInt();

         int soma = numero1 + numero2;
         int sub = numero1 - numero2;
         int mult= numero1 * numero2;
 
        System.out.println("\n A soma entre os número é: " + soma + "\n A subtração entre os números é: " + sub + "\n A Multiplicação entre os números é: " + mult );
    
     scanner.close();

    }
 }