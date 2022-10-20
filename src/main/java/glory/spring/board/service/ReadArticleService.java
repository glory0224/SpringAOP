package glory.spring.board.service;

import glory.spring.board.vo.ArticleNotFoundException;
import glory.spring.board.vo.ArticleVO;

// read 서비스 제공할 인터페이스 작성
public interface ReadArticleService {
	ArticleVO getArticleAndIncreaseReadCount(int id) throws ArticleNotFoundException;
}
