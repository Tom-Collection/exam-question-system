package com.xiaoyi.springsecurity.domain.question_bank.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author 王艺翔
 * @description Options
 * @date 2023/5/16 13:46
 * @phone 18318436514
 * @email w2603494062@gmail.com
 * @github https://github.com/Tom-Collection"
 */
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "_option")
public class Option {
	@Id
	@GeneratedValue
	private Integer id;
	@Column(columnDefinition = "TEXT")
	private String content;
	private Integer questionId;
	private boolean isTrue;
}
