public class FullTimeEmployee extends Emlpoyee {
    private double mothlySalary;

    public FullTimeEmployee(String name , int id , double mothlySalary){
        super(name,id);
        this.mothlySalary = mothlySalary;
    }
    @Override
    public double calculateSalary(){
        return mothlySalary;
    }
}
