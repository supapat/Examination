package lab9;

import java.util.Date;
import java.util.Scanner;

public class Run_Review {

	public static void main(String[] args) {
		Date d = new Date();

		subject sub = new subject("it213", "java");
		student stu = new student("123", "patcharaporn Fongfon");
		Scanner scan = new Scanner(System.in);

		Examination e = new Examination(1, 0, d, stu, sub);
		String choil1[] = {"1","���"};
		String choil2[] = {"2","�ԧ"};
		String choil3[] = {"3","���"};
		String choil4[] = {"4","��"};
		
		for(int i=0;i<2;i++){
			choice ch1 = new choice('A',choil1[i]);
			choice ch2 = new choice('B',choil2[i]);
			choice ch3 = new choice('C',choil3[i]);
			choice ch4 = new choice('D',choil4[i]);
			
			Question q[] = new Question[2];
		    q[i] = new Question(1, "����ա���", 'D');
		    q[i] = new Question(2, "�ѵ�쪹Դ�Թ��", 'D');

				q[i].addChoice(ch1, 0);
				q[i].addChoice(ch2, 1);
				q[i].addChoice(ch3, 2);
				q[i].addChoice(ch4, 3);
				q[i].listQuestion();
				System.out.println("");

					System.out.print("���͡�ӵͺ����١��ͧ: ");
					String ans = scan.next();

		char answer = ans.charAt(0);
		if (answer == q[i  ].getCorrectAnswer()) {
			e.setScore(e.getScore() + 1);
		}
		}
		System.out.println("Score = " + e.getScore());
		scan.close();
		System.out.println(e.toString());
	}

}
