package school.mjc.stage0.loops.task2;

public class WordsBuilder {
    public void buildPhrase(char... chars) {
        String s = "";
        for( char c : chars){
            s+= c;
        }
        System.out.print(s);

    }
}
