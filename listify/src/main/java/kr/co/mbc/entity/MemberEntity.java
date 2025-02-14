package kr.co.mbc.entity;

import java.util.Date;

import jakarta.persistence.Id;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import kr.co.mbc.dto.MemberForm;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "member")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class MemberEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String username;
	private String name;
	private String password;
	private String phone;
	
	@Column(name="member_number")
	private int memberNumber;
	private String address;
	private Date birthday;
	
	@Column(name="create_date")
	private Date createDate;
	
	@Column(name="update_date")
	private Date updateDate;
	
	private String role;
	
	@Column(name="member_state")
	private Character memberState;

	
	public static MemberEntity toMemberEntity(MemberForm memberform) {
		return MemberEntity.builder()
				.id(memberform.getId())
				.username(memberform.getUsername())
				.name(memberform.getName())
				.password(memberform.getPassword())
				.phone(memberform.getPhone())
				.memberNumber(memberform.getMemberNumber())
				.address(memberform.getAddress())
				.birthday(memberform.getBirthday())
				.role("ROLE_USER")
				.build();
	}


	@Override
	public String toString() {
		return "MemberEntity [id=" + id + ", username=" + username + ", name=" + name + ", password=" + password
				+ ", phone=" + phone + ", memberNumber=" + memberNumber + ", address=" + address + ", birthday="
				+ birthday + ", createDate=" + createDate + ", updateDate=" + updateDate + ", role=" + role
				+ ", memberState=" + memberState + "]";
	}

}
