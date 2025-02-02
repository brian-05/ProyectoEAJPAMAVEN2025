package DaoImp;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import Interfaces.IProducto;
import model.TblProducto;

public class ClassProductoImp implements IProducto {

	@Override
	public void RegistrarProducto(TblProducto tblproducto) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("ProyectoEAJPAMaven2025");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		em.persist(tblproducto);
		System.out.println("Producto registrado en BD correctamente!!!!!!");
		em.getTransaction().commit();
		em.close();
	}

	@Override
	public void ActualizarProducto(TblProducto tblproducto) {
		
		
	}

	@Override
	public void EliminarProducto(TblProducto tblproducto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<TblProducto> ListadoProducto() {
		//establecemos conexion con la unidad de persistencialll
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("ProyectoEAJPAMaven2025");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		List<TblProducto> listadoproductos = em.createQuery("select p from TblProducto p", TblProducto.class).getResultList();
		em.getTransaction().commit();
		em.close();
		return listadoproductos;
	}

	@Override
	public TblProducto BuscarProducto(TblProducto tblproducto) {
		// TODO Auto-generated method stub
		return null;
	}

}
