
// recorre un vector y te devuelve el elemento mas grande
using namespace std;
#include <iostream>
#include <vector>
int mesetaMasLarga (vector<int>& v) {
int i = 0;
int maxMeseta = 0; 
int meseta ; // hasta aca 3, O{1}
while ( i < v.size () ) {
int j = i + 1;
while ( j < v.size () && v [ i ] == v [ j ]) {
j ++; // O{1}
} // lo de adentro * O{n}
meseta = j - i ; i = j ; //  3, O{1}
if ( meseta > maxMeseta ) { // O{1}
maxMeseta = meseta ; // O{1}
}
}// lo de adentro * O{n}
return maxMeseta ;// O{1}
// Complejidad total: O{n'2}
}

int mesetaMasLargaMejorado (vector<int>& v) {
int i = 0;
int maxMeseta = 0; 
int meseta ; // hasta aca 3, O{1}
while ( i < v.size () ) {
    meseta = v[i]; // 2,O{1}
    if (meseta>maxMeseta) // O{1}
    {
        maxMeseta=meseta; // O{1}
    }
    i++; // O{1}
 } // lo de adentro * O{n}
return maxMeseta ;// O{1}
} // Complejidad  O{n}
int main(){
    vector<int> lista = {5,32,754,324,7};
    cout << mesetaMasLarga(lista) << endl;
    cout << mesetaMasLargaMejorado(lista) << endl;
}
