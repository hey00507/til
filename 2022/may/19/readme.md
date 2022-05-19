# 자바 플랫폼? 
- 자바 언어로 작성된 프로그램이 실행되는 특정한 환경

## 자바는 총 4가지 플랫폼을 제공한다.
1. Java SE (Standard Edition)
2. Java EE (Enterprise Edition)
3. Java ME (Micro Edition)
4. Java FX


### JAVA SE
```text
Java 프로그래밍 언어의 핵심 기능을 제공한다.
Java 프로그래밍 언어의 기본 유형부터 네트워킹, 보안, 데이터베이스 액세스, GUI 개발 및 XML 구문 분석에 사용되는 고급 클래스까지 모든 것을 정의한다.
핵심 API 외에도 Java SE 플랫폼은 가상 머신, 개발 도구, 배포 기술, Java 기술 응용프로그램에서 일반적으로 사용되는 기타 클래스 라이브러리 및 도구 키트로 구성된다.

우리가 일반적으로 설치하는 JDK가 Java SE JDK 이다.
주요 패키지로는 java.lang.*, java.io.*, java.util.*, java.awt.*, javax.rmi.*, javax.net.* 등이 있다.
```

### Java EE
```text
Java EE(Enterprise Edition) 플랫폼은 Java SE 위에 구축된다.
대규모, 다계층, 확장 가능하고 안정적이고 안전한 네트워크 애플리케이션을 개발하고 실행하기 위한 API 및 런타임 환경을 제공한다. 원어 그대로 기업용 에디션이라고 생각하면 된다.

Java EE는 Java SE를 사용하며, 서버 개발을 위한 다양한 다양한 기술을 제공한다.

- JDBC
- JNDI
- EJB
- RMI
- JSP
- Servlet
- XML
- JMS
- Java IDL
- JTS
- JTA
- JavaMail
- JAF
현재 Java EE의 명칭은 Jakarta EE로 변경되었다.

Jakarta EE 스펙에 따라 제품으로 구현한 것을 웹 애플리케이션 서버 또는 WAS라고 한다.
```
### JAVA SE
```text
Java ME(Micro Edition) 플랫폼은 휴대전화, 셋톱박스 등에서 Java 프로그래밍 언어를 지원하기 위해 만들어진 플랫폼이다.
한마디로 임베디드용이다.
```
### JAVA SE
```text
Java FX는 데스크톱 애플리케이션과 리치 인터넷 애플리케이션(RIA)을 개발하고 배포하는 소프트웨어 플랫폼이다.
이 플랫폼은 Java SE를 위한 표준 라이브러리로, 스윙을 대체하기 위해 고안되었다.
Java FX는 마이크로소프트 윈도우, 리눅스, MacOS의 데스크톱 컴퓨터와 웹 브라우저를 지원한다.

```