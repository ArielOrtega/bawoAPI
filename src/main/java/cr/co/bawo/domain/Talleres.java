package cr.co.bawo.domain;

public class Talleres {

		public int codigoTaller;
		public String nombreTaller;
		public String descripcionTaller;
		public String imagenTaller;
		
		public Talleres() {
			codigoTaller = 0;
			nombreTaller = "";
			descripcionTaller = "";
			imagenTaller = "";
		}
		
		public Talleres(int codigoTaller, String nombreTaller, String descripcionTaller, String imagenTaller) {
			this.codigoTaller = codigoTaller;
			this.nombreTaller = nombreTaller;
			this.descripcionTaller = descripcionTaller;
			this.imagenTaller = imagenTaller;
			
		}

		public int getCodigoTaller() {
			return codigoTaller;
		}

		public void setCodigoTaller(int codigoTaller) {
			this.codigoTaller = codigoTaller;
		}

		public String getNombreTaller() {
			return nombreTaller;
		}

		public void setNombreTaller(String nombreTaller) {
			this.nombreTaller = nombreTaller;
		}

		public String getDescripcionTaller() {
			return descripcionTaller;
		}

		public void setDescripcionTaller(String descripcionTaller) {
			this.descripcionTaller = descripcionTaller;
		}

		public String getImagenTaller() {
			return imagenTaller;
		}

		public void setImagenTaller(String imagenTaller) {
			this.imagenTaller = imagenTaller;
		}
		
}
