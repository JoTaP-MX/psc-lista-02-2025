import java.util.Scanner;
public class PreçoGasolina{
    public static void main(String[] args){
     
     Scanner scanner = new Scanner(System.in);

      System.out.println("Digite o preço da gasolina, em litros, separando o Real dos Centavos por vírgula: ");
        double preço = scanner.nextDouble();
      System.out.println("Digite quantos litros de gasolina foi comprada pelo cliente: ");
        double gasolina = scanner.nextDouble();
        double pagar = (preço*gasolina);
    
      System.out.println("\n O valor que deve ser pago pelo cliente é : " + pagar+"R$");

     scanner.close();

    }
}