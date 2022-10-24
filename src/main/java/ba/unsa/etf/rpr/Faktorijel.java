package ba.unsa.etf.rpr;

public class Faktorijel {
    public static Integer fact(Integer n){
        if (n.compareTo(1) <= 0)return 1;
        else return n * fact(n-1);
    }
}
