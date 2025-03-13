import java.util.Scanner;
public class ViagemEurotrip{
    public static void main(String[] args){
     
     Scanner scanner = new Scanner(System.in);

      System.out.println("X: ");
        double passagemAlemanha = scanner.nextDouble();
      System.out.println("X: ");
        double passagemItalia = scanner.nextDouble();
      System.out.println("X: ");
        double passagemPortugal = scanner.nextDouble();
      System.out.println("X: ");
        double passageiros = scanner.nextDouble();
        double pagar = (passageiros);
    
      System.out.println("\n O valor que deve ser pago pelo cliente é : " + pagar+"R$");

     scanner.close();

    }
}