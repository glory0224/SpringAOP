package glory.spring.member.service;

import glory.spring.board.vo.MemberVO;
import glory.spring.member.vo.UpdateInfo;

public interface MemberService {
	void regist(MemberVO member);
	boolean update(String memberId, UpdateInfo info);
}
