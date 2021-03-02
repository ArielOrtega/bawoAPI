package cr.co.bawo.domain;

public class Empresa {

		private int codigo;
		private String nombre;
		private String vision;
		private String mision;
		private String historia;
		private String telefono1;
		private String telefono2;
		private String correo;
		private String direccion;
		private String facebook;
		private String instagram;
		private String whatsapp;
		private String urlLogo;
		
		public Empresa() {
			this.codigo = 0;
			this.nombre = "";
			this.vision = "";
			this.mision = "";
			this.historia = "";
			this.telefono1 = "";
			this.telefono2 = "";
			this.correo = "";
			this.direccion = "";
			this.facebook = "";
			this.instagram = "";
			this.whatsapp = "";
			this.urlLogo = "";
		}

		public Empresa(int codigo, String nombre, String vision, String mision, String historia, String telefono1,
				String telefono2, String correo, String direccion, String facebook, String instagram, String whatsapp,
				String urlLogo) {
			this.codigo = codigo;
			this.nombre = nombre;
			this.vision = vision;
			this.mision = mision;
			this.historia = historia;
			this.telefono1 = telefono1;
			this.telefono2 = telefono2;
			this.correo = correo;
			this.direccion = direccion;
			this.facebook = facebook;
			this.instagram = instagram;
			this.whatsapp = whatsapp;
			this.urlLogo = urlLogo;
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

		public String getVision() {
			return vision;
		}

		public void setVision(String vision) {
			this.vision = vision;
		}

		public String getMision() {
			return mision;
		}

		public void setMision(String mision) {
			this.mision = mision;
		}

		public String getHistoria() {
			return historia;
		}

		public void setHistoria(String historia) {
			this.historia = historia;
		}

		public String getTelefono1() {
			return telefono1;
		}

		public void setTelefono1(String telefono1) {
			this.telefono1 = telefono1;
		}

		public String getTelefono2() {
			return telefono2;
		}

		public void setTelefono2(String telefono2) {
			this.telefono2 = telefono2;
		}

		public String getCorreo() {
			return correo;
		}

		public void setCorreo(String correo) {
			this.correo = correo;
		}

		public String getDireccion() {
			return direccion;
		}

		public void setDireccion(String direccion) {
			this.direccion = direccion;
		}

		public String getFacebook() {
			return facebook;
		}

		public void setFacebook(String facebook) {
			this.facebook = facebook;
		}

		public String getInstagram() {
			return instagram;
		}

		public void setInstagram(String instagram) {
			this.instagram = instagram;
		}

		public String getWhatsapp() {
			return whatsapp;
		}

		public void setWhatsapp(String whatsapp) {
			this.whatsapp = whatsapp;
		}

		public String getUrlLogo() {
			return urlLogo;
		}

		public void setUrlLogo(String urlLogo) {
			this.urlLogo = urlLogo;
		}
}
