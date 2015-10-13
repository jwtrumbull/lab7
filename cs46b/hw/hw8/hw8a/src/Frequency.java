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