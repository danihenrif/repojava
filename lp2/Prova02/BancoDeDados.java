import java.util.ArrayList;
import java.util.Date;

public class BancoDeDados {
    private ArrayList<Professor> professores = new ArrayList<>();

    public void add(Professor professor){
        professores.add(professor);
    }
    
    public void informaQuantidadeProfessores(){
        System.out.println("------------------------------QUANTIDADE DE PROFESSORES---------------------------------");
        System.out.println("Existem um total de: " + professores.size() + " professores na escola"); 
        System.out.println("-----------------------------------------------------------------------------------"); 
    }

    public void informaProfessorMaiorSalario(){
        double maiorSalario = professores.get(0).getSalario();
        String nomeProfessor = professores.get(0).getNome();
        
        for(Professor professor : professores){
            if(professor.getSalario() > maiorSalario){
                maiorSalario = professor.getSalario();
                nomeProfessor = professor.getNome();
            }
        }

        System.out.println("------------------------------PROFESSOR COM MAIOR SALARIO---------------------------------");
        System.out.println("O professor com o maior salario eh: " + nomeProfessor ); 
        System.out.println("-----------------------------------------------------------------------------------"); 
        
    }

    public void informaProfessorMaisJovem(){
        Date dataNascimento= professores.get(0).getDataNascimento();
        String nomeProfessor = professores.get(0).getNome();
        
        for(Professor professor : professores){
            if(professor.getDataNascimento().compareTo(dataNascimento) > 0){
                dataNascimento = professor.getDataNascimento();
                nomeProfessor = professor.getNome();
            }
        }
        System.out.println("------------------------------PROFESSOR MAIS NOVO---------------------------------");
        System.out.println(nomeProfessor); 
        System.out.println("-----------------------------------------------------------------------------------");               
    }

    public void informaProfessorMaisAntigo(){
        Date dataEntradadaEscola = new Date(); //Data atual
        String nomeProfessor = professores.get(0).getNome();
        
        for(Professor professor : professores){
            if(professor instanceof ProfessorIntegral && professor.getDataNascimento().compareTo(dataEntradadaEscola) < 0){
                dataEntradadaEscola = ((ProfessorIntegral)professor).getDataInicio();
                nomeProfessor = professor.getNome();
            }
        }
        System.out.println("------------------------------PROFESSOR MAIS ANTIGO---------------------------------");
        System.out.println(nomeProfessor); 
        System.out.println("-----------------------------------------------------------------------------------");       
    }
    
    public void listaTotalDeSalariosAPagar(){
        double totalIntegrais = 0;
        double totalHoristas = 0;

        for(Professor professor : professores){
            if(professor instanceof ProfessorIntegral){
                totalIntegrais += professor.getSalario();
            }
            else if(professor instanceof ProfessorHorista){
                totalHoristas += professor.getSalario();
            }
        }
        System.out.println("------------------------------Total DE SALARIOS A PAGAR ---------------------------------");
        System.out.println("A escola deve pagar um total de: " + totalIntegrais + " R$ aos professores integrais");
        System.out.println("A escola deve pagar um total de: " + totalHoristas + " R$ aos professores horistas");
        System.out.println("-----------------------------------------------------------------------------------");        
    }

    public void listaMediaHorasTrabalhadasHoristas(){
        int mediaHoras = 0;
        int contador = 0;

        for(Professor professor : professores){
            if(professor instanceof ProfessorHorista){
                mediaHoras += ((ProfessorHorista)professor).getHorasTrabalhadas();
                contador++;
            }
        }
        
        System.out.println("------------------------------QUANTIDADE MÉDIA DE HORAS TRABALHADAS POR PROFESSORES HORISTAS---------------------------------");
        System.out.println(mediaHoras/contador); 
        System.out.println("-----------------------------------------------------------------------------------");        
    }

    public void listaProfessoresLecionamPortuguesMatematica(){
        System.out.println("------------------------------ PROFESSORES QUE LECIONAM PORTUGUES E MATEMATICA ---------------------------------");
        for(Professor professor : professores){
            if(professor.getDisciplina() == "portugues" || professor.getDisciplina() == "Portugues" || professor.getDisciplina() == "PORTUGUES"){
                System.out.println("O professor " + professor.getNome() + " leciona portugues");
            }
            else if(professor.getDisciplina() == "matematica" || professor.getDisciplina() == "Matematica" || professor.getDisciplina() == "MATEMATICA"){
                System.out.println("O professor " + professor.getNome() + " leciona matematica");
            }
        }
        System.out.println("-----------------------------------------------------------------------------------");        
    }

    public void listaProfessoresMestresEDoutores(){
        System.out.println("------------------------------ PROFESSORES MESTRES E DOUTORES ---------------------------------");
        for(Professor professor : professores){
            if(professor.getNivelEscolaridade() == "mestrado" || professor.getNivelEscolaridade() == "Mestrado" || professor.getNivelEscolaridade() == "MESTRADO"){
                System.out.println("O professor " + professor.getNome() + " é mestre");
            }
            else if(professor.getNivelEscolaridade() == "doutorado" || professor.getNivelEscolaridade() == "Doutorado" || professor.getNivelEscolaridade() == "DOUTORADO"){
                System.out.println("O professor " + professor.getNome() + " é doutor");
            }
        }
        System.out.println("-----------------------------------------------------------------------------------");          
    }
    
    





}
