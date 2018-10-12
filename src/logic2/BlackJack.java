package logic2;

public class BlackJack {
    public int blackjack(int a, int b) {
        if (near(a)<near(b)){
            return a;
        }else if (near(a)>near(b)){
            return b;
        }return 0;

    }

    public int near(int n){
        if(n<=21){
            return 21-n;
        }return 22;
    }
}
