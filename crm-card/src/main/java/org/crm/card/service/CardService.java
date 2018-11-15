package org.crm.card.service;
import org.crm.card.model.Card;
import com.common.base.service.BaseService;


/**
 * Created by CodeGenerator on 2018/08/07.
 */
public interface CardService extends BaseService<Card> {

	public void issueMemberCard(int memberid);
}
