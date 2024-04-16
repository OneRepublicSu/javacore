package collect;


import java.util.BitSet;

/**
 * 筛选素数的一个基本方法
 */
public class Sieve {
    public static void main(String[] args) {
        int n = 150;
        long start = System.currentTimeMillis();
        BitSet bitSet = new BitSet(n + 1);
        int count = 0;
        int i;
//把2-目标所有的数字放进bitSet
        for (i = 2; i <= n; i++)
            bitSet.set(i);

        i = 2;

        while (i * i <= n) {
            if (bitSet.get(i)) ;
            {
                int k = 2 * i;
                while (k <= n) {
                    bitSet.clear(k);
                    k += i;
                }
            }
            i++;
        }
        System.out.println(count);

        System.out.println(bitSet);

        i= 0;

        while (i <= n) {
            if (bitSet.get(i)) {
                count++;
            }
            i++;
        }
        long end = System.currentTimeMillis();
        System.out.println(count + "primes");
        System.out.println((end - start) + "milliseconds");

    }
}
