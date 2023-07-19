/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos.interfaces;

import java.util.List;

/**
 *
 * @author XxJuniorMxX
 */
public interface CrudSimpleInterface<T> {
   public List<T> listar(String texto);
   public boolean insertar(T obj);
   public boolean actualizar(T obj);
   public boolean desactivar(int id);
   public boolean activar(int id);
//calcular el total de registros de la tabla
   public int total();
   //para saber si existe o no un registro en la tabla correspondiente
   public boolean existe(String texto);
}
