>## RESTful
REST+ful >>즉 REST원리를 따르는 시스템을 RESTful이란 용어로 지칭된다. REST란 아키텍쳐스타일의 제약조건을 모두 만족하는 시스템




### REST

자원의 표현을 가지고 상태 전달
여기서 자원의 표현은 HTTP URI을 나타내고
상태 전달은 HTTP method을 이용한다.
즉 HTTP URI을 가지고 HTTP method를 통해 표현하는 것이다.




### REST의 특징
1. client- server(서버-클라이언트 구조)
	* client(자원을 요청하는 쪽)가 server(자원이 있는 쪽)에게 request보내고 server가 client에게 response를 보내는 구조
	* 서버는 api제공과 제공된 APi를 이용하여 비지니스 로직을 처리하거나 저장하는 역활
	* 클라이언트는 사용자 인증이나 컨텍스트(세션들을 관리하는 역활)

1. stateless(무상태) 
	* 클라인터와 서버의 통신에는 상태가 없어야한다
	* 모든 요청은 필요한 모든 정보를 담고 있어야한다.

1. cache	
	* 일반적인 서비스에서 60 ~80퍼 가량의 트랜잭션이 SELECT와 같은 조회성 트랜잭션
	* get은 얼마든지 호출해도 같은 값을 반환함
	
1. uniform interface(인터페이스 일관성)
	* 리소스가 URI로 식별되야 합니다.
    * 리소스를 생성,수정,추가하고자 할 때 HTTP메시지에 표현을 해서 전송해야 합니다.
    * 메시지는 스스로 설명할 수 있어야 합니다. (Self-descriptive message)
    * 애플리케이션의 상태는 Hyperlink를 이용해 전이되야 합니다.(HATEOAS)
1. Layered System(계층화)
	* 계층으로 구성이 가능해야 한다.
	* 클라이언트 입장에서는 서버만 호출함
	* 서버는 다중 계층으로 구성될 수 있음
1. Code-on-demand(optional)
 	* Server로부터 스크립트를 받아서 Client에서 실행한다.

	
## 정리
* http method,status code를 용도에 맞게 써야하고 http헤더와 link를 신경 쓰면 restful한 서비스를 설계할 수 있다.
* 이해하기 쉽고 사용하기 쉬운 REST API를 만드는 것
* RESTful한 API를 구현하는 근본적인 목적이 성능 향상에 있는 것이 아니라 일관적인 컨벤션을 통한 API의 이해도 및 호환성을 높이는 것이 주 동기이니, 성능이 중요한 상황에서는 굳이 RESTful한 API를 구현할 필요는 없다.
