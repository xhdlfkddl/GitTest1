package Ch03;

public class MainTest {

	public static void main(String[] args) {
		//��Ŀ ���� ��ü ����
		HackerNews hackerNews = new HackerNews();
		MbcNews mbcNews = new MbcNews();
		
		// ��� �ۼ�
		MyArticle article = new MyArticle(hackerNews, mbcNews);
		article.complete();

	}

}
