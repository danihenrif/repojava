public class VisaoNatalFitness {
    public static void main (String[] args){
        BancoDeDados bancoDeDados = new BancoDeDados();
        
        Funcionario professor1 = new Professor();
        Funcionario professor2 = new Professor();
        Funcionario professor3 = new Professor();

        professor1.setNome("Bernardo");
        professor1.setMatricula(01);
        professor2.setNome("Augusto");
        professor2.setMatricula(02);
        professor3.setNome("Reinaldo");
        professor3.setMatricula(03);


        Funcionario gerente1 = new Gerente();

        gerente1.setNome("Roberto");
        gerente1.setMatricula(04);
        
        Aluno aluno1 = new Aluno();
        Aluno aluno2 = new Aluno();

        Treino treino1Aluno1 = new Treino();
        Treino treino2Aluno1 = new Treino();

        Treino treino1Aluno2 = new Treino();
        Treino treino2Aluno2 = new Treino();

        treino1Aluno1.setNomeAtividade("Hipertrofia");
        treino1Aluno1.setHoraAtividade("10:00");
        treino2Aluno1.setNomeAtividade("Corrida");
        treino2Aluno1.setHoraAtividade("15:00");

        treino1Aluno2.setNomeAtividade("Cardio");
        treino1Aluno2.setHoraAtividade("09:00");
        treino2Aluno2.setNomeAtividade("Basquete");
        treino2Aluno2.setHoraAtividade("14:00");

        aluno1.adicionaTreino(treino1Aluno1);
        aluno1.adicionaTreino(treino2Aluno1);

        aluno2.adicionaTreino(treino1Aluno2);
        aluno2.adicionaTreino(treino2Aluno2);

        bancoDeDados.adicionaFuncionario(professor1);
        bancoDeDados.adicionaFuncionario(professor2);
        bancoDeDados.adicionaFuncionario(professor3);

        bancoDeDados.adicionaFuncionario(gerente1);

        bancoDeDados.listarFuncionarios();
        //bancoDeDados.listarListaDeAlunos();
    }
}
