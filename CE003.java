package Project;

//CE003 extended from Module
public class CE003 extends Module {
    //private attributes for CE003
    private int hwk4;
    private int hwk5;
    private int hwk6;
    private int hwk7;
    private int exam2;

    //constructor including Module super attributes and CE003 private attributes
    public CE003(String moduleName, int status, int hwk4, int hwk5, int hwk6, int hwk7, int exam2) {
        super(moduleName, 2);
        this.hwk4 = hwk4;
        this.hwk5 = hwk5;
        this.hwk6 = hwk6;
        this.hwk7 = hwk7;
        this.exam2 = exam2;
    }

    //getters and setters for CE003 attributes
    public int gethwk4() {
        return hwk4;
    }
    public void sethwk4(int hwk4) {
        this.hwk4 = hwk4;
    }
    public int gethwk5() {
        return hwk5;
    }
    public void sethwk5(int hwk5) {
        this.hwk5 = hwk5;
    }
    public int gethwk6() {
        return hwk6;
    }
    public void sethwk6(int hwk6) {
        this.hwk6 = hwk6;
    }
    public int gethwk7() {
        return hwk7;
    }
    public void sethwk7(int hwk7) {
        this.hwk7 = hwk7;
    }
    public int getexam2() {
        return exam2;
    }
    public void setexam2(int exam2) {
        this.exam2 = exam2;
    }

    //calculating final mark for CE003, overriding abstract method in Module abstract class
    @Override
    public double printfinalMark() {
        double avgHomeworks = (gethwk4() +  gethwk5() + gethwk6() + gethwk7())/4.0;
        finalMark = (avgHomeworks * 0.4) + (getexam2() * 0.6);
        return finalMark;
    }
}