public class reverseString {
    public String r(String s, int k) {
        StringBuilder sb = new StringBuilder(s);
        if( s.length() < k ){
            return new StringBuilder(s).reverse().toString();
        }
        else {
            return new StringBuilder(s.substring(0, k)).reverse().toString() +
                   s.substring(k, 2 * k) + r(s.substring(2 * k), k);
        }
    }
    public static void main(String[] args) {
        reverseString obj = new reverseString();
        obj.r("abdsjk", 2);
        
    }
}
