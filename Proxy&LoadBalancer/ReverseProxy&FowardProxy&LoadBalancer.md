# Forward Proxy & Reverse Proxy & Load Balancer

## proxy 서버란
클라이언트와 서버간의 중계 서버로, 통신을 대리 수행하는 서버
캐시/보안/트래픽 분산등 다양한 장점을 가질 수 있음

## ForwardProxy
![](https://img1.daumcdn.net/thumb/R1280x0/?scode=mtistory2&fname=https%3A%2F%2Fblog.kakaocdn.net%2Fdn%2FPbhvn%2FbtqBzj4CWaB%2FLVl1kFgdRPYq3DLbEeGn10%2Fimg.jpg)
_출처 : www.imperva.com_



### 위치 
클라이언트와 인터넷 사이

### 특징 
1. 캐싱 
	* 전송시간 절약
	* 불필요한 외부 전송 X
	* 외부 요청 감소 > 네트워크 병목 현상 방지
2. 익명성 서버가 응답 받은 요청을 알 수 없음


## ReverseProxy
![](https://img1.daumcdn.net/thumb/R1280x0/?scode=mtistory2&fname=https%3A%2F%2Fblog.kakaocdn.net%2Fdn%2FsoZxz%2FbtqBvsBdrub%2F3lKN2HHrkzEnxZecoArlFK%2Fimg.jpg)
_출처 : www.imperva.com_

### 위치
인터넷과 서버사이
### 특징
1. 캐싱
2. 보안 서버정보를 클라이언트로 숨김 client입장에서 프록시 서버를 실제 서버로 생각함


## LoadBalancer
부하 분산

### why
단순히 성능을 올리는 **(Scale Up)** 으로만은 힘듬어서 **Scale Out**


여러대의 서버가 분산 처리할 수 있도록 나누는 것
### L4 LoadBalancer
Transport Layer level에서 Load Balancing (TCP/UDP) 서버 A와 서버 B로 나누는다.

### L7 LoadBalancer
Application Layer Level에서 Load Balancing (HTTPS/HTTP/FTP) uri 요청 방식에 따라서 담당 서버들로 로드밸런싱
ex) /post , /login