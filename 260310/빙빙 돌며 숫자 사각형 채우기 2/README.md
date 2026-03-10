# [빙빙 돌며 숫자 사각형 채우기 2](https://www.codetree.ai/trails/complete/curated-cards/challenge-snail-number-square-2)

|유형|문제 경험치|난이도|
|---|---|---|
|[Trail 2 / 시뮬레이션 II / dx dy technique](https://www.codetree.ai/trail-info/novice-mid/)|[[Challenge]빙빙 돌며 숫자 사각형 채우기 2](https://www.codetree.ai/trails/complete/curated-cards/challenge-snail-number-square-2/)|어려움|


수정 전: if (c == 91) c = 65;

수정 후: if (c > 'Z') c = 'A'; (혹은 해설처럼 (char)(i % 26 + 'A') 방식 추천)
