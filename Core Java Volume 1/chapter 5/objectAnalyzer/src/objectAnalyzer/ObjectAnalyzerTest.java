package objectAnalyzer;

import java.util.ArrayList;

/**
 * @version 1.0 2016/5/5.
 * @author colin
 */
public class ObjectAnalyzerTest {
    public static void main(String[] args){
        ArrayList<Integer> squares = new ArrayList<>();
        for(int i=1; i<=5; i++)
            squares.add(i*i);
        System.out.println(new ObjectAnalyzer().toString(squares));
    }
}
