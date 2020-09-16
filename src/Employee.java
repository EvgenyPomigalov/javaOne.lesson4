import java.util.Calendar;

public class Employee {
   private String fio;
   private double salary;
   private int birthYear;
   private static int indNumber;
   private int id;

    public Employee(String FIO, double salary, int birthYear) {
        this.fio = FIO;
        this.salary = salary;
        this.birthYear = birthYear;
        this.id = ++indNumber;
    }

    public String getFio() {
        return this.fio;
    }

    public double getSalary() {
        return this.salary;
    }

    public int getId() {
        return this.id;
    }

    public int getAge() {
        return  Calendar.getInstance().get(Calendar.YEAR) - this.birthYear;
    }

    public void incrementSalary(double incrementValue) {
        this.salary += incrementValue;
    }

}
