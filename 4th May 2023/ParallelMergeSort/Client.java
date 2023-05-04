package FairWork.Lect11_Threads.ParallelMergeSort;

import java.util.*;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        List<Integer> list = Arrays.asList(2, 7, 9, 1, 4, 3, 6, 8);
        ExecutorService es = Executors.newFixedThreadPool(8);

        MergeSorter ms = new MergeSorter(es, list);
        Future<List<Integer>> promiseOfASortedList = es.submit(ms);

        List<Integer> sortedList = promiseOfASortedList.get();
        System.out.println(sortedList);

        es.shutdown();
    }
}
