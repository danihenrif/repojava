public class Mulher extends PessoaIMC {
    
    @Override
    public String resultIMC() {
        double imc = calculaIMC();

        if(imc < 19){
            return "IMC: " + imc + " Abaixo do peso ideal" + "\n";
        }
        else if(imc > 25.8){
            return "IMC: " + imc + " Acima do peso ideal" + "\n";
        }
        else{
            return "IMC: " + imc + " Peso ideal" + "\n";
        }
    }
}
