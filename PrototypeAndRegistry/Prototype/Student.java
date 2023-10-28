package PrototypeAndRegistry.Prototype;

public class Student {
    private int age;
    private String name;
    private String batch;

    public Student(){ }

    public Student(String name, int age, String batch){
        this.name = name;
        this.age = age;
        this.batch = batch;
    }

    // copy constructor
    public Student(Student student){
        this.name = student.name;
        this.age = student.age;
        this.batch = student.batch;
    }

    public Student copy(){
        return new Student(this);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBatch() {
        return batch;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }
}