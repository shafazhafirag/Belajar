/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parkir;
import java.text.SimpleDateFormat;
import java.util.*;
/**
 *
 * @author SHAFA
 */
public class Parkir {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        
        
        System.out.println("Jam a =");
        int j1 = Input.nextInt();
        System.out.println("Menit a =");
        int m1 = Input.nextInt();
        System.out.println("Detik a =");
        int d1 = Input.nextInt();
        
        System.out.println("Jam b =");
        int j2 = Input.nextInt();
        System.out.println("Menit b =");
        int m2 = Input.nextInt();
        System.out.println("Detik b =");
        int d2 = Input.nextInt();
        
        int j3,sisa,m3,d3;
        int waktu1,waktu2,selisih;
        waktu1 = (3600*j1)+(60*m1)+d1;
        waktu2 = (3600*j2)+(60*m2)+d2;
        selisih = waktu2-waktu1;
        j3 = selisih/3600;
        sisa = selisih%3600;
        m3 = sisa/60;
        d3 = sisa%60;
        
        System.out.println("Waktu Pertama = "+j1+":"+m1+":"+d1);
        System.out.println("Waktu Kedua = "+j2+":"+m2+":"+d2);
        System.out.println("Selisih Waktu = "+j3+":"+m3+":"+d3);
    }
    
} 