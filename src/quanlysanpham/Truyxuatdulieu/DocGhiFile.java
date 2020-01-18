/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlysanpham.Truyxuatdulieu;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
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
public class DocGhiFile {

    public DocGhiFile() {
        BufferedReader br = null;
        try {
            String filesPath = CauHinh.filesPath;
//            System.out.println(filesPath+"\\database.txt");
            br = new BufferedReader(new FileReader(filesPath + "\\database.txt"));
            String docdata;

            while ((docdata = br.readLine()) != null) {
                System.out.println(docdata);
                String[] cat = docdata.split("\\$");
                for (int i = 0; i < cat.length; i++) {
                    System.out.println(cat[i]);
                }

            }

        } catch (FileNotFoundException ex) {
            Logger.getLogger(DocGhiFile.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(DocGhiFile.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                br.close();
            } catch (IOException ex) {
                Logger.getLogger(DocGhiFile.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }
    
    public List<SanPham> layTatCaSanPham() {
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
            Logger.getLogger(DocGhiFile.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(DocGhiFile.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                bf.close();
            } catch (IOException ex) {
                Logger.getLogger(DocGhiFile.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return list;

    }

}
