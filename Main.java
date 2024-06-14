public class Main {
    public static void main(String[] args){
        PayRollSyatem payRollSyatem = new PayRollSyatem();
        FullTimeEmployee fEmployee_1 = new FullTimeEmployee("Ajay", 001, 100000);
        payRollSyatem.addEmployee(fEmployee_1);
        PartTimeEmployee pEmployee_1 = new PartTimeEmployee("Rohit", 101, 51, 25);
        payRollSyatem.addEmployee(pEmployee_1);
        payRollSyatem.desplayEmployee();
    }
}
