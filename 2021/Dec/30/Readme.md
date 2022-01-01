# SSL 갱신
- 담당하고 있던 프로젝트의 SSL 갱신 건과 오늘 일어난 에피소드 정리


## 흐름
1. 처음으로 SSL 갱신을 맡게 되고 관련 파일을 전달받음
2. 개발문서, SSL 인증 업체 등 별도의 정보는 주어지지 않음
3. 아파치 톰켓으로 업데이트 되는 서버이니만큼, 설정 방법에 대해 구글링하고 방문
4. 톰켓 -> conf -> server.xml 확인
   1. SSL 관련 설정 문구가 따로 존재하지 않음
   2. 해당 프로젝트는 톰켓이 아닌 아파치(httpd) 를 통해 SSL 설정하는 것임을 확인
5. /etc/httpd/conf 에서 httpd.conf 파일을 확인하였음
```httpd.config

SSLProtocol all -SSLv2 -SSLv3
SSLCipherSuite HIGH:MEDIUM:!SSLv2:!PSK:!SRP:!ADH:!AECDH

#SSLCertificateFile /usr/local/apache/conf/ssl1/cert.pem (인증서파일)
SSLCertificateFile /usr/local/apache/conf/ssl1/new_cert.pem (새 인증서파일)

#SSLCertificateKeyFile /usr/local/apache/conf/ssl1/key.pem (키 파일)
SSLCertificateKeyFile /usr/local/apache/conf/ssl1/new_key.pem (새 키 파일)

#SSLCACertificateFile /usr/local/apache/conf/ssl1/Name-Chain.pem (체인인증서파일)
SSLCACertificateFile /usr/local/apache/conf/ssl1/new_Name-Chain.pem (새 체인인증서파일)

```

6. Conf 파일 변경 후 아파치 재실행
```
service httpd restart
```

7. 로컬에선 잘 적용 된 것을 확인 했으나, 운영사이트에서는 적용이 되지 않았음
8. 아파치 종료 후 사이트 진입시 443 포트가 꺼져있음에도, L7 스위치(운영서버의 방화벽 역할을 하고 있었음)로 연동되어 443 포트로 진입이 가능했음을 확인
9. L7 스위치의 캐시가 이전 SSL 을 담고 있는 것을 체크
10. 위 부분 변경해줌 (직접할 수 있는 작업이 아니기에 요청드림)
11. 해결!