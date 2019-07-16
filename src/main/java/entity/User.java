package entity;

import java.io.Serializable;

import org.apache.ibatis.type.Alias;

/**
 * 实体类
 * @author RanJi
 *
 */

@Alias("UserBean")
public class User implements Serializable{
	private static final long serialVersionUID = 1L;
	private int id;				//-- ID
	private String name;		//-- 用户姓名
	private String email;		//-- 邮箱
	private String headIcon;	//-- 头像
	private String uname;		//-- 账号
	private String pwd;			//-- 密码
	
	
	public User(){}
	public User(String uname, String pwd) {
		this.uname = uname;
		this.pwd = pwd;
	}
	public User(String name, String email, String headIcon, String uname, String pwd) {
		super();
		this.name = name;
		this.email = email;
		this.headIcon = headIcon;
		this.uname = uname;
		this.pwd = pwd;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getHeadIcon() {
		return headIcon;
	}
	public void setHeadIcon(String headIcon) {
		this.headIcon = headIcon;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", email=" + email + ", headIcon=" + headIcon + ", uname=" + uname
				+ ", pwd=" + pwd + "]";
	}
	
	
}
