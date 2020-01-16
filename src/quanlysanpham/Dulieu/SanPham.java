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
public abstract class SanPham {
    private String ten;
    private int soluong;
    private float gia;
    private String donvi;

    public SanPham() {
    }

    public SanPham(String ten, int soluong, float gia, String donvi) {
        this.ten = ten;
        this.soluong = soluong;
        this.gia = gia;
        this.donvi = donvi;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    public float getGia() {
        return gia;
    }

    public void setGia(float gia) {
        this.gia = gia;
    }

    public String getDonvi() {
        return donvi;
    }

    public void setDonvi(String donvi) {
        this.donvi = donvi;
    }
    
    
    
}
