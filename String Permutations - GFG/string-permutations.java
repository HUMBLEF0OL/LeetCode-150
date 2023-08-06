//{ Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class Main {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int T=sc.nextInt();
		sc.nextLine();
		while(T-->0)
		{
		    
		    Solution ob=new Solution();
		    
		    String S=sc.nextLine();
		    
		    ArrayList<String> arr = ob.permutation(S);
		    for(String s : arr){
		        System.out.print(s+" ");
		    }
		    System.out.println();
		}
		
	}
}

// } Driver Code Ends


//User function Template for Java


class Solution
{
    public void findPermutation(String originalString, String formedString, ArrayList<String> result, int stringLength){
        if(formedString.length() == stringLength){
            // add the formedString to arrayList
            result.add(formedString);
            return;
        }
        for(int i =0;i<originalString.length();i++){
            String newFormed = formedString + originalString.charAt(i);
            findPermutation(originalString.substring(0,i)+originalString.substring(i+1),newFormed,result,stringLength);
        }
    }
    public ArrayList<String> permutation(String S)
    {
        //Your code here
        ArrayList<String> result = new ArrayList<>();
        findPermutation(S,"",result,S.length());
        Collections.sort(result);
        return result;
    }
	   
}
