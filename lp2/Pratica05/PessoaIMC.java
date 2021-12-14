public abstract class PessoaIMC extends Pessoa {
    protected double peso;
    protected double altura;
    
    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }
    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double calculaIMC () {
        return peso/(altura*altura);
    }

    public abstract String resultIMC();
    
    public String toString() {
        return "Nome: " + "<" + nome + ">" + "\n" +
               "Data de Nascimento: <" + dataNascimento.getDay() + "/" + dataNascimento.getMonth() + "/" + dataNascimento.getYear() + ">" + "\n" + 
               "Peso: " + "<" + peso + ">" + "\n" +
               "Altura: " + "<" + altura + ">";

    }
}
