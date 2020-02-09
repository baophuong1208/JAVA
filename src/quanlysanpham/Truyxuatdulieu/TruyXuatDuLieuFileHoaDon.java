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
    
        
//        List<HoaDon> list = new ArrayList<>();
//        BufferedReader br = null;
//        try {
//            String filesPath = CauHinh.filesPath;
//            br = new BufferedReader(new FileReader(filesPath + "\\hoadon.txt"));
//            String dochoadon;
//                HoaDon hd=null;
//            while ((dochoadon = br.readLine()) != null) {
//                String[] doc = dochoadon.split("\\$");
//                hd = new HoaDon();
//                hd.setNgaythanhtoan(doc[0]);
//                hd.setDssanpham(doc[1]);
//                hd.setThanhtien(Float.parseFloat(doc[2]));
//              list.add(hd);  
//            }
//            
//
//        } catch (FileNotFoundException ex) {
//            Logger.getLogger(TruyXuatDuLieuFileHoaDon.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (IOException ex) {
//            Logger.getLogger(TruyXuatDuLieuFileHoaDon.class.getName()).log(Level.SEVERE, null, ex);
//        } finally {
//            try {
//                br.close();
//
//            } catch (IOException ex) {
//                Logger.getLogger(TruyXuatDuLieuFileHoaDon.class.getName()).log(Level.SEVERE, null, ex);
//            }
//
//        }
//        return list;

    

    public void ghiData(String contentHD) {
        //ngay_thang$ds_tensp$thanh_tien
        DocGhi ghi = new DocGhi();
        ghi.ghiDe(filesPath+"\\hoadon.txt", contentHD);
//        try {
//            FileWriter fw = new FileWriter(filesPath + "\\hoadon.txt", true);
//            
//            BufferedWriter bw = new BufferedWriter(fw);
//            bw.write(contentHD);
//            bw.close();
//            fw.close();
//        } catch (IOException ex) {
//            Logger.getLogger(TruyXuatDuLieuFileHoaDon.class.getName()).log(Level.SEVERE, null, ex);
//        }
    }

    public void suaHD(String ngayThangCanTim, String dsspCanTim, String ngayThangSua, String dsspSua, float thanhtien) {
        List<HoaDon> list = DocHD();
        DocGhi ghi = new DocGhi();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getNgaythanhtoan().equals(ngayThangCanTim) && list.get(i).getDssanpham().equals(dsspCanTim)) {
                list.get(i).setNgaythanhtoan(ngayThangSua);
                list.get(i).setDssanpham(dsspSua);
                list.get(i).setThanhtien(thanhtien);
                
            }
        }
        String suahd = "";
//        FileWriter fw = null;
        for (int j = 0; j < list.size(); j++) {
            suahd = suahd + list.get(j).toString();
//            try {
//                fw = new FileWriter(filesPath + "\\hoadon.txt");
//                BufferedWriter bw = new BufferedWriter(fw);
//                bw.write(suahd);
//                bw.close();
//            } catch (IOException ex) {
//                Logger.getLogger(TruyXuatDuLieuFileHoaDon.class.getName()).log(Level.SEVERE, null, ex);
//            } finally {
//                try {
//                    fw.close();
//                } catch (IOException ex) {
//                    Logger.getLogger(TruyXuatDuLieuFileHoaDon.class.getName()).log(Level.SEVERE, null, ex);
//                }
//            }
        }
        ghi.ghi(filesPath+"\\hoadon.txt", suahd);
        

    }
    
    public void xoaHD(String ngayThangX, String dsspX){
        List<HoaDon> list = DocHD();
        DocGhi ghi = new DocGhi();
        String hd ="";
        for (int i=0; i<list.size(); i++){
            if(list.get(i).getNgaythanhtoan().equals(ngayThangX)&&list.get(i).getDssanpham().equals(dsspX)){
                list.remove(i);
            
            }
        }
        for (int j=0; j<list.size(); j++){
//        FileWriter fw = null;
//            try {
                hd = hd+ list.get(j).toString();
//                fw = new FileWriter(filesPath+"\\hoadon.txt");
//                BufferedWriter bw = new BufferedWriter(fw);
//                bw.write(hd);
//                bw.close();
//            } catch (IOException ex) {
//                Logger.getLogger(TruyXuatDuLieuFileHoaDon.class.getName()).log(Level.SEVERE, null, ex);
//            } finally {
//                try {
//                    fw.close();
//                } catch (IOException ex) {
//                    Logger.getLogger(TruyXuatDuLieuFileHoaDon.class.getName()).log(Level.SEVERE, null, ex);
//                }
//            }
        
        }
        ghi.ghi(filesPath+"\\hoadon.txt", hd);
        
    }

}
