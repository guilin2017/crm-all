package org.crm.card.service.impl;

import org.crm.card.dao.CardMapper;
import org.crm.card.model.Card;
import org.crm.card.service.CardService;
import org.crm.core.api.feign.member.MemberRest;
import org.crm.core.beans.member.MemberVO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.common.base.service.BaseServiceImpl;
import com.common.web.Result;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2018/08/07.
 */
@Service
@Transactional
public class CardServiceImpl extends BaseServiceImpl<Card> implements CardService {
    
	private static Logger log = LoggerFactory.getLogger(CardServiceImpl.class);
	
	@Resource
    private CardMapper cardMapper;

    @Autowired
    private MemberRest memberRest;

	@Override
	public void issueMemberCard(int memberid) {
		Result<MemberVO> result = memberRest.selectById(memberid);
		if (result.isSuccess() && result.getModel() != null) {
			MemberVO memberVO = result.getModel();
		}else {
			
		}
		
	}
    
    
}
