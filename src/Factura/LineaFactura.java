package Factura;
/**
 * Clase para introducir los datos del producto	
 * @author <u>Andr�s</u>
 * @version 1.0
 * @see Factura
 */
public class LineaFactura {
		
	public String id_producto; 		// identificador (codigo) del producto
	public String nombre_producto; 	// nombre del producto
	
	public float precio; 			//precio por una unidad del producto
	public float cantidad; 			//cantidad de unidades compradas
	public float descuento; 		//descuento de la unidad (no se esta utilizando)
	
	/**
	 * 
	 * @param idProducto Identificador (codigo) del producto
	 * @param nombreProducto Nombre del producto
	 * @param precio Precio por una unidad del producto
	 * @param cantidad Cantidad de unidades compradas
	 * @param descuento Descuento de la unidad (no se esta utilizando)
	 */
	public LineaFactura(String idProducto, String nombreProducto, float precio,
			float cantidad, float descuento) {
		super();
		id_producto = idProducto;
		nombre_producto = nombreProducto;
		this.precio = precio;
		this.cantidad = cantidad;
		this.descuento = descuento;
	}
	
	@Override
	public String toString() {
		return "\n\tLineaFactura ["  				 				 
				+ "id_producto=" + id_producto
				+ ", nombre_producto=" + nombre_producto				
				+ ", precio=" + precio
				+ ", cantidad=" + cantidad
				+ ", descuento=" + descuento
				+ "]";
	}
	
	
	/**
	 * Devuelve el precio total de una linea. El precio de la unidad por la cantidad de productos 
	 * pedidos de esa uniad 
	 */
	public float getTotal(){
		float total = this.precio * this.cantidad;
		return total;
	}

}
