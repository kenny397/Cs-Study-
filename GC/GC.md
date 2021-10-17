# JVM Garbage Collector(GC)

### JVM 
운영체제의 메모리 영역에 접근하여 메모리를 관리하는 프로그램
메모리 관리, GC의 역활을 하고 있다.

### Stop-The-World
GC를 실행하기 위해 JVM이 애플리 케이션 실행을 멈추는것이다.
Stop-the-world가 발생하면 GC를 실행하는 스레드를 제외한 나머지 스레드는 모두 작업을 멈춘다.
GC작업을 완료한 이후에 중단한 작업을 다시 시작한다.

## GC
동적으로 할당한 메모리 영역(Heap) 중 사용하지 않는 영역을 탐지하여 해지하는 기능
Heap영역의 Object를 가르키는 참조 변수가 Stack에 할당


### GC의 수거 대상 
UnReachable한 객체들

### GC의 과정(Mark and Sweep)
1. GC가 스택의 모든 변수를 스캔하면서 각각 어떤 객체를 참조하고 있는지 마킹한다.(Mark)
1. Reachable Object가 참조하고 있는 객체도 찾아서 마킹한다.(Mark)
1. 마킹되지 않는 객체를 힙에서 제거한다.(Sweep)

### GC는 언제 일어날까?
힙은 Young Generation과 Old Generation으로 구분된다.
Young Generation은 Eden과 Survivor0,1로 나누어진다.

1. eden의 영역이 가득차면 Minor GC발생 
1. Reachable한 객체는 Survivor 0 나 1에 들어간다. 그리고 Aging값이 증가한다. (0이나 1영역중 한곳은 비워둬야 한다.)
1. 이와 같은 일을 반복하고 Survivor에 들어있는 객체의 age값이 임계점에 도착하면 Old Generation으로 이동한다.
1. 그리고 Old Generation영역이 가득 차면 Major GC가 일어난다.