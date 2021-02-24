/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libro.cap02.colecciones;

/**
 *
 * @author eduar
 */
public class MiPila<T>
{
    private static final int capacidadInicial = 5;
    private MiColeccion<T> coll = new MiColeccion<T>(capacidadInicial);
    public void apilar(T elm)
    {
       coll.insertar(elm,0);
    }
       public T desapilar()
    {
       return coll.eliminar(0);
    }
}
