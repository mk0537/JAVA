package ex01_Set;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class Bingo {

	public static void main(String[] args) {
		// HashSet을 이용한 5*5 랜덤 빙고판 만들기
		// 숫자는 1 ~ 50
		
		HashSet<Integer> set = new HashSet<>();
		
		// 5 * 5 크기의 2차원 배열 생성
		int[][] board = new int [5][5];
		
		// HashSet에 25개의 난수를 채울 때까지 돌려라
		while(set.size() != 25) {
			set.add(new Random().nextInt(50)+1);
		}
		
		
		//Set은 index 가 없기 때문에 하나식 꺼낼 수가 없다.
		// 그렇기 때문에 iterator 를 통해서 꺼낸다
		
		
		// shuffle()
		List<Integer> list = new ArrayList<>(set);
		Collections.shuffle(list);
		// set 으로 랜덤값을 넣었기 때문에 중복값은 어차피 안 들어가 있음
		
		
		
		Iterator<Integer> iter = set.iterator();
	
		for(int i = 0; i < board.length; i++) {
			for(int j = 0; j < board[i].length; j++) {
				board[i][j] = iter.next();
				System.out.printf("%02d ", board[i][j]);
			}
			System.out.println();
		}
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
