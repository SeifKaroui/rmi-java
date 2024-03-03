import java.rmi.Naming;
import java.util.Scanner;

public class Client {
  public static void main(String[] args) {
    try {
      Calculatrice calc = (Calculatrice) Naming.lookup("//localhost/CalculatriceService");


      System.out.println("Client connecté au serveur");

      Scanner scanner = new Scanner(System.in);
      String operation;
      do {
        System.out.println("Saisir l'opération (+, -, *, /) : ");


        operation = scanner.nextLine();

        if (operation.equals("quit")) break;

        System.out.println("Saisir le premier nombre : ");
        double a = scanner.nextDouble();
        System.out.println("Saisir le deuxième nombre : ");


        double b = scanner.nextDouble();

        double result;
        switch (operation) {
          case "+":
            result = calc.add(a, b);
            break;
          case "-":
            result = calc.sub(a, b);
            break;
          case "*":
            result = calc.mul(a, b);
            break;
          case "/":
            result = calc.div(a, b);
            break;
          default:
            result = 0;


            break;
        }
        System.out.println("Le résultat est : " + result);
        scanner.nextLine(); // flush buffer
      } while (true);

      scanner.close();
      System.out.println("Fin de connexion");
    } catch (Exception e) {
      System.err.println("Erreur client: " + e.getMessage());

    }
  }

}
