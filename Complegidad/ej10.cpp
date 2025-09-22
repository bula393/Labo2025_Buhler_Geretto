using namespace std;
#include <vector>
#include <iostream>


void imprimirvector(vector<int> vectorA) {
    for (int i = 0; i < vectorA.size(); i++) {

            cout << vectorA[i] << " ";
    }
    cout << endl;
}

void ordenado1A3(vector<int> &v1) {
    int i = 0;
    int j = v1.size() - 1;
    while (i < j) { // O(n)
        if (v1[i] == 1) { // O(1)
            i++;
        } else if (v1[j] == 3) { // O(1)
            j--;
        } else if (v1[i] == 3 && v1[j] == 1) { // O(1)
            swap(v1[i], v1[j]); //
            i++;
            j--;
        } else if (v1[i] == 2) { // O(1)    
            if (v1[j] == 3) { // O(1)
                swap(v1[i], v1[j]);
                j--;
            } else { // O(1)
                i++;
            }
        } else if (v1[j] == 2) { // O(1)
            if (v1[i] == 1) { // O(1)
                swap(v1[i], v1[j]);
                i++;
            } else { // O(1)
                j--;
            }
        }
}}
int main(){
    vector<int> vectorA = {1,1,2,1,3,2,3,1};
    ordenado1A3(vectorA);
    imprimirvector(vectorA);
}



    



