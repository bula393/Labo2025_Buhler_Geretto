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
    bool completado;
};

void cancelar_pedido(vector<Pedido> &pedidos_pendientes)
{   
    int numero_pedido;
    int exito = 0;
    cout << "diga  el numero de pedido que desea canselar" << endl;
    cin >> numero_pedido;
    for (int i = 0; i < pedidos_pendientes.size(); i++)
    {
        if(numero_pedido==pedidos_pendientes[i].numero){
            pedidos_pendientes.erase(pedidos_pendientes.begin()+i);
            exito++;
        }
    }
        if(exito==1){
            cout << "el pedido a sido cancelado" << endl;
        }
        else{
            cout << "no hay un pedido con ese numero en este momento" << endl;
        }
}

void completar_pedido(vector<Pedido> &pedidos_pendientes)
{   
    int numero_pedido;
    int exito = 0;
    cout << "diga  el numero de pedido que desea dar por completado" << endl;
    cin >> numero_pedido;
    for (int i = 0; i < pedidos_pendientes.size(); i++)
    {
        if(numero_pedido==pedidos_pendientes[i].numero){
            pedidos_pendientes[i].completado=true;
            exito=1;
        }
    }
        if(exito==1){
            cout << "el pedido a sido completado" << endl;
        }
        else{
            cout << "no hay un pedido con ese numero en este momento" << endl;
        }
}


void suma_completos(vector<Pedido> &pedidos_pendientes)
{   
    int total=0;
    int exito = 0;
    for (int i = 0; i < pedidos_pendientes.size(); i++)
    {
        if(pedidos_pendientes[i].completado){
            total+=pedidos_pendientes[i].precio;
        }
    }
        if(exito>0){
            cout << "el total del dia es" << total << '$' << endl;
        }
        else{
            cout << "no hay ningun pedido completado hoy" << endl;
        }
}

void mostrar(vector<Pedido> &pedidos_pendientes)
{   

    for (int i = 0; i < pedidos_pendientes.size(); i++)
    {
        if(!pedidos_pendientes[i].completado){
            cout << "------------------------------------" << endl;
            cout << "el pedido numero " << pedidos_pendientes[i].numero << " realizado por " << pedidos_pendientes[i].nombre << endl;
            cout << "producto     |    cantidad" << endl;
            for (int f = 0; f < pedidos_pendientes[i].lista_productos.size(); f++)
            {
                cout << pedidos_pendientes[i].lista_productos[f].product.nombre << "     " << pedidos_pendientes[i].lista_productos[f].cantidad << endl;
            }
            cout << "el total del pedido es de " << pedidos_pendientes[i].precio << endl;
            cout << "------------------------------------" << endl;
        }
    }
}

void agregar_pedido(vector<Pedido> &pedidos_pendientes,producto productos[10],int &pedido)
{
    pedido++;
    int eleccion=1;
    int preciofinal=0;
    Pedido eligiendo;
    eligiendo.completado=false;
    producto_cantidad can_p;
    cout << "diga nombre para el pedido" << endl;
    cin >> eligiendo.nombre;
    eligiendo.numero=pedido;
    while (eleccion!=0)
    {
        cout << "elija un producto de esta lista por el numero a su izquierda, si no quiere mas escriba 0" << endl;
        for (int i = 0; i < arreglo; i++)
        {
            cout << i+1 << ')' << productos[i].nombre << ' ' << productos[i].precio << endl;
        }
        cin >> eleccion;
        if(eleccion!=0)
            {
                can_p.product=productos[eleccion-1];
                cout << "ingrese la canntidad de ese producto que quiere" << endl;
                cin >> can_p.cantidad;
                eligiendo.lista_productos.push_back(can_p);
            }
    }
    for (int i = 0; i < eligiendo.lista_productos.size(); i++)
    {
        preciofinal+= eligiendo.lista_productos[i].cantidad * eligiendo.lista_productos[i].product.precio;
        eligiendo.precio=preciofinal;
}
pedidos_pendientes.push_back(eligiendo);
}


int main(){

    int pedido=0;
    vector<Pedido> pedidos_pendientes; 
    producto productos[arreglo]={
    {"Hamburguesa", 8},
    {"Pizza Margherita", 12},
    {"Ensalada César", 7},
    {"Tacos al Pastor",5},
    {"Sopa de Tomate", 4},
    {"Pasta Carbonara", 11},
    {"Pollo Asado", 9},
    {"Paella", 14},
    {"Sushi Roll",13},
    {"Postre de Chocolate", 6}
    };
    while(true){
        int opcion=0;
        cout << "elija una opcion, si quiere salir escriba 0" << endl;
        cout << "1) agregar pedido"  << endl;
        cout << "2) Cancelar pedido " << endl;
        cout << "3) completar pedido" << endl;
        cout << "4) suma diaria" << endl;
        cout << "5) mostrar pedidos en contra" << endl;
        cin >> opcion;
        switch (opcion)
        {
            case 0 :
                return 0;
            break;
            case 1 :
                agregar_pedido(pedidos_pendientes,productos,pedido);
                break;
            case 2 :
                cancelar_pedido(pedidos_pendientes);
                break;
            case 3 :
                completar_pedido(pedidos_pendientes);
                break;
            case 4 :
                suma_completos(pedidos_pendientes);
                break;        
            case 5 :
                mostrar(pedidos_pendientes);
                break;   
            default:
                break;
            }
        cout << pedidos_pendientes[0].nombre << endl;
    }
}


