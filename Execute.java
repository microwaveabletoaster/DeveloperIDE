public class Execute
{
	static Window win;
	public static void main(String[] args)
	{
		win = new Window();
		win.populateFromFiles();
	}

	public static void update()
	{
		System.out.println("Updated");
		win.updateWindow();
	}
}
