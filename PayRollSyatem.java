
import java.util.ArrayList;

public class PayRollSyatem {
    private ArrayList<Emlpoyee> emlpoyeeList;

    public PayRollSyatem(){
        emlpoyeeList = new ArrayList<>();
    }

    public void addEmployee(Emlpoyee emlpoyee){
        emlpoyeeList.add(emlpoyee);
    }
    public void removeEmployee(int id){
        Emlpoyee emlpoyeeToremove = null;
       for (Emlpoyee emlpoyee : emlpoyeeList) {
           if(emlpoyee.getId() == id){
                emlpoyeeToremove = emlpoyee;
                break;
           }
           else{
                System.out.println("Invaild id Number");
           }
       }
       if(emlpoyeeToremove != null){
            emlpoyeeList.remove(emlpoyeeToremove);
       }
       
    }
    public void desplayEmployee(){
        for(Emlpoyee emlpoyee : emlpoyeeList){
            System.out.println(emlpoyee);
        }
    }
}  
