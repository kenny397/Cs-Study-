## Docker
**컨테이너 기반 가상화 도구**

### 가상화 무엇이며 왜 필요한가?
- 서버의 성능을 나눠서 사용할 때 필요
- 하나의 물리적 서버 호스트에서 여러개의 서버 운영 체제를  게스트로 실행할 수 있게 해주는 소프트웨어 아키텍처

### 가상화의 단점
1. 가상화 작업은 하이퍼바이저를 반드시 거쳐야 함
2. 각 가상머신에는 여러 운영체제가 설치 이미지가 용량이 크다
3. 성능이 느리고 부담

### 이러한 단점을 해결하기 위해 컨테이너 등장

#### 컨테이너를 왜 써야할까?
- 프로세스 라이플 사이클 관리를 위한 컨테이너
- Host OS 와의 격리를 통해 독립된 개발 환경을 보장 
- 프로세스를 컨테이너 단위로 사용 
- 프로세스 관리 확장이 용이

### 장점
1. 애플리케이션을 구동하는데 필요한 라이브러리 및 실행 파일만 존재
2. 이미지 용량이 줄어듬
3. 성능이 빠르다



## 도커 엔진
- 유저가 컨테이너를 쉽게 사용할 수 있게 하는 주체
- 컨테이너 관리
- 이미지 관리
- 볼륨 관리
- 네트워크 관리

### 클러스터
각기 다른 서버들을 하나로 묶어 하나의 시스템 같이 동작하게 하는것(고가용성 제공)

### 도커 스웜 모드
- 클러스터관리
- 서비스 관리
- 네트워크 관리
- 노드 관리

### 도커 스웜 모드를 왜 써야할까?
- 서비스 확장 관리 
- 마이크로 서비스 아키텍처의 컨테이너를 다루기 위한 클러스터링 기능에 초점
- 필요에 따라 유동적으로 컨테이너 수를 조절
- 컨테이너로의 연결을 분산하는 로드밸런싱 기능을 자체적으로 지원



## 도커 컴포즈
- 여러개의 컨테이너를 하나의 서비스로 정의
- 스웜 모드와 비슷
- .yml파일을 읽고 명령어를 통해 컨터이너 생성
- 컨테이너의 생성을 편리하게 위하여 





