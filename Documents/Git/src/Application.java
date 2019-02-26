

import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;


public class Application extends Frame implements WindowListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static void main(String[] args) {
		new Application();
	}
	
	public Application() {
		super();
		
		Modèle modl = new Modèle();
		Contrôleur ctrl = new Contrôleur(modl); 
		Vue vue = new Vue();
		modl.addObserver(vue);
		vue.addActionListener(ctrl);
		this.setTitle("tutoriel git");
		this.add(vue);
		this.pack();
		this.setVisible(true);
	}

	@Override
	public void windowClosing(WindowEvent arg0) {
		
		System.out.println("n");
		System.exit(0);
		
	}

	@Override
	public void windowActivated(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosed(WindowEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("n");
		System.exit(0);
		
	}

	@Override
	public void windowDeactivated(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowOpened(WindowEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("n");
		System.exit(0);
		
	}

}
