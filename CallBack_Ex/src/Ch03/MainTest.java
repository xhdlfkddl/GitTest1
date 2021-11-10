package Ch03;

public class MainTest {

	public static void main(String[] args) {
		//해커 뉴스 객체 생성
		HackerNews hackerNews = new HackerNews();
		MbcNews mbcNews = new MbcNews();
		
		// 기사 작성
		MyArticle article = new MyArticle(hackerNews, mbcNews);
		article.complete();

	}

}
