package model;

public class Turn {
	private String turn;
	public Turn() {
		this.turn = "TURNO_ACTUAL";
	
	}
	
	public Turn(String turn) {
		this.turn = turn;
	}

	public String getTurn() {
		return turn;
	}

	public void setPlayer(String player) {
		this.turn = turn;
	}
}
