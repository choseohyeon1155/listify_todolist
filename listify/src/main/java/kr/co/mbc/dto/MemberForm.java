package kr.co.mbc.dto;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class MemberForm {

	private Long id;
	private String username;
	private String name;
	private String password;
	private String password2;
	private String phone;
	private int memberNumber;
	private String address;
	private Date birthday;
	
	
	@Override
	public String toString() {
		return "MemberForm [id=" + id + ", username=" + username + ", name=" + name + ", password=" + password
				+ ", password2=" + password2 + ", phone=" + phone + ", memberNumber=" + memberNumber + ", address="
				+ address + ", birthday=" + birthday + "]";
	}
	
}
