package Ch03;

import java.util.Scanner;

// 콜리(호출자)
public class MyArticle {
	
	//
	String article;
	WriteArticle hackerNews;
	WriteArticle mbcNews;
	
	// 주소값 연결
	public MyArticle(WriteArticle hackerNews, WriteArticle mbcNews) {
	// this.article = article;
		this.hackerNews = hackerNews;
		this.mbcNews = mbcNews;
	}
	
	public void complete() {
		// 스캐너를 사용하여 사용자 입력값을 받고 콜백 메서드를 실행시켜주세요
		Scanner sc = new Scanner(System.in);
		System.out.println("기사 내용을 입력해주세요.");
		article = sc.nextLine();
		hackerNews.printArticle(article);
		mbcNews.printArticle(article);
	}
	
}
