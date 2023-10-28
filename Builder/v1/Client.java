package Builder.v1;

public class Client {
    public static void main(String[] args) {
        StudentBuilder builder = new StudentBuilder();
        builder.setName("Praveen");
        builder.setAge(25);
        builder.setEmail("abc@abc.com");
        builder.setMobileNumber("98222222");
        builder.setGraduationYear(2018);

        Student student = new Student(builder);
        System.out.println("DEBUG");
    }
}
