#include <iostream>
#include <iostream>
#include <vector>
using namespace std;

const int arreglo=10;

struct producto
{
    string nombre;
    int precio;
};

struct producto_cantidad
{
    producto product;
    float cantidad;
};
struct Pedido {
    int numero;
    string nombre;
    int precio;
    vector<producto_cantidad> lista_productos;
};

void cancelar_pedido(vector<Pedido> &pedidos_pendientes,vector<producto> productos)
{   
    int numero_pedido;
    int exito = 0;
    cout << "diga  el numero de pedido que desea canselar" << endl;
    cin >> numero_pedido;
    for (int i = 0; i < pedidos_pendientes.size(); i++)
    {
        if(numero_pedido==pedidos_pendientes[i].numero){
            pedidos_pendientes.erase(i);
            exito=1;
        }
    }
        if(exito==1){
            cout << "el pedido a sido cancelado" << endl;
        }
        else{
            cout << "no hay un pedido con ese numero en este momento" << endl;
        }
}






void agregar_pedido(vector<Pedido> &pedidos_pendientes,producto productos[10],int &pedido)
{
    pedido++;
    int eleccion=1;
    int preciofinal=0;
    Pedido eligiendo;
    producto_cantidad can_p;
    vector<producto_cantidad> lista;
    cout << "diga nombre para el pedido" << endl;
    cin >> eligiendo.nombre;
    eligiendo.numero=pedido;
    while (eleccion!=0)
    {
        cout << "elija un producto de esta lista por el numero a su izquierda, si no quiere mas escriba 0" << endl;
        for (int i = 0; i < arreglo; i++)
        {
            cout <<i+1 << ')' << productos[i].nombre << ' ' << productos[i].precio << endl;
        }
        cin >> eleccion;
        can_p.product=productos[eleccion-1];
        cout << "ingrese la canntidad de ese producto que quiere" << endl;
        cin >> can_p.cantidad;
        eligiendo.lista_productos.pushback(can_p);
    }
    for (int i = 0; i < lista.size(); i++)
    {
        preciofinal+= eligiendo.lista_productos[i].cantidad * eligiendo.lista_productos[i].product.precio;
        eligiendo.precio=preciofinal;
        pedidos_pendientes.pushback(eligiendo);
}
}


int main(){
    
    int pedido=0;
    vector<Pedido> pedidos_pendientes; 
    producto productos[arreglo]={
    {"Hamburguesa", 8},
    {"Pizza Margherita", 12},
    {"Ensalada César", 7},
    {"Tacos al Pastor",5},
    {"Sopa de Tomate", 4.00},
    {"Pasta Carbonara", 11},
    {"Pollo Asado", 9.90},
    {"Paella", 14},
    {"Sushi Roll",13},
    {"Postre de Chocolate", 6}
};







}


