package FairWork.Lect10_Threads.Demo4;

import com.sun.security.jgss.GSSUtil;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {
    public static void main(String[] args) throws ExecutionException, InterruptedException {


        GreetingsCreator gc = new GreetingsCreator();
        ExecutorService es = Executors.newFixedThreadPool(10);

        Future<String> promiseOfAGreeting = es.submit(gc);

        // any work not related to greeting
        System.out.println("A hello that is not related to the greeting");
        int mult = 2 * 5;
        System.out.println(mult);


        // take greeting
        String greeting = promiseOfAGreeting.get(); // A potentially blocking statement


        System.out.println(greeting);

        es.shutdown();
    }
}
