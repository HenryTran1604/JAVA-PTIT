/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J07013_DanhSachSinhVienTrongFileNhiPhan;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.text.ParseException;
import java.util.ArrayList;

/**
 *
 * @author :Tran Quang Huy
 */
public class Sinh {
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException, ParseException {
        FileOutputStream fileOutputStream = new FileOutputStream("SV.in");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        ArrayList <SinhVien> list = new ArrayList<>();
        list.add(new SinhVien("B20DCCN001", "NGuyen van a", "d20", "1/12/2002", 3));
        objectOutputStream.writeObject(list);
        fileOutputStream.close();
    }
}
