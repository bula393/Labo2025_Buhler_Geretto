using namespace std;
#include <vector>
#include <iostream>


void imprimirvector(vector<int> vector) {
    for (int i = 0; i < vector.size(); i++) {

            cout << vector[i] << " ";
    }
}

vector<int> ordenados(vector<int> v1, vector<int> v2) {
    vector<int> vectorOrdenado;
    int i = 0;
    int j = 0;
    while (i < v1.size() && j < v2.size()) { // O(n+m)
        if (v1[i] < v2[j]) { // O(1)
            vectorOrdenado.push_back(v1[i]); // O(1)
            i++;
        } else {
            vectorOrdenado.push_back(v2[j]); // O(1)
            j++;
        }
    }
    while (i < v1.size()) { // O(n)
        vectorOrdenado.push_back(v1[i]); // O(1)
        i++;
    }
    while (j < v2.size()) { // O(m)
        vectorOrdenado.push_back(v2[j]); // O(1)
        j++;
    }
    return vectorOrdenado;
}

int main() {
    vector<int> vectorA = {1,4,7,10};
    vector<int> vectorB = {2,3,6};
    imprimirvector(ordenados(vectorA, vectorB));
};


    



