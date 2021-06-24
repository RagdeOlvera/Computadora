/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package computadora;

import ico.fes.componentes.Cpu;
import ico.fes.componentes.Monitor;
import ico.fes.componentes.Mouse;
import ico.fes.componentes.Teclado;

/**
 *
 * @author Ragde
 */
public class Computadora {
    
    private String marca;
    private String modelo;
    private Cpu cpu;
    private Monitor monitor;
    private Mouse mouse;
    private Teclado teclado;

    public Computadora() {
    }

    public Computadora(String marca, String modelo, Cpu cpu, Monitor monitor, Mouse mouse, Teclado teclado) {
        this.marca = marca;
        this.modelo = modelo;
        this.cpu = cpu;
        this.monitor = monitor;
        this.mouse = mouse;
        this.teclado = teclado;
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Computadora computadora1 = new Computadora("Asus", "Vivobook", new Cpu("Intel", "Core i7", 3.6f), new Monitor("BenQ", "EX2710", 27), new Mouse("Razer", "Deathadder Elite", "wireless"), new Teclado("Logitech", "Illuminated Keyboard K740", 50, 20));
        System.out.println(computadora1);
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Cpu getCpu() {
        return cpu;
    }

    public void setCpu(Cpu cpu) {
        this.cpu = cpu;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public Mouse getMouse() {
        return mouse;
    }

    public void setMouse(Mouse mouse) {
        this.mouse = mouse;
    }

    public Teclado getTeclado() {
        return teclado;
    }

    public void setTeclado(Teclado teclado) {
        this.teclado = teclado;
    }

    @Override
    public String toString() {
        return "Computadora{" + "marca=" + marca + ", modelo=" + modelo + ", \ncpu=" + cpu + ", \nmonitor=" + monitor + ", \nmouse=" + mouse + ", \nteclado=" + teclado + '}';
    }
    
    
}
