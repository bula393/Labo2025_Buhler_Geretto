#include <iostream>
#include <iostream>
#include <vector>
using namespace std;

struct producto
{
    string nombre;
    string precio;
};

struct producto_cantidad
{
    producto product;
    int cantidad;
};
struct Pedido {
    int numero;
    string nombre;
    int precio;
    vector<string> lista_productos;
};

void cancelar_pedido(vector<Pedido> &pedidos_pendientes,vector<producto> productos,int &pedido)
{   
    int numero_pedido;
    int exito = 0;
    cout << "diga  el numero de pedido que desea canselar" << endl;
    cin >> numero;
    for (int i = 0; i < pedidos_pendientes.size; i++)
    {
        if(numero_pedido==pedidos_pendientes[i].numero){
            pedidos_pendientes.erase(i);
            exito=1;
        }
    }
    if{exito==1}{
        cout << "el pedido a sido cancelado" << endl;
    }
    else{
        cout << "no hay un pedido con ese numero en este momento" << endl;
    }
}






void agregar_pedido(vector<Pedido> &pedidos_pendientes,producto productos,int &pedido)
{
    
    int eleccion;
    int cantidad;
    int preciofinal=0
    string nombre;
    vector<product> lista;
    cout << "diga nombre para el pedido"
    cin >> nombre;
    while (eleccion!=0)
    {
        cout << "elija un producto de esta lista por el numero a su izquierda, si no quiere mas escriba 0" << endl
        for (int i = 0; i < 10; i++)
        {
            cout << productos[i].nombre << ' ' << productos[i].precio << endl;
        }
        cin >> eleccion;
        cout << "ingrese la canntidad de ese producto que quiere" << endl;
        cin >> cantidad;
        lista.pushback({eleccion,cantidad})
    }
    for (int i = 0; i < lista.size(); i++)
    {
        preciofinal+= lista[i].precio*lista[i].cantidad
    }
    
    pedidos_pendientes.pushback(pedido,nombre,preciofinal,lista);
}



int main(){
    
    int pedido=0;
    vector<Pedido> pedidos_pendientes; 
    producto productos[10]=
    {"Hamburguesa", 8},
    {"Pizza Margherita", 12},
    {"Ensalada César", 7},
    {"Tacos al Pastor",5},
    {"Sopa de Tomate", 4.00},
    {"Pasta Carbonara", 11},
    {"Pollo Asado", 9.90},
    {"Paella", 14},
    {"Sushi Roll",13},
    {"Postre de Chocolate", 6};







}


