package glory.spring.board.dao;

import glory.spring.board.vo.ArticleVO;

// 데이터베이스 처리 구현 클래스 
public class OracleArticleDAO implements ArticleDAO {

	@Override
	public void insert(ArticleVO article) {
		System.out.println("MyOracleArticleDAO.insert() 실행");
	}

	@Override
	public void updateReadCount(int id) {
		System.out.println("MyOracleArticleDAO.updateReadCount() 실행");
	}

}
