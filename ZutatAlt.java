package anonym;

public class ZutatAlt {
	private String name;

	public ZutatAlt(String name) {
	    this.setName(name);
	}

	public String getName() {
	    return this.name;
	}

	public void setName(String name) {
	    this.name = name;
	}

	public void zubereiten(ZutatVerarbeitenAlt z) {
	    z.schneiden();
	}
}
