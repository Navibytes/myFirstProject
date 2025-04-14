import java.util.ArrayList;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class TaskManager {
    int ID = 0;
    ArrayList<task> taskList =  new ArrayList<task>();

    public void add(String input){
        String description = returnDesc(input);             
        LocalDateTime clock = LocalDateTime.now();
        task task = new task(ID, description, clock);
        taskList.add(task);
        System.out.println("Task added succesfully (ID: "+ID+")");
        ++ID;
    }

    public void update(String input){
        int inputID = returnID(input);
        System.out.println("you are editing task"+ inputID);
        LocalDateTime clock = LocalDateTime.now();
        taskList.get(inputID).updateTime(clock);
        taskList.get(inputID).updateDesc(returnNewDesc(input));
    }

    public void list(String input){
        for(int i = 0; i < taskList.size(); i++){
            System.out.println(taskList.get(i));
        }
    }

    public void delete(String input){
        int index = returnID(input);
        taskList.remove(index);
    }

    public void mip(String input){
        int index = returnID(input);
        taskList.get(index).mark(false);
    }
    
    public void md(String input){
        int index = returnID(input);
        taskList.get(index).mark(true);
    }

    public void listBy(String input){
        String type = returnDesc(input);
        for (int i = 0; i < taskList.size(); )
    }

    public static String returnDesc(String input){
        String[] splitString = input.split(" ");
        System.out.println(splitString[1]);
        return splitString[1];
    }

    public static int returnID(String input){
        String [] splitString = input.split(" ");
        System.out.println(splitString[1]);
        return Integer.parseInt(splitString[1]);
    }

    public static String returnNewDesc(String input){
        String [] splitString = input.split(" ");
        System.out.println(splitString[2]);
        return (splitString[2]);
    }

}
