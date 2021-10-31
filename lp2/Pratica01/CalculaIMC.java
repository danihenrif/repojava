import java.io.*;

public class CalculaIMC {
  
  public static void main(String[] args){
    Pessoa pessoa = new Pessoa();
    pessoa.setPeso(170);
    pessoa.setAltura(1.91);
    pessoa.informarIMC();
  }
}
