package quanlysanpham.Truyxuatdulieu;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import quanlysanpham.Dulieu.HoaDon;
import quanlysanpham.Dulieu.SanPham;
import quanlysanpham.cauhinh.CauHinh;

public class TruyXuatDuLieuFileHoaDon {

    String filesPath = CauHinh.filesPath;

    public List<HoaDon> DocHD(){
        List<HoaDon> list = new ArrayList<>();
        BufferedReader br = null;
        try {
            String filesPath = CauHinh.filesPath;
            br = new BufferedReader(new FileReader(filesPath + "\\hoadon.txt"));
            String dochoadon;
            HoaDon hd = new HoaDon();
            while ((dochoadon = br.readLine()) != null) {
                String[] doc = dochoadon.split("\\$");
                hd.setNgaythanhtoan(doc[0]);
                hd.setDssanpham(doc[1]);
                hd.setThanhtien(Float.parseFloat(doc[2]));
                list.add(hd);
            }

        } catch (FileNotFoundException ex) {
            Logger.getLogger(TruyXuatDuLieuFileHoaDon.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(TruyXuatDuLieuFileHoaDon.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                br.close();

            } catch (IOException ex) {
                Logger.getLogger(TruyXuatDuLieuFileHoaDon.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
        return list;

    }

    public void ghiData(String contentData) {
        try {
            FileWriter fw = new FileWriter(filesPath + "\\hoadon.txt", true);
            //ngay_thang$ds_tensp$so_luong$thanh_tien
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(contentData);
            bw.close();
            fw.close();
        } catch (IOException ex) {
            Logger.getLogger(TruyXuatDuLieuFileHoaDon.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void suaDatabase(String ngayThang, String tensp) {

    }

}
