import java.util.Scanner;
public class MediaNotas{
        
     public static void main(String[] args){
     
     Scanner scanner = new Scanner(System.in);

      System.out.println("Digite primeira nota: ");
        double nota1 = scanner.nextDouble();
      System.out.println("Digite segunda nota: ");
        double nota2 = scanner.nextDouble();
      System.out.println("Digite primeira nota: ");
        double nota3 = scanner.nextDouble();
      System.out.println("Digite segunda nota: ");
         double nota4 = scanner.nextDouble();
         double media = (nota1 + nota2 + nota3 + nota4) /4;
    
      System.out.println("\n A média entre as 4 notas é: " + media);

     scanner.close();

    }
}