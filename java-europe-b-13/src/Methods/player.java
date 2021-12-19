package Methods;

public class player {

	int num;
	String name="";
	
	
	public static player[] createPlayer(int a) {
		player[] players =new player[a];	
		for ( int i = 0; i<a ; i++) {
			
			players[i] = new player();
		}
		return players;
	}


	public static int closest(player[] oyuncular, int keep) {
		int index = 0;
		int temp = Math.abs(oyuncular[index].num-keep);
		for(int i=1 ; i<oyuncular.length;i++) {
			if(Math.abs(oyuncular[index].num-keep)<temp) {
				index = i;
			}	
			
			
		}
		return index;
	}

}