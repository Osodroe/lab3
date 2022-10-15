import static org.junit.Assert.*;
import org.junit.*;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileExampleTests {
	@Test
	public void getFiles1() throws IOException {
    FileExample input1 = new FileExample();
    List<File> expected1 = new ArrayList<>();
    File path = new File("some-files/");
    File[] FileList = path.listFiles();

    for(File subFile: FileList) {
      if(subFile.listFiles() != null){
        File paths[] = subFile.listFiles();
        for(File subFile2: paths) {
          expected1.add(subFile2);
        }
      }
      else {
        expected1.add(subFile);
      }
    }

    assertEquals(expected1, input1.getFiles(path));
  }

  @Test
	public void getFiles2() throws IOException {
    FileExample input1 = new FileExample();
    List<File> expected1 = new ArrayList<>();
    File path = new File("some-files/more-files");
    File[] FileList = path.listFiles();

    for(File subFile: FileList) {
      if(subFile.listFiles() != null){
        File paths[] = subFile.listFiles();
        for(File subFile2: paths) {
          expected1.add(subFile2);
        }
      }
      else {
        expected1.add(subFile);
      }
    }

    assertEquals(expected1, input1.getFiles(path));
  }

  @Test
	public void getFiles3() throws IOException {
    FileExample input1 = new FileExample();
    List<File> expected1 = new ArrayList<>();
    File path = new File("some-files/a.txt");
    expected1.add(path);
  

    assertEquals(expected1, input1.getFiles(path));
  }
}


