
public class HintRoom extends Room{
	
	public HintRoom(int a, int b)
	{
		super(a, b);
	}
	
	public void enterRoom(Person x)
	{
		occupant = x;
		x.setxLoc(this.xLoc);
		x.setyLoc(this.yLoc);
		System.out.println("You found the hint room! Here's a hint: go up.");
	}
	
	
}
