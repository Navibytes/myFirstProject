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

    public void updateTime(LocalDateTime updatedAtVar){
        updatedAt = updatedAtVar;
        System.out.println("New time is: "+ updatedAt);
    }

    public void updateDesc(String desc){
        description = desc;
    }

    public void list(){
        System.out.println(id+"\n"+description+"\n"+status+"\n"+createdAt+"\n"+updatedAt);
    }

    public void mark(boolean done){
        if(done){
            status = "done";
        }
        else{
            status = "in progress";
        }
    }

    public String getStatus() {
        return status;
    }

    @Override
    public String toString(){
        return "ID: "+ id + "\n" + "Description:" + description + "\n" + "Status: " + status + "\n"+ "Created at: " + createdAt + "\n" + "Updated at: " + updatedAt + "\n";
    }
}
