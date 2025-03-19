#include <iostream>
#include <iostream>
#include <vector>
using namespace std;

struct producto{
    string nombre;
    bool promocion;
    int cantidadventas;
    int precio;
    string categoria;
};
struct producto_cantidad
{
    producto product;
    int cantidad;
};
struct pedido{
    string nombre;
    vector<producto_cantidad> tipoycantidad;
    int fecha;
    int preciototal;
};

void usuario_llena_pedido(vector<producto> &productos){
    producto product;
    string opcion;
    cout << "llena el producto , pone 20" << endl;
    for (int i = 0; i < 20; i++)
    {
            cout << "ingrese nombre:" << endl;
            cin >> product.nombre;
            cout << "ingrese categoria:" << endl;
            cin >> product.categoria;
            cout << "ingrese precio:" << endl;
            cin >> product.precio;
            cout << "ingrese si tiene o no promocion, si tiene promocion escriba 1 sino escriba 0:" << endl;
            cin >> product.promocion;
            product.cantidadventas=0;
            productos.push_back(product);
        }
}

void agregar_pedido(vector<pedido> &pedidos,vector<producto> &productos)
{
   int eleccion;
   pedido pedidos;
   producto_cantidad cant_pro;
   cout << "elija su producto basado en su numero" << endl;
   while (eleccion!=0)
    {
        cout << "ingrese el numeor de producto que desea, si no quiere mas ingrese 0" << endl;
        cout << "-------------------------------------------" << endl;

        for (int i = 0; i < productos.size(); i++)
            {
                cout << i+1 << ')' << productos[i].nombre << "-- " << productos[i].precio << endl; 
            }
        cout << "-------------------------------------------" << endl;
        cin >> eleccion;
        if(eleccion!=0)
            {
                cant_pro.product=productos[eleccion-1];
                cout << "ingrese la canntidad de ese producto que quiere" << endl;
                cin >> cant_pro.cantidad;
            }
    }
   

    
   cin >> eleccion;
}