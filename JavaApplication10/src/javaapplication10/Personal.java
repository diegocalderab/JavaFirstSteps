package javaapplication10;

/**
 *
 * @author diego
 */
public class Personal {
    private String name;
    private String jobPosition;
    private double salary;

    public Personal(String name, String jobPosition, double salary) {
        this.name = name;
        this.jobPosition = jobPosition;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJobPosition() {
        return jobPosition;
    }

    public void setJobPosition(String jobPosition) {
        this.jobPosition = jobPosition;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Personal{" + "Nombre=" + name + ", Cargo=" + jobPosition + ", Salario=" + salary + '}';
    }
    
    
}
