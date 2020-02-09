package quanlysanpham.Xuly;

import java.util.List;
import quanlysanpham.Dulieu.SanPham;
import quanlysanpham.Truyxuatdulieu.DocGhi;
import quanlysanpham.Truyxuatdulieu.TruyXuatDuLieuFileSanPham;
import quanlysanpham.cauhinh.CauHinh;

public class XuLySanPham {

    TruyXuatDuLieuFileSanPham doc = new TruyXuatDuLieuFileSanPham();
    String filesPath = CauHinh.filesPath;

    public void SuaSanPham(String tenSanPhamS, int soLuong, String donVi, float gia, String viTri) {
        List<SanPham> list = doc.layTatCaSanPham();
        DocGhi ghi = new DocGhi();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getTen().equals(tenSanPhamS)) {

                list.get(i).setTen(tenSanPhamS);
                list.get(i).setSoluong(soLuong);
                list.get(i).setDonvi(donVi);
                list.get(i).setGia(gia);
                list.get(i).setViTri(viTri);

            }
        }
        String giatri = "";
        for (int j = 0; j < list.size(); j++) {
            giatri = giatri + list.get(j).toString();
        }
        ghi.ghi(filesPath + "\\sanpham.txt", giatri);

    }

    public void xoaSP(String tenSanPhamX) {
        List<SanPham> list = doc.layTatCaSanPham();
        DocGhi ghi = new DocGhi();
        String sp = "";
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getTen().equals(tenSanPhamX)) {
                list.remove(i);
            }
        }
        for (int j = 0; j < list.size(); j++) {
            sp = sp + list.get(j).toString();

        }
        ghi.ghi(filesPath + "\\sanpham.txt", sp);

    }

}
