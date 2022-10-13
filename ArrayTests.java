import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace1() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
	}


  @Test
  public void testReversed0() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }

  @Test
  public void testReverseInPlace4() {
    int[] input1 = {5, 6, 8, 20};
    int[] expected1 = {20, 8, 6, 5}; 
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(expected1, input1);
  }

  @Test
  public void testReversed4() {
    int[] input1 = {5, 6, 8, 20};
    int[] expected1 = {20, 8, 6, 5}; 
    assertArrayEquals(expected1, ArrayExamples.reversed(input1));
  }

  @Test 
  public void testAverageWithoutLowest4() {
    double[] input1 = {5, 5, 8, 20};
    double expected1 = 33.0/3.0;
    assertEquals(expected1, ArrayExamples.averageWithoutLowest(input1), 0.1);
  }
  
}
