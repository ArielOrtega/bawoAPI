package cr.co.bawo.domain;

public class Categoria {

		private int codigo;
		private String nombre;
		private boolean visibilidad;
		
		public Categoria() {
			this.codigo = 0;
			this.nombre = "";
			this.visibilidad = false;
		}

		public Categoria(int codigo, String nombre, boolean visibilidad) {
			this.codigo = codigo;
			this.nombre = nombre;
			this.visibilidad = visibilidad;
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

		public boolean isVisibilidad() {
			return visibilidad;
		}

		public void setVisibilidad(boolean visibilidad) {
			this.visibilidad = visibilidad;
		}
}
