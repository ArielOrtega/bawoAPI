package cr.co.bawo.domain;

public class Producto {

		private int codigo;
		private String nombre;
		private float precio;
		private String informacionNutricional;
		private String descripcion;
		private String imagen;
		private Categoria categoria;
		
		public Producto() {
			this.codigo = 0;
			this.nombre = "";
			this.precio = 0;
			this.informacionNutricional = "";
			this.descripcion = "";
			this.imagen = "";
			this.categoria = null;
		}

		public Producto(int codigo, String nombre, float precio, String informacionNutricional, String descripcion,
				String imagen, Categoria categoria) {
			this.codigo = codigo;
			this.nombre = nombre;
			this.precio = precio;
			this.informacionNutricional = informacionNutricional;
			this.descripcion = descripcion;
			this.imagen = imagen;
			this.categoria = categoria;
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

		public float getPrecio() {
			return precio;
		}

		public void setPrecio(float precio) {
			this.precio = precio;
		}

		public String getInformacionNutricional() {
			return informacionNutricional;
		}

		public void setInformacionNutricional(String informacionNutricional) {
			this.informacionNutricional = informacionNutricional;
		}

		public String getDescripcion() {
			return descripcion;
		}

		public void setDescripcion(String descripcion) {
			this.descripcion = descripcion;
		}

		public String getImagen() {
			return imagen;
		}

		public void setImagen(String imagen) {
			this.imagen = imagen;
		}

		public Categoria getCategoria() {
			return categoria;
		}

		public void setCategoria(Categoria categoria) {
			this.categoria = categoria;
		}
}
