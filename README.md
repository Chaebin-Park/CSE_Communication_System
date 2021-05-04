# CSE_Communication_System

### 프로젝트 비전

- 코로나 사태로 인해 등교하지 못하는 신입생의 고충을 덜기 위해서
- 학과 생활에 어려움을 겪는 재학생들에게 도움을 주기 위해서



### 프로젝트 개요

- 학과 생활 정보와 과제, 궁금증 등을 공유할 수 있는 프로그램
- 멘토-멘티의 상호 보완을 목표로 하는 정보 교환 서비스
- 신입생 및 재학생을 대상으로 한다.



### 패턴 설계

#### 이터레이터 패턴

- "게시판 관리" 기능에 적용하였다. DB에 저장되는 데이터들을 리스트로 관리하여 DB 테이블을 탐색하는 시간을 줄이고자 하였다.

  ![그림입니다.  원본 그림의 이름: CSE_게시판.PNG  원본 그림의 크기: 가로 1449pixel, 세로 841pixel](file:///C:\Users\ADMINI~1\AppData\Local\Temp\Hnc\BinData\EMB000018f4ae56.PNG)  



#### 옵저버 패턴

- "댓글 알림" 기능에 적용하였다. 게시글에 댓글이 추가로 작성되었을 경우, 해당 게시글의 작성자에게 댓글이 추가됨을 알리기 위해 사용하였다.

  ![그림입니다.  원본 그림의 이름: CSE_알림.PNG  원본 그림의 크기: 가로 1533pixel, 세로 646pixel](file:///C:\Users\ADMINI~1\AppData\Local\Temp\Hnc\BinData\EMB000018f4ae5a.PNG)  



#### 프록시 패턴

- 본 서비스는 소켓을 기반으로 하여 통신 과정에서의 데이터 변형, 유실이 우려되어 프록시 패턴을 적용하였다.

  ![그림입니다.  원본 그림의 이름: CLP00006d180001.bmp  원본 그림의 크기: 가로 1121pixel, 세로 796pixel](file:///C:\Users\ADMINI~1\AppData\Local\Temp\Hnc\BinData\EMB000018f4ae5e.bmp)  



#### 상태 패턴

- 채팅 기능에서 관리자의 공지사항과 일반 사용자의 채팅 기록을 구분하기 위하여 사용하였다.

  ![그림입니다.  원본 그림의 이름: CLP00006d184c02.bmp  원본 그림의 크기: 가로 992pixel, 세로 510pixel](file:///C:\Users\ADMINI~1\AppData\Local\Temp\Hnc\BinData\EMB000018f4ae62.bmp)  

#### 빌더 패턴

- "사용자 관리" 기능에서 회원가입 시 입력받는 사용자 속성이 많고, 필수 정보와 부가 정보를 구분할 필요성이 있어 깔끔한 코드 작성을 위해 사용하였다.

  ![그림입니다.  원본 그림의 이름: CSE_사용자관리.PNG  원본 그림의 크기: 가로 1187pixel, 세로 577pixel](file:///C:\Users\ADMINI~1\AppData\Local\Temp\Hnc\BinData\EMB000018f4ae66.PNG)  



#### 싱글턴 패턴

- 소켓 통신을 하는 데 있어서, 소켓의 정보를 계속 전달해 주어야 하기에 단일 객체를 생성하여 사용하였다.

  ![그림입니다.  원본 그림의 이름: CLP00006d180002.bmp  원본 그림의 크기: 가로 261pixel, 세로 218pixel](file:///C:\Users\ADMINI~1\AppData\Local\Temp\Hnc\BinData\EMB000018f4ae6a.bmp)  



### 시연 영상

https://youtu.be/K_BJJXCxxZs