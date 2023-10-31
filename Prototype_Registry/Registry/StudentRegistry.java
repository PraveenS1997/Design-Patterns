package Prototype_Registry.Registry;

import Prototype_Registry.Prototype.Student;

import java.util.HashMap;

public class StudentRegistry implements Registry<String, Student>{
    private final HashMap<String, Student> studentRegistry;

    public StudentRegistry(){
        this.studentRegistry = new HashMap<>();
    }

    @Override
    public Student getPrototype(String key) {
        return studentRegistry.get(key);
    }

    @Override
    public void setPrototype(String key, Student value) {
        studentRegistry.put(key, value);
    }
}
