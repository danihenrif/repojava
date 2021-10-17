package academy.devdojo.maratonajava.javacore.Bintroducaometodos.domain;

public class Person {
    private String name;
    private int age;

    public void print(){
        System.out.println(this.name);
        System.out.println(this.age);
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }
}
