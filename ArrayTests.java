import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
	}

    @Test
    public void testMyReverseInPlace() {
        int[] input1 = {1,2,3,4,5};
        ArrayExamples.reverseInPlace(input1);
        assertArrayEquals(new int[]{5,4,3,2,1}, input1);
    }
    

  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }

  @Test
  public void testMyReversed() {
      int[] input1 = {1,2,3,4,5};
      int[] input1Rev = ArrayExamples.reversed(input1);
      assertArrayEquals(new int[]{5,4,3,2,1}, input1Rev);
  }
 
}

