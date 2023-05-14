package com.xiaoyi.springsecurity.user;

import com.xiaoyi.springsecurity.response.UserResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 王艺翔
 * @description UserServiceImpl
 * @date 2023/5/11 20:27
 * @phone 18318436514
 * @email w2603494062@gmail.com
 * @github https://github.com/Tom-Collection"
 */
@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

	private final UserRepo userRepo;

	@Override
	public UserResponse findByUserEmail(String email) {
		User user = userRepo.findByEmail(email).orElseThrow();
		UserResponse userResponse = new UserResponse();
		BeanUtils.copyProperties(user, userResponse);
		return userResponse;
	}

	@Override
	public List<UserResponse> findAllUser() {
		return userRepo.findAll().stream().map(
						user -> UserResponse.builder().name(user.getName()).email(user.getEmail())
										.role(user.getRole()).build()).toList();
	}
}
