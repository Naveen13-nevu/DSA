package com.interview.preparation;
public class MergeIntervals {
    
    public static int [][] merge(int [][] arr){

        int n = arr.length;

        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-1-i;j++){
                if(arr[j][0] > arr[j+1][0]){
                    int [] temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        int [][] result = new int[n][2];
        int index=0;

        result[index][0] = arr[0][0];
        result[index][1] = arr[0][1];

        for(int i=1;i<n;i++){
            if(arr[i][0] <= result[index][1]){
                if(arr[i][1] > result[index][1]){
                    result[index][1] = arr[i][1];
                }
            }
            else{
                index++;
                result[index][0] = arr[i][0];
                result[index][1] = arr[i][1];
            }
        }

        int finalResult[][] = new int [index+1][2];

        for(int i=0;i<=index;i++){
            finalResult[i][0]= result[i][0];
            finalResult[i][1] = result[i][1];
        }

        return finalResult;
    }


    public static void main(String[] args) {
        
     int[][] intervals = {{1,3}, {2,6}, {8,10}, {15,18}};

    int [][] result = merge(intervals);

    for(int n[]: result){
        System.out.println(n[0]+","+n[1]);
    }

    }
}
