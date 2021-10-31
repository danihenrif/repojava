import java.util.ArrayList;

public class Aluno {
    
    private ArrayList<Prova> provas = new ArrayList<>();

    public void setProvas(Prova prova1, Prova prova2){
        provas.add(prova1);
        provas.add(prova2);
    }
    
    public Prova getProvas(int indice){
        return provas.get(indice);
    }

    public double calcularMedia(){
        double media = 0;
        for(Prova prova : provas){
            media += prova.getNotaParte1() + prova.getNotaParte2();
        }
        return media/2;
    }

    public void imprimeMedia(int numeroAluno){
        System.out.println("A media do aluno " + numeroAluno + " e: " + this.calcularMedia());
    }
}
