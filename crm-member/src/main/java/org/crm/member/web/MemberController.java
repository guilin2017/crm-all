package org.crm.member.web;

import org.crm.member.model.Member;
import org.crm.member.service.MemberService;
import org.crm.member.utils.RedisUtil;

import com.common.web.Result;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

import java.util.List;

/**
* Created by CodeGenerator on 2018/08/10.
*/
@RestController
@RequestMapping("/member")
public class MemberController {
      @Resource
      private MemberService memberService;

      @GetMapping("/{id}")
	  public Result selectById(@PathVariable Integer id) {
    	  System.out.print("进来了！");
	      Result result = new Result();
	      Member member = (Member) RedisUtil.get(String.valueOf(id));
	      System.out.print("Redis:" + member);
	      if (member == null) {
	    	  member = memberService.findById(id);
	    	  if (member == null) {
		    	  result.setResultMsg("找不到对应的会员！");
		      }else {
		    	  RedisUtil.set(String.valueOf(id), member, 60);
		      }
	      }

    	  result.setDate(member);
	      result.setSuccess(true);
	      return result;
	  }
    
     
//    @PostMapping
//    public Result add(@RequestBody Member member) {
//        memberService.save(member);
//        return ResultGenerator.genSuccessResult();
//    }
//
//    @DeleteMapping("/{id}")
//    public Result delete(@PathVariable Integer id) {
//        memberService.deleteById(id);
//        return ResultGenerator.genSuccessResult();
//    }
//
//    @PutMapping
//    public Result update(@RequestBody Member member) {
//        memberService.update(member);
//        return ResultGenerator.genSuccessResult();
//    }
//
//    @GetMapping("/{id}")
//    public Result detail(@PathVariable Integer id) {
//        Member member = memberService.findById(id);
//        return ResultGenerator.genSuccessResult(member);
//    }
//
//    @GetMapping
//    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
//        PageHelper.startPage(page, size);
//        List<Member> list = memberService.findAll();
//        PageInfo pageInfo = new PageInfo(list);
//        return ResultGenerator.genSuccessResult(pageInfo);
//    }
}
