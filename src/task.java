import java.time.LocalDate;

public class task {
    int id;
    String description="";
    String status = "haven't started";

    task(int ID, String desc ){
        id = ID;
        description = desc;
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
