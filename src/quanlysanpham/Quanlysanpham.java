package quanlysanpham;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
import quanlysanpham.Truyxuatdulieu.TruyXuatDuLieuFileDatabase;
import quanlysanpham.Truyxuatdulieu.TruyXuatDuLieuFileSanPham;
import quanlysanpham.Xuly.ThongKe;
import quanlysanpham.cauhinh.CauHinh;

/**
 *
 * @author Phuong
 */
public class Quanlysanpham {

    public static void main(String[] args) {
        System.out.println("Doc file san pham.txt: ");
        ThongKe thongKe = new ThongKe();
        thongKe.thongKeSanPham();
        System.out.println("Doc file database.txt: ");
        TruyXuatDuLieuFileDatabase docdb = new TruyXuatDuLieuFileDatabase();
        docdb.Docdb(); 
        System.out.println("nhap ten san pham can loc: ");
        String tenSanPham = new Scanner(System.in).nextLine();
        thongKe.locSanPhamTheoTen(tenSanPham);

        System.out.println("Ghi file");
//        GhiFile gf = new GhiFile();
            
        System.out.println("Nhap noi dung ghi file database.txt");
        TruyXuatDuLieuFileDatabase ghidata = new TruyXuatDuLieuFileDatabase();
        String contentDatabase = new Scanner(System.in).nextLine();
        ghidata.ghiData(contentDatabase);
        System.out.println("Nhap noi dung ghi file sanpham.txt");
        TruyXuatDuLieuFileSanPham ghisp = new TruyXuatDuLieuFileSanPham();
        String contentSanPham = new Scanner(System.in).nextLine();
        ghisp.ghiSanPham(contentSanPham);
        
    }

}
