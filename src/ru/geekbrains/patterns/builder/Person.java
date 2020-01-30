package ru.geekbrains.patterns.builder;

import java.util.Date;

public class Person {
    public static enum Gender {male, female};
    private String firstName;
    private String lastName;
    private Gender gender;
    private Date birthday;
    private boolean married;
    private String passport;
    private String inn;
    private String strahovoeSvidetelstvo;
    private String medPolis;
    private String phoneNumber;
    private String homeAddress;
    private String email;

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gender=" + gender +
                ", birthday=" + birthday +
                ", married=" + married +
                ", passport='" + passport + '\'' +
                ", inn='" + inn + '\'' +
                ", strahovoeSvidetelstvo='" + strahovoeSvidetelstvo + '\'' +
                ", medPolis='" + medPolis + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", homeAddress='" + homeAddress + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public Person() {
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public boolean isMarried() {
        return married;
    }

    public void setMarried(boolean married) {
        this.married = married;
    }

    public String getPassport() {
        return passport;
    }

    public void setPassport(String passport) {
        this.passport = passport;
    }

    public String getInn() {
        return inn;
    }

    public void setInn(String inn) {
        this.inn = inn;
    }

    public String getStrahovoeSvidetelstvo() {
        return strahovoeSvidetelstvo;
    }

    public void setStrahovoeSvidetelstvo(String strahovoeSvidetelstvo) {
        this.strahovoeSvidetelstvo = strahovoeSvidetelstvo;
    }

    public String getMedPolis() {
        return medPolis;
    }

    public void setMedPolis(String medPolis) {
        this.medPolis = medPolis;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(String homeAddress) {
        this.homeAddress = homeAddress;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
