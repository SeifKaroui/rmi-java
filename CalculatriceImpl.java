import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class CalculatriceImpl extends UnicastRemoteObject implements Calculatrice {
  protected CalculatriceImpl() throws RemoteException {
    super();

  }

  @Override
  public double add(double a, double b) throws RemoteException {
    return a + b;

  }

  @Override
  public double sub(double a, double b) throws RemoteException {
    return a - b;

  }

  @Override
  public double mul(double a, double b) throws RemoteException {
    return a * b;

  }

  @Override
  public double div(double a, double b) throws RemoteException {
    return a / b;

  }
}
