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

    }

}
