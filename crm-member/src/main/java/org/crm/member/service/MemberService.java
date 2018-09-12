package org.crm.member.service;
import org.crm.member.model.Member;
import org.crm.member.core.Service;


/**
 * Created by CodeGenerator on 2018/08/10.
 */
public interface MemberService extends Service<Member> {

	public Member selectById(int memberId);
}
