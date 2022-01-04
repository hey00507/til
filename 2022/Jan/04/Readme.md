# Application / Json

- form 태그에서 데이터를 Json 으로 뿌려주는 방법?
  - Ajax 밖에없나?
  - form 태그의 action, method 등이 모두 표시되는 문제?
    - 리액트나 view 로 해결할 수 있을듯?

컨트롤러에서 Json 을 받을 때는
- @RequestBody, 도메인엔 @Setter 를 사용하지 말자(private 으로 선언하는 이유에 대해서 생각할 것)