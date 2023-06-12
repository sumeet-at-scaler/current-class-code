package FairWork.Lect_Begin_RAEH.EH.demo4;

import java.util.Scanner;

public class AnExampleOfUncheckedException {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int x = scn.nextInt();
        int y = 0;

        do {
            y = scn.nextInt();
            if(y == 0){
                System.out.println("Wrong value, y can't be 0.");
            } else {
                // no code
            }
        } while(y == 0);

        int res = x / y;
        System.out.println(res);
    }

}
