package com.bbs.user.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

/**
 * @author: guangxush
 * @create: 2020/05/05
 */
@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "user")
public class User {
    /**
     * 用户表自增id
     */
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 账号
     */
    @Column(name = "uid")
    private String uid;

    /**
     * 用户信息
     */
    @Column(name = "userinfo")
    private String userInfo;
}
