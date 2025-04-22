package ex01_Collections;

public class Student {
	private String name;
	private int totalScore;
	private int subjectCount;

	public Student(String name) {
		this.name = name;
	}
	

	// 점수 추가
	public void addScore(int score) {
		totalScore += score;
		subjectCount++;
	}
	
	
	// 평균 반환
	public double getAverage() {
		if(subjectCount == 0) {
			return 0;
		} else {
			return (double) totalScore/subjectCount;
		}
	}
	
	
	// 이름 반환
	public String getName() {
		return name;
	}


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
