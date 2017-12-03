package lab9;

import java.util.Date;

import javax.security.auth.Subject;

public class Examination {
	private int noOfTimes;
	private int score;
	private Date date;
	private student stu;
	private subject sub;

	public Examination(int noOfTimes, int score, Date date, student stu,subject sub) {
		this.noOfTimes = noOfTimes;
		this.score = score;
		this.date = date;
		this.stu = stu;
		this.sub = sub;
	}

	public int getNoOfTimes() {
		return noOfTimes;
	}

	public void setNoOfTimes(int noOfTimes) {
		this.noOfTimes = noOfTimes;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	subject getSubject() {
		return sub;
	}

	public String toString() {
		return "รหัส  " + stu.getStudentID() + "\t\t\tชื่อ-สกุล    "
				+ stu.getStudentName() + "\n" + "วิชา  " + sub.getSubjectID()
				+ "(" + sub.getSubjectName() + ")" + "\t\tคะแนนสอบ  " + ""
				+ score;
	}

}
