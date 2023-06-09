public class StarDiamond
{
	public static void main(String[]args)
        {

	int n=39,l,i,j,k;

	l=10;

	for(i=1;i<l;i++)
	{
	for(j=1;j<=n;j++)
	{
	System.out.print(" ");
	}
	for(k=1;k<=l;k++)
	{
	System.out.print(" *");
	}
	System.out.println("");
	n--;
	}
	
	
}
}
