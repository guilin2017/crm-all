package org.crm.card.web;

import org.crm.card.model.Card;
import org.crm.card.service.CardService;

import com.common.web.Result;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import org.springframework.web.bind.annotation.*;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import javax.annotation.Resource;

import java.util.List;

/**
* Created by CodeGenerator on 2018/08/07.
*/
@RestController
@RequestMapping("/card")
@Api(description = "卡片接口")
public class CardController {
    @Resource
    private CardService cardService;

    @ApiOperation("发会员卡")
    @RequestMapping(value = "issueMemberCard", method = RequestMethod.GET)
    public Result issueMemberCard(@RequestParam(value = "memberId", required = true) int memberId){
		Result result = new Result<>();
        
		cardService.issueMemberCard(memberId);
		
        return result;
    }
}
