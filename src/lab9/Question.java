package lab9;

public class Question {
	private int questionNo;
	private String question;
	private char correctAnswer;
	private choice[] ch = new choice[4];

	public Question(int questionNo, String question, char correctAnswer) {
		this.questionNo = questionNo;
		this.question = question;
		this.correctAnswer = correctAnswer;
	}

	public int getQuestionNo() {
		return questionNo;
	}

	public void setQuestionNo(int questionNo) {
		this.questionNo = questionNo;
	}

	public void addChoice(choice temp, int i) {
		ch[i] = temp;
	}

	public choice[] getChoice() {
		return ch;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public char getCorrectAnswer() {
		return correctAnswer;
	}

	public void setCorrectAnswer(char correctAnswer) {
		this.correctAnswer = correctAnswer;
	}

	public void listQuestion() {
		System.out.println("" + this.questionNo + "." + this.question);
		for (int i = 0; i < ch.length; i++) {
			System.out
					.print("" + ch[i].getChoiceNo() + "." + ch[i].getAnswer());
			System.out.print("\t");
		}
	}

}
