package payground;

public class rice {
	public static boolean getRice(int big, int small, int goal) {
		if (big*5+small<goal)
			return false;
		for(int i = 0; goal>=5;i++)
		{
		goal-=5;
		}
		if(small >= goal%5)
			return true;
		else
			return false;

	}
}
