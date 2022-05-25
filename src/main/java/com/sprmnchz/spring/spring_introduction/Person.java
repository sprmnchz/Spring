package com.sprmnchz.spring.spring_introduction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("personBean")
public class Person {
    @Autowired
    @Qualifier ("catBean")
    private Pet pet;
    private int age;
    private String surname;

    public void setAge(int age) {
        this.age = age;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public String getSurname() {
        return surname;
    }

//    @Autowired
//        public Person(Pet pet) {
//        System.out.println("Person bean is created");
//        this.pet = pet;
//    }

        public Person() {
            System.out.println("Person bean is created");
        }

//    @Autowired
    public void setPet(Pet pet) {
        System.out.println("Class Person: set pet");
        this.pet = pet;
    }

    public void callYourPet (){
        System.out.println("Hi, my lovly pet");
        pet.say();
    }

}
