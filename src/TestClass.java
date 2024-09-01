import java.util.Random;

public class TestClass {
    public static void main(String[] args) {
        Random random = new Random();
        Student student;
        for (int i = 0; i < 10; i++){
            double tempGpa = Math.random()*4;
            boolean tempGraduate = random.nextBoolean();
            String tempId =  String.valueOf((int)Math.floor(Math.random()*(999999-100000+1) + 100000));
            if (tempGraduate){
                student = new Graduate(tempId,tempGpa);
            }else{
                student = new Undergraduate(tempId,tempGpa);
            }
            System.out.println(student.toString());
        }

    }
}