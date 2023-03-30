# 1181번
## 단어 정렬
### 문제
알파벳 소문자로 이루어진 N개의 단어가 들어오면 아래와 같은 조건에 따라 정렬하는 프로그램을 작성하시오.

1. 길이가 짧은 것부터
2. 길이가 같으면 사전 순으로

단, 중복된 단어는 하나만 남기고 제거해야 한다.

### 입력
첫째 줄에 단어의 개수 N이 주어진다. (1 ≤ N ≤ 20,000) 둘째 줄부터 N개의 줄에 걸쳐 알파벳 소문자로 이루어진 단어가 한 줄에 하나씩 주어진다. 주어지는 문자열의 길이는 50을 넘지 않는다.

### 출력
조건에 따라 정렬하여 단어들을 출력한다.

### 예제 입력 1
13<br>
but<br>
i<br>
wont<br>
hesitate<br>
no<br>
more<br>
no<br>
more<br>
it<br>
cannot<br>
wait<br>
im<br>
yours


### 예제 출력 1
i<br>
im<br>
it<br>
no<br>
but<br>
more<br>
wait<br>
wont<br>
yours<br>
cannot<br>
hesitate

### 출처
https://www.acmicpc.net/problem/1181