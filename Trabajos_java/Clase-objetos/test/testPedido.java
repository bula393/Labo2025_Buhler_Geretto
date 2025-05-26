package test;
import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.*;
import objetos.Plato;
import org.junit.Assert;
import org.junit.Test;
import random.Pedido;
import sistemas.Sistema_pedido;

import java.util.ArrayList;

public class testPedido {
@Test
    public void testAddPlato(){
        Pedido p1 = new Pedido();
        Plato plato = new Plato();
        assertEquals(0,p1.getPlatos().size());
        p1.addPlato(plato);
        assertEquals(1,p1.getPlatos().size());
    }
@Test
    public void testremovePlato(){
        Pedido p1 = new Pedido();
        Plato plato = new Plato();
        p1.addPlato(plato);
        assertEquals(1,p1.getPlatos().size());
        p1.bajaplato(plato);
        assertEquals(0,p1.getPlatos().size());
    }
@Test
    public void testListadoP(){
        Sistema_pedido s1 = new Sistema_pedido(new ArrayList<>());
        Pedido p1 = new Pedido();
        Plato plato = new Plato();
        p1.addPlato(plato);
    }
}
