package Project;

//Student class
public class Student {
    //private attributes for Student
    private int ID;
    private String firstName;
    private String lastName;

    //attributes of 3 modules being called
    private CW001 mod1;
    private EX002 mod2;
    private CE003 mod3;

    //constructor taking in ID, firstName, lastName, and instances of 3 modules
    public Student(int studID, String First_Name, String Last_Name, CW001 module1, EX002 module2, CE003 module3) {
        ID = studID;
        firstName = First_Name;
        lastName = Last_Name;
        mod1 = module1;
        mod2 = module2;
        mod3 = module3;
    }

    //getters and setters for each attribute
    public int getstudID() {
        return ID;
    }
    public void setstudID(int studID) {
        ID = studID;
    }
    public String getfirstName() {
        return firstName;
    }
    public void setfirstName(String First_Name) {
        firstName = First_Name;
    }
    public String getlastName() {
        return lastName;
    }
    public void setlastName(String Last_Name) {
        lastName = Last_Name;
    }

    //setters for module marks
    public void setModule1(CW001 module1) {
        this.mod1 = module1;
    }
    public void setModule2(EX002 module2) {
        this.mod2 = module2;
    }
    public void setModule3(CE003 module3) {
        this.mod3 = module3;
    }

    //methods for getting marks of each module using arrays
    public double[] getModule1() {
        double[] mod1marks = {(this.mod1.gethwk1()+this.mod1.gethwk2()+this.mod1.gethwk3())/3.0, this.mod1.getproject(), this.mod1.printfinalMark()};
        return mod1marks;
    }
    public double getModule2() {
        double mod2marks = this.mod2.getexam();
        return mod2marks;
    }
    public double[] getModule3() {
        double[] mod3marks = {(this.mod3.gethwk4()+this.mod3.gethwk5()+this.mod3.gethwk6()+this.mod3.gethwk7())/4.0, this.mod3.getexam2(), this.mod3.printfinalMark()};
        return mod3marks;
    }

    //methods for printing marks for all modules or for a particular module with Student parameter
    public void printCW001() {
        System.out.printf("%-10s %-12s %-14.2f %-14s %-10.2f", this.getfirstName(), this.getlastName(), this.getModule1()[0], this.getModule1()[1], this.getModule1()[2]);
    }
    public void printEX002() {
        System.out.printf("%-10s %-12s %-14s", this.getfirstName(), this.getlastName(), this.getModule2());
    }
    public void printCE003() {
        System.out.printf("%-10s %-12s %-14.2f %-14s %-10.2f", this.getfirstName(), this.getlastName(), this.getModule3()[0], this.getModule3()[1], this.getModule3()[2]);
    }
    public void printall() {
        System.out.printf("%-10s %-12s %-14.2f %-14s %-10.2f", this.getfirstName(), this.getlastName(), this.getModule1()[2], this.getModule2(), this.getModule3()[2]);
    }
}
