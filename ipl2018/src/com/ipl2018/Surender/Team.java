package com.ipl2018.Surender;

abstract class Team {
	private String TeamCheer;
	private String CaptainName;
	private String BestForeignPlayers;

	private String BestLocalPlayers;

	private String HighestRunScoreer;
	private String HIghestWicketTakers;

	public Team(String TeamCheer, String CaptainName, String BestForeignPlayers, String BestLocalPlayers,
			String HighestRunScoreer, String HIghestWicketTakers) {
		this.TeamCheer = TeamCheer;
		this.CaptainName = CaptainName;
		this.BestForeignPlayers = BestForeignPlayers;
		this.BestLocalPlayers = BestLocalPlayers;
		this.HighestRunScoreer = HighestRunScoreer;
		this.HIghestWicketTakers = HIghestWicketTakers;

	}

	void print() {

		{
			System.out.println(" TeamCheer :" + TeamCheer + "\n CaptainName:" + CaptainName + "\n BestForeignPlayers :"
					+ BestForeignPlayers + "\n BestLocalPlayers :" + BestLocalPlayers + "\n HighestRunScoreer :"
					+ HighestRunScoreer + "\n HIghestWicketTakers :" + HIghestWicketTakers);
		}

	}

}
