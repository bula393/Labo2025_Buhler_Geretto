#include <iostream>
#include <iostream>
#include <vector>
using namespace std;
const int arreglo=10;
struct date{
    int dia;
    int mes;
    int año;
};
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
    vector<producto_cantidad> lista_productos;
    date fecha;
    int preciototal;
};

 
void agregar_pedido(vector<pedido> &pedidos,producto &productos[10])
{
   int eleccion;
   pedido orden;
   producto_cantidad cant_pro;
   cout << "elija su producto basado en su numero" << endl;
   while (eleccion!=0)
    {
        cout << "ingrese el numeor de producto que desea, si no quiere mas ingrese 0" << endl;
        cout << "-------------------------------------------" << endl;

        for (int i = 0; i < arreglo; i++)
            {
                cout << i+1 << ')' << productos[i].nombre << "-- " << productos[i].precio << '$' << endl; 
            }
        cout << "-------------------------------------------" << endl;
        cin >> eleccion;
        if(eleccion!=0)
            {
                cant_pro.product=productos[eleccion-1];
                cout << "ingrese la canntidad de ese producto que quiere" << endl;
                cin >> cant_pro.cantidad;
                productos[eleccion-1].cantidadventas+=cant_pro.cantidad;
                orden.lista_productos.push_back(cant_pro);
            }

    }
    cout << "ingrese su nombre para el pedido" << endl;
    cin >> orden.nombre;
    cout << "ingrese dia del pedido" << endl;
    cin >> orden.fecha.dia;
    cout << "ingrese mes del pedido" << endl;
    cin >> orden.fecha.mes;
    cout << "ingrese año del pedido" << endl;
    cin >> orden.fecha.año;
    for (int i = 0; i < orden.lista_productos.size(); i++)
    {
        if (orden.lista_productos[i].product.promocion)
        {
            orden.preciototal+=(orden.lista_productos[i].product.precio*0.8)*orden.lista_productos[i].cantidad;
        }
        else
        {
            orden.preciototal+=orden.lista_productos[i].product.precio*orden.lista_productos[i].cantidad;
        }
        
    }
    pedidos.push_back(orden);
    cout << "pedido agregado" << endl;
}

int main(){
    producto productos[arreglo] = {
        {"Cheeseburger", true, 150, 0, "Hamburguesas"},
        {"Doble Bacon Burger", false, 120, 0, "Hamburguesas"},
        {"Veggie Burger", true, 90, 0, "Hamburguesas"},
        {"Helado de Chocolate", false, 130, 0, "Postres"},
        {"Pastel de Queso", true, 110, 0, "Postres"},
        {"Brownie con Helado", false, 95, 0, "Postres"},
        {"Coca Cola", true, 200, 0, "Bebidas"},
        {"Jugo de Naranja", false, 80, 0, "Bebidas"},
        {"Batido de Fresa", true, 75, 0, "Bebidas"},
        {"Café Expreso", false, 160, 0, "Bebidas"}
    };
    int opcion=0;
    vector<pedido> pedidos;
    
    while (true)
    {
        cout << "elija una opcion, si quiere salir escriba 0" << endl;
        cout << "1) Agregar pedido"  << endl;


        cin >> opcion;
        switch (opcion)
        {
            case 1:
                agregar_pedido(pedidos,productos);
                break;
            
            default:
                break;
        }
    }
    

}