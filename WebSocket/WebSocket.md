## WebSocket
전이중 통신 > 실시간성 보장
### 언제쓰지?
실시간성을 보장하는 서비스
게임 채팅 실시간 주식거래 사이트 등등

## WebSocket vs HTTP

### HTTP
- 비연결성
- 매번 연결 맺고 끊는 과정의 비용
- 요청 응답 구조
- 많은 양의 요청 데이터
**HTTP 에서도 실시간성을 보장하는 기법이 존재**
ex)polling, long polling streaming


###그래도 왜 웹소켓을 쓸까?

 

### WebSocket 
- 연결 지향
- 한번 연결 맺은뒤 유지
- 양방향
- 연결 후에는 적은 데이터

**WebSocket을 지원하지 않은 곳은 Socket.io, Socket Js를 사용**


## STOMP
텍스트 기반 메시징 프로토콜
메시지 브로커를 활용하여 쉽게 메세지를 주고 받을 수 있는 프로토콜
 - pub -sub(발행 - 구독) : 발신자가 메시지를 발행하면 수신자가 그것을 수신하는 메시지 패러다임
 - 메시지 브로커 : 발신자의 메시지를 받아와서 수신자들에게 메시지를 전달하는 어떤 것

**WebSocket 위에 얹어 함께 사용할 수 있는 프로토콜** 

웹소켓은 텍스트와 바이너리 타입의 메시지를 양방향으로 주고 받는 프로토콜
하지만 형식이 정해지지 않는다.(대규모 프로젝트에서 적합하지 않음)
STOMP는 프레임이라고 해서 커맨드 헤더 바디로 정의
서버에서 가공 처리가 가능 
### 장점
- 하위 프로토콜 혹은 컨벤션을 따로 정의할 필요가 없다
- 연결 주소마다 새로 핸들러를 구현하고 설정해줄 필요가 없다
- 외부 메시징 큐를 사용할 수 있다
- spring security를 사용할 수 있다.
