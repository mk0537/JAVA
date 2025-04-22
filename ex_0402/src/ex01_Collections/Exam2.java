package ex01_Collections;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Exam2 {

	public static void main(String[] args) {
//		당신은 학교 성적 분석 시스템을 개발하고 있다.
//		주어진 학생 성적 데이터를 기반으로, 각 학생의 평균 점수를 계산한 후,
//		가장 평균 점수가 높은 학생의 이름과 평균 점수를 출력하는 프로그램을 작성하라.

//
//		요구 사항
//		학생 정보를 관리하는 Student 클래스를 설계하라.
//
//		이름(name), 총점(totalScore), 과목 수(subjectCount)를 필드로 가진다.
//
//		점수를 추가하는 addScore(int score) 메서드를 정의하라.
//
//		평균을 반환하는 getAverage() 메서드를 정의하라.
//
//		이름을 반환하는 getName() 메서드를 정의하라.
//
//		주어진 성적 리스트를 활용하여, 이름별로 Student 객체를 생성하고 점수를 누적하라.
//
//		모든 학생 중에서 평균 점수가 가장 높은 학생의 이름과 평균 점수를 출력하라.
//
//		평균 점수는 소수점 한 자리 이상 나오도록 출력해도 무방하다.
		
		
		List<String> scores = Arrays.asList(
			    "Alice:Math:85", "Alice:English:78",
			    "Bob:Math:90", "Bob:English:92", "Bob:Science:88",
			    "Charlie:Math:70", "Charlie:English:60"
			);
		
		
		// Map<key, value>
		Map<String, Student> studentMap = new HashMap<>();
		
		// scores 배열의 모든 요소를 돌면서
		for(String record : scores) {
			
			// name(학생 이름)을 추출하고
			String[] parts = record.split(":");
			String name = parts[0];
			
			// scores(점수) 를 추출하여 각 name 마다 Stuudent 객체로 생성하여
			// studentMap 에 넣기
			/** putIfAbsent : 값이 없을 때만 넣어라(이미 키가 있으면 무시) */
			int score = Integer.parseInt(parts[2]);
			studentMap.putIfAbsent(name, new Student(name));
			
			// name 을 만들어서 얻어온 Student 객체를 통해 addScore 메서드를 호출하고
			// 점수를 전달
			studentMap.get(name).addScore(score);
		}
		
		Student topStudent = null;
		double highAvg = 0;
		
		// studentMap 의 value 들만 하나씩 순회하며 
		for(Student student : studentMap.values()) {
			double avg = student.getAverage();
			if(avg > highAvg) {
				highAvg = avg;
				topStudent = student;
			}
		}
		
		if(topStudent != null) {
			System.out.println(topStudent.getName() + " => " + highAvg);
		}
		
		
		
		
		
		
		
	}
}
