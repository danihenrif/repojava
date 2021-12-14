public class Homem extends PessoaIMC {
    
    @Override
    public String resultIMC() {
        double imc = calculaIMC();

        if(imc < 20.7){
            return "IMC: " + imc + " Abaixo do peso ideal" + "\n";
        }
        else if(imc > 26.4){
            return "IMC: " + imc + " Acima do peso ideal" + "\n";
        }
        else{
            return "IMC: " + imc + " Peso ideal" + "\n";
        }
    }
}
