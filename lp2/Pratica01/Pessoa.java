public class Pessoa{
  
  private double peso;
  private double altura;

  //Getters and Setters
  public void setPeso(double peso){
    this.peso = peso;
  }

  public double getPeso(){
    return this.peso;
  }

  public void setAltura(double altura){
    this.altura = altura;
  }

  public double getAltura(){
    return this.altura;
  }

  public double calcularIMC(){
    return this.peso / ( this.altura * this.altura );
  } 

  public String avaliaIMC(final double IMC){
    if(IMC < 18.5){return "Pessoa Abaixo do peso";}
    else if(IMC >=  18.5 && IMC <= 24.9){return "Pessoa com Peso normal";} 
    else if(IMC >=  25.0 && IMC <= 29.9){return "Pessoa com Pré-obesidade";} 
    else if(IMC >=  30.0 && IMC <= 34.9){return "Pessoa com Obesidade Grau 1";} 
    else if(IMC >=  35.5 && IMC <= 39.9){return "Pessoa com Obesidade Grau 2";} 
    else{return "Pessoa com Obesidade Grau 3";}   
  }

  public void informarIMC(){
    final double IMC = calcularIMC();
    System.out.println("Peso    => " + this.peso);
    System.out.println("Altura  => " + this.altura);
    System.out.println("IMC     =  " +  IMC);
    System.out.println(avaliaIMC(IMC));
  }

}