//package hello.core.beanfind;
//
//import hello.core.AppConfig;
//import hello.core.dicount.DiscountPolicy;
//import hello.core.member.MemberRepository;
//import hello.core.member.MemoryMemberRepository;
//import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.DisplayName;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.NoUniqueBeanDefinitionException;
//import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//import java.util.Map;
//
//import static org.assertj.core.api.Assertions.*;
//
//class ApplicationConextSameBeanFindTest {
//    AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(SameDeanConfig.class);
//
//    @Test
//    @DisplayName("중복 오류가 발생한다")
//    void findBeanByTypeDuplicate(){
//        Assertions.assertThrows(NoUniqueBeanDefinitionException.class,
//                () -> ac.getBean(MemberRepository.class));
//    }
//
//    @Test
//    @DisplayName("중복 오류가 발생시 이름을 지정해주면 됩니다.")
//    void findBeanByTypeName(){
//        MemberRepository bean = ac.getBean("memberRepository2", MemberRepository.class);
//        assertThat(bean).isInstanceOf(MemberRepository.class);
//
//    }
//
//    @Test
//    @DisplayName("특정 타입을 모두 조회하기")
//    void findAllBeanByType(){
//        Map<String, MemberRepository> beansOfType = ac.getBeansOfType(MemberRepository.class);
//        for (String key : beansOfType.keySet()) {
//            System.out.println("key = "+ key + " value = " + beansOfType.get(key));
//        }
//
//        System.out.println("beansOfType = " + beansOfType);
//        assertThat(beansOfType.size()).isEqualTo(2);
//    }
//
//    @Test
//    @DisplayName("부모타입으로 모두 조회하기 -object")
//    void findAllBeanByObject(){
//        Map<String, Object> beansOfType = ac.getBeansOfType(Object.class);
//        for (String key : beansOfType.keySet()) {
//            System.out.println("key = "+ key + " value = " + beansOfType.get(key));
//
//        }
//
//    }
//
////    @Configuration
////    static class SameDeanConfig{
////
////        @Bean
////        public MemberRepository memberRepository1(){
////            return new MemoryMemberRepository();
////        }
////
////        @Bean
////        public MemberRepository memberRepository2(){
////            return new MemoryMemberRepository();
////        }
////
////    }
//}
