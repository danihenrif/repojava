package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.domain.Person;

public class PersonTest01 {
    public static void main(String[] args) {
        Person person1 = new Person();

        person1.age = 20;
        person1.name = "Daniel";
        person1.gender = 'M';

        System.out.println(person1.age + "\n" + person1.name + "\n" + person1.gender);
    }
}
