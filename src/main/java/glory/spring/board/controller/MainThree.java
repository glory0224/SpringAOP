package glory.spring.board.controller;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import glory.spring.board.service.WriteArticleService;
import glory.spring.board.vo.ArticleVO;
import glory.spring.board.vo.MemberVO;
import glory.spring.member.service.MemberService;

public class MainThree {

	public static void main(String[] args) {
		String[] configLocations = new String[] { "applicationContextThree.xml" };
		AbstractApplicationContext context = 
		new ClassPathXmlApplicationContext(configLocations);
		WriteArticleService articleService = 
		(WriteArticleService) context.getBean("writeArticleService");
		articleService.write(new ArticleVO());
		MemberService memberService = 
		context.getBean("memberService", MemberService.class);
		memberService.regist(new MemberVO());
		context.close();
	}

}
