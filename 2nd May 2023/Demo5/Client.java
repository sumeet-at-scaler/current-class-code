package FairWork.Lect10_Threads.Demo5;

import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        ExecutorService es = Executors.newFixedThreadPool(10);
        ArrayList<Future<String>> allPromises = new ArrayList<>();

        for(int i = 1; i <= 100; i++){
            GreetingsCreator gc = new GreetingsCreator();
            Future<String> promiseOfAGreeting = es.submit(gc);
            allPromises.add(promiseOfAGreeting);
        }

        System.out.println("Unrelated work");

        for(Future<String> promise: allPromises){
            String greeting = promise.get();
            System.out.println(greeting);
        }

        es.shutdown();
    }
}
