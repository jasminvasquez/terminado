
public class parte2 {

	static int f (int Num)
	{ if(Num==0)
		{return 0;
		}

	if(Num==1)
	{ return 1;

	}
	int n = 0;
	return f(Num-1) * f(Num-2)+n;
	}
	public static void main(String[] args) 
	{
	

		System.out.println(f(0));//FUNCION RECURSIVA
		System.out.println(f(1));
	}

}

