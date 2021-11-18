public class VisaoEscola {
    public static void main(String[] args){
        BancoDeDados bancoDeDados = new BancoDeDados();
        
        Professor professorIntegral1 = new ProfessorIntegral();
        Professor professorIntegral2 = new ProfessorIntegral();
        Professor professorIntegral3 = new ProfessorIntegral();
        Professor professorHorista1 = new ProfessorHorista();
        Professor professorHorista2 = new ProfessorHorista();
        Professor professorHorista3 = new ProfessorHorista();

        professorIntegral1.setNome("Danilo");
        professorIntegral1.setMatricula("ABC");
        professorIntegral1.setDataNascimento(1970, 10, 1);
        professorIntegral1.setNivelEscolaridade("doutorado");
        professorIntegral1.setDisciplina("portugues");
        professorIntegral1.setNumeroDependentes(4);
        ((ProfessorIntegral)professorIntegral1).setDataInicio(1995, 10, 1);
        professorIntegral1.setSalario(5000);

        professorIntegral2.setNome("Cleber");
        professorIntegral2.setMatricula("ABCD");
        professorIntegral2.setDataNascimento(1980, 10, 1);
        professorIntegral2.setNivelEscolaridade("mestrado");
        professorIntegral2.setDisciplina("matematica");
        professorIntegral2.setNumeroDependentes(3);
        ((ProfessorIntegral)professorIntegral2).setDataInicio(2005, 10, 1);
        ((ProfessorIntegral)professorIntegral2).setSalario(4000);

        professorIntegral3.setNome("Saulo");
        professorIntegral3.setMatricula("ABCDE");
        professorIntegral3.setDataNascimento(1990, 10, 1);
        professorIntegral3.setNivelEscolaridade("mestrado");
        professorIntegral3.setDisciplina("portugues");
        professorIntegral3.setNumeroDependentes(2);
        ((ProfessorIntegral)professorIntegral3).setDataInicio(2015, 10, 1);
        professorIntegral3.setSalario(3000);

        professorHorista1.setNome("Andre");
        professorHorista1.setMatricula("ABCDEF");
        professorHorista1.setDataNascimento(1990, 12, 1);
        professorHorista1.setNivelEscolaridade("graduação");
        professorHorista1.setDisciplina("matematica");
        professorHorista1.setNumeroDependentes(2);
        ((ProfessorHorista)professorHorista1).setHorasTrabalhadas(60);
        professorHorista1.setSalario(0);

        professorHorista2.setNome("Rosana");
        professorHorista2.setMatricula("ABCDEFG");
        professorHorista2.setDataNascimento(1991, 12, 1);
        professorHorista2.setNivelEscolaridade("mestrado");
        professorHorista2.setDisciplina("portugues");
        professorHorista2.setNumeroDependentes(1);
        ((ProfessorHorista)professorHorista2).setHorasTrabalhadas(50);
        professorHorista2.setSalario(0);

        professorHorista3.setNome("Maycon");
        professorHorista3.setMatricula("ABCDEFGH");
        professorHorista3.setDataNascimento(1992, 12, 1);
        professorHorista3.setNivelEscolaridade("doutorado");
        professorHorista3.setDisciplina("matematica");
        professorHorista3.setNumeroDependentes(1);
        ((ProfessorHorista)professorHorista3).setHorasTrabalhadas(40);
        professorHorista3.setSalario(0);

        bancoDeDados.add(professorIntegral1);
        bancoDeDados.add(professorIntegral2);
        bancoDeDados.add(professorIntegral3);
        bancoDeDados.add(professorHorista1);
        bancoDeDados.add(professorHorista2);
        bancoDeDados.add(professorHorista3);


        bancoDeDados.informaQuantidadeProfessores();

        bancoDeDados.informaProfessorMaiorSalario();

        bancoDeDados.informaProfessorMaisJovem();

        bancoDeDados.informaProfessorMaisAntigo();

        bancoDeDados.listaTotalDeSalariosAPagar();

        bancoDeDados.listaMediaHorasTrabalhadasHoristas();

        bancoDeDados.listaProfessoresLecionamPortuguesMatematica();

        bancoDeDados.listaProfessoresMestresEDoutores();

    }
}
