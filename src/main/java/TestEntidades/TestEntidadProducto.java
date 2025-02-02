package TestEntidades;

import java.util.Date;
import java.util.List;

import DaoImp.ClassProductoImp;
import model.TblProducto;

public class TestEntidadProducto {

	public static void main(String[] args) {
		TblProducto tbl = new TblProducto();
		ClassProductoImp crudimp = new ClassProductoImp();
		
//		tbl.setNomprod("fideos");
//		tbl.setCantidad(4);
//		tbl.setPrecio(5);
//		tbl.setTotal(tbl.getCantidad() * tbl.getPrecio());
//		tbl.setNrolote("lote2025");
//		tbl.setCodbarras("cod789456");
//		Date fecha = new Date();
//		Date fechasql = new Date(fecha.getTime());
//		tbl.setFechaven(fechasql);
//		
//		crudimp.RegistrarProducto(tbl);
		//*********TESTEANDO EL METODO LISTADO*******
		List<TblProducto> listadoproducto = crudimp.ListadoProducto();
		for(TblProducto prod:listadoproducto){
			System.out.println("codigo " + prod.getIdproducto() + " producto " + prod.getNomprod() + 
			" precio " + prod.getPrecio() + " cantidad " + prod.getCantidad() + " total " + 
			prod.getTotal() + " codigo de barras " + prod.getCodbarras());
		}
		
		
	}  

}
