document.querySelector("#click").addEventListener("click", () => {
  const a = document.querySelector("#first").value;
  const b = document.querySelector("#second").value;
  if (a) {
    if (b) {
      const c = a * b;
      document.querySelector("#result").textContent = c;
    } else {
      document.querySelector("#result").textContent =
        "두 번째 값 입력해주세요.";
    }
  } else {
    document.querySelector("#result").textContent = "첫 번째 값 입력해주세요.";
  }
});

// 변수와 함수의 위치에 대해서 꼭 생각하자.
