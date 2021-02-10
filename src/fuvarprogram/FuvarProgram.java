
package fuvarprogram;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;


public class FuvarProgram {

    
    public static void main(String[] args) throws IOException {
        List<String> sorok = Files.readAllLines(Paths.get("fuvar.csv"));
    }
    
}
