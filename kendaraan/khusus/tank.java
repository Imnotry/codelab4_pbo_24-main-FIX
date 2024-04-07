package kendaraan.khusus;

import kendaraan.kendaraan;
import kendaraan.util.ShootAble;
//Mengubah ShootAb menjadi ShootAble
public class tank extends kendaraan implements ShootAble{
    //    this.getName() diubah menjadi getModel()
    @Override
    public void Start() {
        System.out.println("Menyalakan " + getModel() + " tank");
    }

    @Override
    public void Stop() {
        System.out.println("Mematikan tank " + getModel());
    }

    @Override
    public void Brake() {
        System.out.println("Tank berhenti");
    }

    @Override
    public void Shoot(String vehicle) {
        System.out.println("Tank menembak " + vehicle);
    }
}