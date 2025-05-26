package sistemas;

import vehiculos.Auto;
import vehiculos.Camioneta;
import vehiculos.Vehiculo;

import java.util.ArrayList;

public class Sistema_vehiculos {
    ArrayList<Vehiculo> vehiculos;

    public Sistema_vehiculos(ArrayList<Vehiculo> vehiculos) {
        this.vehiculos = vehiculos;
    }

    public ArrayList<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    public void setVehiculos(ArrayList<Vehiculo> vehiculos) {
        this.vehiculos = vehiculos;
    }
    public int cant_auto(){
        int autos = 0;
        for (Vehiculo v : vehiculos){
            if (v instanceof Auto){  autos++;  }
  }


    return autos;    }
    public int cant_camioneta(){
        int camionetas = 0;
        for (Vehiculo v : vehiculos){
            if (v instanceof Camioneta){  camionetas++;  }
        }
        return camionetas;    }



    public void mas_vahiculos(){
        int autos = this.cant_auto();
        int camionetas = this.cant_camioneta();

        if (autos<camionetas){
            System.out.println("en la lista hay mas camionetas");
        }
        else if (autos>camionetas){
            System.out.println("en la lista hay mas autos");
        }
        else {
            System.out.println("en hay la misma cant");
        }
    }
    public void add(Vehiculo a1){
        this.vehiculos.add(a1);
    }
    public int cant_auto_descapotables() {
        int auto = 0;
        Auto a;
        for (Vehiculo v : vehiculos) {
            if (v instanceof Auto) {
                a = (Auto) v;
                if(a.getDescapotable()){
                    auto++;
                }
            }
        }
            return auto;
    }
    public float porcentaje_de_descapotable(){
        return (this.cant_auto_descapotables()*100/this.vehiculos.size());
    }
    public static void main(String[] args) {
        Sistema_vehiculos s1 = new Sistema_vehiculos(new ArrayList<>());
        Auto a1 = new Auto("lambo","huracan","negro",4,2010,"aa43",true);
        Auto a2 = new Auto("lambo","huracan","negro",4,2010,"aa43",false);
        Camioneta c1 = new Camioneta("lambo","huracan","negro",4,2010,"aa43",1000,500);
        s1.add(a1);
        s1.add(a2);
        s1.add(c1);
        s1.mas_vahiculos();
        System.out.println(s1.porcentaje_de_descapotable()+"%");
    }
}
