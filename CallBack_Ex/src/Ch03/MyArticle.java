package Ch03;

import java.util.Scanner;

// �ݸ�(ȣ����)
public class MyArticle {
	
	//
	String article;
	WriteArticle hackerNews;
	WriteArticle mbcNews;
	
	// �ּҰ� ����
	public MyArticle(WriteArticle hackerNews, WriteArticle mbcNews) {
	// this.article = article;
		this.hackerNews = hackerNews;
		this.mbcNews = mbcNews;
	}
	
	public void complete() {
		// ��ĳ�ʸ� ����Ͽ� ����� �Է°��� �ް� �ݹ� �޼��带 ��������ּ���
		Scanner sc = new Scanner(System.in);
		System.out.println("��� ������ �Է����ּ���.");
		article = sc.nextLine();
		hackerNews.printArticle(article);
		mbcNews.printArticle(article);
	}
	
}
