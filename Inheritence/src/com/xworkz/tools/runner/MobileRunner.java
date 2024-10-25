package com.xworkz.tools.runner;

import com.xworkz.tools.example1.Computer;
import com.xworkz.tools.example1.Device;
import com.xworkz.tools.example1.Machine;
import com.xworkz.tools.example1.Mobile;

public class MobileRunner {
    public static void main(String[] args) {
        Mobile m1=new Mobile();
        Mobile m2=new Mobile();
        Mobile m3=new Mobile();
        System.out.println("===");
        Computer c1=new Computer();
        Computer c2=new Machine();
        System.out.println("===");
        Device d1=new Device();
        Device d2=new Device();
        Device d3=new Machine();
        System.out.println("===");
        Machine e1=new Machine();
        Machine e2=new Machine();
    }
}
