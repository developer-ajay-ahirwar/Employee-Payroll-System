public class PartTimeEmployee extends Emlpoyee{
    private int hoursWorld;
    private double hourlyRate;
    public PartTimeEmployee(String name , int id , int hoursWorld , double hourlyRate){
        super(name, id);
        this.hourlyRate = hourlyRate;
        this.hoursWorld = hoursWorld;
    }

    @Override
    public double calculateSalary(){
        return hourlyRate * hoursWorld;
    }
}
