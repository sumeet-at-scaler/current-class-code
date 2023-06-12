package FairWork.Lect_Begin_RAEH.EH.demo4;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class AnExampleOfCheckedException {

    public static void main(String[] args) {

        try {
            fun();
        } catch(IOException ioex){

        }

    }


    static void fun() throws IOException {
        File f = new File("abc.txt");
        FileReader fr = null;

        try {
            fr = new FileReader(f);
        } catch(FileNotFoundException fnfex){

        }

        fr.read();
    }
}
