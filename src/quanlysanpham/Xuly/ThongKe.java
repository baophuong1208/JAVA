package quanlysanpham.Xuly;

import java.util.ArrayList;
import java.util.List;
import quanlysanpham.Dulieu.HoaDon;
import quanlysanpham.Dulieu.SanPham;
import quanlysanpham.Truyxuatdulieu.TruyXuatDuLieuFileHoaDon;
import quanlysanpham.Truyxuatdulieu.TruyXuatDuLieuFileSanPham;

/**
 *
 * @author Phuong
 */
public class ThongKe {
    TruyXuatDuLieuFileSanPham docFileSP;
    TruyXuatDuLieuFileHoaDon docFileHD;
    public ThongKe() {
        docFileSP = new TruyXuatDuLieuFileSanPham();
        docFileHD = new TruyXuatDuLieuFileHoaDon();
    }

    public TruyXuatDuLieuFileSanPham getDocFileSP() {
        return docFileSP;
    }

    public void setDocFileSP(TruyXuatDuLieuFileSanPham docFileSP) {
        this.docFileSP = docFileSP;
    }

    public TruyXuatDuLieuFileHoaDon getDocFileHD() {
        return docFileHD;
    }

    public void setDocFileHD(TruyXuatDuLieuFileHoaDon docFileHD) {
        this.docFileHD = docFileHD;
    }

    public ThongKe(TruyXuatDuLieuFileSanPham docFileSP, TruyXuatDuLieuFileHoaDon docFileHD) {
        this.docFileSP = docFileSP;
        this.docFileHD = docFileHD;
    }

    public void insp(List<SanPham> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i).getTen());
            System.out.print(list.get(i).getSoluong());
            System.out.print(list.get(i).getDonvi());
            System.out.print(list.get(i).getGia());
            System.out.print(list.get(i).getViTri());
            System.out.println("");

        }
    }

    public void thongKeSanPham() {
        List<SanPham> listsp = docFileSP.layTatCaSanPham();
        insp(listsp);
    }

    public void locSanPhamTheoTen(String tenSanPham) {
        List<SanPham> listsp = docFileSP.layTatCaSanPham();
        List<SanPham> list2 = new ArrayList<>();
        for (int i = 0; i < listsp.size(); i++) {
            if (listsp.get(i).getTen().equals(tenSanPham)) {
                list2.add(listsp.get(i));
            }
        }
        insp(list2);

    }

    public void inhd(List<HoaDon> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i).getNgaythanhtoan());
            System.out.print(list.get(i).getDssanpham());
            System.out.print(list.get(i).getThanhtien());
            System.out.println("");

        }
    }

    public void thongKeHoaDon() {
        List<HoaDon> listhd = docFileHD.DocHD();
        inhd(listhd);

    }
}
