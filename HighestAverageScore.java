import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class HighestAverageScore {
    public static void main(String[] args) {
        String [][] arr = {{"Bob","87"}, {"Mike", "35"},{"Bob", "52"}, {"Jason","35"}, {"Mike", "55"}, {"Jessica", "99.2"}};
        HashMap<String,ArrayList<Integer>> hm = new HashMap<>();
        int maxAvg=Integer.MIN_VALUE;
        for(int i =0;i< arr.length;i++){
                if(hm.containsKey(arr[i][0])){
                    ArrayList<Integer> marks= hm.get(arr[i][0]);
                    marks.add(Integer.valueOf(arr[i][1]));
                    hm.put(arr[i][0],marks);
                }
                else{
                    ArrayList<Integer>temp1=new ArrayList<>();
                    double x1= Double.parseDouble(arr[i][1]);
                    int x2= (int)Math.floor(x1);
                    temp1.add(x2);
                    hm.put(arr[i][0],temp1);
                }
        }
        for(Map.Entry<String, ArrayList<Integer>> entry : hm.entrySet()) {
            ArrayList<Integer> t= entry.getValue();
            int sum=0;
            int count=0;
            for(int a:t){
                sum+=a;
                count++;
            }

            maxAvg=Math.max(maxAvg,sum/count);
        }
        System.out.println(maxAvg);
    }
}
//time complexity: O(n)
//space complexity: O(n)
