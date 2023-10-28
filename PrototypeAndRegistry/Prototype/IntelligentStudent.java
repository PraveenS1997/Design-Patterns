package PrototypeAndRegistry.Prototype;

class IntelligentStudent extends Student{
    private int iq;

    public IntelligentStudent(){ }

    public IntelligentStudent(String name, int age, String batch, int iq){
        super(name, age, batch);
        this.iq = iq;
    }

    public IntelligentStudent(IntelligentStudent intelligentStudent){
        super(intelligentStudent);
        setIq(intelligentStudent.iq);
    }

    public int getIq() {
        return iq;
    }

    public void setIq(int iq) {
        this.iq = iq;
    }

    @Override
    public IntelligentStudent copy(){
        return new IntelligentStudent(this);
    }
}