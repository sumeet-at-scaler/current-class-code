package FairWork.Lect10_Threads.Demo5;

import java.util.Random;
import java.util.concurrent.Callable;

public class GreetingsCreator implements Callable<String>  {
    Random r = new Random();

    @Override
    public String call() throws Exception {
        int num = Math.abs(r.nextInt()) % 5;

        if(num == 0){
            return "Hello from " + Thread.currentThread().getName();
        } else if(num == 1){
            return "Hi from " + Thread.currentThread().getName();
        } else if(num == 2){
            return "Namaste from " + Thread.currentThread().getName();
        } else if(num == 3){
            return "Namaskar from " + Thread.currentThread().getName();
        } else if(num == 4){
            return "Hola from " + Thread.currentThread().getName();
        } else {
            return "No Greeting for you from " + Thread.currentThread().getName();
        }
    }
}
