/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

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
        return "Personal{" + "name=" + name + ", jobPosition=" + jobPosition + ", salary=" + salary + '}';
    }
    
    
}
