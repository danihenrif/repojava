import java.util.HashSet;

public class Professor extends Funcionario {
    private HashSet<Aluno> alunos = new HashSet<Aluno>();

    public void adicionaAluno(Aluno aluno){
        alunos.add(aluno);
    }
    
    public HashSet<Aluno> getAlunos() {
        return alunos;
    }


    public void listaAtividades(){
        for(Aluno aluno: alunos){
            System.out.println("Professor [" + getNome() + "]");
            System.out.println("Aluno >>> " + aluno.getNome());
            for(Treino treino : aluno.getTreino()){
                System.out.println(treino.getHoraAtividade() + "->" + treino.getNomeAtividade());
            }
        }
    }
    
    public void listaAlunos(){
        for(Aluno aluno : alunos){
            System.out.println("Aluno >>> " + "CPF.: " + aluno.getCpf() + "   Nome.: " + aluno.getNome());
        }
    }
}
