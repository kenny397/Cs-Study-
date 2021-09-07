### transport layer
end point간 신뢰성있는 데이터 전송을 담당하는 계층

신뢰성 : 데이터를 순차적 안정적인 전달
전송: 포트 번호에 해당하는 프로세스에 데이터를 전달

전송ㅊ 계층이 없다면!!! 전송 계층이 중요성
1.데이터의 순차 전송 원활히x
2. flow 흐릅문제
원인: 송수신자 간의 데이터 처리 속도 차이
3. congestion 혼잡 문제
원인: 네트워크의 데이터 처리 속도(ex 라우터)

TCP
신뢰성있는 데이터 통신을 가능하게 해주는 프로토콜
특징 : connection 연결 양방향 통신 3웨이 핸드쉐이크
데이터의 순차 전송을 보장
flow control
congestion control
## transport layer(전송 계층)
end point간 **신뢰성**있는 데이터 **전송**을 담당하는 계층
**신뢰성 :** 데이터를 순차적 안정적인 전달
**전송: **포트 번호에 해당하는 프로세스에 데이터를 전달

### 전송 계층의 중요성 
1. 데이터의 순차 전송을 하지 못한다. 
1. flow 흐름에 문제가 생긴다
	* 원인 : 송수신자 간의 데이터 처리 속도 차이
1. congestion 혼잡 문제
	* 원인 : 네트워크의 데이터 처리 속도(ex 라우터)


> # TCP와 UDP

## TCP
신뢰성있는 데이터 통신을 가능하게 해주는 프로토콜
**특징**

1. connection 연결 양방향 통신(3way-handshake)
1. 데이터의 순차 전송을 보장
1. flow control
1. congestion control
1. error detection (오류감지)

### TCP의 3way-handshake

1. SYN 비트를 1로 설정해 패킷 송신
1. SYN ACK비트를 1로 설정해 패킷 송신
1. ACK 비트를 1로 설정해 패킷 송신

### TCP의 데이터 연결

1. 클라이언트가 패킷 송신
1. Server에서 ACK 송신
1. ACK를 못받으면 재송신

### 4way-handshake

1. 데이터를 전부 송신한 클라이언트가 FIN송신
1. Server가 ACK 송신
1. Server에서 남은 패킷 송신(일정 시간 대기)
1. Server가 FIN 송신
1. client가 ACK 송신

### 문제점
전송의 신뢰성은 보장하지만 매번 커넥트를 연결해서 시간 손실 발생

## UDP
**특징**
TCP보다 신뢰성이 떨어지지만 전송 속도가 일반적으로 빠른 프로토콜
1. connectionless
1. error detection
1. 비교적 데이터의 신뢰성이 중요하지 않을 때 사용

### 데이터 전송 방식

1. client가 패킷 송신

## 중요한점
TCP UDP의 특성을 파악하고 상황에 따라 적절한 프로토콜을 사용할 수 있다.
헤더에 대해 파악하고 성능 개선에 이용해야 합니다.

