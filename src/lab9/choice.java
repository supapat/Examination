package lab9;

public class choice {
	private char choiceNo;
	private String answer;

	public choice(char choiceNo, String answer) {
		this.choiceNo = choiceNo;
		this.answer = answer;
	}

	public char getChoiceNo() {
		return choiceNo;
	}

	public void setChoiceNo(char choiceNo) {
		this.choiceNo = choiceNo;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

}
