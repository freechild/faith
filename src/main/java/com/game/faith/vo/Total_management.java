package com.game.faith.vo;



public class Total_management {

	private int turn;
	
	
	public int getTurn() {
		return turn;
	}
	public void setTurn(int turn) {
		this.turn = turn;
	}

	
	private CharacterVO characterVO =new CharacterVO();
	
	private ReligionVO religionVO = new ReligionVO();
	public CharacterVO getCharacterVO() {
		return characterVO;
	}
	public void setCharacterVO(CharacterVO characterVO) {
		this.characterVO = characterVO;
	}
	public ReligionVO getReligionVO() {
		return religionVO;
	}	
	public void setReligionVO(ReligionVO religionVO) {
		this.religionVO = religionVO;
	}
	
	@Override
	public String toString() {
		return "Total_management [characterVO=" + characterVO + ", religionVO=" + religionVO + "]";
	}
	
	
	
	
}
