#include <iostream>
#include <iostream>
#include <vector>
using namespace std;

struct date{
    int dia;
    int mes;
    int año;
};

struct paciente{
    string nombre;
    int edad;
    int numero_historial;
    date fecha_cita; 
};

void Registrar_paciente(vector<paciente> &pacientes,int &n_historial){

    paciente persona;

    cout << "ingrese nombre del paciente" << endl;
    cin >> persona.nombre;
    cout << "ingrese edad del paciente" << endl;
    cin >> persona.edad;
    cout << "ingrese dia para la cita " << endl;
    cin >> persona.fecha_cita.dia;    
    cout << "ingrese mes para la cita " << endl;
    cin >> persona.fecha_cita.mes;  
    cout << "ingrese año para la cita " << endl;
    cin >> persona.fecha_cita.año;  
    cout << "cliente registrado" << endl;
    n_historial++;
    persona.numero_historial=n_historial;
    pacientes.push_back(persona);


}


void cancelar_cita(vector<paciente> &pacientes){

    int n_historial;
    bool exito=false;
    cout << "ingrese su numero de historial para cancelar la cita" << endl;
    cin >> n_historial; 
    for (int i = 0; i < pacientes.size(); i++)
    {
        if(n_historial==pacientes[i].numero_historial){
            pacientes[i].fecha_cita={0,0,0};
            exito=true;
        }
    }
    if(exito){
        cout << "la cita ha sido cancelada" << endl;
    }
    else{
        cout << "la cita ha sido cancelada" << endl;
    }

}


void mostrar_citas(vector<paciente> &pacientes){

    date fecha;
    cout << "ingrese una fecha para ver todos los pedidos de esa" << endl;
    cout << "Dia:";
    cin >> fecha.dia;
    cout << endl << "Mes:";
    cin >> fecha.mes;
    cout << endl << "año:";
    cin >> fecha.año;
    cout << endl;
    cout << "En la fecha " << fecha.dia << '/' << fecha.mes << '/' << fecha.mes << " los pacientes que tienen cita este dia son:" << endl;
    for (int i = 0; i < pacientes.size(); i++)
    {
        if((pacientes[i].fecha_cita.dia==fecha.dia)and(pacientes[i].fecha_cita.mes==fecha.mes)and(pacientes[i].fecha_cita.año==fecha.año)){
             cout << "Paciente "<< pacientes[i].nombre << " con "<< pacientes[i].edad << "años, tiene el numero de historial "  << pacientes[i].numero_historial <<  endl;
        }
    }
    
}


void buscar_data(vector<paciente> &pacientes){
    int n_historial;    
    cout << "ingrese su numero de historial para encontrar los datos del paciente" << endl;
    cin >> n_historial; 
    for (int i = 0; i < pacientes.size(); i++)
    {
        if(n_historial==pacientes[i].numero_historial){
             cout << "Paciente "<< pacientes[i].nombre << " con "<< pacientes[i].edad << "años, tiene el numero de historial "  << pacientes[i].numero_historial << " ,tiene cita e la fecha " << pacientes[i].fecha_cita.dia << '/' << pacientes[i].fecha_cita.mes << '/' << pacientes[i].fecha_cita.mes << endl;
        }
    }
}


int main(){

    int n_historial=0;
    vector<paciente> pacientes;
        while(true){
            int opcion=0;
            cout << "elija una opcion, si quiere salir escriba 0" << endl;
            cout << "1) Registrar y sacar cita"  << endl;
            cout << "2) Cancelar cita " << endl;
            cout << "3) Mostrar citas" << endl;
            cout << "4) Buscar imformacion" << endl;
            cin >> opcion;

            switch (opcion)
            {
                case 0 :
                    return 0;
                break;
                case 1 :
                    Registrar_paciente(pacientes,n_historial);
                    break;
                case 2 :
                    cancelar_cita(pacientes);
                    break;
                case 3 :
                    mostrar_citas(pacientes);
                    break;
                case 4 :
                    buscar_data(pacientes);
                    break;
                default:
                    break;
                }
            
        }
}

