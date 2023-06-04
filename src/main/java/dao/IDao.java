package dao;
import java.util.List;


public interface IDao<T> {
    int agregar(T o);
    int editar(T o);
    int eliminar(T o);
    List<T> seleccionar();

    T seleccionaruno(int id);
}

