public class HugeInteger{
    char [] arr;
    int sz;
    
	public HugeInteger()
	{
        arr = new char[40];
        sz = 0;
	}

    /*
     *@param s
     *@brief
     *@return
    */
	public void inputHugeInteger( String s )
	{
        for (int i = 0; i < s.length(); i++)
        {
            arr[i] = s.charAt(i);
            sz += 1;
        }
	}

    /* 
     *@brief
     *@return
    */
	public void outputHugeInteger()
	{
        for (int i = sz-1; i >= 0; i--)
        {
            System.out.print(arr[i]);
        }
        System.out.println("");
	}

    /*
     *@param
     *@brief
     *@return
    */
	public double addHugeIntegers(  )
	{
        
	}
/*
	public double subtractHugeIntegers()
	{
	}
	public double isEqualTo()
	{
	}
	public double isNotEqualTo()
	{
	}
	public double isGreaterThan()
	{
	}
	public double isLessThan()
	{
	}
	public boolean isZero()
	{
	}
	public double multiplyHugeIntegers()
	{
	}
	public double divideHugeIntegers()
	{
	}
	public double modulusHugeIntegers()
	{
	}
*/
}
