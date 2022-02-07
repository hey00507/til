# 스프링 삼각형

- 스프링을 이해하는데는 POJO(Plain Old Java Object) 를 기반으로 스프링 삼각형이라는 애칭을 가진
3대 스프링 프로그래밍 모델(Ioc/DI, AOP, PSA)에 대한 이해가 필수다.
- 스프링 삼각형을 이해하지 않은 상태에서 스프링 프레임 워크를 학습하는 것은 알파벳을 모르고 스프링을 공부하는 것과 같다.
1. IoC/DI
   - 제어의 역전, 의존성 주입
   - 전체가 부분에 의존함 (Car 객체가 Tire 객체에 의존함)
2. AOP
   - Aspect-Oriented Programming(관점 지향 프로그래밍)
   - DI 가 의존성 주입이라면 AOP는 로직의 주입
   - 공통적으로 일어나는 코드 (DB 연결, statement 세팅, 예외처리, DB 자원 반납) - 횡단관심사
   - DB 연결 후 일어나는 주 로직이 핵심관심사
   - 코드 = 핵심 관심사 + 횡단 관심사
   - Before, After, AfterReturning, AfterThrowing, Around
3. PSA
   - Portable Service Abstraction - 일관성있는 서비스 추상화
   - ex) JDBC 를 통한 여러 DB 연결
   - 다수의 기술을 공통의 인터페이스로 제어할 수 있는 것 -> 서비스 추상화
   - ex) Test 코드작성시에도 이 PSA 를 이용해 추상화로 해결할 수 있다.
