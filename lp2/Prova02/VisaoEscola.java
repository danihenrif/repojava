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
        professorIntegral1.setSalario(5000);
        professorIntegral1.setNivelEscolaridade("doutorado");
        professorIntegral1.setDisciplina("portugues");
        professorIntegral1.setNumeroDependentes(4);
        ((ProfessorIntegral)professorIntegral1).setDataInicio(1995, 10, 1);

        professorIntegral1.setNome("Cleber");
        professorIntegral1.setMatricula("ABCD");
        professorIntegral1.setDataNascimento(1980, 10, 1);
        ((ProfessorIntegral)professorIntegral1).setSalario(4000);
        professorIntegral1.setNivelEscolaridade("mestrado");
        professorIntegral1.setDisciplina("matematica");
        professorIntegral1.setNumeroDependentes(3);
        ((ProfessorIntegral)professorIntegral1).setDataInicio(2005, 10, 1);

        professorIntegral1.setNome("Saulo");
        professorIntegral1.setMatricula("ABCDE");
        professorIntegral1.setDataNascimento(1990, 10, 1);
        professorIntegral1.setSalario(3000);
        professorIntegral1.setNivelEscolaridade("mestrado");
        professorIntegral1.setDisciplina("portugues");
        professorIntegral1.setNumeroDependentes(2);
        ((ProfessorIntegral)professorIntegral1).setDataInicio(2015, 10, 1);

        professorHorista1.setNome("Andre");
        professorHorista1.setMatricula("ABCDEF");
        professorHorista1.setDataNascimento(1990, 12, 1);
        ((ProfessorHorista)professorHorista1).setSalario();
        professorHorista1.setNivelEscolaridade("graduação");
        professorHorista1.setDisciplina("matematica");
        professorHorista1.setNumeroDependentes(2);
        ((ProfessorHorista)professorHorista1).setHorasTrabalhadas(100);

        professorHorista1.setNome("Rosana");
        professorHorista1.setMatricula("ABCDEFG");
        professorHorista1.setDataNascimento(1991, 12, 1);
        ((ProfessorHorista)professorHorista1).setSalario();
        professorHorista1.setNivelEscolaridade("mestrado");
        professorHorista1.setDisciplina("portugues");
        professorHorista1.setNumeroDependentes(1);
        ((ProfessorHorista)professorHorista1).setHorasTrabalhadas(140);

        professorHorista1.setNome("Maycon");
        professorHorista1.setMatricula("ABCDEFGH");
        professorHorista1.setDataNascimento(1992, 12, 1);
        ((ProfessorHorista)professorHorista1).setSalario();
        professorHorista1.setNivelEscolaridade("doutorado");
        professorHorista1.setDisciplina("matematica");
        professorHorista1.setNumeroDependentes(1);
        ((ProfessorHorista)professorHorista1).setHorasTrabalhadas(160);

        bancoDeDados.add(professorIntegral1);
        bancoDeDados.add(professorIntegral2);
        bancoDeDados.add(professorIntegral3);
        bancoDeDados.add(professorHorista1);
        bancoDeDados.add(professorHorista2);
        bancoDeDados.add(professorHorista3);


        bancoDeDados.informaQuantidadeProfessores();

        bancoDeDados.informaProfessorMaiorSalario();

        //bancoDeDados.informaProfessorMaisJovem();

        //bancoDeDados.informaProfessorMaisAntigo();

        bancoDeDados.listaTotalDeSalariosAPagar();

        bancoDeDados.listaMediaHorasTrabalhadasHoristas();

        bancoDeDados.listaProfessoresLecionamPortuguesMatematica();

        bancoDeDados.listaProfessoresMestresEDoutores();

    }
}
