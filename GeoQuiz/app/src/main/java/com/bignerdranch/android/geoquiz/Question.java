package com.bignerdranch.android.geoquiz;

/**
 * Created by Danny on 7/15/2017.
 */

public class Question {

    private int mTextResId;
    private boolean mAnswerTrue;
    private boolean mQuestionShown;
    private boolean mIsCheater;

    public Question(int textResId, boolean answerTrue) {
        mTextResId = textResId;
        mAnswerTrue = answerTrue;
        mQuestionShown = false;
        mIsCheater = false;
    }

    public int getTextResId() {
        return mTextResId;
    }

    public void setTextResId(int textResId) {
        mTextResId = textResId;
    }

    public boolean isAnswerTrue() {
        return mAnswerTrue;
    }

    public void setAnswerTrue(boolean answerTrue) {
        mAnswerTrue = answerTrue;
    }

    public boolean wasQuestionShownBefore() {
        return mQuestionShown;
    }

    public void setQuestionShown() {
        mQuestionShown = true;
    }

    public boolean isCheater() {
        return mIsCheater;
    }

    public void setCheater() {
        mIsCheater = true;
    }

}
