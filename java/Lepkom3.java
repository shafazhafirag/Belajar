/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lepkom3;

import java.io.*;

/**
 *
 * @author SHAFA
 */
public class Lepkom3 {

    public static void main(String[] args) throws IOException{
        String sInput=null;
        System.out.println("===JENIS MAMALIA===");
        System.out.println("1. Ikan Paus");
        System.out.println("2. Cheetah");
        System.out.println("3. Sapi");
        System.out.println("Masukkan Pilihan [1..3] : ");
        Mamalia generalx = new Mamalia();
        Paus turunan1 = new Paus();
        Cheetah turunan2 = new Cheetah();
        Sapi turunan3 = new Sapi();
        
        InputStreamReader inputan=new InputStreamReader(System.in);
        BufferedReader jm = new BufferedReader(inputan);
        sInput = jm.readLine();
        int i = Integer.parseInt(sInput);
        switch(i){
            case 1:
                generalx.KelasMamalia();
                turunan1.TampilkanPaus();
                break;
            case 2:
                generalx.KelasMamalia();
                turunan2.TampilkanCheetah();
                break;
            case 3:
                generalx.KelasMamalia();
                turunan3.TampilkanSapi();
                break;
            default:
                System.out.println("Pilihan yang anda masukan salah");
                break;
        }
        
    }  
    }
