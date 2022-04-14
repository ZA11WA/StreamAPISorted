package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;


public class Main {

    public static void main(String[] args) {
        ArrayList<Person> lista = new ArrayList();
    Person person = new Person("Piotr",10);
    Person person1 = new Person("Adam",22);
    Person person2 = new Person("Wiktoria", 16);
    Person person3 = new Person("Filip", 88);
    lista.add(person);
    lista.add(person1);
    lista.add(person2);
    lista.add(person3);


        lista.stream()
                .sorted(Comparator.comparing(Person::getNick).thenComparing(Person::getAge))
                .forEach(System.out::println);
        }
    }

