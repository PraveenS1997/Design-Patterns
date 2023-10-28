package Builder.v2;

import java.util.UUID;

public class Student {
    private UUID id;
    private String name;
    private int age;
    private double psp;
    private String batch;
    private String collegeName;
    private int graduationYear;
    private String email;
    private String mobileNumber;
    private double totalYearsOfExperience;

    public Student(StudentBuilder builder){
        // assign the values to the student attributes
        this.id = UUID.randomUUID();
        this.name = builder.getName();
        this.age = builder.getAge();
        this.email = builder.getEmail();
        this.mobileNumber = builder.getMobileNumber();
        this.graduationYear = builder.getGraduationYear();
        this.totalYearsOfExperience = builder.getTotalYearsOfExperience();
    }

    public static StudentBuilder getBuilder(){
        return new StudentBuilder();
    }
}