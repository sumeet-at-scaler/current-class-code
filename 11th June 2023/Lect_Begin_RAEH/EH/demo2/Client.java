package FairWork.Lect_Begin_RAEH.EH.demo2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        try {
            System.out.println("hello");
            System.out.println("shello");

            Scanner scn = new Scanner(System.in);
            int n = scn.nextInt();

            System.out.println("bye");
            System.out.println("waye");
        } catch(InputMismatchException ex){
            // log the exception
            System.out.println("A bug occurred. It is logged in a log file. Please press send to send the log to developers");
        }

        System.out.println("program has not crashed that is why we are executing this statement.");
    }
}
