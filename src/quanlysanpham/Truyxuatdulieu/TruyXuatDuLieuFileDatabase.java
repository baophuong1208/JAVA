
package quanlysanpham.Truyxuatdulieu;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import quanlysanpham.cauhinh.CauHinh;

public class TruyXuatDuLieuFileDatabase {
         String filesPath = CauHinh.filesPath;

    public  void Docdb() {
         System.out.println("File database");
        
        
        BufferedReader br = null;
       
        try {
            String filesPath = CauHinh.filesPath;
//            System.out.println(filesPath+"\\database.txt");
            br = new BufferedReader(new FileReader(filesPath + "\\database.txt"));
            String docdata;

            while ((docdata = br.readLine()) != null) {
                System.out.println(docdata);
//                String[] cat = docdata.split("\\$");
//                for (int i = 0; i < cat.length; i++) {
//                    System.out.println(cat[i]);
//                }

            }

        
        }    catch (FileNotFoundException ex) {
                 Logger.getLogger(TruyXuatDuLieuFileDatabase.class.getName()).log(Level.SEVERE, null, ex);
             } catch (IOException ex) {
                 Logger.getLogger(TruyXuatDuLieuFileDatabase.class.getName()).log(Level.SEVERE, null, ex);
             } finally {
            try {
                br.close();
         
            } catch (IOException ex) {
                 Logger.getLogger(TruyXuatDuLieuFileDatabase.class.getName()).log(Level.SEVERE, null, ex);
             }

    }
  }
    public void ghiData(String contentData) {
        try {
            FileWriter fw = new FileWriter(filesPath+"\\database.txt", true);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(contentData);
            bw.close();
            fw.close();
        } catch (IOException ex) {
        
    }
    
    
    }
    
}
