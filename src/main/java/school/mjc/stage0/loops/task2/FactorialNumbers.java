package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {
        System.out.println(1);
        int k = 1;
        int res = 1;
        while ( k <= printToInclusive){
            System.out.println(res);
            k++;

            res *= k;
        }
    }
}
