package dominio;

import java.time.LocalDate;

public class RepositorioUsuariosFalso {
	
	private Usuario admin;
	
	
	public RepositorioUsuariosFalso() {
		admin = new Usuario("admin", "admin", LocalDate.now(), "admin", "admin", "admin");
	}


	public static boolean isLoginOK(String nombreUsuario, String contrasena)
	{
		if(nombreUsuario==null || contrasena ==null) return false;
		if (nombreUsuario.equals("admin") && contrasena.equals("admin")) return true;
		return false;
		
	}


	public Usuario getAdmin() {
		return admin;
	}
	
	
	

}
