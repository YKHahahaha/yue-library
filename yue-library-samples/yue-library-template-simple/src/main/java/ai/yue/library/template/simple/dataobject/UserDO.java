package ai.yue.library.template.simple.dataobject;

import java.time.LocalDate;

import ai.yue.library.data.jdbc.dataobject.DBDO;
import ai.yue.library.template.simple.constant.RoleEnum;
import ai.yue.library.template.simple.constant.UserStatusEnum;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * @author	ylyue
 * @since	2019年9月25日
 */
@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class UserDO extends DBDO {

	Long user_id;// 用户ID
	RoleEnum role;// 用户所属角色
	String cellphone;// 用户手机号码
	String password;// 密码
	String nickname;// 用户昵称
	String email;// 邮箱
	String head_img;// 用户头像
	Character sex;// 用户性别
	LocalDate birthday;// 用户生日
	UserStatusEnum user_status;// 用户状态
	
}
