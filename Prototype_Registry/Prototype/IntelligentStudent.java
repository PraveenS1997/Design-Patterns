package Prototype_Registry.Prototype;

class IntelligentStudent extends Student{
    private int iq;

    public IntelligentStudent(){ }

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

    public IntelligentStudent copy(){
        return new IntelligentStudent(this);
    }
}