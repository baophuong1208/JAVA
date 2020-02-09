package quanlysanpham.Truyxuatdulieu;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DocGhi {

    public String doc(String file) {
        String line = "";
        String result = "";
        try {
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            while ((line = br.readLine()) != null) {
                result += line + "\n";
            }
            br.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(DocGhi.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(DocGhi.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result;
    }

    public void ghiDe(String file, String data) {
        try {
            FileWriter fw = new FileWriter(file,true);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(data);
            bw.close();
        } catch (IOException ex) {
            Logger.getLogger(DocGhi.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    public void ghi(String file, String data){
        FileWriter fw = null;
        try {
            fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(data);
            bw.close();
        } catch (IOException ex) {
            Logger.getLogger(DocGhi.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                fw.close();
            } catch (IOException ex) {
                Logger.getLogger(DocGhi.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    

}
