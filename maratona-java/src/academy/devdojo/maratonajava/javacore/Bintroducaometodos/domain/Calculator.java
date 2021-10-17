package academy.devdojo.maratonajava.javacore.Bintroducaometodos.domain;

public class Calculator {

    public void sumOfTwoNumbers(){
        System.out.println(10+10);
    }

    public int sumVarArgs(int... numbers){
        int sum = 0;
        for(int num: numbers){
            sum += num;
        }
        return sum;
    }
}
