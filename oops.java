class Pen {
    String color;
    String type;

    public void write() {
        System.out.println("write something");

    }

}

class Student {
    String name;
    int age;

    public void printInfo() {
        System.out.println(this.name);
        System.out.println(this.age);
    }
    // Parametorized constructor;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class oops {

    public static void main(String[] args) {
        Student s1 = new Student("ramprasad", 19);

        s1.printInfo();

    }

}