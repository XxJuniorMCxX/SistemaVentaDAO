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
public interface CrudPaginadoInterface<T> {
    //para obtener los registros por partes ingresando total de paginas y numero de pagina
   public List<T> listar(String texto,int totalPorPagina,int numPagina);
   public boolean insertar(T obj);
   public boolean actualizar(T obj);
   public boolean desactivar(int id);
   public boolean activar(int id);
   public int total();
   public boolean existe(String texto);
}
