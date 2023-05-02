package FairWork.Lect10_Threads.Demo4;

import java.util.Random;
import java.util.concurrent.Callable;

public class GreetingsCreator implements Callable<String>  {
    Random r = new Random();

    @Override
    public String call() throws Exception {
        int num = Math.abs(r.nextInt()) % 5;

        if(num == 0){
            return "Hello";
        } else if(num == 1){
            return "Hi";
        } else if(num == 2){
            return "Namaste";
        } else if(num == 3){
            return "Namaskar";
        } else if(num == 4){
            return "Hola";
        } else {
            return "No Greeting for you";
        }
    }
}
