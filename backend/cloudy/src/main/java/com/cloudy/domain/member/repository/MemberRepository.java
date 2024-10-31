package com.cloudy.domain.member.repository;

import com.cloudy.domain.instance.model.Instance;
import com.cloudy.domain.member.model.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MemberRepository extends JpaRepository<Member, Long> {
}