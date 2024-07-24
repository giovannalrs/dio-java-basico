import java.util.Scanner;

abstract class Cofre {
  protected String tipo;
  protected String metodoAbertura;

  public Cofre(String tipo, String metodoAbertura) {
    this.tipo = tipo;
    this.metodoAbertura = metodoAbertura;
  }

  public void imprimirInformacoes() {
    System.out.println("Tipo: " + this.tipo);
    System.out.println("Metodo de abertura: " + this.metodoAbertura);
  }
}

class CofreDigital extends Cofre {
  private int senha;

  public CofreDigital(int senha) {
    super("Cofre Digital", "Senha");
    this.senha = senha;
  }

  public boolean validarSenha(int confirmacaoSenha) {
    return confirmacaoSenha == this.senha;
  }
}

class CofreFisico extends Cofre {
  public CofreFisico() {
    super("Cofre Fisico", "Chave");
  }
}

public class Desafio {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Informe o tipo de cofre (digital/fisico):");
    String tipoCofre = scanner.nextLine();

    Cofre cofre = null;

    if (tipoCofre.equalsIgnoreCase("digital")) {
      System.out.println("Informe a senha do cofre digital:");
      int senha = scanner.nextInt();
      System.out.println("Confirme a senha:");
      int confirmacaoSenha = scanner.nextInt();

      CofreDigital cofreDigital = new CofreDigital(senha);
      if (cofreDigital.validarSenha(confirmacaoSenha)) {
        cofre = cofreDigital;
        System.out.println("Cofre Criado:");
        cofre.imprimirInformacoes();
      } else {
        System.out.println("Tipo: Cofre Digital");
        System.out.println("Metodo de abertura: Senha");
        System.out.println("Senha incorreta!");
      }
    } else if (tipoCofre.equalsIgnoreCase("fisico")) {
      cofre = new CofreFisico();
      System.out.println("Cofre Criado:");
      cofre.imprimirInformacoes();
    } else {
      System.out.println("Tipo de cofre inválido.");
    }

    scanner.close();
  }
}
