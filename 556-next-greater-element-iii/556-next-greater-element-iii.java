class Solution {
    public int nextGreaterElement(int n) {
        char[] arr = (n+"").toCharArray();
        int i =-1;
        for(i=arr.length-1;i>0;i--){
            if(arr[i-1]<arr[i])
                break;
        }
        if(i==0)
            return -1;
        int first = i-1,second=i;
        for(i = arr.length-1;i>first;i--){
            if(arr[i]>arr[first]){
                char temp = arr[i];
                arr[i] = arr[first];
                arr[first] = temp;
                break;
                
                
            }
        }
        reverse(arr,second);
        
        long val = Long.parseLong(new String(arr));
        return (val <= Integer.MAX_VALUE) ? (int) val : -1;
        }
    private void reverse(char[] a,int first)
    {
        int last = a.length-1;
        while(first<last)
        {
            char t = a[first];
            a[first] = a[last];
            a[last] = t;
            first ++;
            last --;
        }
    }
        
}