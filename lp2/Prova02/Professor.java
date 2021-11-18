import java.util.Date;

public class Professor {
    protected String nome;
    protected String matricula;
    protected Date dataNascimento;
    protected double salario;
    protected String nivelEscolaridade;
    protected String disciplina;
    protected int numeroDependentes;
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    public Date getDataNascimento() {
        return dataNascimento;
    }
    public void setDataNascimento(int ano, int mes, int dia) {
        this.dataNascimento = new Date(ano,mes,dia);
    }
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
    }
    public String getNivelEscolaridade() {
        return nivelEscolaridade;
    }
    public void setNivelEscolaridade(String nivelEscolaridade) {
        this.nivelEscolaridade = nivelEscolaridade;
    }
    public String getDisciplina() {
        return disciplina;
    }
    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }
    public int getNumeroDependentes() {
        return numeroDependentes;
    }
    public void setNumeroDependentes(int numeroDependentes) {
        this.numeroDependentes = numeroDependentes;
    }


    
}