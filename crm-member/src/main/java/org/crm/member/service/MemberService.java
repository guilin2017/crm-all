package org.crm.member.service;
import com.common.base.service.Service;
import org.crm.member.model.Member;



/**
 * Created by CodeGenerator on 2018/08/10.
 */
public interface MemberService extends Service<Member> {

	public Member selectById(Integer memberId);
}
