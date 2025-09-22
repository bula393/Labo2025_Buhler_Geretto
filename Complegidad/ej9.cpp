using namespace std;
#include <vector>
#include <iostream>


void imprimirvector(vector<int> vectorA) {
    for (int i = 0; i < vectorA.size(); i++) {

            cout << vectorA[i] << " ";
    }
    cout << endl;
}

vector<int> elementoCompartido(vector<int> v1, vector<int> v2, vector<int> v3) {
    vector<int> indicesElementosCompartidos;
    int i = 0;
    int j = 0; 
    int k = 0;
    while (i < v1.size() && j < v2.size() && k < v3.size() ) { // O(n+m)
        if (v1[i]>v2[j] && v1[i]>v3[k]) { // O(1)
            j++;
            k++;
        } else if(v2[j]>v1[i] && v2[j]>v3[k])
        {
            i++;
            k++;
        }
        else if (v3[k]>v1[i] && v3[k]>v2[j])
        {
            i++;
            j++;
        }
        
    else if(v1[i]<v2[j]){
        i++;
    }
    else if(v1[i]<v2[j]){
        i++;
    }
    else if(v2[j]<v3[k]){
        j++;
    }
    else if(v2[j]<v3[k]){
        j++;
    }
    else if(v3[k]<v1[i]){
        k++;
    }
    else if(v3[k]<v1[i]){
        k++;
    }
    else{
        indicesElementosCompartidos.push_back(i);
        indicesElementosCompartidos.push_back(j);
        indicesElementosCompartidos.push_back(k);
        i = v1.size();
    }
}return indicesElementosCompartidos;
}

int main() {
    vector<int> vectorA = {1,5,7,10};
    vector<int> vectorB = {1,2,3,4,5,6};
    vector<int> vectorC = {5,6,66,76};
    imprimirvector(elementoCompartido(vectorA, vectorB,vectorC));
};


    



