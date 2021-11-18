public class ProfessorHorista extends Professor {
    private int horasTrabalhadas;
    private final double valorHora = 55;

    public int getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(int horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }
    
    public void setSalario(){
        salario = (valorHora * horasTrabalhadas) + (150 * numeroDependentes); 
    }
}
