## MVC 패턴
웹 개발 하면 필수적으로 알아야 할 디자인 패턴이다.

#### MVC패턴 이전에는 어떤 구조를 사용했을까?

![이미지](https://download.oracle.com/otn_hosted_doc/jdeveloper/1012/developing_mvc_applications/images/struts_model1.gif)
(출처 제타위키)

**model 1 ** : 로직+출력 코드가 한페이지에 삽입
쉬운 코딩 어려운 유지보수



![이미지](https://download.oracle.com/otn_hosted_doc/jdeveloper/1012/developing_mvc_applications/images/struts_model2.gif)
(출처 제타위키)
**model2:** 비즈니스와 출력 로직의 분리 

### 이제 MVC패턴에 대해서 알아보자

**model  **

	도메인 객체 또는 DTO로 화면에 전달할 또는 화면에서 전달 받은 데이터를 담고 있는 객체
	(@Entitiy),Database와 강하게 연관

**view  **

	데이터를 보여주는 역활. 다양한 형태 HTML ,JSON , XML
    
**controller **

	흐름제어의 역활
	사용자 입력을 받아 모델 객체의 데이터를 변경하거나 뷰에 전달하는 역활 
	EX)입력값 검증 , 모델 객체 변경, 변경된 모델 객체 뷰에 전달

![이미지](https://upload.wikimedia.org/wikipedia/commons/thumb/5/53/Router-MVC-DB.svg/550px-Router-MVC-DB.svg.png)
(출처 제타위키)

흐름을 알아보면 DispatcherServlet이 Controller 에게 Mapping 해주고
Controller가 model에게 보내 데이터 변경하여 view를 준비함 view가 랜더링해주면서 끝남

### MVC장점

1. 구성요소들의 재사용
2. 확장성 증가
	* 한 모델에 대한 여러 행태의 뷰를 가짐
3. 중복 코딩 제거
	* 높은 응직도 : 논리적으로 관련있는 기능을 하나의 컨트롤러로 묶거나 , 특정 모델과 관련있는 뷰로 그룹화 ex(하나의 컨트롤러에 다양한 URL Mapping)
4. 각 요소들에 집중
	* 동시다발적개발: 백엔드 개발자와 프론트엔드 개발자 독립적으로 개발진행
    * 낮은 의존도: 뷰,모델,컨트롤러 각각 독립적이다.


### MVC 단점
	코드네비게이션 복잡함
	코드 일관성 유지에 노력이 필요함
	높은 학습 곡선?



