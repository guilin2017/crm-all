package org.crm.member.service.impl;

import org.crm.member.core.AbstractService;
import org.crm.member.dao.MemberMapper;
import org.crm.member.model.Member;
import org.crm.member.service.MemberService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.common.web.Result;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2018/08/10.
 */
@Service
@Transactional
public class MemberServiceImpl extends AbstractService<Member> implements MemberService {
    @Resource
    private MemberMapper memberMapper;

    @HystrixCommand(fallbackMethod = "error")
	@Override
	public Member selectById(int memberId) {
		// TODO Auto-generated method stub
		return null;
	}

    public Member error() {
  	  return new Member();
    }
}
