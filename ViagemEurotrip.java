import java.util.Scanner;
public class ViagemEurotrip{
    public static void main(String[] args){
     
     Scanner scanner = new Scanner(System.in);

      System.out.println("Digite o preço da viagem para Alemanha: ");
        double passagemAlemanha = scanner.nextDouble();
      System.out.println("Digite o preço da viagem para Italia: ");
        double passagemItalia = scanner.nextDouble();
      System.out.println("Digite o preço da viagem para Portugal: ");
        double passagemPortugal = scanner.nextDouble();
      System.out.println("Escreva o número de pessoas que participarão para a viagem: ");
        int passageiros = scanner.nextInt();
        double valortotal = (passagemAlemanha+passagemItalia+passagemPortugal);
    
      System.out.printf("\nAs %d pessoas pagarão um total de R$%.2f", passageiros, valortotal);

     scanner.close();

    }
}