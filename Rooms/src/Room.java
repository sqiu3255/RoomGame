
public class Room {
	Person occupant;
	int xLoc,yLoc, points;
	
	public Room(int x, int y)
	{
		xLoc = x;
		yLoc = y;
	}
	public void enterRoom(Person x)
	{
		System.out.println("You enter a plain old room");
		occupant = x;
		x.setxLoc(this.xLoc);
		x.setyLoc(this.yLoc);
		points = 0;
	}
	
	public void leaveRoom(Person x)
	{
		occupant = null;
	}
	
}
