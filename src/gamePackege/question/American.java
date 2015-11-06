package gamePackege.question;

public class American extends Question {

  private String[] ans;
    private int correctAnsIndex;
    public American (String name, int point, int level, String[] ans, int correctAnsIndex) {
        super (name, point, level);
        ans = new String[4];
        setCorrectAnsIndex (correctAnsIndex);
    }

    public String[] getAns () {
        return ans;
    }
    public void setAns (String[] ans) {
        this.ans = ans;
    }
    public int getCorrectAnsIndex () {
        return correctAnsIndex;
    }
    public void setCorrectAnsIndex (int correctAnsIndex) {
        this.correctAnsIndex = correctAnsIndex;
    }
}
