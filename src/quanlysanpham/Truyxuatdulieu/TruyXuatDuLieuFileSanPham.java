/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlysanpham.Truyxuatdulieu;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import quanlysanpham.Dulieu.Ao;
import quanlysanpham.Dulieu.Keo;
import quanlysanpham.Dulieu.LoaiSanPham;
import quanlysanpham.Dulieu.SanPham;
import quanlysanpham.cauhinh.CauHinh;

/**
 *
 * @author Phuong
 */
public class TruyXuatDuLieuFileSanPham {
//
//    public void SuaSanPham(String tenSanPham, int soLuong, String donVi, float gia, String viTri, LoaiSanPham loaiSP) {
//        DocFile df = new DocFile();
//        List<SanPham> list = df.layTatCaSanPham();
//        List<SanPham> list2 = new ArrayList<>();
//        for (int i = 0; i < list.size(); i++) {
//            if (list2.get(i).getTen().equals(tenSanPham)) {
//                list2.get(i).setTen(tenSanPham);
//                list2.get(i).setSoluong(soLuong);
//                list2.get(i).setDonvi(donVi);
//                list2.get(i).setGia(gia);
//                list2.get(i).setViTri(viTri);
//                list2.get(i).setLoai(loaiSP);
//                list.add(list2.get(i));
//                GhiFile gf = new GhiFile();
//                gf.ghiSanPham(tenSanPham);
//
//            }
//        }
//
//    }

    String filesPath = CauHinh.filesPath;

    public List<SanPham> layTatCaSanPham() {
//        System.out.println("san pham: ");
        BufferedReader bf = null;
        List<SanPham> list = new ArrayList<>();

        try {
            String filesPath = CauHinh.filesPath;
//            System.out.println(filesPath+"\\sanpham.txt");
            bf = new BufferedReader(new FileReader(filesPath + "\\sanpham.txt"));
            String docsanpham;
            while ((docsanpham = bf.readLine()) != null) {
                String[] doc = docsanpham.split("\\$");
                SanPham sp = null;
                if (LoaiSanPham.AO.getValue().equals(doc[doc.length - 1])) {
                    sp = new Ao();
                    sp.setTen(doc[0]);
                    sp.setSoluong(Integer.parseInt(doc[1]));
                    sp.setDonvi(doc[2]);
                    sp.setGia(Float.parseFloat(doc[3]));
                    sp.setViTri(doc[4]);
                    sp.setLoai(LoaiSanPham.AO);
                } else {
                    sp = new Keo();
                    sp.setTen(doc[0]);
                    sp.setSoluong(Integer.parseInt(doc[1]));
                    sp.setDonvi(doc[2]);
                    sp.setGia(Float.parseFloat(doc[3]));
                    sp.setViTri(doc[4]);
                    sp.setLoai(LoaiSanPham.KEO);
                }
                list.add(sp);

            }
        } catch (FileNotFoundException ex) {

        } catch (IOException ex) {
            Logger.getLogger(TruyXuatDuLieuFileSanPham.class.getName()).log(Level.SEVERE, null, ex);
        }

        return list;

    }

    public void ghiSanPham(String contentSanPham) {
        try {
            FileWriter fw = new FileWriter(filesPath + "\\sanpham.txt", true);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(contentSanPham);
            bw.close();
            fw.close();
        } catch (IOException ex) {

        }

    }

}
