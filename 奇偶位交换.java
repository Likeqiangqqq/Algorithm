import java.util.*;



public class Exchange {
    public int exchangeOddEven(int x) {
        int odd =x&0x55555555;
        int even =x&0xAAAAAAAA;
        return odd<<1|even>>>1;
    }
}
