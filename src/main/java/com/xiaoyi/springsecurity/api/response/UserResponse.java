package com.xiaoyi.springsecurity.api.response;

import com.xiaoyi.springsecurity.domain.user.entity.Role;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author 王艺翔
 * @description UserResponse 用户
 * @date 2023/5/11 20:30
 * @phone 18318436514
 * @email w2603494062@gmail.com
 * @github https://github.com/Tom-Collection"
 */
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserResponse {
	@Schema(description = "用户昵称")
	private String name;
	@Schema(description = "用户邮箱")
	private String email;
	@Schema(description = "用户角色")
	private Role role;
}
