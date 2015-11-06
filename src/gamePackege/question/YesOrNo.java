package gamePackege.question;

public class YesOrNo extends Question {

    private  boolean ans;

    public YesOrNo (String name, int point, int level, boolean ans) {
        super (name, point, level);
        this.ans = ans;
    }
}
