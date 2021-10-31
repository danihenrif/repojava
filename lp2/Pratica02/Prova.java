public class Prova {
    
    private double notaParte1;
    private double notaParte2;

    //Construtor
    public Prova(double parte1, double parte2){
        if(parte1 + parte2 > 10.0){
            System.out.println("A soma das notas nao pode ser maior que 10");
            System.exit(1);//Encerra o programa
        }
        if(parte1 < 0 || parte2 < 0){
            System.out.println("Nao podem haver nota(s) negativa(s)");
            System.exit(1); //Emcerra o programa
        }
      
        notaParte1 = parte1;
        notaParte2 = parte2;
    }
    
    public double getNotaParte1(){
      return notaParte1;
    }
    public double getNotaParte2(){
      return notaParte2;
    }

    public double calcularNotaTotal(){
      return notaParte1 + notaParte2;
    }
}
