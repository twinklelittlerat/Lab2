class Person {
    String firstName;
    String lastName;

    String getFirstName() {
        return firstName;
    }

    String getLastName() {
        return lastName;
    }

    void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    void setLastName(String lastName) {
        this.lastName = lastName;
    }
}

class Parent extends Person {
    int age;
    int salary;

    int getAge() {
        return age;
    }

    int getSalary() {
        return salary;
    }

    void setAge(int age) {
        this.age = age;
    }

    void setSalary(int salary) {
        this.salary = salary;
    }
}

class Father extends Parent {

    @Override
    String getFirstName() {
        return "Mr. " + firstName;
    }
}

class Mother extends Parent {

    @Override
    String getFirstName() {
        return "Ms. " + firstName;
    }
}

public class Main {
    public static void main(String[] args) {

        Mother m = new Mother();
        m.setFirstName("Alice");
        System.out.println(m.getFirstName());

        Father f = new Father();
        f.setFirstName("Bob");
        System.out.println(f.getFirstName());

        Person p = new Person();
        p.setFirstName("John");
        System.out.println(p.getFirstName());
    }
}