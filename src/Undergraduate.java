
public class Undergraduate extends Student{
    Undergraduate(String id,double gpa){
        super(id,gpa);
    }

    @Override
    public String getStatus() {
        if (gpa >= 3.0){
            return "honor";
        }else if(gpa>=2.0){
            return "good";
        }else{
            return "probation";
        }
    }
}

