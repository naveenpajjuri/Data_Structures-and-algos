import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Demonstration {
    public static void main( String args[] ) throws Exception {
      ExecutorService threadPool = Executors.newFixedThreadPool(5); 
      
      Callable<Integer> someTask = new Callable<Integer>() {

            public Void call() throws Exception {
                System.out.println("Running");
                return 7;
            }
        };
      
      threadPool.submit(someTask).get();
      
      System.out.println( "Program Exiting" );
    }
}