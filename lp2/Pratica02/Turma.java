import java.util.ArrayList;

public class Turma {
    
    private ArrayList<Aluno> alunos = new ArrayList<>();

    public void setAlunos(Aluno aluno){
        alunos.add(aluno);
    }

    public double calcularMedia(){
        double media = 0;
        for(Aluno aluno : alunos){
          media += aluno.calcularMedia();
        }
        return media/3; 
    }

    public void imprimeMedia(){
        System.out.println("A media da turma e: " + calcularMedia());
    }
}
