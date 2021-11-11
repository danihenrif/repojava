import java.util.HashSet;

public class Professor extends Funcionario {
    private HashSet<Aluno> alunos = new HashSet<Aluno>();

    public HashSet<Aluno> getAlunos() {
        return alunos;
    }


    /*public void listaAtividades(){
        for(Aluno aluno: alunos){

        }
    }*/
    
    public void listaAlunos(){
        for(Aluno aluno: alunos){
            System.out.println("CPF.: " + aluno.getCpf() + "   Nome.: " + aluno.getNome());
        }
    }
}
