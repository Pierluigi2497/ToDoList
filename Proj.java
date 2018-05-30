
public class Proj {
	Proj next;
	String Nome;
	String Info;
	String Scadenza;
	String Completamento;
	public Proj() {
		Nome=new String("");
		Info=new String("");
		Scadenza=new String("");
		Completamento=new String("");
		
	}
	
	public void setName(String a) {
		Nome=a;
	}
	
	public void setInfo(String a) {
		Info=a;
	}
	
	public void setScadenza(String a) {
		Scadenza=a;
	}
	
	public String getName() {
		return Nome;
	}
	
	public String getInfo() {
		return Info;
	}
	
	public String getScadenza() {
		return Scadenza;
	}
}
