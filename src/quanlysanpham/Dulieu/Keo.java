/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlysanpham.Dulieu;

import java.util.Date;

/**
 *
 * @author Phuong
 */
public class Keo extends SanPham{
    private Date hsd;

    public Keo() {
    }

    public Keo(Date hsd) {
        this.hsd = hsd;
    }

    public Date getHsd() {
        return hsd;
    }

    public void setHsd(Date hsd) {
        this.hsd = hsd;
    }
    
    
    
}
