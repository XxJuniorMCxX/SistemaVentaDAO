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
public interface CrudIngresoInterface<T,D> {
   //permite ingresar como parameto una variable llamada texto de tipo string por que cuando yo realize el listado tambien 
    //voy a permitir listar un registro
   public List<T> listar(String texto,int totalPorPagina,int numPagina);
   //
   public List<D> listarDetalle(int id);
   //boolen para saber si es 1 va ha permitir actualizar o si es cero no lo va ha permitir
   public boolean insertar(T obj);
   public boolean anular(int id);
   public int total();
   public boolean existe(String texto1,String texto2);
}
