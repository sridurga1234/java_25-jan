public class stringperformance
{
	public static void main(String args[])
	{
		long startTime=System.currentTimeMillis();
		for(int i=0;i<100000;i++)
		{
			String str1="technology";
			String str2="technology";
		}
		long endTime=System.currentTimeMillis();
		System.out.println("time taken to create  literal string:"+(endTime-startTime)+"ms");
		long startTime1=System.currentTimeMillis();
		for(int i=0;i<100000;i++)
		{
			String str1=new String("technology");
			String str2=new String("technology");
		}
		long endTime1=System.currentTimeMillis();
		System.out.println("time taken to create object string"+(endTime1-startTime1) + "ms");
	}
}
