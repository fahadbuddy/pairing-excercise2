import com.sheikh.enterprises.Stack;
import org.junit.Test;

import static org.junit.Assert.*;


public class MainTest {

  @Test
  public void create(){
    Stack s = new Stack();
    assertNotNull(s);
  }

  @Test
  public void initiallyEmpty(){
    Stack s = new Stack();
    int result = s.count();
    int expected = 0;
    assertEquals(expected, result);
  }


  @Test
  public void whenNewStack_And_AddItem_ThenCount1(){
    Stack s = new Stack();
    s.push(123);
    int result = s.count();
    int expected = 1;
    assertEquals(expected, result);
  }

}