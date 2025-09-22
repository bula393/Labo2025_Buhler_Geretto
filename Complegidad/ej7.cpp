using namespace std;
#include <vector>
#include <iostream>

void  matrizconValoresRepetidos(vector<vector<bool>> &matriz) {
    
    for (int i = 0; i < matriz.size(); i++) { // o[n]
        for (int j = i+1; j < matriz.size() ;j++)// o[n]
        {
            if (matriz[i] == matriz[j])// o[1]
            {
                matriz.erase(matriz.begin() + j); // o[1]
            }
        }
        
    }
}
void imprimirMatriz(vector<vector<bool>> &matriz) {
    for (int i = 0; i < matriz.size(); i++) {
        for (int j = 0; j < matriz[i].size(); j++) {
            cout << matriz[i][j] << " ";
        }
        cout << endl;
    }
}

int main() {
    vector<vector<bool>> matriz = {
    {1, 0, 1, 1},  // Fila repetida (1)
    {0, 0, 0, 1},  // Fila repetida (2)
    {1, 1, 0, 0},  // Fila única (solo aparece una vez)
    {1, 0, 1, 1},  // Fila repetida (1)
    {0, 0, 0, 1}   // Fila repetida (2)
};
    imprimirMatriz(matriz);
    matrizconValoresRepetidos(matriz);

    cout << "Matriz sin filas repetidas:" << endl;
    imprimirMatriz(matriz);
}

    

// o[n^2]
// 2) creo que no,no recorro la matriz por sus casilleros, solo por sus filas
// 3) no


