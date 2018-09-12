package org.crm.core.api.feign.member;

import org.crm.core.beans.member.MemberVO;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.common.web.Result;

@FeignClient("crm-member")
public interface MemberRest {

	 //@ApiOperation("根据ID获取会员信息")
	@RequestMapping(value="/member/{id}",method=RequestMethod.GET)
	public Result<MemberVO> selectById(@RequestParam(name = "id", required = true) Integer id);
}
