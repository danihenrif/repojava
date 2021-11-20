public class Treino {
    private String nomeAtividade;
    private String horaAtividade;
    
    public Treino(String nomeAtividade, String horaAtividade){
        this.nomeAtividade = nomeAtividade;
        this.horaAtividade = horaAtividade;
    }
    
    public String getNomeAtividade() {
        return nomeAtividade;
    }
    public void setNomeAtividade(String nomeAtividade) {
        this.nomeAtividade = nomeAtividade;
    }
    public String getHoraAtividade() {
        return horaAtividade;
    }
    public void setHoraAtividade(String horaAtividade) {
        this.horaAtividade = horaAtividade;
    }

    
}
