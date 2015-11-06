package gamePackege.game;

import gamePackege.question.American;
import gamePackege.question.Question;
import gamePackege.question.YesOrNo;

import java.util.HashSet;
import java.util.Set;

public class Game {

       Set<Question> questionsRandom = new HashSet<> ();


    public  Game(){
        int i=0;
        while (questionsRandom.size ()<5){
            Question randomQuestion = GameData.questionDB.get ((int)Math.random ()*GameData.questionDB.size ());
            if (randomQuestion instanceof YesOrNo) {
                printQuestion (randomQuestion, i);
                System.out.println ("Print your ANSWER: YES or NO");
            }
                else if (randomQuestion instanceof American) {
                printQuestion (randomQuestion,i);
                System.out.println (((American) randomQuestion).getAns () + "\n");
            }
                  else {
                printQuestion (randomQuestion,i);
                System.out.println ("Enter Your Answer");
            }
            questionsRandom.add (randomQuestion);
            i++;
        }
    }
    public void printQuestion (Question randomQuestion,int i ){
        System.out.println ("Question  # " + i + randomQuestion.getQuestion ());
    }

}
