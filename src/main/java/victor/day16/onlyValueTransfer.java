package victor.day16;

import lombok.Data;

/**
 * Author：Victor_htq
 * Package：victor.day16
 * Project：JavaFaundamental
 * name：onlyValueTransfer
 * Date：2023/11/27 10:31
 * Filename：onlyValueTransfer
 */
@Data
class Person {
    int age;
}


public class onlyValueTransfer {

    public static void main(String[] args) {
        Person person1 = new Person();
        person1.age = 1;
        Person person2 = new Person();
        person2.age = 2;
        swap(person1, person2);
        System.out.println(person1.age);
        System.out.println(person2.age);
    }

    private static void swap(Person p1, Person p2) {
        Person tmp = p1;
        p1 = p2;
        p2 = tmp;
    }
}
