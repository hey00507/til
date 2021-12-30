# Try, Catch, Finally

```java
public class TryCatchTest {
    public static void main(String[] args) {
        System.out.println(tryCatch());
    }

    private static int tryCatch() {
        try {
            return 10;
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            return 30;
        }
    }
}
```

- 위와 같은 상황에서는, try 문에서 return 10 을 행하게 되고, 에러가 없으므로 catch 문으로 넘어가지 않는다.
- finally 문이 있을 경우, 모든 로직이 끝나면 무조건 finally 를 거치게 된다. 즉 이 경우엔 선 입력된 try 문의 `return 10` 이 무시된다.
  즉, 위 경우 return 30 으로, 콘솔에선 30이 찍히게 된다.
