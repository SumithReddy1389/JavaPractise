package Collections;

import java.util.Iterator;
import java.util.List;

public class ArrayList {

    //    ArrayList is better for storing and accessing data.
//          Intial capacity as 10

    public static void main(String[] args) {
        List<String> L1 = new java.util.ArrayList<>();

        L1.add("abc");
        L1.add("def");
        L1.add("gija");
        L1.add("klm");
        L1.add("nopa");

//        System.out.println(L1);
        L1.forEach(l -> {
            if(l.contains("a")){
                System.out.println(l);
            }
        });

        Iterator<String> iterator = L1.iterator();
        while (iterator.hasNext()){
            String l = iterator.next();
            System.out.println(l);
        }
        System.out.println("For Each Remaining");

        iterator = L1.iterator();
        iterator.forEachRemaining(l -> {
            if(!(l.contains("a"))){
                System.out.println(l);
            }
        });

        System.out.println("get(1) : " + L1.get(1));


    }



    /*
    * //{ Driver Code Starts
import java.io.*;
import java.util.*;

// } Driver Code Ends
class Solution
{
    ArrayList<Integer> solve(int N, ArrayList<Integer> A, int Q, ArrayList<Integer> Query)
    {
        // code here
        if(Q == 1){
          A.add(Query.get(0), Query.get(1));
          return A;
        } else {
            int x =  A.lastIndexOf(Query.get(0));
             ArrayList<Integer> ans = new ArrayList<>();
            ans.add(x);
            return ans;
        }
    }
}

//{ Driver Code Starts.
class GFG{
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int q=sc.nextInt();
            ArrayList<Integer> a = new ArrayList<>();
            for(int i=0;i<n;i++)
            {
                a.add(sc.nextInt());
            }
            ArrayList<Integer> query = new ArrayList<Integer>();
            if(q==1){
                query.add(sc.nextInt());
                query.add(sc.nextInt());
            }
            else{
                query.add(sc.nextInt());
            }
            Solution obj = new Solution();
            ArrayList<Integer> ans = obj.solve(n,a,q,query);
            for(int i=0;i<ans.size();i++)
            {
                System.out.print(ans.get(i));
                if(q==1)
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
// } Driver Code Ends*/
}

