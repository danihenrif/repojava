import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


public class LocaLisa {
    private static ArrayList<Veiculo> veiculos = new ArrayList<>();

    public static void adicionaVeiculo(Veiculo veiculo){
        veiculos.add(veiculo);
    }
    
    public static void removeVeiculo(Veiculo veiculo){
        veiculos.remove(veiculo);
    }
    
    public static void exibeVeiculosCadastrados(){
        System.out.println("------------------------------VEICULOS CADASTRADOS---------------------------------");
        for(Veiculo veiculo : veiculos){
            System.out.print("Modelo: " + veiculo.getModelo()+ " Marca: " + veiculo.getMarca() + " Placa: " + veiculo.getPlaca());
            
            if(veiculo instanceof Carro){
                System.out.println(" Potencia do motor:" + ((Carro)veiculo).getPotenciaMotor()
                + " Quantidade de portas: " + ((Carro)veiculo).getQtdPortas());
                System.out.println("A LocaLisa recebera: " + veiculo.getValorAluguel() + " R$ pelo aluguel desse veiculo");
            }
            else if(veiculo instanceof Moto){
                System.out.println(" Tipo de partida:" + ((Moto)veiculo).getTipoPartida()
                + " Cilindradas: " + ((Moto)veiculo).getCilindradas());
                System.out.println("A LocaLisa recebera: " + veiculo.getValorAluguel() + " R$ pelo aluguel desse veiculo");          
            }
        }
        System.out.println("-----------------------------------------------------------------------------------"); 
    }
    
    public static void exibeVeiculosAlugados(){
        System.out.println("------------------------------VEICULOS ALUGADOS---------------------------------");
        for(Veiculo veiculo : veiculos){
            if(veiculo instanceof Carro && ((Carro)veiculo).isAlugado()){
                System.out.println("Carro modelo: " + veiculo.getModelo()+ " Marca: " + veiculo.getMarca() + " Placa: " + veiculo.getPlaca());
                System.out.println("A LocaLisa recebera: " + veiculo.getValorAluguel() + " R$ pelo aluguel desse veiculo");
            }
            else if(veiculo instanceof Moto && ((Moto)veiculo).isAlugado()){
                System.out.println("Moto modelo: " + veiculo.getModelo()+ " Marca: " + veiculo.getMarca() + " Placa: " + veiculo.getPlaca());
                System.out.println("A LocaLisa recebera: " + veiculo.getValorAluguel() + " R$ pelo aluguel desse veiculo");
            }
        }
        System.out.println("-----------------------------------------------------------------------------------");       
    }
    
    public static void exibeVeiculosDisponiveis(){
        System.out.println("------------------------------VEICULOS DISPONIVEIS---------------------------------");
        for(Veiculo veiculo : veiculos){
            if(veiculo instanceof Carro && (!((Carro)veiculo).isAlugado())){
                System.out.println("Carro modelo: " + veiculo.getModelo()+ " Marca: " + veiculo.getMarca() + " Placa: " + veiculo.getPlaca());
                System.out.println("A LocaLisa recebera: " + veiculo.getValorAluguel() + " R$ pelo aluguel desse veiculo");
            }
            else if(veiculo instanceof Moto && (!((Moto)veiculo).isAlugado())){
                System.out.println("Moto modelo: " + veiculo.getModelo()+ " Marca: " + veiculo.getMarca() + " Placa: " + veiculo.getPlaca());
                System.out.println("A LocaLisa recebera: " + veiculo.getValorAluguel() + " R$ pelo aluguel desse veiculo");
            }
        }
        System.out.println("-----------------------------------------------------------------------------------");          
    }
    
    public static void listaAluguelMaisCaro(){
        System.out.println("-----------------------ALUGUEL MAIS CARO----------------------------------------------");
        double aluguelMaisCaro = veiculos.get(0).getValorAluguel();
        String modelo = veiculos.get(0).getModelo();
        
        for(Veiculo veiculo : veiculos){
            if(veiculo.getValorAluguel() > aluguelMaisCaro){
                aluguelMaisCaro = veiculo.getValorAluguel();
                modelo = veiculo.getModelo();
            }
        }
        System.out.println("O aluguel mais caro custa: " + aluguelMaisCaro + "R$");
        System.out.println("E refere-se ao(a): " + modelo);
        System.out.println("-----------------------------------------------------------------------------------");
    }
    
    public static void listaMarcaComMaiorQtddDeCarros(){
        Map<String, Integer> mapa = new HashMap<String, Integer>();
        
        for(Veiculo veiculo : veiculos){
            if(veiculo instanceof Carro && mapa.containsKey(veiculo.getMarca())){
                mapa.put(veiculo.getMarca(), mapa.hashCode() + 1) ;
            }
            else if(veiculo instanceof Carro && !(mapa.containsKey(veiculo.getMarca())) ){
                mapa.put(veiculo.getMarca(), 0);
            }
        }

        int maior;
        String marca;

        mapa.forEach((key,value)->{
            if(value > maior){
                maior = value;
                marca = key;
            }
        });
    }

    public static void main(String[] args){
        Veiculo carro1 = new Carro();
        Veiculo carro2 = new Carro();
        Veiculo carro3 = new Carro();
        Veiculo moto1 = new Moto();
        Veiculo moto2 = new Moto();
        Veiculo moto3 = new Moto();

        carro1.setMarca("Chevrolet");
        carro1.setModelo("Camaro");
        carro1.setPlaca("ABCDE-F123");
        carro1.setValorAluguel(260.5);
        carro1.setAlugado(true);
        ((Carro)carro1).setPotenciaMotor(461);
        ((Carro)carro1).setQtdPortas(2);
        
        carro2.setMarca("Chevrolet");
        carro2.setModelo("Tracker");
        carro2.setPlaca("ABADE-G123");
        carro2.setValorAluguel(150.5);
        carro2.setAlugado(false);
        ((Carro)carro2).setPotenciaMotor(200);
        ((Carro)carro2).setQtdPortas(4);
        
        carro3.setMarca("Fiat");
        carro3.setModelo("Mobi");
        carro3.setPlaca("ABCDPF-129");
        carro3.setValorAluguel(100);
        carro3.setAlugado(false);
        ((Carro)carro3).setPotenciaMotor(180);
        ((Carro)carro3).setQtdPortas(4);

        moto1.setMarca("Honda");
        moto1.setModelo("Pcx");
        moto1.setPlaca("ABCDK-F143");
        moto1.setValorAluguel(80);
        moto1.setAlugado(true);
        ((Moto)moto1).setTipoPartida("eletrica");
        ((Moto)moto1).setCilindradas(149);
        
        moto2.setMarca("Yamaha");
        moto2.setModelo("Xj6");
        moto2.setPlaca("ABADK-G923");
        moto2.setValorAluguel(200.5);
        moto2.setAlugado(false);
        ((Moto)moto2).setTipoPartida("eletrica");
        ((Moto)moto2).setCilindradas(600);
        
        moto3.setMarca("Honda");
        moto3.setModelo("Cg");
        moto3.setPlaca("ANCDPF-129");
        moto3.setValorAluguel(50);
        moto3.setAlugado(false);
        ((Moto)moto3).setTipoPartida("manual");
        ((Moto)moto3).setCilindradas(150);

        adicionaVeiculo(carro1);
        adicionaVeiculo(carro2);
        adicionaVeiculo(carro3);
        adicionaVeiculo(moto1);
        adicionaVeiculo(moto2);
        adicionaVeiculo(moto3);

        exibeVeiculosCadastrados();

        exibeVeiculosAlugados();

        exibeVeiculosDisponiveis();

        listaAluguelMaisCaro();

        removeVeiculo(carro2);

        exibeVeiculosCadastrados();

        //listaMarcaComMaiorQtddDeCarros();

    }
}
