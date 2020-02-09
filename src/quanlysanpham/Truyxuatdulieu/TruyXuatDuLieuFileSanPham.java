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
import java.util.Arrays;
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

    String filesPath = CauHinh.filesPath;

    public List<SanPham> layTatCaSanPham() {
        List<SanPham> listProduct = new ArrayList<>();

        DocGhi doc = new DocGhi();
        String fileResult = doc.doc(filesPath + "\\sanpham.txt");
        List<String> listStringData = Arrays.asList(fileResult.split("\\n"));  //array.asList(n): tra ve 1 danh sach co kich thuoc co dinh
        for (int i = 0; i < listStringData.size(); i++) {
            SanPham sp = mapStringToObject(listStringData.get(i));
            listProduct.add(sp);
        }
        //        BufferedReader bf = null;
//
//        try {
//            bf = new BufferedReader(new FileReader(filesPath + "\\sanpham.txt"));
//            String docsanpham;
//            while ((docsanpham = bf.readLine()) != null) {
//                String[] doc = docsanpham.split("\\$");
//            
//                SanPham sp = null;
//                if (LoaiSanPham.AO.getValue().equals(doc[doc.length - 1])) {
//                    sp = new Ao();
//                    sp.setTen(doc[0]);
//                    sp.setSoluong(Integer.parseInt(doc[1]));
//                    sp.setDonvi(doc[2]);
//                    sp.setGia(Float.parseFloat(doc[3]));
//                    sp.setViTri(doc[4]);
//                    sp.setLoai(LoaiSanPham.AO);
//                } else {
//                    sp = new Keo();
//                    sp.setTen(doc[0]);
//                    sp.setSoluong(Integer.parseInt(doc[1]));
//                    sp.setDonvi(doc[2]);
//                    sp.setGia(Float.parseFloat(doc[3]));
//                    sp.setViTri(doc[4]);
//                    sp.setLoai(LoaiSanPham.KEO);
//                }
//                list.add(sp);
//
//            }
//        } catch (FileNotFoundException ex) {
//
//        } catch (IOException ex) {
//            Logger.getLogger(TruyXuatDuLieuFileSanPham.class.getName()).log(Level.SEVERE, null, ex);
//        }
        return listProduct;

    }

    private SanPham mapStringToObject(String data) {
        String[] doc = data.split("\\$");
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
        return sp;
    }

    public void ghiSanPham(String contentSanPham) {
        DocGhi ghi = new DocGhi();
        ghi.ghiDe(filesPath + "\\sanpham.txt", contentSanPham);

//        try {
//            FileWriter fw = new FileWriter(filesPath + "\\sanpham.txt", true);
//            BufferedWriter bw = new BufferedWriter(fw);
//            bw.write(contentSanPham);
//            bw.close();
//            fw.close();
//        } catch (IOException ex) {
//
//        }
    }

    public void SuaSanPham(String tenSanPhamS, int soLuong, String donVi, float gia, String viTri) {
        List<SanPham> list = layTatCaSanPham();
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
//        FileWriter fw = null;
        for (int j = 0; j < list.size(); j++) {
            giatri = giatri + list.get(j).toString();
        }
        ghi.ghi(filesPath + "\\sanpham.txt", giatri);

//            try {
//                fw = new FileWriter(filesPath + "\\sanpham.txt");
//                BufferedWriter bw = new BufferedWriter(fw);
//                bw.write(giatri);
//                bw.close();
//            } catch (IOException ex) {
//                Logger.getLogger(TruyXuatDuLieuFileSanPham.class.getName()).log(Level.SEVERE, null, ex);
//            } finally {
//                try {
//                    fw.close();
//                } catch (IOException ex) {
//                    Logger.getLogger(TruyXuatDuLieuFileSanPham.class.getName()).log(Level.SEVERE, null, ex);
//                }
//            }
    }



public void xoaSP(String tenSanPhamX) {
        List<SanPham> list = layTatCaSanPham();
        DocGhi ghi = new DocGhi();
        String sp = "";
//        FileWriter fw = null;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getTen().equals(tenSanPhamX)) {
                list.remove(i);
            }
        }
        for (int j = 0; j < list.size(); j++) {
            sp = sp + list.get(j).toString();

        }
        ghi.ghi(filesPath+"\\sanpham.txt", sp);
        
//        try {
//            fw = new FileWriter(filesPath + "\\sanpham.txt");
//            BufferedWriter bw = new BufferedWriter(fw);
//            bw.write(sp);
//            bw.close();
//        
//
//} catch (IOException ex) {
//            Logger.getLogger(TruyXuatDuLieuFileSanPham.class  
//
//.getName()).log(Level.SEVERE, null, ex);
//        } finally {
//            try {
//                fw.close();
//            
//
//} catch (IOException ex) {
//                Logger.getLogger(TruyXuatDuLieuFileSanPham.class  
//
//.getName()).log(Level.SEVERE, null, ex);
//            }
//        }

    }
    public static void main(String[] args) {
        TruyXuatDuLieuFileSanPham t = new TruyXuatDuLieuFileSanPham();
        t.layTatCaSanPham();
    }
}
