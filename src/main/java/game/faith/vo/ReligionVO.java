package game.faith.vo;

public class ReligionVO {
	private int believer;
	private int temple;
	private int fame;
	
	private int lawful;
	private int good;
	private int chaos;
	private int evil;
	public int getBeliever() {
		return believer;
	}
	public void setBeliever(int believer) {
		this.believer = believer;
	}
	
	public int getTemple() {
		return temple;
	}
	public void setTemple(int temple) {
		this.temple = temple;
	}
	public int getFame() {
		return fame;
	}
	public void setFame(int fame) {
		this.fame = fame;
	}
	public int getLawful() {
		return lawful;
	}
	public void setLawful(int lawful) {
		this.lawful = lawful;
	}
	public int getGood() {
		return good;
	}
	public void setGood(int good) {
		this.good = good;
	}
	public int getChaos() {
		return chaos;
	}
	public void setChaos(int chaos) {
		this.chaos = chaos;
	}
	public int getEvil() {
		return evil;
	}
	public void setEvil(int evil) {
		this.evil = evil;
	}
	@Override
	public String toString() {
		return "ReligionVO [believer=" + believer + ", temple=" + temple + ", fame=" + fame + ", lawful=" + lawful
				+ ", good=" + good + ", chaos=" + chaos + ", evil=" + evil + "]";
	}
	
	
	
	
	
}
