/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J07013_DanhSachSinhVienTrongFileNhiPhan;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

/**
 *
 * @author :Tran Quang Huy
 */
public class Main {
    public static void main(String[] args) throws IOException, FileNotFoundException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream("SV.in");
        ObjectInputStream ois = new ObjectInputStream(fis);
        ArrayList <SinhVien> list = (ArrayList<SinhVien>) ois.readObject();
        for(SinhVien sv : list){
            System.out.println(sv);
        }
    }
}
