package quanlysanpham.Truyxuatdulieu;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import quanlysanpham.Dulieu.HoaDon;
import quanlysanpham.Dulieu.SanPham;
import quanlysanpham.cauhinh.CauHinh;

public class TruyXuatDuLieuFileHoaDon {

    String filesPath = CauHinh.filesPath;

    public List<HoaDon> DocHD() {
        List<HoaDon> List = new ArrayList<>();
        DocGhi doc = new DocGhi();
        String FileResult = doc.doc(filesPath+"\\hoadon.txt");
        List<String> ListStringData = Arrays.asList(FileResult.split("\\n"));
        for(int i = 0; i<ListStringData.size(); i++){
           HoaDon hd = mapStringToObject(ListStringData.get(i));
           List.add(hd);
        
        }
        
        
        return List;
    }
    private HoaDon mapStringToObject(String data){
        String[] doc = data.split("\\$");
        HoaDon hd = new HoaDon();
                hd.setNgaythanhtoan(doc[0]);
                hd.setDssanpham(doc[1]);
                hd.setThanhtien(Float.parseFloat(doc[2]));    
        return hd;
        
    }
    
    public void ghiData(String contentHD) {
        //ngay_thang$ds_tensp$thanh_tien
        DocGhi ghi = new DocGhi();
        ghi.ghiDe(filesPath+"\\hoadon.txt", contentHD);

    }
}
