package cr.co.bawo.domain;

public class Proveedor {

	private int codigo;
	private String nombre;
	private String descripcion;
	private String urlImagen;
	
	public Proveedor() {
	}

	public Proveedor(int codigo, String nombre, String descripcion, String urlImagen) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.urlImagen = urlImagen;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getUrlImagen() {
		return urlImagen;
	}

	public void setUrlImagen(String urlImagen) {
		this.urlImagen = urlImagen;
	}
}
