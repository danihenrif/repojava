import java.time.LocalDate;

import java.time.LocalDate;

public class ProdutoNaoDuravel extends Produto {
    private LocalDate dataValidade;
    private String genero;

    //Getters
    public LocalDate getDataValidade() {
        return dataValidade;
    }
    public String getGenero() {
        return genero;
    }
    
    //Setters
    public void setGenero(String genero) {
        this.genero = genero;
    }
    public void setDataValidade(int ano, int mes, int dia) {
        dataValidade = LocalDate.of(ano, mes, dia);
    }

    
}
