package com.its.member.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor //기본생성자
@AllArgsConstructor //모든 필드를 매개변수로 하는 생성자
public class MemberDTO {
    long id;
    String memberId;
    String memberPassword;
    String memberName;
    int memberAge;
    String memberPhone;

}
