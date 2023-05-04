package FairWork.Lect11_Threads.ParallelMergeSort;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

public class MergeSorter implements Callable<List<Integer>> {
    List<Integer> listToSort;
    ExecutorService es;
    MergeSorter(ExecutorService es, List<Integer> listToSort){
        this.listToSort = listToSort;
        this.es = es;
    }

    @Override
    public List<Integer> call() throws Exception {
        System.out.println(listToSort + " is processed by " + Thread.currentThread().getName());

        if(listToSort.size() <= 1){
            return listToSort;
        }

        List<Integer> firstHalf = new ArrayList<>();
        List<Integer> secondHalf = new ArrayList<>();
        for(int i = 0; i < listToSort.size(); i++){
            if(i < listToSort.size() / 2){
                firstHalf.add(listToSort.get(i));
            } else {
                secondHalf.add(listToSort.get(i));
            }
        }

        MergeSorter sorterForLeftHalf = new MergeSorter(es, firstHalf);
        MergeSorter sorterForRightHalf = new MergeSorter(es, secondHalf);


//        List<Integer> sortedFirstHalf = sorterForLeftHalf.call();
//        List<Integer> sortedSecondHalf = sorterForRightHalf.call();

        Future<List<Integer>> promiseOfSortedFirstHalf = es.submit(sorterForLeftHalf);
        Future<List<Integer>> promiseOfSortedSecondHalf = es.submit(sorterForRightHalf);

        List<Integer> sortedFirstHalf = promiseOfSortedFirstHalf.get();
        List<Integer> sortedSecondHalf = promiseOfSortedSecondHalf.get();
        List<Integer> sortedList = new ArrayList<>();

        int i = 0;
        int j = 0;
        int k = 0;

        while(i < sortedFirstHalf.size() && j < sortedSecondHalf.size()){
            if(sortedFirstHalf.get(i) <= sortedSecondHalf.get(j)){
                sortedList.add(sortedFirstHalf.get(i));
                i++;
                k++;
            } else {
                sortedList.add(sortedSecondHalf.get(j));
                j++;
                k++;
            }
        }

        while(i < sortedFirstHalf.size()){
            sortedList.add(sortedFirstHalf.get(i));
            i++;
            k++;
        }

        while(j < sortedSecondHalf.size()){
            sortedList.add(sortedSecondHalf.get(j));
            j++;
            k++;
        }

        return sortedList;
    }
}
