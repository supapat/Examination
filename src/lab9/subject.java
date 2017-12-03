package lab9;

import java.util.Scanner;
import java.util.Vector;


public class subject {
	private String subjectID;
	private String subjectName;
	private Vector<Question> Question = new Vector<Question>();

	Scanner scan = new Scanner(System.in);

	public subject(String subjectID, String subjectName) {
		this.subjectID = subjectID;
		this.subjectName = subjectName;

	}

	public void addquestion(Question temp) {
		Question.addElement(temp);

	}

	public Vector<Question> getQuestion() {
		return Question;
	}

	public void setQuestion(Vector<Question> question) {
		Question = question;
	}

	public String getSubjectID() {
		return subjectID;
	}

	public void setSubjectID(String subjectID) {
		this.subjectID = subjectID;
	}

	public String getSubjectName() {
		return subjectName;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}

}
