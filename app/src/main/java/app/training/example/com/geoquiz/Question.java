package app.training.example.com.geoquiz;

//Basic Class to hold question and boolean value of true or false;
//Questions are int since they are pulled from string resources

public class Question {

    int mQuestion;
    boolean mIsAnswerTrue;

    public Question(int question, boolean isAnswerTrue){
        mQuestion = question;
        mIsAnswerTrue = isAnswerTrue;
    }

    public int getQuestion() {
        return mQuestion;
    }

    public void setQuestion(int question) {
        mQuestion = question;
    }

    public boolean isAnswerTrue() {
        return mIsAnswerTrue;
    }

    public void setIsAnswerTrue(boolean isAnswerTrue) {
        mIsAnswerTrue = isAnswerTrue;
    }
}
