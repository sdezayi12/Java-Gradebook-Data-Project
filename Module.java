//all classes under same Project package
package Project;

//creating abstract superclass
public abstract class Module {
    //attributes for Module
    protected String moduleName;
    protected int status;
    protected double finalMark;

    //constructor for moduleName and status
    public Module(String moduleName, int status) {
        this.moduleName = moduleName;
        this.status = status;
    }

    //getters and setters
    public String getmoduleName() {
        return moduleName;
    }
    public void setmoduleName(String moduleName) {
        this.moduleName = moduleName;
    }
    public int getstatus() {
        return status;
    }
    public void setstatus(int status) {
        this.status = status;
    }

    //abstract method to calculate final mark to be overridden by concrete subclasses
    public abstract double printfinalMark(); //no implementation here
}

