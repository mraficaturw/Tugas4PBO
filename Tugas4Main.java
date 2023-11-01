/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas4;

/**
 *
 * @author Reynaldo
 */
public class Tugas4Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Tugas4 vl = new Tugas4(2, 3, 5);
        Tugas4 vls = new Tugas4(2);
        
        System.out.println("Volume dan Luas Permukaan Balok");
        System.out.println("Volume Balok : "+vl.volume());
       	System.out.println("Luas Permukaan Balok    : "+vl.luas());
        
        System.out.println("Volume dan Luas Permukaan Kubus");
        System.out.println("Volume Kubus : "+vls.volume_k());
        System.out.println("Luas Permukaan Kubus  : "+vls.luas_k());
    
    }
    
}
