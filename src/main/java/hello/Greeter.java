package hello;

public class Greeter 
{
    public String sayHello() 
    {
        return "Hello world!";
    }
    
    public int addPositiveNum(int num, int positiveNumToAdd)
    {
    	if (positiveNumToAdd < 0)
    	{
    		return num;
    	}
    	
    	return num + positiveNumToAdd;
    }
}
