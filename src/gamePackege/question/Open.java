package gamePackege.question;

public class Open extends Question {

    private String  ans;

    public Open (String name, int point, int level, String ans) {
        super (name, point, level);
        setAns (ans);
    }

    public String getAns () {
        return ans;
    }

    public void setAns (String ans) {
        this.ans = ans;
    }
}
