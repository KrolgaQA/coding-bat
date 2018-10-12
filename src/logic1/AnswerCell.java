package logic1;

public class AnswerCell {
    public boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {
        if(!isAsleep){
            if(isMorning){
                if(isMom){
                    return true;
                }return false;
            }return true;
        }return false;

    }
}
