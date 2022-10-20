package glory.spring.board.dao;

import glory.spring.board.vo.ArticleVO;

public interface ArticleDAO {
	void insert(ArticleVO article);
	void updateReadCount(int id);
}
