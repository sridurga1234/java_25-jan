class stringbufferdelete
{
	public static void main(String args[])
	{
		StringBuffer sb=new StringBuffer("happy");
		sb.delete(1,3);
		System.out.println(sb);
	}
}