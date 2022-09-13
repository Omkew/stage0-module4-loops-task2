package school.mjc.stage0.loops.task2;

public class WordsBuilder {
    public void buildPhrase(char... chars) {
        int i = chars.length;
        int j = 0;
        while (j <= i){
            System.out.println(chars);
            j++;
        }
    }
}
