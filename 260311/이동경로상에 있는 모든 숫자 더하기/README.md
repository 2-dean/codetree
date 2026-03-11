# [이동경로상에 있는 모든 숫자 더하기](https://www.codetree.ai/trails/complete/curated-cards/test-add-all-the-numbers-on-the-path)

|유형|문제 경험치|난이도|
|---|---|---|
|[Trail 2 / 시뮬레이션 II / dx dy technique](https://www.codetree.ai/trail-info/novice-mid/)|[[Test]이동경로상에 있는 모든 숫자 더하기](https://www.codetree.ai/trails/complete/curated-cards/test-add-all-the-numbers-on-the-path/)|보통|

조금 더 개선한다면? 
① inRange 함수의 습관화
지금처럼 if (nx >= 0 && nx < n ...)라고 직접 쓰는 것도 좋지만, 격자 이동 문제에서는 별도의 inRange 함수를 만드는 습관을 들이면 좋습니다. 코드가 복잡해질수록 가독성 차이가 커지거든요.

② charAt(i) 대신 toCharArray()
for문에서 매번 s.charAt(i)를 호출하는 것보다, for(char command : s.toCharArray())를 사용하면 Java 스타일의 더 깔끔한(Enhanced for loop) 코드가 됩니다.

③ 변수 명확화
x, y 변수 선언 시 currX, currY 혹은 r, c (row, col)라고 이름 붙이면 행렬 구조를 다룰 때 덜 헷갈릴 수 있습니다.
