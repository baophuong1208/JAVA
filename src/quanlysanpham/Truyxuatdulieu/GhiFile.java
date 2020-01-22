package quanlysanpham.Truyxuatdulieu;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import quanlysanpham.cauhinh.CauHinh;

/**
 *
 * @author Phuong
 */
public class GhiFile {
    String filesPath = CauHinh.filesPath;
    
    public void ghiData(String contentData) {
        try {
            FileWriter fw = new FileWriter(filesPath+"\\database.txt", true);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(contentData);
        } catch (IOException ex) {
            Logger.getLogger(GhiFile.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    public void ghiSanPham(String contentSanPham){
        try {
            FileWriter fw = new FileWriter(filesPath+"\\sanpham.txt", true);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(contentSanPham);
        } catch (IOException ex) {
            Logger.getLogger(GhiFile.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

}
