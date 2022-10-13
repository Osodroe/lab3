import static org.junit.Assert.*;
import org.junit.*;
import java.util.ArrayList;
import java.util.List;

public class ListTests {
	@Test
    public void filter4() {
        List<String> input1 = new ArrayList<>();
        List<String> expected1 = new ArrayList<>();
        StringChecker sc = new StringCheck();
        input1.add("sandwich");
        input1.add("crab");
        input1.add("sand");
        input1.add("Towers");
        expected1.add("sandwich");
        expected1.add("Towers");
        assertEquals(expected1, ListExamples.filter(input1, sc));
    }
}
