package quanlysanpham;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Scanner;
import quanlysanpham.Truyxuatdulieu.DocGhiFile;
import quanlysanpham.Xuly.ThongKe;
import quanlysanpham.cauhinh.CauHinh;

/**
 *
 * @author Phuong
 */
public class Quanlysanpham {

    public static void main(String[] args) {
        ThongKe thongKe = new ThongKe();
        thongKe.thongKeSanPham();
        
        System.out.println("nhap ten san pham can loc: ");
        String tenSanPham = new Scanner(System.in).nextLine();
        thongKe.locSanPhamTheoTen(tenSanPham);
        
        
        
    }
    
}
