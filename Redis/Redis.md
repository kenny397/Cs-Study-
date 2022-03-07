## Redis
Remote dictionary server
키-값 기반의 인메모리 데이터 저장소


- Database
- Cache
(나중의 요청에 대한 결과를 미리 저장했다가 빠르게 사용하는 것 ),
- Message broker
- In-memory Data Structure Store 
(Database보다 더 빠른 Memory에 더 자주 접근하고 덜 자주 바뀌는 데이터를 저장하자)
- Supports rich data structure(자료구조가 풍부하다)
1. String : 단순한 키-값 매핑
2. Lists : Array형식의 데이터 구조
3. Sets : 순서가 없는 String 데이터 집합 (중복 X)
4. Sorted Sets : 순서를 정할 수 있는 Sets
5. Hashes : 키-값의 구조를 여러개 가진 object 타입을 저장하기 좋은 구조


## Redis 주의할 점 
### Single Thread 서버 이므로 시간 복잡도를 고려해야한다
- 비동기
- IO-bound Process
- Context Switching 효율이 적다
- Single Thread
### In-memory 특성상 메모리 파편화, 가상 메모리등의 이해가 필요하다.
- 메모리 파편화
- 가상메모리 Swap
- Replication - Fork

## 정리
Redis는 인-메모리 방식의 데이터 저장소로 캐시서버를 구성하는데 사용되는 오픈소스입니다.
캐시서버를 구성하는 비용도 많이 들고 관리도 어렵습니다. 하지만 서비스 개선을 위해서 반드시 사용해야합니다.
