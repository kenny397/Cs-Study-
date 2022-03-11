## HTTPS

### HTTP
- 서로 다른 시스템들 사이에서 통신을 주고받게 하는 가장 기본적인 프로토콜
- 서버에서 브라우저로 데이터를 전송하는 용도로 가장 많이 사용함
- 문제점 : 서버에서 브라우저로 전송되는 정보가 암호화되지 않는다는 문제점을 가지고 있습니다.

### HTTPS
- SSL(보안 소켓 계층) 사용
	- SSL은 서버와 브라우저 사이에 안전하게 암호화된 연결을 만들 수 있게 도와주고, 서버와 브라우저가 민감한 정보를 주고받을 때 해당 정보가 도난당하는 것을 막아줌
**HTTPS는 HTTP Message Body를 암호화 하는것**
Header는 암호화하지 않는다.

### 사용 이유
1. 보안성
2. SEO 검색엔진최적화(구글은 HTTPS 웹 사이트에 가산점을 줌)

### SSL/TLS
TLS는 SSL의 업그레이드 버전

### SSL
- 웹 서버와 웹 브라우저간의 보안을 위해 만든 프로토콜
- 공개키/개인키 대칭키 기반으로 사용함(서로 장단점을 가지고 있다.)


### SSL 통신 과정
- SSL은 공개키 방식으로 대칭키를 전달합니다.
- 대칭키를 활용해서 암호화와 복호화를 하고, 서버와 브라우저간 통신을 진행함

1. 클라이언트가 서버에게 접속을 요청한다.
2. 서버가 자신의  공개키를 전송
3. 클라이언트가 자신의 대칭키를 공개키로 암호화한다.
4. 서버는 받은 대칭키를 개인키로 복호화한다.
5. 대칭키로 암호와하고 복호화하고 통신한다.



