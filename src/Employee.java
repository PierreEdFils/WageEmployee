
public class Employee {
    private int baseSalary;
    private int hourlyRate;

    public Employee(int baseSalary, int hourlyRate) {
        this.baseSalary = baseSalary;
        this.hourlyRate = hourlyRate;
    }

    public  int calculateWage(int extraHours) {
        return baseSalary + (extraHours* getHourlyRate());
    }
     public void setBaseSalary(int baseSalary){
        if (baseSalary <= 0)
            throw  new IllegalArgumentException("Salary cannot be 0 or less ");
        this.baseSalary = baseSalary;
    }

    private int getBaseSalary() {
        return baseSalary;
    }

    private int getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(int hourlyRate) {
        if (hourlyRate <= 0)
            throw  new IllegalArgumentException("hourly rate  cannot be 0 or negative ");
        this.hourlyRate = hourlyRate;
    }
}
