package quanlysanpham;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
import quanlysanpham.Truyxuatdulieu.DocFile;
import quanlysanpham.Truyxuatdulieu.GhiFile;
import quanlysanpham.Xuly.ThongKe;
import quanlysanpham.cauhinh.CauHinh;

/**
 *
 * @author Phuong
 */
public class Quanlysanpham {

    public static void main(String[] args) {

        System.out.println("Doc du lieu: ");
        ThongKe thongKe = new ThongKe();
        thongKe.thongKeSanPham();
        System.out.println("nhap ten san pham can loc: ");
        String tenSanPham = new Scanner(System.in).nextLine();
        thongKe.locSanPhamTheoTen(tenSanPham);

        System.out.println("Ghi file");
        GhiFile gf = new GhiFile();
        System.out.println("Nhap noi dung ghi file database.txt");
        String contentDatabase = new Scanner(System.in).nextLine();
        gf.ghiData(contentDatabase);
        System.out.println("Nhap noi dung ghi file sanpham.txt");
        String contentSanPham = new Scanner(System.in).nextLine();
        gf.ghiSanPham(contentSanPham);
        
    }

}
