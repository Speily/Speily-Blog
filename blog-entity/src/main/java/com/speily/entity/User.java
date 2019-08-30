package com.speily.entity;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 用户表
 * </p>
 *
 * @author Speily
 * @since 2019-08-30
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class User extends Model<User> {

    private static final long serialVersionUID=1L;

    /**
     * 主键id
     */
    private String id;

    /**
     * 登录名
     */
    private String loginName;

    /**
     * 手机号
     */
    private String mobile;

    /**
     * 密码
     */
    private String password;

    /**
     * 登陆名
     */
    private String userName;

    /**
     * 性别0=女 1=男
     */
    private Integer sex;

    /**
     * 年龄
     */
    private Integer age;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 职位 岗位
     */
    private String position;

    /**
     * 用户所属城市
     */
    private Integer city;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;

    /**
     * 创建人
     */
    private String createBy;

    /**
     * 修改时间
     */
    private LocalDateTime updateTime;

    /**
     * 更新人
     */
    private String updateBy;

    /**
     * 状态 0=正常 1=停用
     */
    private String status;

    /**
     * 删除标识：1删除，0未删除
     */
    private String deleteFlag;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
