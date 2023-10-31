package Prototype_Registry.Prototype;

import Prototype_Registry.Registry.Registry;
import Prototype_Registry.Registry.StudentRegistry;

public class Client {
    private static final Registry<String, Student> studentRegistry = new StudentRegistry();

    private static void fillRegistry(){
        // create a common prototype for all the students who are part of June-2023 batch
        Student student = new Student();
        student.setName("Student 1");
        student.setAge(26);
        student.setPsp(88);
        student.setBatch("June-2023");
        student.setAverageBatchPsp(80.22);
        // store the common prototype object into the registry
        studentRegistry.setPrototype("June-2023", student);

        // create a common prototype for all the intelligent students who are part of July-2023 batch
        IntelligentStudent intelligentStudent = new IntelligentStudent();
        intelligentStudent.setName("Intelligent Student 1");
        intelligentStudent.setAge(22);
        intelligentStudent.setPsp(99);
        intelligentStudent.setIq(90);
        intelligentStudent.setBatch("July-2023");
        intelligentStudent.setAverageBatchPsp(98);
        // store the common prototype object into the registry
        studentRegistry.setPrototype("July-2023", intelligentStudent);
    }

    public static void main(String[] args) {
        fillRegistry();

        // prototype - example 1
        Student praveen = new Student();
        praveen.setName("Praveen");
        praveen.setAge(25);
        praveen.setPsp(90);
        praveen.setBatch("June 2023");
        praveen.setAverageBatchPsp(80.23);

        Student ramesh = praveen.copy();
        ramesh.setName("Ramesh");
        ramesh.setAge(28);
        ramesh.setPsp(87);

        // create a new intelligent student who belongs to July-2023 batch using the prototype object stored in registry
        Student intelligentPraveen = studentRegistry.getPrototype("July-2023").copy();
        intelligentPraveen.setName("Praveen");
        intelligentPraveen.setAge(30);
        intelligentPraveen.setPsp(98);

        // create a new student who belongs to batch June-2023 using the prototype object stored in registry
        Student vijay = studentRegistry.getPrototype("June-2023").copy();
        vijay.setName("Vijay");
        vijay.setAge(25);
        vijay.setPsp(75);

        System.out.println("DEBUG");
    }
}