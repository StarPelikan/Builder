package home;

public class Main {
    public static void main(String[] args){

        Person person= new PersonBuilder()
                .setName("Джек")
                .setSurname("Лондон")
                .setAge(34)
                .setCity("Будапешт")
                .build();
        System.out.println(person);

        person.happyBirthday();
        System.out.println(person);

        Person son = person.newChildBuilder()
                .setName("Мария")
                .setAge(9)
                .build();
        System.out.println("У " + person + " есть сын - " + son);
        try {
            // Не хватает обязательных полей
            new PersonBuilder().build();
        } catch (IllegalStateException e) {
            e.printStackTrace();
        }

        try {
            // Возраст недопустимый
            new PersonBuilder().setAge(-100).build();
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
    }
    }
