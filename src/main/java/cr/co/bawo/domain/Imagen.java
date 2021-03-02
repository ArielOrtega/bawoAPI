package cr.co.bawo.domain;

public class Imagen {

		private int codigoImagen;
		private String nombre;
		private String urlImagen;
		private Empresa empresa;
		
		public Imagen() {
			this.codigoImagen = 0;
			this.nombre = "";
			this.urlImagen = "";
			this.empresa = null;
		}

		public Imagen(int codigoImagen, String nombre, String urlImagen, Empresa empresa) {
			this.codigoImagen = codigoImagen;
			this.nombre = nombre;
			this.urlImagen = urlImagen;
			this.empresa = empresa;
		}

		public int getCodigoImagen() {
			return codigoImagen;
		}

		public void setCodigoImagen(int codigoImagen) {
			this.codigoImagen = codigoImagen;
		}

		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public String getUrlImagen() {
			return urlImagen;
		}

		public void setUrlImagen(String urlImagen) {
			this.urlImagen = urlImagen;
		}

		public Empresa getEmpresa() {
			return empresa;
		}

		public void setEmpresa(Empresa empresa) {
			this.empresa = empresa;
		}
}
