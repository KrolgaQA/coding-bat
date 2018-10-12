package logic1;

public class CaughtSpeeding {
    public int caughtSpeeding(int speed, boolean isBirthday) {
        if (speed <= 60 | (speed >= 61 & speed <= 65 & isBirthday)) {
            return 0;
        } else if ((speed >= 60 & speed <= 80) | (speed >= 80 & speed <= 85 & isBirthday)) {
            return 1;
        }
        return 2;

    }
}
