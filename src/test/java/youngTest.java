import org.junit.Test;
import static org.junit.Assert.*;
public class youngTest {
    @Test
    public void YoungTest(){
        int zarr[]={6,5,4};
        Young n = new Young();
        assertTrue(n.YoungTest(2 , new int[]{0, 0, 0,0,0,0})=="YES");// in range and all same
        assertTrue(n.YoungTest(2 , new int[]{10, 20, 30,-10,-20,-30})=="YES");//in range and equilibrium
        assertTrue(n.YoungTest(2 , new int[]{-100, -100, -100,100,100,100})=="YES");//negative and positive boundary
        assertTrue(n.YoungTest(2 , new int[]{100, 100, 100,-100,-100,-100})=="YES");//positive and negative boundary
        assertTrue(n.YoungTest(2 , new int[]{10,20,30,40,50,60})=="NO"); // positive in range
        assertTrue(n.YoungTest(2 , new int[]{-10,-20,-30,-40,-50,-60})=="NO");// negative in range
        assertTrue(n.YoungTest(8 , new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0})=="YES");// 8 lines equal
        assertTrue(n.YoungTest(8 , new int[]{1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0})=="NO");// 8 lines not equal
        assertTrue(n.YoungTest(2 , new int[]{-101, -101, -101,101,101,101})=="NO");// out range but equilibrium
        assertTrue(n.YoungTest(2 , new int[]{-101, -101, -101,102,102,102})=="NO");// out range and not equilibrium
        assertTrue(n.YoungTest(0 , new int[]{0, 0, 0,0,0,0,0,0,0})=="NO");// number of lines is 0
        assertTrue(n.YoungTest(-10 , new int[]{0, 0, 0,0,0,0,0,0,0})=="NO");// number of lines is negative
    }
}
