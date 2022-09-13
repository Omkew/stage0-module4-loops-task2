package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    public void printPrimeNumbers(int printToInclusive) {
        int i = 2;
        int j = 2;
        double max = Math.sqrt(printToInclusive);
        boolean flag = true;

        while (i < printToInclusive){
            while (j <= max){
                if(i % j == 0){
                    flag = false;
                    break;
                }j++;
            }i++;
            if (flag){
                System.out.println(i);
            }
        }
    }
}
