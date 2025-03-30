struct Vuelta_rapida {
    int numero_vuelta;
    int tiempo;
    string nombre_piloto;
  }
      
struct Piloto {
    string nombre;
    int puntos;
    string equipo;
  }
struct Equipo {
    string nombre;
     int puntos;
  }

struct Carrera {
    string lugar;
    Vuelta_rapida vueltas_rapidas;
    vector<Piloto> puestos;
}

void cargar_datos_carrera(vector<Carrera> &campeonato, vector<Piloto> &pilotos)
    {
        bool comprobacion_v = true;
        bool comprobacion = true;
        Vuelta_rapida actual_vuelta_rapida;
        carrera actual_carrera;
        cout << "Ingrese el lugar de la carrera" << endl;
        cin >> actual_vuelta_rapida.lugar;
        string nombre;
        while(comprobacion_v){
            cout << "Ingrese el nombre del piloto que hizo la vuelta rapida" << endl;
            cin >> actual_vuelta_rapida.nombre_piloto;
            cout << "Ingrese el tiempo de la vuelta rapida" << endl;
            cin >> actual_vuelta_rapida.tiempo;
            cout << "Ingrese la vuelta en la que se realizo la vuelta rapida" << endl;
            cin >> actual_vuelta_rapida.numero_vuelta;

            for(int i = 0; i < pilotos.size(); i++){
                if((piloto[i].nombre == actual_vuelta_rapida.nombre_piloto)){
                    comrprobacion = false;
                    actual_carrera.vueltas_rapidas = actual_vuelta_rapida;
                }
            }
            if(comprobacion_v){
                cout << "El piloto no esta en la lista" << endl;
            }
        }
        for(int i = 0; i < pilotos.size(); i++){
       
            while(comprobacion){
                
                cout << "Ingrese el nombre del piloto que quedo " << i+1 << ")" << endl;
                cin >> nombre;
                for(int j = 0; j < pilotos.size(); j++){

                    if((pilotos[j].nombre == nombre)){
                        comprobacion = false;
                        actual_carrera.puestos.push_back(pilotos[j]);
                    }
                }
                if(comprobacion){
                    cout << "El piloto no esta en la lista" << endl;
                }
            comprobacion = true;
            }
    
        }
        campeonato.push_back(actual_carrera);
    }

void calcular_puntaje_piloto_equipo(vector<Carrera> &campeonato, vector<Piloto> &pilotos){

carrera actual_carrera = campeonato[campeonato.size()-1];
for(int i = 0; i < actual_carrera.puestos.size(); i++){
    switch(i+1){
        case 1:
            pilotos[j].puntos += 25;
            break;
        case 2:
            pilotos[j].puntos += 18;
            break;
        case 3:
            pilotos[j].puntos += 15;
            break;
        case 4:
            pilotos[j].puntos += 12;
            break;
        case 5:
            pilotos[j].puntos += 10;
            break;
        case 6:
            pilotos[j].puntos += 8;
            break;
        case 7:
            pilotos[j].puntos += 6;
            break;
        case 8:
            pilotos[j].puntos += 4;
            break;
        case 9:
            pilotos[j].puntos += 2;
            break;
        case 10:
            pilotos[j].puntos += 1;
            break; 
    }

    }
}

void ordenar_tabla_equipos(vector<Piloto> &pilotos, vector<Equipo> &equipos){
    for(int i = 0; i < pilotos.size(); i++){
        for(int j = 0; j < equipos.size(); j++){
            if(pilotos[i].equipo == equipos[j].nombre){
                equipos[j].puntos += pilotos[i].puntos;
            }
        }
    }
    for(int i = 0; i < equipos.size(); i++){
        for(int j = 0; j < equipos.size()-1; j++){
            if(equipos[j].puntos < equipos[j+1].puntos){
                swap(equipos[j], equipos[j+1]);
            }
        }
    }
}

void mostrar_tabla_equipos(vector<Equipo> &equipos){
    cout << "---------------------------------------------------------------------" << endl;
    cout << "Posicion\tNombre\t\tPuntos" << endl;
    cout << "---------------------------------------------------------------------" << endl;
    for(int i = 0; i < equipos.size(); i++){
        cout << i+1 << "\t\t" << equipos[i].nombre << "\t\t" << equipos[i].puntos << endl;
        cout << "---------------------------------------------------------------------" << endl;
    }
}



  int main(){
    vector<Equipo> equipos = {
        {"Red Bull Racing", 0},
        {"Mercedes AMG", 0},
        {"Ferrari", 0},
        {"McLaren", 0},
        {"Aston Martin", 0},
        {"Alpine", 0},
        {"Williams", 0},
        {"Haas", 0},
        {"AlphaTauri", 0},
        {"Alfa Romeo", 0}
    };
    vector<Piloto> pilotos = {
        {"Max Verstappen", 0, "Red Bull Racing"},
        {"Sergio Pérez", 0, "Red Bull Racing"},
        {"Lewis Hamilton", 0, "Mercedes AMG"},
        {"George Russell", 0, "Mercedes AMG"},
        {"Charles Leclerc", 0, "Ferrari"},
        {"Carlos Sainz", 0, "Ferrari"},
        {"Lando Norris", 0, "McLaren"},
        {"Oscar Piastri", 0, "McLaren"},
        {"Fernando Alonso", 0, "Aston Martin"},
        {"Lance Stroll", 0, "Aston Martin"},
        {"Pierre Gasly", 0, "Alpine"},
        {"Esteban Ocon", 0, "Alpine"},
        {"Alexander Albon", 0, "Williams"},
        {"Logan Sargeant", 0, "Williams"},
        {"Kevin Magnussen", 0, "Haas"},
        {"Nico Hülkenberg", 0, "Haas"},
        {"Yuki Tsunoda", 0, "AlphaTauri"},
        {"Daniel Ricciardo", 0, "AlphaTauri"},
        {"Valtteri Bottas", 0, "Alfa Romeo"},
        {"Zhou Guanyu", 0, "Alfa Romeo"}
    };

    for (int i = 0; i < 24; i++){
       // 1
       cargar_datos_carrera();
       // 2
       calcular_puntaje_piloto_equipo();
    }
    // 3
    ordenar_tabla_equipos();
    mostrar_tabla_equipos();
 }