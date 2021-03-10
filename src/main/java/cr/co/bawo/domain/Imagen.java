package cr.co.bawo.domain;

public class Imagen {

		private int codigoImagen;
		private String nombre;
		private String urlImagen;
		private int codigoEmpresa;
		
		public Imagen() {
			this.codigoImagen = 0;
			this.nombre = "";
			this.urlImagen = "";
			this.codigoEmpresa = 0;
		}

		public Imagen(int codigoImagen, String nombre, String urlImagen, int codigoEmpresa) {
			this.codigoImagen = codigoImagen;
			this.nombre = nombre;
			this.urlImagen = urlImagen;
			this.codigoEmpresa = codigoEmpresa;
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

		public int getCodigoEmpresa() {
			return codigoEmpresa;
		}

		public void setCodigoEmpresa(int codigoEmpresa) {
			this.codigoEmpresa = codigoEmpresa;
		}
}
