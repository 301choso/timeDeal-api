package kr.rebe.deal.repository;

import kr.rebe.deal.entity.Member;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

/**
 * 회원 Repository Interface
 * */

@Repository
public interface MemberRepository extends CrudRepository<Member, Long> {

    List<Member> findAll();

    Member findByLoginId(String loginId);
}
