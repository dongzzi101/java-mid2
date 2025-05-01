package collection.map.test.member;

public class MemberRepositoryMain {

    public static void main(String[] args) {

        Member member1 = new Member("id1", "회원1");
        Member member2 = new Member("id2", "회원2");
        Member member3 = new Member("id3", "회원3");

        // 회원 저장
        MemberRepository memberRepository = new MemberRepository();
        memberRepository.save(member1);
        memberRepository.save(member2);
        memberRepository.save(member3);

        // 회원 조회
        Member findMember1 = memberRepository.findById("id1");
        System.out.println("findMember1 = " + findMember1);

        Member findMember3 = memberRepository.findByName("회원3");
        System.out.println("findMember3 = " + findMember3);

        // 회원 삭제
        memberRepository.remove("id1");
        Member removedMember = memberRepository.findById("id1");
        System.out.println("removedMember = " + removedMember);

    }

}
