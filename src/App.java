import java.util.*;
import java.time.LocalDate;

public class App {
    static boolean killer = true;
    public static void main(String[] args) throws Exception {
        System.out.println("Welcome to To-do program!");
        Scanner reader = new Scanner(System.in);
        int ID = 1;
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
                task task = new task(ID, program);
                System.out.println("Task added succesfully (ID: "+ID+")"+program);
                ++ID;
            }
            if (program.startsWith("edit task ID")){
                program = program.replaceAll("\\s", "");
                System.out.println(program);
                program = program.substring(program.indexOf("D")+1, program.length());
                System.out.println(program);
                int inputID = Integer.parseInt(program);
                System.out.println("you are editing task"+ inputID);
            }
        }

        reader.close();
        System.out.println("end of program");
    }
}
