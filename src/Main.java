import java.util.HashSet;
import java.util.Set;

public class Main {

    private static void out(String s1) {
        System.out.println(s1);
    }

    private static void out(int i1) {
        System.out.println(i1);
    }

    private static void out(Integer i2) {
        System.out.println("Jeg er Integer:" + i2);
    }

    private static void out(boolean b1) {
        System.out.println(b1);
    }

    private static void out(double d1) {
        System.out.println(d1);
    }

    private static void out(long l1) {
        System.out.println(l1);
    }

    private static void out(float f1) {
        System.out.println(f1);
    }

    public static void main(String[] args) {
        out('a');
        out('b');
        out('ض');
        out('通');
        for (int i=1590; i<1596; i++) {
            out("i=" + i + (char)i);
        }

        for (int i=36890; i<36900; i++) {
            out("i=" + i + (char)i);
        }

        out(' ');
        Set<Character> characterList = new HashSet<>();
        
                for(int i=0; i<10000000; i++){
                   characterList.add((char)i);
                }
        System.out.println(characterList.size());

    }




}