package quanlysanpham.Xuly;

import java.util.ArrayList;
import java.util.List;
import quanlysanpham.Dulieu.SanPham;
import quanlysanpham.Truyxuatdulieu.TruyXuatDuLieuFileSanPham;

/**
 *
 * @author Phuong
 */
public class ThongKe {

//    DocFile docFile;
    TruyXuatDuLieuFileSanPham docFile;

    public ThongKe() {
        docFile = new TruyXuatDuLieuFileSanPham();
    }

    public TruyXuatDuLieuFileSanPham getDocFile() {
        return docFile;
    }

    public void setDocFile(TruyXuatDuLieuFileSanPham docFile) {
        this.docFile = docFile;
    }
    

    public void in(List<SanPham> list) {
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
        List<SanPham> list = docFile.layTatCaSanPham();
        in(list);
    }

    public void locSanPhamTheoTen(String tenSanPham) {
        List<SanPham> list = docFile.layTatCaSanPham();
        List<SanPham> list2 = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getTen().equals(tenSanPham)) {
                list2.add(list.get(i));
            }
        }
        in(list2);

    }
}
