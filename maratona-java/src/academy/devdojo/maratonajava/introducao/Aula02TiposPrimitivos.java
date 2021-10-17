package academy.devdojo.maratonajava.introducao;

import java.net.SocketOption;

public class    Aula02TiposPrimitivos {
    public static void main(String[] args) {
        /*
          Os tipos primitivos são:
          int, double, float, char, byte, shirt, long, boolean
        */
        int age = (int) 100000000000L; //Corta os bits para caber na força, valor imprevisível
        double salaryDouble = 2000;
        float salaryFloat = 2500.0f;//Para especificar que é um float ou d para especificar um double
        char caractere = 'c';
        byte ageByte = 10;
        short ageShort = 10;
        long bigNumber = 1000000000;
        boolean True = true;
        boolean False = false;
        String name = "Daniel";
        System.out.println("A idade é " + age + " anos");
        System.out.println(True);
        System.out.println(name);
    }
}