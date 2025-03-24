package ex06_operator;

import java.util.Scanner;

public class Ex03_operator {

	public static void main(String[] args) {
		// 비트 연산자
		// 논리 연산자와 비슷하지만 bit 단위의 연산만 가능하다.
		
		// & 논리곱 (and) : 둘 다 1이면 1(참)
		// | 논리합 (or) : 둘이 더한 것이 1이면 1 (단, 1과 1도 1)
		// ^ 배타적 논리합 : 둘이 다르면 1
		// ~ 부정 (not) : 0이면 1, 1이면 0
		
		int a = 10; // 1010
		int b = 7; // 0111
		int c = a & b;
		System.out.println("c : " + c); //2 0010
		
		int a2 = 12; // 1100
		int b2 = 8; // 1000
		int c2 = a2 | b2;
		System.out.println("c2 : " + c2); // 12 2^3 + 2^2 1100
		
		int a3 = 9; // 1001 -> 2^3 + 2^0
		int b3 = 11; // 1011 -> 2^3 + 2^1 + 2^0
		int c3 = a3 ^ b3;
		System.out.println("c3 : " + c3); //2 0010
		
		
		int x =7; // 4+2+1 (2^2 + 2^1 + 2^0 => 0111
		System.out.println("~x : " + ~x); // 1000(-8)
		// 공!!!!식!!!!!! ~x -> -(x+1)
		
		
		
		// 시프트 연산자 : 비트의 이동
		// >> : 오른쪽으로 한 칸씩 옮김
		// << : 왼쪽으로 한 칸씩 옮김 (숫자만큼 곱하기 2)
		
		x = 10;
		int result = x << 1; // 10100
		System.out.println(result); // 20
		
		result = x >> 1; // 0101
		System.out.println(result); // 5 (2^2+2^0) 
		
		
		
		// 삼항 연산자
		// 조건식 ? 참 : 거짓
		
		int i = 10;
		int i2 = 15;
		result = ++a >= b ? 1 : 0; // ++a : 11, b : 11
		System.out.println("result : " + result); // 1
		
		
	}
}
