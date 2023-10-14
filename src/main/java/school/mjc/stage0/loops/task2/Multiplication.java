package school.mjc.stage0.loops.task2;

public class Multiplication {
    public void printMultiplied(int multiplyByAndToInclusive) {
        int sign = 1;
        if( multiplyByAndToInclusive < 0){
            sign = -1;
            multiplyByAndToInclusive *= -1;
        }
        int k = 0;
        while( k < multiplyByAndToInclusive){
            System.out.println(k);
            k*=multiplyByAndToInclusive;
        }
    }
}
