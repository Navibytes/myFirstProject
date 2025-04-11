import java.time.LocalDate;
import java.time.LocalDateTime;

public class task {
    int id;
    String description="";
    String status = "haven't started";
    LocalDateTime createdAt;
    LocalDateTime updatedAt;


    task(int ID, String desc, LocalDateTime createdAt){
        id = ID;
        description = desc;
        this.createdAt = createdAt;
    }

    public void update(LocalDateTime updatedAtVar){
        updatedAt = updatedAtVar;
        System.out.println("New time is: "+ updatedAt);
    }

    public void mark(boolean done){
        if(done){
            status = "done";
        }
        else{
            status = "in progress";
        }
    }
}
