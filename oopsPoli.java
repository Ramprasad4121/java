
class Student {
    String name;
    int age;

    public void poli(String name) {
        System.out.println(name);
    }

    public void poli(int age) {
        System.out.println(age);
    }

    public void poli(String name, int age) {
        System.out.println(name + " " + age);
    }

}

class oopsPoli {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Ramprasad";
        s1.age = 19;

        s1.poli(s1.name, s1.age);

    }

}
