class Solution {
    public int fib(int n) {
        if(n<2)
            return n;
        int firstNum = 0;
        int secNum = 1;
        int res=0;
        for(int i =2;i<=n;i++){
            res = firstNum+secNum;
            firstNum = secNum;
            secNum= res;
        }
        return res;
        
    }
}