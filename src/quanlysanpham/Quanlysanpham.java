package quanlysanpham;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
import quanlysanpham.Dulieu.LoaiSanPham;
import quanlysanpham.Truyxuatdulieu.TruyXuatDuLieuFileHoaDon;
import quanlysanpham.Truyxuatdulieu.TruyXuatDuLieuFileSanPham;
import quanlysanpham.Xuly.ThongKe;
import quanlysanpham.cauhinh.CauHinh;

/**
 *
 * @author Phuong
 */
public class Quanlysanpham {

    public static void main(String[] args) {
        ThongKe thongKe = new ThongKe();
        System.out.println("Doc file san pham.txt: ");
        thongKe.thongKeSanPham();
        System.out.println("Doc file hoadon.txt: ");
        thongKe.thongKeHoaDon();
        System.out.println("nhap ten san pham can loc: ");
        String tenSanPham = new Scanner(System.in).nextLine();
        thongKe.locSanPhamTheoTen(tenSanPham);

        System.out.println("Ghi file");            
        System.out.println("Nhap noi dung ghi file hoadon.txt");
        TruyXuatDuLieuFileHoaDon ghidata = new TruyXuatDuLieuFileHoaDon();
        String contentDatabase = new Scanner(System.in).nextLine();
        ghidata.ghiData(contentDatabase);
        System.out.println("Nhap noi dung ghi file sanpham.txt");
        TruyXuatDuLieuFileSanPham ghisp = new TruyXuatDuLieuFileSanPham();
        String contentSanPham = new Scanner(System.in).nextLine();
        ghisp.ghiSanPham(contentSanPham);
        
        
        
        System.out.println("ten sp can sua: ");
        String tenSanPhamS = new Scanner(System.in).nextLine();
        System.out.println("so luong");
        int soLuong = new Scanner(System.in).nextInt();
        System.out.println("Don vi");
        String donVi = new Scanner(System.in).nextLine();
        System.out.println("gia");
        float gia = new Scanner(System.in).nextFloat();
        System.out.println("vi tri");
        String viTri = new Scanner(System.in).nextLine();
//        System.out.println("Loai sp");
        TruyXuatDuLieuFileSanPham sua = new TruyXuatDuLieuFileSanPham();
        sua.SuaSanPham(tenSanPhamS, soLuong, donVi, gia, viTri);
        System.out.println("Xoa san pham theo ten");
        System.out.println("nhap ten san pham can xoa");
        String tenSanPhamX = new Scanner(System.in).nextLine();
        sua.xoaSP(tenSanPhamX);
    
        
    }

}
