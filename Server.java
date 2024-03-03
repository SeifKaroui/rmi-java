import java.rmi.Naming;

public class Serveur {
  public static void main(String[] args) {
    try {
      Calculatrice calc = new CalculatriceImpl();
      Naming.rebind("//localhost/CalculatriceService", calc);
      System.out.println("Serveur prêt");
    } catch (Exception e) {
      System.err.println("Erreur serveur: " + e.getMessage());
    }
  }
}
