package payground;
/*Package Rice Bags (part 2)

Provided that you have a given number of small rice bags (1 kilo each) and big rice bags (5 kilo each), 
write a method that returns the minimum number of small bags necessary to package goal kilos of rice. Return -1 
if it is not possible to package the required rice amount with the bags provided. */
public class rice2 {
	public static Integer getRice(int big, int small, int goal) {
		if (big*5+small<goal)
			return -1;
		for(int i = 0;big!=0 &&goal>=5;i++)
		{
		goal-=5;
		big--;
		}
		if(small >= goal%5)
			return goal;
		else
			return -1;

	}
}
