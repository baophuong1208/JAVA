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
        TruyXuatDuLieuFileSanPham sua = new TruyXuatDuLieuFileSanPham();
        TruyXuatDuLieuFileHoaDon ghiHD = new TruyXuatDuLieuFileHoaDon();

        int n;

        do {
            System.out.println("Menu");
            System.out.println("Thao tac voi file sanppham.txt");
            System.out.println("1: Doc file");
            System.out.println("2: Ghi file");
            System.out.println("3: Loc san pham theo ten");
            System.out.println("4: Sua ");
            System.out.println("5: Xoa");
            System.out.println("Thao tac voi file hoadon.txt");
            System.out.println("6: Doc file");
            System.out.println("7: Ghi file");
            System.out.println("8: Sua");
            System.out.println("9: Xoa");
            System.out.println("Chon");
            n = new Scanner(System.in).nextInt();
            switch (n) {
                case 1: {
                    ThongKe thongKe = new ThongKe();
                    System.out.println("Doc file san pham.txt: ");
                    thongKe.thongKeSanPham();
                }
                break;

                case 2: {
                    System.out.println("Nhap noi dung ghi file sanpham.txt");
                    TruyXuatDuLieuFileSanPham ghisp = new TruyXuatDuLieuFileSanPham();
                    String contentSanPham = new Scanner(System.in).nextLine();
                    ghisp.ghiSanPham(contentSanPham);

                    break;
                }
                case 3: {
                    ThongKe thongKe = new ThongKe();
                    System.out.println("nhap ten san pham can loc: ");
                    String tenSanPham = new Scanner(System.in).nextLine();
                    thongKe.locSanPhamTheoTen(tenSanPham);
                    break;
                }
                case 4: {
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
                    System.out.println("Loai sp");
                    sua.SuaSanPham(tenSanPhamS, soLuong, donVi, gia, viTri);

                    break;
                }
                case 5: {
                    System.out.println("Xoa san pham theo ten");
                    System.out.println("nhap ten san pham can xoa");
                    String tenSanPhamX = new Scanner(System.in).nextLine();
                    sua.xoaSP(tenSanPhamX);
                    break;
                }
                case 6: {
                    ThongKe thongKe = new ThongKe();
                    System.out.println("Doc file hoadon.txt: ");
                    thongKe.thongKeHoaDon();

                    break;
                }
                case 7: {
                    System.out.println("Ghi file");
                    System.out.println("Nhap noi dung ghi file hoadon.txt");
                    String contentDatabase = new Scanner(System.in).nextLine();
                    ghiHD.ghiData(contentDatabase);

                    break;
                }
                case 8: {

                    System.out.println("Nhap ngay thang can tim o hoa don");
                    String ngayThangCanTim = new Scanner(System.in).nextLine();
                    System.out.println("Nhap dssp can tim o hoa don");
                    String dsspCanTim = new Scanner(System.in).nextLine();
                    System.out.println("Nhap ngay thang can sua");
                    String ngayThangSua = new Scanner(System.in).nextLine();
                    System.out.println("Nhap dssp can sua");
                    String dsspSua = new Scanner(System.in).nextLine();
                    System.out.println("Nhap thanh tien can sua");
                    float thanhtien = new Scanner(System.in).nextFloat();
                    ghiHD.suaHD(ngayThangCanTim, dsspCanTim, ngayThangSua, dsspSua, thanhtien);
                    break;
                }
                case 9: {
                    System.out.println("Nhap ngay thang cua hoa don can xoa");
                    String ngayThangX = new Scanner(System.in).nextLine();
                    System.out.println("nhap dssp cua hoa don can xoa");
                    String dsspX = new Scanner(System.in).nextLine();
                    ghiHD.xoaHD(ngayThangX, dsspX);
                    break;
                }
            }

        } while (n != 10);
    }
}
