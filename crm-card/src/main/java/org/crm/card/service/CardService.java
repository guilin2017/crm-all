package org.crm.card.service;
import org.crm.card.model.Card;
import org.crm.card.core.Service;


/**
 * Created by CodeGenerator on 2018/08/07.
 */
public interface CardService extends Service<Card> {

	public void issueMemberCard(int memberid);
}
