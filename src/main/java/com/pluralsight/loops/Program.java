package com.pluralsight.loops;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Program {
    public static void main(String[] args) {

        creatPeopleList();
    }

    private static void creatPeopleList() {
        List<Person> people = new ArrayList<>();

        Person person1 = new Person("Christoper", "Kidd", 20);
        Person person2 = new Person("Normand", "Baker", 13);
        Person person3 = new Person("Coleman", "Guzman", 26);
        Person person4 = new Person("Sonya", "Rangel", 82);
        Person person5 = new Person("Benton", "Christian", 56);
        Person person6 = new Person("Madge", "Riggs", 19);
        Person person7 = new Person("Liliana", "Preston", 31);
        Person person8 = new Person("Randolph", "Harrison", 64);
        Person person9 = new Person("Lourdes", "Barber", 42);
        Person person10 = new Person("Hobert", "Francis", 5);
        people.add(person1);
        people.add(person2);
        people.add(person3);
        people.add(person4);
        people.add(person5);
        people.add(person6);
        people.add(person7);
        people.add(person8);
        people.add(person9);
        people.add(person10);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Search for a first or last name: ");
        String searchName = scanner.nextLine();

        for (Person person : people) {
            if (person.getFirstName().equalsIgnoreCase(searchName) ||  person.getLastName().equalsIgnoreCase(searchName)) {
                System.out.println("People with mactching names:");
                System.out.println(person);
            }
        }
    }

}
