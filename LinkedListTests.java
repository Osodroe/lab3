import static org.junit.Assert.*;
import org.junit.*;

public class LinkedListTests {
	@Test
	public void prependTest1() {
    LinkedList input1 = new LinkedList();
    int[] expected1 = {1,2,3,4,5};
    input1.prepend(5);
    input1.prepend(4);
    input1.prepend(3);
    input1.prepend(2);
    input1.prepend(1);
    
    Node iter = input1.root;
    for(int expected: expected1) {
      assertEquals(expected, iter.value);
      if(iter.next != null) {iter = iter.next;}
    }
  }
   
  @Test
  public void appendTest1() {
    LinkedList input1 = new LinkedList();
    int[] expected1 = {1,2,3,4,5};
    input1.append(1);
    input1.append(2);
    input1.append(3);
    input1.append(4);
    input1.append(5);
    
    Node iter = input1.root;
    for(int expected: expected1) {
      assertEquals(expected, iter.value);
      if(iter.next != null) {iter = iter.next;}
    }
  }

  @Test
  public void firstTest1() {
    LinkedList input1 = new LinkedList();
    int expected1 = 1;
    input1.append(1);
    assertEquals(expected1, input1.first());
  }
  
  @Test(expected=java.util.NoSuchElementException.class)
  public void lastTest1() {
    LinkedList input1 = new LinkedList();
    input1.last();
  }

  @Test
  public void lastTest2() {
    LinkedList input1 = new LinkedList();
    int expected1 = 1;
    input1.append(1);
    assertEquals(expected1, input1.last());
  }

  @Test
  public void lastTest3() {
    LinkedList input1 = new LinkedList();
    int expected1 = 2;
    input1.append(1);
    input1.append(2);
    assertEquals(expected1, input1.last());
  }

  @Test
  public void toStringTest1() {
    LinkedList input1 = new LinkedList();
    String expected1 = "";
    assertEquals(expected1, input1.toString());
  }

  @Test
  public void toStringTest2() {
    LinkedList input1 = new LinkedList();
    String expected1 = "1 ";
    input1.append(1);
    assertEquals(expected1, input1.toString());
  }

  @Test
  public void toStringTest3() {
    LinkedList input1 = new LinkedList();
    String expected1 = "1 2 ";
    input1.append(1);
    input1.append(2);
    assertEquals(expected1, input1.toString());
  }

  @Test
  public void toStringTest4() {
    LinkedList input1 = new LinkedList();
    String expected1 = "1 -2 5 -2 -6 ";
    input1.append(1);
    input1.append(-2);
    input1.append(5);
    input1.append(-2);
    input1.append(-6);
    assertEquals(expected1, input1.toString());
  }

  @Test
  public void lengthTest() {
    LinkedList input1 = new LinkedList();
    int expected1 = 5;
    input1.append(1);
    input1.append(2);
    input1.append(3);
    input1.append(4);
    input1.append(5);
    assertEquals(expected1, input1.length());
  }
}
