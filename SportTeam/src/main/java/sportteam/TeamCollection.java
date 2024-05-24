package sportteam;



public class TeamCollection {
	private static String playername;
	private static int playernumber;
	
	public TeamCollection(String playername,int playernumber){
		this.playername=playername;
		this.playernumber=playernumber;
	}
	
	
	


	public static String getPlayername() {
		return playername;
	}

	public static void setPlayername(String playername) {
		TeamCollection.playername = playername;
	}

	public static int getPlayernumber() {
		return playernumber;
	}

	public static void setPlayernumber(int playernumber) {
		TeamCollection.playernumber = playernumber;
	}

	
	
	
}

