package dominio;

public class AppVideo {
	
	String usuario = "usuario";
	
	public String getUsuario() {
		return usuario;
	}



	public boolean login(String usuario, String contrasena)
	{
		if(RepositorioUsuariosFalso.isLoginOK(usuario, contrasena))
		{
			this.usuario=usuario;
			return true;
			//PanelPrueba panel_prueba = new PanelPrueba();
			//CreadorPaneles.creaPanel(panel_centro_central, panel_prueba);
			//esto funciona
			
		}
		else {
			//JOptionPane.showMessageDialog(panel_centro_central, "Login rechazado", "Error", JOptionPane.ERROR_MESSAGE);
			return false;
		}
	}

}
