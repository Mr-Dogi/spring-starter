package hello.core.order;

import hello.core.dicount.FixDiscountPolicy;
import hello.core.member.Grade;
import hello.core.member.Member;
import hello.core.member.MemoryMemberRepository;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

// 생성자 주입을 사용하는 이유
class OrderServiceImplTest {
    @Test
    void createOrder(){


        MemoryMemberRepository memberRepository = new MemoryMemberRepository();
        memberRepository.save(new Member(1L,"name", Grade.VIP));

        OrderServiceImpl orderService = new OrderServiceImpl(memberRepository, new FixDiscountPolicy());
        Order order = orderService.crateOrder(1L,"numberA",100000);

        Assertions.assertThat(order.getDiscountPrice()).isEqualTo(1000);

    }

}