package Project;

//CW001 extended from Module
public class CW001 extends Module {
    //private attributes for CW001
    private int hwk1;
    private int hwk2;
    private int hwk3;
    private int project;

    //constructor including Module super attributes and CW001 private attributes
    public CW001(String moduleName, int status, int hwk1, int hwk2, int hwk3, int project) {
        super(moduleName, 0);
        this.hwk1 = hwk1;
        this.hwk2 = hwk2;
        this.hwk3 = hwk3;
        this.project = project;
    }

    //getters and setters for CW001 attributes
    public int gethwk1() {
        return hwk1;
    }
    public void sethwk1(int hwk1) {
        this.hwk1 = hwk1;
    }
    public int gethwk2() {
        return hwk2;
    }
    public void sethwk2(int hwk2) {
        this.hwk2 = hwk2;
    }
    public int gethwk3() {
        return hwk3;
    }
    public void sethwk3(int hwk3) {
        this.hwk3 = hwk3;
    }
    public int getproject() {
        return project;
    }
    public void setproject(int project) {
        this.project = project;
    }

    //calculating final mark for CW001, overriding abstract method in Module abstract class
    @Override
    public double printfinalMark() {
        double avgHomeworks = (gethwk1() +  gethwk2() + gethwk3())/3.0;
        finalMark = (avgHomeworks * 0.5) + (getproject() * 0.5);
        return finalMark;
    }
}
