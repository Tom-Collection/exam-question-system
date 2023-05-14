package com.xiaoyi.springsecurity.user;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

/**
 * @author 王艺翔
 * @description Permisson
 * @date 2023/5/14 20:17
 * @phone 18318436514
 * @email w2603494062@gmail.com
 * @github https://github.com/Tom-Collection"
 */
@RequiredArgsConstructor
public enum Permission {
	ADMIN_READ("admin:read"),
	ADMIN_CREATE("admin_create"),
	ADMIN_UPDATE("admin_update"),
	ADMIN_DELETE("admin_delete");

	@Getter
	private final String permission;
}
