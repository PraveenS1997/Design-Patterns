package Builder.v3;

public class Client {
    public static void main(String[] args) {
        Student student = Student.getBuilder()
                .setName("Praveen")
                .setAge(25)
                .setGraduationYear(2024)
                .setMobileNumber("9382727727")
                .setEmail("abc@abc.com")
                .setTotalYearsOfExperience(4.5)
                .build();

        System.out.println("DEBUG");
    }
}