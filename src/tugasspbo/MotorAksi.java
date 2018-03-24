/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasspbo;

/**
 *
 * @author User
 */
public class MotorAksi {
    public static void main(String[] args) {
        Motor yamaha = new Motor();
        Motor Honda = new Motor();
        Motor Kawasaki = new Motor();
        
        
        yamaha.jenis="Yamaha";
        yamaha.nama="R6";
        yamaha.isitorsi="650cc";
        yamaha.warna="Hitam";
        yamaha.bahanbakar="Pertamax Turbo";
        
        Honda.jenis="Honda";
        Honda.nama="CBR1000rr";
        Honda.isitorsi="1000cc";
        Honda.warna="Putih Merah";
        Honda.bahanbakar="Pertamax Turbo";
        
        Kawasaki.jenis="Kawasaki";
        Kawasaki.nama="H2R";
        Kawasaki.isitorsi="1100cc";
        Kawasaki.warna="Hitam Doff";
        Kawasaki.bahanbakar="Pertamax Turbo";
        
        yamaha.cetakInfo();
        Honda.cetakInfo();
        Kawasaki.cetakInfo();
        
    }
    
}
