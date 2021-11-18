import java.util.Date;

public class ProfessorIntegral extends Professor {
    private Date dataInicio;

    public Date getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(int ano, int mes, int dia) {
        this.dataInicio = new Date(ano,mes,dia);
    }

    public void setSalario(double salario){
        this.salario = salario + (150 * numeroDependentes); //considerei 4 semanas cada mes
    }

}
