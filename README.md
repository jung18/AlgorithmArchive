# Algorithm Problem Archive Service

개인적으로 알고리즘 문제를 정리하고, 문제별로 어떤 알고리즘을 사용했는지와 풀이를 함께 기록하기 위해 만든 문제풀이 보관 서비스 입니다.

온라인 저지에서 푼 문제나 직접 공부한 알고리즘 문제들을 체계적으로 정리하고 보관하여 향후 참고자료로 사용하기 편리하게 하는 것이 목표입니다.

---

## 기술 스택

* Java 21
* Spring Boot
* Spring Data JPA
* MySQL

---

## API 엔드포인트

### 1. 알고리즘 문제 API

| 기능       | Method | Endpoint                 |
| -------- | ------ | ------------------------ |
| 문제 목록 조회 | GET    | /api/problem             |
| 문제 상세 조회 | GET    | /api/problem/{problemId} |
| 문제 수정    | PUT    | /api/problem/{problemId} |
| 문제 삭제    | DELETE | /api/problem/{problemId} |

---

### 2. 풀이 API

| 기능    | Method | Endpoint                                       |
| ----- | ------ | ---------------------------------------------- |
| 풀이 추가 | POST   | /api/problem/{problemId}/solution              |
| 풀이 수정 | PUT    | /api/problem/{problemId}/solution/{solutionId} |
| 풀이 삭제 | DELETE | /api/problem/{problemId}/solution/{solutionId} |

---

### 3. 알고리즘 유형 API

알고리즘 유형(enum) 전체 목록을 반환합니다.

```http
GET /api/algorithms
```

응답 예시:

```json
{
  "DFS": "깊이 우선 탐색",
  "BFS": "너비 우선 탐색",
  "DIJKSTRA": "다익스트라"
}
```
---
