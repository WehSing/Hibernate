package entidades;
import java.util.*;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.Session;
import org.hibernate.cfg.AnnotationConfiguration;
public class operaciones {
    private Session sesion;
    
    private void iniciaOperacion()   {
    SessionFactory sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
    sesion = sessionFactory.openSession();
    sesion.getTransaction().begin();
    }
    
    private void terminaOperacion() {
        sesion.getTransaction().commit();
        sesion.close();
    }
    
    public int guardarProducto(Producto producto)    {
        int id=0;
        iniciaOperacion();
        id=(int)sesion.save(producto);
        terminaOperacion();
        return id;
    }
    public void actualizaProducto(Producto producto)    {   
        iniciaOperacion();
        sesion.update(producto);
        terminaOperacion();
    }
    public void eliminaProducto(Producto producto){ 
        iniciaOperacion();
        sesion.delete(producto);
        terminaOperacion();
    }
    public Producto obtenProducto(int idProducto)   {   
        Producto producto=null;
        iniciaOperacion();
        producto=(Producto) sesion.get(Producto.class, idProducto);
        terminaOperacion();
        return producto;
    }
    public List<Producto> ListadeProductos(){   
        List<Producto> listaProducto=null;
        iniciaOperacion();
        listaProducto=sesion.createQuery("from Producto").list();
        terminaOperacion();
        return listaProducto;
    }
}
