import java.util.*;
public class PW9_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Array length : ");
		int len = sc.nextInt();
		System.out.print("Input Array : ");
		int arr[] = new int[len];
		for(int i=0;i<len;i++)
		{
			arr[i] = sc.nextInt();
		}
		
		System.out.print("Enter Sum:");
		int sum = sc.nextInt();
		
		for(int j=0; j<len-2;j++)
			for(int k=j+1;k<len-1;k++)
				for(int l=k+1;l<len;l++)
				{
					if(arr[j]+arr[k]+arr[l]==sum)
						System.out.println(arr[j]+" + "+arr[k]+" + "+arr[l]+" = "+sum);
				}
		
		

	}

}
