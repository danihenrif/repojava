import java.util.HashSet;

public class BancoDeDados {
    private HashSet<Funcionario> funcionarios = new HashSet<Funcionario>();

    public void adicionaFuncionario(Funcionario funcionario){
        funcionarios.add(funcionario);
    }

    public void removeFuncionario(Funcionario funcionario){
        funcionarios.remove(funcionario);
    }

    public void listarFuncionarios(){
        System.out.println("############### Funcionarios ###############");
        for(Funcionario funcionario : funcionarios){
            if(funcionario instanceof Professor){
                System.out.println("Matricula : " + funcionario.getMatricula() + " Nome.: " + funcionario.getNome() + "  Tipo.: Professor");
            }
            else{
                System.out.println("Matricula : " + funcionario.getMatricula() + " Nome.: " + funcionario.getNome() + "  Tipo.: Gerente");
            }
        }
        System.out.println("############################################");
    }

    public void listarAtividades(){
        System.out.println("############### Professores ###############");
            for(Funcionario funcionario : funcionarios){
                ((Professor)funcionario).listaAtividades();
            }
        System.out.println("############################################");
    }

    public void listarListaDeAlunos(){
        System.out.println("############### Alunos ###############");
        for(Funcionario funcionario : funcionarios){        
            if(funcionario instanceof Professor){
                ((Professor)funcionario).listaAlunos();
            }
        }
        System.out.println("############################################");
    }
}
