package Builder.v3;

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

    private Student(StudentBuilder builder){
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

    public static class StudentBuilder {
        private int id;
        private String name;
        private int age;
        private double psp;
        private String batch;
        private String collegeName;
        private int graduationYear;
        private String email;
        private String mobileNumber;
        private double totalYearsOfExperience;

        public int getId() {
            return id;
        }

        public StudentBuilder setId(int id) {
            this.id = id;
            return this;
        }

        public String getName() {
            return name;
        }

        public StudentBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public int getAge() {
            return age;
        }

        public StudentBuilder setAge(int age) {
            this.age = age;
            return this;
        }

        public double getPsp() {
            return psp;
        }

        public StudentBuilder setPsp(double psp) {
            this.psp = psp;
            return this;
        }

        public String getBatch() {
            return batch;
        }

        public StudentBuilder setBatch(String batch) {
            this.batch = batch;
            return this;
        }

        public String getCollegeName() {
            return collegeName;
        }

        public StudentBuilder setCollegeName(String collegeName) {
            this.collegeName = collegeName;
            return this;
        }

        public int getGraduationYear() {
            return graduationYear;
        }

        public StudentBuilder setGraduationYear(int graduationYear) {
            this.graduationYear = graduationYear;
            return this;
        }

        public String getEmail() {
            return email;
        }

        public StudentBuilder setEmail(String email) {
            this.email = email;
            return this;
        }

        public String getMobileNumber() {
            return mobileNumber;
        }

        public StudentBuilder setMobileNumber(String mobileNumber) {
            this.mobileNumber = mobileNumber;
            return this;
        }

        public double getTotalYearsOfExperience() {
            return totalYearsOfExperience;
        }

        public StudentBuilder setTotalYearsOfExperience(double totalYearsOfExperience) {
            this.totalYearsOfExperience = totalYearsOfExperience;
            return this;
        }

        public Student build(){
            // add all the validations here before creating the Student object
            if(graduationYear > 2023){
                throw new RuntimeException("Student is not eligible to enroll");
            }
            return new Student(this);
        }
    }
}