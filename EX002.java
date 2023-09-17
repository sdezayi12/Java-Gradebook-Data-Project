package Project;

//EX002 extended from Module
public class EX002 extends Module {
    //private attributes for EX002
    private int exam;

    //constructor including Module super attributes and EX002 private attribute
    public EX002(String moduleName, int status, int exam)  {
        super(moduleName, 1);
        this.exam = exam;
    }

    //getters and setters for EX002 attribute
    public int getexam() {
        return exam;
    }
    public void setexam(int exam) {
        this.exam = exam;
    }

    //calculating final mark for EX002, overriding abstract method in Module abstract class
    @Override
    public double printfinalMark() {
        finalMark = getexam();
        return finalMark;
    }
}
