public class CountPrimes {
    public int countPrimes(int n) {
        if(n <= 2) {
        return 0;
    }
    boolean[] isPrime = new boolean[n];
    for(int i = 2;i < n;i++) {
        isPrime[i] = true;
    }

    int count = n / 2;//only count odd numbers

    for(int i = 3; i * i < n; i += 2) { // i += 2 counts only odd numbers
        if(!isPrime[i]) continue;

        for(int j = i * i;j < n;j = j + 2 * i) {
            if(isPrime[j]) { // once find a not marked non-prime number, subtract count by 1
                count--;
            }
            isPrime[j] = false;
        }
    }

    return count;
    }
}