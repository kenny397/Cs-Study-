## Junit5

### 어노테이션
@BeforeAll : 해당 클래스에 위치한 모든 테스트 메서드 실행 전에 딱 한 번 실행되는 메서드
@AfterAll : 해당 클래스에 위치한 모든 테스트 메서드 실행 후에 딱 한 번 실행되는 메서드

@BeforeEach : 해당 클래스에 위치한 모든 테스트 메서드 실행 전에 실행되는 메서드
@AfterEach : 해당 클래스에 위치한 모든 테스트 메서드 실행 후에 실행되는 메서드
@Disabled : 테스트를 하고 싶지 않은 클래스나 메서드에 붙이는 어노테이션
@DispayName : 어떤 테스트인지 쉽게 표현할 수 있도록 사용하는 어노테이션
@RepeatedTest : 특정 테스트를 반복시키고 싶을때 사용하는 어노테이션
@ParameterizedTest : 매개변수를 대입해가며 반복 실행할 때 사용하는 어노테이션
@Nested : 테스트 클래스 안에서 내부 클래스를 정의해 테스트를 계층화 할 때 사용


### Assertions
테스트 케이스의 수행 결과를 판별하는 메서드
모든 Junit Jupiter Assertions는 static 메서드
assertAll : 모든 assert실행
assertThrows : 예외 발생을 확인하는 테스트

