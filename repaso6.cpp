#include <iostream>
#include <iostream>
#include <vector>
using namespace std;

struct date{
    int dia;
    int mes;
    int año;
};

struct equipo
{
    string nombre;
    string jugadores[11];
    int goles_f,goles_c;
    int posicion,cant_puntos;
    vector<char> historial;
};

struct partido
{
    string local;
    string visitante;
    int goles_l,goles_v;
    date fecha;
    string estadio;
};


void cargar_partido(vector<partido> &partidos,vector<equipo> &torneo){
    string nombre_equipo;
    partido actual_partido;
    string ganador="";
    string perdedor="";
    int golesg, golesp;
    bool empate;
    bool comprobacion=true;
    while(comprobacion){
        cout << "ingrese equipo local" << endl;
        cin >> nombre_equipo;
        for(int i = 0;i < torneo.size();i++){
            if(torneo[i].nombre==nombre_equipo)
            {
                comprobacion=false;
            }
        }
        if(comprobacion){
            cout << "el equipo no esta en el torneo" << endl;
        }
    }
    comprobacion = true;
    actual_partido.local=nombre_equipo;
    while(comprobacion){
        cout << "ingrese equipo visitante" << endl;
        cin >> nombre_equipo;
        for(int i = 0;i < torneo.size();i++){
            if(torneo[i].nombre==nombre_equipo)
            {
                comprobacion=false;
            }
        }
        if (nombre_equipo==actual_partido.local)
        {
            comprobacion=true;
            cout << "el equipo visitante no puede ser el mismo que el local" << endl;
        }
        
        if(comprobacion){
            cout << "el equipo no esta en el torneo" << endl;
        }
    }
    actual_partido.visitante=nombre_equipo;
    cout << "ingrese cantidad de goles que metio el local" << endl;
    cin >> actual_partido.goles_l;
    cout << "ingrese cantidad de goles que metio el local" << endl;
    cin >> actual_partido.goles_v;
    cout << "ingrese dia del partido " << endl;
    cin >> actual_partido.fecha.dia;    
    cout << "ingrese mes del partido " << endl;
    cin >> actual_partido.fecha.mes;  
    cout << "ingrese año del partido " << endl;
    cin >> actual_partido.fecha.año;  
    cout << "ingrese estadio" << endl;
    if (actual_partido.goles_l>actual_partido.goles_v)
    {
        ganador=actual_partido.local;
        golesg=actual_partido.goles_l;
        perdedor=actual_partido.visitante;
        golesp=actual_partido.goles_v;
    }
    else if (actual_partido.goles_l<actual_partido.goles_v)
    {
        ganador=actual_partido.visitante;
        golesg=actual_partido.goles_v;
        perdedor=actual_partido.local;
        golesp=actual_partido.goles_l;
    }
    if((ganador=="") and (perdedor=="")){
        empate=true;
    }
    for(int i = 0;i < torneo.size();i++){
        if(!empate){
            if(torneo[i].nombre==ganador){
                torneo[i].cant_puntos+=3;
                torneo[i].goles_f=golesg;
                torneo[i].goles_c=golesp;   
                torneo[i].historial.push_back('V');
            }
            else if(torneo[i].nombre==perdedor){
                torneo[i].goles_f=golesp;
                torneo[i].goles_c=golesg;   
                torneo[i].historial.push_back('D');
            }
        }
        else{
            if(torneo[i].nombre==actual_partido.local){
                torneo[i].cant_puntos+=1;
                torneo[i].goles_f=actual_partido.goles_l;
                torneo[i].goles_c=actual_partido.goles_v;   
                torneo[i].historial.push_back('E');
            }
            else if(torneo[i].nombre==actual_partido.visitante){
                torneo[i].cant_puntos+=1;
                torneo[i].goles_f=actual_partido.goles_v;
                torneo[i].goles_c=actual_partido.goles_l;   
                torneo[i].historial.push_back('E');
            }
        }
    }
    partidos.push_back(actual_partido);
}


void mostrar_partido(vector<partido> partidos){
    string l_equipo;
    string v_equipo;
    cout << "ingrese equipo local" << endl;
    cin >> l_equipo;
    cout << "ingrese equipo local" << endl;
    cin >> v_equipo;
    for (int i = 0; i < partidos.size(); i++)
    {
        if((partidos[i].local==l_equipo)and(v_equipo==partidos[i].visitante)){
            cout << "local:" << partidos[i].local << ", visitante:" << partidos[i].visitante << ", salio "  << partidos[i].goles_l << '-' << partidos[i].goles_v << ", se diputo en el estadio " << partidos[i].estadio << "el partido se realizo el dia" << partidos[i].fecha.dia << ",el mes " << partidos[i].fecha.mes << ", el año" << partidos[i].fecha.año;
        }
    }
    
}

int main ()
{
    vector<equipo> torneo;
    vector<partido> partidos;
    for (int i = 0; i < 10; i++) {
        equipo nuevo_equipo;


        nuevo_equipo.nombre = "Equipo " + to_string(i + 1);
        nuevo_equipo.goles_f = 0;
        nuevo_equipo.goles_c = 0; 
        nuevo_equipo.posicion = 0;
        nuevo_equipo.cant_puntos = 0; 


        nuevo_equipo.historial = {}; 


        for (int j = 0; j < 11; j++) {
            nuevo_equipo.jugadores[j] = "Jugador " + to_string(j + 1);
        }

        torneo.push_back(nuevo_equipo);
    }
        while(true){
            int opcion=0;
            cout << "elija una opcion, si quiere salir escriba 0" << endl;
            cout << "1) cargar partido"  << endl;
            cout << "2)mostrar_partido " << endl;
            cout << "3) Mostrar citas" << endl;
            cin >> opcion;

            switch (opcion)
            {
                case 0 :
                    return 0;
                break;
                case 1 :
                cargar_partido(partidos,torneo);
                    break;
                case 2 :
                mostrar_partido(partidos);
                    break;
                case 3 :
                    
                    break;
                default:
                    break;
                }
            
        }
}