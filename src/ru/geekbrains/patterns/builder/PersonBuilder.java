package ru.geekbrains.patterns.builder;

import java.util.Date;

public class PersonBuilder {
    private Person person;

    public PersonBuilder() {
        person = new Person();
    }

    PersonBuilder birthday(Date date) {
        person.setBirthday(date);
        return this;
    }

    PersonBuilder email(String email) {
        person.setEmail(email);
        return this;
    }

    PersonBuilder firstName(String firstName) {
        person.setFirstName(firstName);
        return this;
    }

    PersonBuilder gender(Person.Gender gender) {
        person.setGender (gender);
        return this;
    }

    PersonBuilder homeAddress(String homeAddress) {
        person.setHomeAddress(homeAddress);
        return this;
    }

    PersonBuilder inn(String inn) {
        person.setInn (inn);
        return this;
    }

    PersonBuilder lastName(String lastName) {
        person.setLastName (lastName);
        return this;
    }

    PersonBuilder married(Boolean married) {
        person.setMarried (married);
        return this;
    }

    PersonBuilder medPolis(String medPolis) {
        person.setMedPolis (medPolis);
        return this;
    }

    PersonBuilder passport(String passport) {
        person.setPassport(passport);
        return this;
    }

    PersonBuilder phoneNumber(String phoneNumber) {
        person.setPhoneNumber (phoneNumber);
        return this;
    }

    PersonBuilder strahovoeSvidetelstvo(String strahovoeSvidetelstvo) {
        person.setStrahovoeSvidetelstvo (strahovoeSvidetelstvo);
        return this;
    }

    Person build(){
        return person;
    }
}
