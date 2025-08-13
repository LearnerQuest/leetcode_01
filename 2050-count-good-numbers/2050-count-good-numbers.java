class Solution {
    static final long MOD = 1_000_000_007;
    public int countGoodNumbers(long n) {
        long evens = (n+1)/2;
        long odd = n/2;

        long pow5 = modPow(5, evens, MOD);
        long pow4 = modPow(4, odd, MOD);

        return (int)((pow5*pow4)% MOD);
    }
    private long modPow(long base, long exp, long mod){
        if (exp == 0) return 1;         
        base %= mod;                    

        long half = modPow(base, exp / 2, mod);
        long result = (half * half) % mod;

        if (exp % 2 == 1) {             
            result = (result * base) % mod;
        }
        return result;
    }
}