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
    int goles_f=0,goles_c=0;
    int cant_puntos=0;
    vector<char> historial;
};

struct partido
{
    equipo local;
    equipo visitante;
    int goles_l=0,goles_v=0;
    date fecha;
    string estadio;
};


void cargar_partido(vector<partido> &partidos,vector<equipo> &torneo){
    string nombre_equipo;
    partido actual_partido;
    int golesg, golesp;
    bool comprobacion=true;
    int indicel,indicev;
    while(comprobacion){
        cout << "ingrese equipo local" << endl;
        cin >> nombre_equipo;
        for(int i = 0;i < torneo.size();i++){
            if(torneo[i].nombre==nombre_equipo)
            {
                comprobacion=false;
                actual_partido.local=torneo[i];
                indicel=i;
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
                actual_partido.visitante=torneo[i];
                indicev=i;
            }
        }
        if (nombre_equipo==actual_partido.local.nombre)
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
    cin >> actual_partido.estadio;
    torneo[indicel].goles_f+=actual_partido.goles_l;
    torneo[indicel].goles_c+=actual_partido.goles_v;
    torneo[indicev].goles_f+=actual_partido.goles_v;
    torneo[indicev].goles_c+=actual_partido.goles_l;
    if (actual_partido.goles_l>actual_partido.goles_v)
    {
        torneo[indicel].cant_puntos+=3;
        torneo[indicel].historial.push_back('V');
        torneo[indicev].historial.push_back('D');
    }
    else if(actual_partido.goles_l<actual_partido.goles_v){
        
        torneo[indicev].cant_puntos+=3;
        torneo[indicel].historial.push_back('D');
        torneo[indicev].historial.push_back('V');
    }
    else{
        torneo[indicel].cant_puntos+=1;
        torneo[indicev].cant_puntos+=1;
        torneo[indicel].historial.push_back('E');
        torneo[indicev].historial.push_back('E');
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


void tabla_posiciones(vector<equipo> &torneo){
    
    equipo temp;
    cout << "---------------------------------------------------------------------" << endl;
    cout << " Posición - Nombre del equipo - Cantidad de goles a favor - Cantidad de goles en contra - Historial de partidos" << endl;
    cout << "---------------------------------------------------------------------" << endl;
    for (int i = 0; i < torneo.size(); i++)
    {
        for (int j = i; j < torneo.size()-1; j++)
        {
            if(torneo[j].cant_puntos<torneo[j+1].cant_puntos){
                temp=torneo[j];
                torneo[j]=torneo[j+1];
                torneo[j+1]=temp;
                cout << i << '-' << torneo[i].nombre << '-' << torneo[i].goles_f << '-' << torneo[i].goles_c << '-' << 
                
                for (int k = 0; k < torneo[k].historial.size(); k++)
                {
                    cout << torneo[k].historial[k] << ',';
                }
                << endl;   
                cout << "---------------------------------------------------------------------" << endl;
            }
        }
        
    }
    for (int i = 0; i < torneo.size(); i++)
    {
        
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
                    tabla_posiciones(torneo);
                    break;
                default:
                    break;
                }
            
        }
}