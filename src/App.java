import java.util.*;
import java.lang.reflect.Array;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class App {
    static boolean killer = true;
    public static void main(String[] args) throws Exception {
        System.out.println("Welcome to To-do program!");
        Scanner reader = new Scanner(System.in);
        int ID = 0;
        ArrayList<task> taskList =  new ArrayList<task>();
        while (killer){
            System.out.println("Kill program with 'kill'");
            String program = reader.nextLine();
            if (program.equals("kill")){
                killer = false;
            }
            if (program.startsWith("add")){
                program = program.replaceAll("\\s", "");
                System.out.println(program);
                program = program.substring(program.indexOf("d")+2, program.length());
                System.out.println(program);
                LocalDateTime clock = LocalDateTime.now();
                task task = new task(ID, program, clock);
                taskList.add(task);
                System.out.println("Task added succesfully (ID: "+ID+")"+program+clock);
                ++ID;
            }
            if (program.startsWith("update ")){
                program = program.replaceAll("\\s", "");
                System.out.println(program);
                program = program.substring(program.indexOf("e")+1, program.length());
                System.out.println(program);
                int inputID = Integer.parseInt(program);
                System.out.println("you are editing task"+ inputID);
                LocalDateTime clock = LocalDateTime.now();
                taskList.get(inputID).update(clock);
            }
        }

        reader.close();
        System.out.println("end of program");
    }
}
