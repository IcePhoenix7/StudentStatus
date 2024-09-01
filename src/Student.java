public abstract class Student {
    String id;
    double gpa;
    protected Student(String id,double gpa){
        this.id = id;
        this.gpa = gpa;

    }

    public String getId() {
        return id;
    }

    public double getGpa() {
        return gpa;
    }

    public abstract String getStatus();

    @Override
    public String toString() {
        return "ID>> " + getId() + ", GPA>> " + getGpa()+ ", Status>> " + getStatus();
    }
}