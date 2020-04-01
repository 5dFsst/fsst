package anonym;

public class ZutatDemoAlt {

    public static void main(String[] args) {
	ZutatAlt z=new ZutatAlt("Zwiebel");
	z.zubereiten(new ZutatVerarbeitenAlt(){	//anonyme Klasse mit automatischer Implementierung des Interfaces
	    @Override
	    public void schneiden() {
		System.out.println("Schneide die "+z.getName()+" in Würfel!");
	    }
	
    });
	/* Eine anonyme Klasse ist also nichts anderes als eine 
	 * Klassendefinition ohne Namen, 
	 * von der wir eine Instanz (=>Action-Objekt) erzeugen.*/
    }
}

