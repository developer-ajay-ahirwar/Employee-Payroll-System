public abstract class Emlpoyee {
    private String name;
    private int id;
    public Emlpoyee(String name , int id){
        this.name = name;
        this.id = id;
    }
    public String getName(){
        return name;
    }
    public int getId(){
        return id;
    }

    public abstract double calculateSalary();
    @Override
    public String toString(){
        return "Employee{name="+name+" \n id="+id+" \n Salary="+calculateSalary()+"}";
    }

}
