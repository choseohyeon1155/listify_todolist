package kr.co.mbc.service;

import org.springframework.stereotype.Service;

import kr.co.mbc.repository.MemberRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class MemberService {

	private final MemberRepository memberRepository;
}
