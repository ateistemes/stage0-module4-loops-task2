package school.mjc.stage0.loops.task2;

public class Multiplication {
    public void printMultiplied(int multiplyByAndToInclusive) {
        int positiveCount = 0;
        int negativeCount = 0;
        if (multiplyByAndToInclusive < 0) {
            while (negativeCount >= multiplyByAndToInclusive) {
                System.out.println(positiveCount * multiplyByAndToInclusive);
                positiveCount++;
                negativeCount--;
            }
        } else if (multiplyByAndToInclusive > 0) {
            while (multiplyByAndToInclusive >= positiveCount) {
                System.out.println(positiveCount * multiplyByAndToInclusive);
                positiveCount++;
            }
        } else {
            System.out.print("");
        }
    }
}