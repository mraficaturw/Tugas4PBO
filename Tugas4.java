/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas4;

/**
 *
 * @author Reynaldo
 */
public class Tugas4 {

    double p,t,l,s;
    public Tugas4 (double p,double l,double t){
        this.p = p;
        this.l = l;
        this.t = t;
    }
    public Tugas4(double s){
        this.s = s;
    }
     public double volume(){
    return p * l * t;
    }
    public double luas(){
    return 2 * ((p * l) + (p * t) + (l * t));
    }
     public double volume_k(){
    return s * s * s;
    }
     public double luas_k(){
    return 6 * s * s;
    }
}
