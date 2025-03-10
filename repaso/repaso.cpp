#include <iostream>
#include <vector>
using namespace std;

struct Empleado {
    string nombre;
    string apellido;
    int fecha;
    string sexo;
    int salario;
};

Empleado listar_Empleados(vector<Empleado> lista_Empleado,vector<Empleado> &lista_Empleado_pobres){
    Empleado empledo_mayor_sueldo;
    int mayor_sueldo=0;
    for(int i=0;i < lista_Empleado.size();i++){
        
        Empleado persona=lista_Empleado[i];
        if(persona.salario<=400000)
        
        {
            lista_Empleado_pobres.push_back(persona);
        }    
        if(persona.salario>=mayor_sueldo){
            empledo_mayor_sueldo=persona;
        }
    }
    return empledo_mayor_sueldo;
}


int main(){
    vector<Empleado> lista_Empleado;
    lista_Empleado.push_back({"tomas","cantale",1999,"masculino",1000000});
    lista_Empleado.push_back({"santino","garayzar",2007,"masculino",350000});
    lista_Empleado.push_back({"felipe","garayzar",2007,"masculino",400000});
    lista_Empleado.push_back({"santino","copati",2007,"masculino",2000000});
    vector<Empleado> lista_Empleado_pobres;
    Empleado mayor_sueldo=listar_Empleados(lista_Empleado,lista_Empleado_pobres);   
    cout << "el nombre del empledo con mayor sueldo es" << mayor_sueldo.nombre << ' ' << mayor_sueldo.apellido << endl;
    cout << "los nombres de los empleados de sueldo menor o igula a 400000 son:" << endl; 
    for(int i=0;i < lista_Empleado_pobres.size();i++){
        cout << lista_Empleado_pobres[i].nombre << ' ' <<lista_Empleado_pobres[i].apellido << endl;
    }

}