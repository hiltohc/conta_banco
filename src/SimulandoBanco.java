import java.util.Scanner;

public class SimulandoBanco {
    public static void main(String[] args) throws Exception {
         Scanner sc = new Scanner(System.in);
         int numero;
         String agencia;
         String nomeCliente;
         Float saldo = 237.48f;

         System.out.println("Por favor, digite o nomero da agência");
         agencia = sc.next();
         System.out.println("Por favor, digite o nomero da conta");
         numero = sc.nextInt();
         System.out.println("Por favor, digite o nome dp cliente");
         nomeCliente = sc.next();
         

         System.out.println("Olá "+nomeCliente+", obrigado por criar uma conta em nosso banco, sua agência é "+agencia+", conta " +numero+ " e seu saldo "+saldo+" já está disponível para saque");
         

    }

    }