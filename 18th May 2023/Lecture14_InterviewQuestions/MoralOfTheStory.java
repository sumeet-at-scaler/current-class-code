package FairWork.Lecture14_InterviewQuestions;

public class MoralOfTheStory {
    public static void main(String[] args) {
        int n = 1000000;
        fun2(n);
    }

    // 10 -> 6
    // 100 -> 7
    // 1000 -> 9
    // 10000 -> 36
    // 100000 -> 1184
    // 1000000 -> got tired of waiting
    static void fun1(int n){
        long starting = System.currentTimeMillis();

        String s = "";
        for(int i = 1; i <= n; i++){
            s += i;
        }

        long ending = System.currentTimeMillis();
        long duration = ending - starting;
        System.out.println("For a loop of size " + n + ", time taken = " + duration);
    }

    // 10 -> 0
    // 100 -> 0
    // 1000 -> 0
    // 10000 -> 1
    // 100000 -> 5
    // 1000000 -> 18
    static void fun2(int n){
        long starting = System.currentTimeMillis();

        StringBuilder sb = new StringBuilder("");
        for(int i = 1; i <= n; i++){
            sb.append(i);
        }

//        System.out.println(sb.toString());
        long ending = System.currentTimeMillis();
        long duration = ending - starting;
        System.out.println("For a loop of size " + n + ", time taken = " + duration);

    }
}
