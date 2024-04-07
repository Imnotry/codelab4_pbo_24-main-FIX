package kendaraan.khusus;

import kendaraan.kendaraan;
import kendaraan.util.Flyable;

public class khusus extends kendaraan implements Flyable {
    //    this.getName() diubah menjadi getModel()
    @Override
    public void Start() {
        System.out.println("Mennyalakan pesawat " + getModel());
    }

    @Override
    public void Stop() {
        System.out.println("Mematikan mesin pesawat " + getModel());
    }

    //    Menambah override method Brake yang ada di Kelas Kendaraan
    @Override
    public void Brake() {
        System.out.println("Pesawat "+ getModel() +" mengurangi kecepatan/ mengerem");
    }

    @Override
    public void fly() {
        System.out.println("Pesawat " + getModel() + " lepas landas");
    }
}