## 오늘 알게 된 것
1. 그레이들로 프로젝트 내 라이브러리 직접 삽입하기
```gradle
/**
* 프로젝트 디렉토리 최상단에 lib 라는 이름의 디렉토리 생성
* dependencies 설정을 잡아줌
*/
dependencies{
	implementation fileTree(dir: 'lib', includes: ['*.jar'])
}
```

2. non-varargs call of varargs method with inexact argument type for last parameter 경고
- 해당 경고문구는 선언한 메서드의 파라미터에 null 값이 들어갈 때 생기는 문구이다.
- null 도 기존의 파라미터의 형태에 맞게 형변환 시켜주면 해결할 수 있다.

3. 네임서버? -> 도메인 연결시 사용하는 듯?