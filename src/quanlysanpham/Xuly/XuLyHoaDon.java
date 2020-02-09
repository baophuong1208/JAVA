
package quanlysanpham.Xuly;

import java.util.List;
import quanlysanpham.Dulieu.HoaDon;
import quanlysanpham.Truyxuatdulieu.DocGhi;
import quanlysanpham.Truyxuatdulieu.TruyXuatDuLieuFileHoaDon;
import quanlysanpham.cauhinh.CauHinh;

public class XuLyHoaDon {
        String filesPath = CauHinh.filesPath;
        TruyXuatDuLieuFileHoaDon doc = new TruyXuatDuLieuFileHoaDon();
    public void suaHD(String ngayThangCanTim, String dsspCanTim, String ngayThangSua, String dsspSua, float thanhtien) {
        List<HoaDon> list = doc.DocHD();
        DocGhi ghi = new DocGhi();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getNgaythanhtoan().equals(ngayThangCanTim) && list.get(i).getDssanpham().equals(dsspCanTim)) {
                list.get(i).setNgaythanhtoan(ngayThangSua);
                list.get(i).setDssanpham(dsspSua);
                list.get(i).setThanhtien(thanhtien);
                
            }
        }
        String suahd = "";
        for (int j = 0; j < list.size(); j++) {
            suahd = suahd + list.get(j).toString();
        }
        ghi.ghi(filesPath+"\\hoadon.txt", suahd);
    }
    
        public void xoaHD(String ngayThangX, String dsspX){
        List<HoaDon> list = doc.DocHD();
        DocGhi ghi = new DocGhi();
        String hd ="";
        for (int i=0; i<list.size(); i++){
            if(list.get(i).getNgaythanhtoan().equals(ngayThangX)&&list.get(i).getDssanpham().equals(dsspX)){
                list.remove(i);
            
            }
        }
        for (int j=0; j<list.size(); j++){
            hd = hd + list.get(j).toString();
        }
        ghi.ghi(filesPath+"\\hoadon.txt", hd);
        
    }

    
}
