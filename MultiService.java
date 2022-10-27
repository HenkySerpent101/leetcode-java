import java.util.ArrayList;
import java.util.List;

public class MultiService {

    // Add any necessary member variables here
    private List<Thread> tasks ;
    /* 
     * @param tasks to executed concurrently
     */
    public MultiService(List<Runnable> tasks) {
        List<Thread> threads=new ArrayList<>();
        for(Runnable task:tasks){
            threads.add(new Thread(task));
        }

        // Complete your code here
    }

    /**
     * Starts and executes all the tasks concurrently
     */
    public void executeAll() {
    for(Thread thread:this.tasks){
            thread.start();
        }
        // complete your code here
    }
}