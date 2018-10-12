package logic1;

public class TeaParty {
    public int teaParty(int tea, int candy) {
        if (tea >= 5 & candy >= 5) {
            if ((tea >= (candy * 2)) || ((tea * 2) <= candy)) {
                return 2;
            } else return 1;
        }
        return 0;

    }
}
