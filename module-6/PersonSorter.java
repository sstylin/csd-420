// Steve Stytlin : Module 6

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + " (" + age + ")";
    }
}

public class PersonSorter {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Eva", 35));
        people.add(new Person("Bernard", 65));
        people.add(new Person("Julie", 41));

        // Sorting by age using Comparator
        Collections.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person p1, Person p2) {
                return Integer.compare(p1.age, p2.age);
            }
        });

        System.out.println("Sorted by age: " + people);
    }
}
