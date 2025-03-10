#include <iostream>
#include <vector>
using namespace std;

struct Producto {
    string nombre;
    string codigobarra;
    int fecha;
    string marca;
    int precio;
    bool fechavencimiento;
};

int main(){
    Producto  super[3][4]= {
        {
            {"Producto 1", "123456789", 20250310, "Marca A", 150, true},
            {"Producto 2", "987654321", 20250315, "Marca B", 1000, false},
            {"Producto 3", "112233445", 20250320, "Marca C", 250, true},
            {"Producto 4", "556677889", 20250325, "Marca D", 300, false}
        },
        {
            {"Producto 5", "998877665", 20250330, "Marca E", 350, true},
            {"Producto 6", "223344556", 20250405, "Marca F", 1000, false},
            {"Producto 7", "667788990", 20250410, "Marca G", 450, true},
            {"Producto 8", "445566778", 20250415, "Marca H", 500, false}
        },
        {
            {"Producto 9", "778899112", 20250420, "Marca I", 550, true},
            {"Producto 10", "334455667", 20250425, "Marca J", 1000, false},
            {"Producto 11", "990011223", 20250501, "Marca K", 650, true},
            {"Producto 12", "665544332", 20250505, "Marca L", 700, false}
        }
    };

    int total_columna=0;
    int mayorvalor=0;
    int numerocolumna;
        for (int j = 0; j < 4; j++)
        {
            for (int f = 0; f < 3; f++)
            {
                total_columna+=super[f][j].precio;
            }
            if (total_columna>=mayorvalor)
            {
                mayorvalor=total_columna;
                numerocolumna=j+1;
            }
            total_columna=0;
            
            
        }
        
    cout << "la columna " << numerocolumna;


    cout << super[1][2].nombre <<  endl;
    float Promedio;
    for (int i = 0; i < 3; i++)
    {
        for (int j = 0; j < 4; j++)
        {
            Promedio+=super[i][j].precio;
        }
        
    }
    Promedio/=4*3;
    cout << "el promedio es igual a " << Promedio << endl;

    float Suma;
    for (int i = 0; i < 3; i++)
    {
        for (int j = 0; j < 4; j++)
        {
            if (super[i][j].fechavencimiento)
            {
                Suma++;
            }
        }
        
    }
    cout << " El total es: " << Suma << endl;
    
    
}

