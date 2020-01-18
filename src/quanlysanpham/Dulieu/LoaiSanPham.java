/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlysanpham.Dulieu;

/**
 *
 * @author Phuong
 */
public enum LoaiSanPham {
    AO("ao"),
    KEO("keo");

    private LoaiSanPham() {
    }

    private LoaiSanPham(String value) {
        this.value = value;
    }
    
    
    private String value;
    
    public String getValue(){
        return value;
    }
}
