package FairWork.Lect_Begin_RAEH.EH.demo3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        try {
            System.out.println("hello");
            System.out.println("shello");

            int n = scn.nextInt();

            if(n == 10){
                return;
            }

            System.out.println("bye");
            System.out.println("waye");
        } catch(InputMismatchException ex){
            // log the exception
            System.out.println("A bug occurred. It is logged in a log file. Please press send to send the log to developers");
        } finally {
            System.out.println("only for testing purposes");
            scn.close();
            // close the files, ports, databases that you are working with
        }

        System.out.println("program has not crashed that is why we are executing this statement.");
    }
}
