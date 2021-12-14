import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        ArrayList<Pessoa> pessoas = new ArrayList<>();
        
        Pessoa pessoa1 = new Homem();
        Pessoa pessoa2 = new Homem();
        Pessoa pessoa3 = new Homem();
        Pessoa pessoa4 = new Mulher();
        Pessoa pessoa5 = new Mulher();
        Pessoa pessoa6 = new Mulher();

        pessoa1.setNome("Danilo");
        pessoa1.setDataNascimento(1999, 5, 20);
        ((PessoaIMC)pessoa1).setPeso(50);
        ((PessoaIMC)pessoa1).setAltura(1.7);

        pessoa2.setNome("Caio");
        pessoa2.setDataNascimento(2000, 5, 29);
        ((PessoaIMC)pessoa2).setPeso(75);
        ((PessoaIMC)pessoa2).setAltura(1.8);

        pessoa3.setNome("Roberto");
        pessoa3.setDataNascimento(1980, 4, 20);
        ((PessoaIMC)pessoa3).setPeso(110);
        ((PessoaIMC)pessoa3).setAltura(1.6);

        pessoa4.setNome("Rosana");
        pessoa4.setDataNascimento(1988, 3, 21);
        ((PessoaIMC)pessoa4).setPeso(40);
        ((PessoaIMC)pessoa4).setAltura(1.6);

        pessoa5.setNome("Carla");
        pessoa5.setDataNascimento(1999, 5, 20);
        ((PessoaIMC)pessoa5).setPeso(50);
        ((PessoaIMC)pessoa5).setAltura(1.55);

        pessoa6.setNome("Pietra");
        pessoa6.setDataNascimento(1999, 5, 20);
        ((PessoaIMC)pessoa6).setPeso(80);
        ((PessoaIMC)pessoa6).setAltura(1.7);

        pessoas.add(pessoa1);
        pessoas.add(pessoa2);
        pessoas.add(pessoa3);
        pessoas.add(pessoa4);
        pessoas.add(pessoa5);
        pessoas.add(pessoa6);

        for(Pessoa pessoa : pessoas){
            
            System.out.println(pessoa.toString());
            if(pessoa instanceof Homem){
                System.out.println(((Homem)pessoa).resultIMC());

            }
            else if(pessoa instanceof Mulher){
                System.out.println(((Mulher)pessoa).resultIMC());
            }
        }

    }
}
