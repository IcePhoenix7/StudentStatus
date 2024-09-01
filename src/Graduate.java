public class Graduate extends Student{
    Graduate(String id, double gpa){
        super(id,gpa);
    }

    @Override
    public String getStatus() {
        if (gpa >= 3.0){
            return "good";
        } else {
            return "probation";
        }
    }

    @Override
    public String toString() {
        return "Graduate "+super.toString();
    }
}
