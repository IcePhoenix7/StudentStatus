public abstract class Student {
    String id;
    double gpa;

    protected Student(String id, double gpa) {
        this.id = id;
        this.gpa = gpa;
    }

    public String getId() {
        return id;
    }

    public double getGpa() {
        return gpa;
    }

    public final String displayStudent() {
        return "ID>> " + getId() + ", GPA>> " + String.format("%.2f",getGpa()) + ", Status>> " + getStatus();
    }

    abstract String getStatus();
}