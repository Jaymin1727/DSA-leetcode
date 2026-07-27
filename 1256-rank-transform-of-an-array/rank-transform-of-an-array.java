class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int[] temp=arr.clone();

        Arrays.sort(temp);

        int n=0;
        for(int i:temp){
            if(n==0 || temp[n-1]!=i){
                temp[n++]=i;
            }
        }
        int[] unique=Arrays.copyOf(temp,n);

        for(int i=0;i<arr.length;i++){
            arr[i]=Arrays.binarySearch(unique,arr[i])+1;
        }
        return arr;        
    }
}