
package fuvarprogram;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;


public class FuvarProgram {

    
    public static void main(String[] args) throws IOException, ParseException {
        //2.feladat
        
        List<String> sorok = Files.readAllLines(Paths.get("fuvar.csv"));
        ArrayList<Fuvar> fuvarok = new ArrayList<>();
        for (int i = 1; i < sorok.size(); i++) {
            String sor = sorok.get(i);
            fuvarok.add(new Fuvar(sor));
        }
        //3.feladat
        hanyadikFeladat(3);
        System.out.println(fuvarok.size() + " fuvar");
//        //4.feladat
//        hanyadikFeladat(4);
//        int db = 0;
//        double bevetel = 0.0;
//        for (Fuvar fuvar : fuvarok) {
//            if (fuvar.getId()==6185) {
//                db++;
//                bevetel += fuvar.getDij() + fuvar.getBorra();
//            }
//        }
//        System.out.println(db + " fuvar alatt: " + bevetel + "$");
//        //5.feladat
//        hanyadikFeladat(5);
        
        
        
        
        
        
        
        
    }
    
    public static void hanyadikFeladat(int hanyadik){
        System.out.print(hanyadik + ". feladat: ");
    }
    
}
