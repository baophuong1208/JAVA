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
public class Ao extends SanPham{
    private String size;
    private String mausac;

    public Ao() {
    }

    public Ao(String mausac) {
        this.mausac = mausac;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getMausac() {
        return mausac;
    }

    public void setMausac(String mausac) {
        this.mausac = mausac;
    }
    
    
    
}
