import java.util.*;

/** The exercise for the Thinking in Java 
 * 
 * @author fenghongxia
 * @version 1.0
 */
class ATypeName 
{ /* class body goes here */ 
	public void f()
	{
		System.out.println("Hello, this is the test for ATypeName.");
	}
	
	public int storage(String s)
	{
		return s.length()*2;
	}
}

class DataOnly
{
	int i;
	float f;
	boolean b;

	public DataOnly(int i, float f, boolean b)
	{
		this.i = i;
		this.f = f;
		this.b = b;
	}
	public void f()
	{
		System.out.println("i = " + i + "; f = " + f + ";  b = " + b);
	}
}

class StaticTest
{
	static int i = 47;
}

class StaticFun
{
	static void incr()
	{
		StaticTest.i++;
	}
}

class AllTheColorsOfTheRainbow
{
	int anIntegerRepresentingColors;
	/*public AllTheColorsOfTheRainbow(int initial)
	{
		anIntegerRepresentingColors = initial;
	}*/
	public void changeTheHueofTheColor(int newHue)
	{
		anIntegerRepresentingColors = newHue;
	}
	public int get()
	{
		return anIntegerRepresentingColors;
	}
}

public class Atest 
{
	/** Some exercise for the Thinking in Java
	 * 
	 * @param args array of string aruments
	 * @return No return value
	 * @exception exception No exception thrown
	 */
	static int ternary(int i)
	{
		return i < 10 ? i * 100 : i * 10;
	}
	
	static int alternative(int i)
	{
		if( i < 10 ) return i * 100;
		else return i * 10;
	}
	
	static int test(int testval, int target)
	{
		int result = 0;
		if(testval > target) result = +1;
		else if (testval < target) result = -1;
		else result = 0;
		return result;
	}
	
	static void pNumber()
	{
		//for(int i = 0; i < 100; i++) System.out.println("i = " + (i+1));
		for(int i = 0; i < 100;) System.out.println("i = "+ ++i);
	}
	
	static void bNumber()
	{
		for(int i = 0; i < 100;)
		{
			if (i == 47) return;
			System.out.println("i = " + ++i);
		}
	}
	
	static int cString(String ori, String tar)
	{
		if(ori == tar) return 1;
		if(ori.equals(tar)) return 2;
		//if(ori == tar) return 1;	
		return 0;
	}
	
	static void randomNumber()
	{
		int[] rnd = new int[25];
		Random r = new Random();
		for(int i = 0; i < 25; i++)
		{	
			rnd[i] = r.nextInt(1000);
			//rnd[i] = (int)(Math.random() * 10 + 100);
			System.out.println(rnd[i]);
		}
		int up = 0, below = 0, equal = 0;
		for(int i = 0; i < 24; i++)
		{
			if(rnd[i] > rnd[i+1]) up++;
			else if(rnd[i] < rnd[i+1]) below++;
			else equal++;
		}
		System.out.println("up = " + up + "; below = " + below + "; equal = " + equal);
	}
	
	static void findNumber()
	{
		for(int i = 1; i < 1000; i++)
		{
			int k = 0;
			for(int j = 1; j <= i; j++)
			{
				if(i%j == 0) k++;
			}
			if (k <= 2) System.out.println(i);
		}
	}
	
	public static void  main(String[] args)
	{
		System.out.println("Test TortoiseGit.");
		System.out.println("Hello, this is some test with GitHub.");
		
		findNumber();
		//randomNumber();
		/*
		System.out.println("result = " + cString("abc", "abc"));
		System.out.println("result = " + cString("abc", "def"));
		System.out.println("result = " + cString("abc", "ABC"));
		String a = "abc";
		String b = a;
		System.out.println("new result = " + cString(a, a));
		System.out.println("new result = " + cString(a, b));
		*/
		
		//pNumber();
		//bNumber();
		/*
		System.out.println(test(10, 5));
		System.out.println(test(5, 10));
		System.out.println(test(5, 5));
		
		System.out.println("ternary = " + ternary(15));
		System.out.println("alternative = " + alternative(15));
		*/
		
		/*
		int x = 10, y = 20, z = 30;
		double a = x + y - 2 / 2 + z;
		double b = x + (y - 2) / (2 + z);
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		*/
		
		/*
		ATypeName a = new ATypeName();
		a.f();
		int length = a.storage("hello");
		System.out.println("length = " + length);
		
		DataOnly dod = new DataOnly(1, 0.3f, true);
		dod.f();
	
		StaticFun.incr();
		System.out.println("StaticTest.i = " + StaticTest.i);
		*/
		
		//AllTheColorsOfTheRainbow atotr = new AllTheColorsOfTheRainbow(35);
		/*
		AllTheColorsOfTheRainbow atotr = new AllTheColorsOfTheRainbow();
		System.out.println("old = " + atotr.get());
		atotr.changeTheHueofTheColor(56);
		System.out.println("new = " + atotr.get());
		*/

		/*
		System.out.println((int)(short)(byte)-1);
		System.out.println((int)(char)(byte)-1);

		System.out.println("+++++++");
		System.out.println(-1);
		System.out.println(Integer.toBinaryString(-1));
		System.out.println("-------");
		System.out.println((byte)-1);
		System.out.println(Integer.toBinaryString((byte)-1));
		System.out.println((short)(byte)-1);
		System.out.println(Integer.toBinaryString((short)(byte)-1));
		System.out.println((char)(byte)-1);
		System.out.println(Integer.toBinaryString((char)(byte)-1));
		System.out.println(Integer.toBinaryString((int)(short)(byte)-1));
		System.out.println(Integer.toBinaryString((int)(char)(byte)-1));
		
		System.out.println("+++++++");
		System.out.println(Integer.valueOf("1111111111111111", 2).toString());
		*/
		
	}
}
