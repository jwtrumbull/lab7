public class Frequency
{
	/**
      Returns an array of the frequencies of each element in a.
      That is, if the returned array is f, then a[i] occurs f[i]
      times in a.
      @return the frequency array
	 */
	public static int[] frequencyOfElements(int[] a)
	{
		/*
		 * array starts at i = 0 and j = 1
		 * check if the array in pos i and j are the same
		 * if so add to the counter
		 * then have j go to the next pos
		 * repeat this until you get the the last elt in the array
		 * then add the counter to the other array that keeps count at pos i
		 * then increment i by 1 and go through j again
		 * go through the length of array b
		 * then return array b
		 * 
		 */
		int[] b = new int[a.length]; 
		for (int i = 0; i < b.length; i++)
		{
			int counter = 0;
			for(int j = 1; j < a.length; j++)
			{
				if(a[j] == a[i])
				{
					counter++;
				}
			}
			b[i] = counter;
		}
		return b;
	}
}