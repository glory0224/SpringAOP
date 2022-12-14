package glory.spring.board.controller;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import glory.spring.board.service.ReadArticleService;
import glory.spring.board.vo.ArticleNotFoundException;
import glory.spring.board.vo.ArticleVO;
import glory.spring.member.service.MemberService;
import glory.spring.member.vo.UpdateInfo;

public class MainTwo {

	public static void main(String[] args) {
		String[] configLocations = new String[] { "applicationContextTwo.xml" };
		AbstractApplicationContext context = 
		new ClassPathXmlApplicationContext(configLocations);
		ReadArticleService readArticleService = 
		context.getBean("readArticleService", ReadArticleService.class);
		
		try {
		ArticleVO article1 = readArticleService.getArticleAndIncreaseReadCount(1);
		ArticleVO article2 = readArticleService.getArticleAndIncreaseReadCount(1);
		System.out.println("article1 == article2 : " + (article1 == article2));
		readArticleService.getArticleAndIncreaseReadCount(0);
		} catch (ArticleNotFoundException e) {
			
		}
		MemberService memberService = 
				context.getBean("memberService", MemberService.class);
		memberService.update("javaline", new UpdateInfo());
		context.close();
	}

}
