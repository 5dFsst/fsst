package anonym;

public class ZutatDemoLambdaAlt {

    public static void main(String[] args) {
	ZutatAlt z=new ZutatAlt("Zwiebel");
	z.zubereiten(()->{	System.out.println("Schneide die "
				+z.getName()+" in Würfel!");});
	/* Mit Lambda-Ausdrücken können wir den kompletten Code 
	 * der schneiden()-Methode direkt als Parameter an die 
	 * zubereiten()-Methode übergeben.
	 * Lambda Ausdrücke bestehen aus zwei, durch einen Pfeil voneinander, 
	 * getrennten Teilen (Parameterliste + Methodenkonkretisierung.*/
    }
}

