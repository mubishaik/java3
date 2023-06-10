package array;

public class arraymaxandmin {
	  public static void main(String[] args) {  
	        int [] arr = new int [] {5,9,7,6,2,4,10};    
	        int max = arr[0];  
	     
	        for (int i = 0; i < arr.length; i++) {  
	   
	           if(arr[i] > max)  
	               max = arr[i];  
	        }  
	        int min = arr[0];  
		     
	        for (int i = 0; i < arr.length; i++) {  
	   
	           if(arr[i] < min)  
	               min = arr[i];  
	        }  
	        System.out.println("Largest element  in given array: " + max);
	        System.out.println("smallest element  in given array: " + min);
	    }  
}
