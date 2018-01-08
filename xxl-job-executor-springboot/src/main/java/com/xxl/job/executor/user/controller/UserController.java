package com.xxl.job.executor.user.controller;

import com.xxl.job.executor.core.Result;
import com.xxl.job.executor.core.ResultGenerator;
import com.xxl.job.executor.entity.User;
import com.xxl.job.executor.user.service.UserService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * Created by 方典典 on 2017/12/26.
 */
@RestController
// @RequestMapping("/user")
@Api(value = "User", description = "用户")
public class UserController {
	@Resource
	private UserService userService;

	@ApiOperation(value = "添加用户")
	@PostMapping("/user")
	public Result<Object> add(@RequestBody User user) {
		userService.save(user);
		return ResultGenerator.genSuccessResult();
	}

	/**
	 * @Description:TODO
	 * @param id
	 * @return Result
	 * @exception:
	 * @author: 方典典
	 * @time:2017年12月26日 下午10:39:05
	 */
	@ApiOperation(value = "删除用户")
	@DeleteMapping("/user")
	public Result<Object> delete(@RequestParam Integer id) {
		userService.deleteById(id);
		return ResultGenerator.genSuccessResult();
	}

	/*
	 * @ApiOperation(value = "更新用户")
	 * 
	 * @PutMapping("/user") public Result update(@RequestBody User user) {
	 * userService.update(user); return ResultGenerator.genSuccessResult(); }
	 * 
	 * @ApiOperation(value = "获取用户")
	 * 
	 * @GetMapping("/user") public Result detail(@RequestParam Integer id) {
	 * User user = userService.findById(id); return
	 * ResultGenerator.genSuccessResult(user); }
	 */
	@ApiOperation(value = "获取全部用户")
	@GetMapping("/users")
	public Result<Object> list(@RequestParam(defaultValue = "0") Integer page,
			@RequestParam(defaultValue = "0") Integer size) {
		PageHelper.startPage(page, size);
		List<User> list = userService.findAll();
		PageInfo<User> pageInfo = new PageInfo<>(list);
		return ResultGenerator.genSuccessResult(pageInfo);
	}
}
