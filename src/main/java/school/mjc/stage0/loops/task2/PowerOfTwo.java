package school.mjc.stage0.loops.task2;

public class PowerOfTwo {
    public void printPower(int power) {
        int i = 0;
        int s = 2;
        if (power > 0){
            while (i < power){
                s = s * i;
                System.out.println(s);
                i++;
            }
        }
    }
}
