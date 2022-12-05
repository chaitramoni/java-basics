import java.util.*;
class SecondLargestElement
{
	static void print2largest(int arr[],int arr_size)
	{
	int i,first,second;
	if(arr_size<2)
	{
	System.out.println("Invalid input");
	return;
	}
	Arrays.sort(arr);
	for(i = arr_size - 2;i>=0;i--)
	{
	if(arr[i]!= arr[arr_size - 1])
	{
	System.out.println("The Second Largest Element is %d\n",arr[i]);
	return;
	}
	}
	System.out.println("There is no second" + "largest element\n");
	}
	public static void main(String[] args)
	{
	int arr[] = {12,35,1,10,34,1};
	int n = arr.length;
	print2largest(arr,n);
	}
}