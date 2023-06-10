package array;
public class evenandoddarray {
	
public static void main(String[] args) {
int[] arr = new int[] {2,3,9,6,5,4,6};
System.out.println("even are :");
for(int i=0;i< arr.length;i++) {
if(arr[i]%2==0)  System.out.println( arr[i]);

}
System.out.println("odd are :");
for(int i=0;i< arr.length;i++) {
if(arr[i]%2!=0)  System.out.println( arr[i]);
}
}

}