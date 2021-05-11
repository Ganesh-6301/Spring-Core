package Assignment2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Questions {
	
	private int questionid;
	private String Question;
	private  Set<String> answers;
	
	
	public int getQuestionid() {
		return questionid;
	}
	public void setQuestionid(int questionid) {
		this.questionid = questionid;
	}
	public String getQuestion() {
		return Question;
	}
	public void setQuestion(String question) {
		Question = question;
	}
	public Set<String> getAnswers() {
		return answers;
	}
	public void setAnswers(Set<String> answers) {
		this.answers = answers;
	}
	@Override
	public String toString() {
		return "Questions [questionid=" + questionid + ", Question=" + Question + ", answers=" + answers + "]";
	}
	
	
	
	

}
