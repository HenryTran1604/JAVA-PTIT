/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J05015_DuaXeDap;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author :Tran Quang Huy
 */
public class Racer {
    private String ma, hoTen, donVi;
    private Date denDich;
    public Racer(String hoTen, String donVi, String denDich) throws ParseException{
        this.hoTen = hoTen;
        this.donVi = donVi;
        SimpleDateFormat format = new SimpleDateFormat("H:mm");
        this.denDich = format.parse(denDich);
        this.ma = "";
        for(String x : donVi.split("\\s+")){
            this.ma += Character.toUpperCase(x.charAt(0));
        }
        for(String x : hoTen.split("\\s+")){
            this.ma += Character.toUpperCase(x.charAt(0));
        }
    }

    public Date getDenDich() {
        return denDich;
    }
    
    public int vanToc() throws ParseException{
        long t = denDich.getTime() - (new SimpleDateFormat("H:mm")).parse("6:00").getTime();
        double h = 1.0 * t / (1000 * 60 * 60);
        return (int) Math.round(120.0 / h);
    }
    @Override
    public String toString(){
        try {
            return this.ma + ' ' + this.hoTen + ' ' + this.donVi + ' ' + this.vanToc() + " Km/h";
        } catch (ParseException ex) {
            Logger.getLogger(Racer.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "";
    }
}
