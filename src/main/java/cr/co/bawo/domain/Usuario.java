package cr.co.bawo.domain;

public class Usuario {
	
		private String usuario;
		private String contrasenna;
		
		
		public Usuario() {
			this.usuario = "";
			this.contrasenna = "";
		}


		public Usuario(String usuario, String contrasenna) {
			this.usuario = usuario;
			this.contrasenna = contrasenna;
		}


		public String getUsuario() {
			return usuario;
		}


		public void setUsuario(String usuario) {
			this.usuario = usuario;
		}


		public String getContrasenna() {
			return contrasenna;
		}


		public void setContrasenna(String contrasenna) {
			this.contrasenna = contrasenna;
		}
		
		
}
