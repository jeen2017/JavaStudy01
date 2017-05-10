package com.bit.oop4.exec;

import com.bit.oop4.vo.BookVO;

public class Exec01 {

	public static void main(String[] args) {

		BookVO bookVO = new BookVO();  // Object생성
		
		bookVO.setStrTitle("자바의정석");
		bookVO.setStrAuthor("남궁성");
		bookVO.setIntPrice(20000);
		
		String mess = bookVO.toString(); // toString 리턴문자열을 mess에 저장
		BookVO vo2 = bookVO; // bookVO instance를 vo2에 복사
		
		System.out.println("첫번째:" + mess);
		System.out.println("두번째:" + vo2);
		
		vo2.setStrTitle("윈도우만세");
		System.out.println("바꾼후:"+bookVO.toString());
		
		// 같은 일을 한다.
		System.out.println(bookVO.toString());
		System.out.println(bookVO);
		
		String num = Integer.toString(30);
		System.out.println(Integer.toString(30));
		System.out.println(30);
		
	}

}
