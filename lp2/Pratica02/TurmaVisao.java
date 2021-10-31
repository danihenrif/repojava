public class TurmaVisao {
    public static void main (String[] args){
        
        Turma turma = new Turma();

        Aluno aluno1 = new Aluno();
        Aluno aluno2 = new Aluno();
        Aluno aluno3 = new Aluno(); 
        
        Prova prova1Aluno1 = new Prova(3.0, 3.5);
        Prova prova2Aluno1 = new Prova(4.0, 4.0);
        Prova prova1Aluno2 = new Prova(4.5, 5.0);
        Prova prova2Aluno2 = new Prova(1.0, 2.0);
        Prova prova1Aluno3 = new Prova(3.0, 4.5);
        Prova prova2Aluno3 = new Prova(6.0, 3.0);

        aluno1.setProvas(prova1Aluno1, prova2Aluno1);
        aluno2.setProvas(prova1Aluno2, prova2Aluno2);
        aluno3.setProvas(prova1Aluno3, prova2Aluno3);

        turma.setAlunos(aluno1); 
        turma.setAlunos(aluno2); 
        turma.setAlunos(aluno3);

        aluno1.imprimeMedia(1);
        aluno2.imprimeMedia(2);
        aluno3.imprimeMedia(3);

        turma.imprimeMedia();
  }
    
}
