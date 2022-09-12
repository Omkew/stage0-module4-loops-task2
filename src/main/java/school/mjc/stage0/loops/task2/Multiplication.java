package school.mjc.stage0.loops.task2;

public class Multiplication {
    public void printMultiplied(int multiplyByAndToInclusive) {
        int x = 0;
        while (x <= Math.abs(multiplyByAndToInclusive)){
            x *= x;
            System.out.println(x);
        }
    }
}
