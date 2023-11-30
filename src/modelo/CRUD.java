
package modelo;

import java.util.List;

/**
 *
 * @author milag
 */
public interface CRUD {
    //metodos a utilizar en MANTENIMIENTO
    public List listar();
    public int add(Object o);
    public int actualizar(Object o);
    public void eliminar(int id);
}
