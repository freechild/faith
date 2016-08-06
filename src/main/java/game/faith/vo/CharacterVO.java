package game.faith.vo;

public class CharacterVO {

	private int Ap;
	private int Cash;
	private int Charisma;
	private int Charm;
	private int Confidence;
	public int getAp() {
		return Ap;
	}
	public void setAp(int ap) {
		Ap = ap;
	}
	public int getCash() {
		return Cash;
	}
	public void setCash(int cash) {
		Cash = cash;
	}
	public int getCharisma() {
		return Charisma;
	}
	public void setCharisma(int charisma) {
		Charisma = charisma;
	}
	public int getCharm() {
		return Charm;
	}
	public void setCharm(int charm) {
		Charm = charm;
	}
	public int getConfidence() {
		return Confidence;
	}
	public void setConfidence(int confidence) {
		Confidence = confidence;
	}
	@Override
	public String toString() {
		return "FaithVO [Ap=" + Ap + ", Cash=" + Cash + ", Charisma=" + Charisma + ", Charm=" + Charm + ", Confidence="
				+ Confidence + "]";
	}
	
	
	
}
