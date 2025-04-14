import java.util.*;
import java.lang.reflect.Array;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class App {
    static boolean killer = true;
    public static void main(String[] args) throws Exception {
        System.out.println("Welcome to Task Managment program!\nYou can do the following:\n1.add(description of task)\n2.update(new description of task)\n3.kill");
        Scanner reader = new Scanner(System.in);
        TaskManager tasky = new TaskManager();
        while (killer){
            System.out.println(" ");
            String program = reader.nextLine();
            if (program.equals("kill")){
                killer = false;
            }
            if (program.startsWith("add")){
                tasky.add(program);
            }
            if (program.startsWith("update ")){
                tasky.update(program);
            }

            if (program.startsWith("list")){
                tasky.list(program);
            }
            
            if(program.startsWith("delete ")){
                tasky.delete(program);
            }

            if(program.startsWith("mark-in-progress ")){
                tasky.mip(program);
            }
            
            if(program.startsWith("mark-done ")){
                tasky.md(program);
            }
            
            if(program.startsWith("list ")){
                tasky.listBy(program);
            }

        }

        reader.close();
        System.out.println("end of program");
    }   
}
