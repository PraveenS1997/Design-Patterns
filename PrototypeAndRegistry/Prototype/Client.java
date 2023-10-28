package PrototypeAndRegistry.Prototype;

import PrototypeAndRegistry.Registry.Registry;
import PrototypeAndRegistry.Registry.StudentRegistry;

public class Client {
    public static void main(String[] args) {
        // prototype - 1
        Student student = new Student("Praveen", 25, "June 2023");
        Student copy = student.copy();

        // prototype - 2
        IntelligentStudent intelligentStudent = new IntelligentStudent("Vijay", 24, "Dec 2022", 90);
        IntelligentStudent isCopy = intelligentStudent.copy();

        // registry - student
        Registry<String, Student> studentRegistry = new StudentRegistry();
        // create a common prototype for all the students who are part of June-2023 batch
        Student june2023 = new Student();
        june2023.setBatch("June-2023");
        // store the common prototype object into the registry
        studentRegistry.setPrototype("June-2023", june2023);

        // create a new student who belongs to batch June-2023 using the prototype object stored in registry
        Student vijay = studentRegistry.getPrototype("June-2023").copy();
        vijay.setName("Vijay");
        vijay.setAge(25);
        System.out.println("DEBUG");
    }
}