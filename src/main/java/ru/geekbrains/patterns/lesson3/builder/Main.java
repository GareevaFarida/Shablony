package ru.geekbrains.patterns.lesson3.builder;

public class Main {
    public static void main(String[] args) {
        PersonBuilder personBuilder = new PersonBuilder();
        Person person = personBuilder.firstName("Tom")
                .lastName("Kruz")
                .gender(Person.Gender.male)
                .email("123@mail.ru")
                .build();

        System.out.println(person);
    }
}
