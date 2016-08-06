package game.faith.vo;

public class CharacterVO {

	private int ap;
	private int cash;
	private int charisma;
	private int charm;
	private int confidence;
	public int getAp() {
		return ap;
	}
	public void setAp(int ap) {
		this.ap = ap;
	}
	public int getCash() {
		return cash;
	}
	public void setCash(int cash) {
		this.cash = cash;
	}
	public int getCharisma() {
		return charisma;
	}
	public void setCharisma(int charisma) {
		this.charisma = charisma;
	}
	public int getCharm() {
		return charm;
	}
	public void setCharm(int charm) {
		this.charm = charm;
	}
	public int getConfidence() {
		return confidence;
	}
	public void setConfidence(int confidence) {
		this.confidence = confidence;
	}
	
	@Override
	public String toString() {
		return "CharacterVO [ap=" + ap + ", cash=" + cash + ", charisma=" + charisma + ", charm=" + charm
				+ ", confidence=" + confidence + "]";
	}
	
	
	
	
}
