package programa;

import pantallas.FrameBase;
import pantallas.FrameLogin;

import java.awt.EventQueue;

import dominio.AppVideo;
import dominio.RepositorioUsuariosFalso;



public class Programa {

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AppVideo appvideo = new AppVideo();
					FrameLogin frame = new FrameLogin(appvideo);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

}
