package glory.spring.board.service;

import glory.spring.board.dao.ArticleDAO;
import glory.spring.board.vo.ArticleVO;

public class WriteArticleServiceImpl implements WriteArticleService{
	private ArticleDAO articleDao;
	
	public WriteArticleServiceImpl() {
	}
	
	// 생성자 주입 
	public WriteArticleServiceImpl(ArticleDAO articleDao) {
		this.articleDao = articleDao;
	}
	
	
	@Override
	public void write(ArticleVO article) {
		System.out.println("WriteArticleServiceImpl.write() 메서드 실행");
		articleDao.insert(article);
	}

}
