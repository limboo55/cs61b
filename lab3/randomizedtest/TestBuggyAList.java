package randomizedtest;

import edu.princeton.cs.algs4.StdRandom;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by hug.
 */
public class TestBuggyAList {
  // YOUR TESTS HERE
    @Test
    public void randomizedTest(){
        AListNoResizing<Integer> Ar = new AListNoResizing<>();
        BuggyAList<Integer> Ba =new BuggyAList<>();

        int N = 5000;
        for (int i = 0; i < N; i += 1) {
            int operationNumber = StdRandom.uniform(0, 4);
            if (operationNumber == 0) {
                // addLast
                int randVal = StdRandom.uniform(0, 100);
                Ar.addLast(randVal);
                Ba.addLast(randVal);

            } else if (operationNumber == 1) {
                // size

                assertEquals(Ar.size(),Ba.size());
            }
             else if (operationNumber == 2 && Ar.size()>0 && Ba.size()>0){

                assertEquals(Ar.getLast(),Ba.getLast());
            }
            else if (operationNumber == 3 && Ar.size()>0 && Ba.size()>0){
                int Artemp = Ar.removeLast();
                int Batemp = Ba.removeLast();

                assertEquals(Artemp,Batemp);
            }


        }

    }


}
