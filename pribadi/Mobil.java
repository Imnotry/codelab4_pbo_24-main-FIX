package kendaraan.pribadi;

import kendaraan.kendaraan;

public class Mobil extends kendaraan {
    //    this.getName() diubah menjadi getModel()
    @Override
    public void Start() {
        System.out.println("Mobil " + getModel() + " dinyalakan");
    }

    @Override
    public void Stop() {
        System.out.println("Mobil " + getModel() + " dimatikan");
    }

    @Override
    public void Brake() {
        System.out.println("Mobil berhenti");
    }
}