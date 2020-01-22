package quanlysanpham.Xuly;

import java.util.ArrayList;
import java.util.List;
import quanlysanpham.Dulieu.SanPham;
import quanlysanpham.Truyxuatdulieu.DocFile;

/**
 *
 * @author Phuong
 */
public class ThongKe {

    DocFile docFile;

    public ThongKe() {
        docFile = new DocFile();
    }

    public ThongKe(DocFile docFile) {
        this.docFile = docFile;
    }

    private void in(List<SanPham> list) {
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
