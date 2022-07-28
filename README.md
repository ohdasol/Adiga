# 우리 어디가

### :loudspeaker: 서비스 소개
- 전국의 도서관, 농어촌 체험 마을, 휴양림을 검색할 수 있도록 한 서비스  


### :hammer: 기술 스택  
<img src="https://img.shields.io/badge/React-61DAFB?style=flat-square&logo=React&logoColor=white"/>

<img src="https://img.shields.io/badge/Spring Boot-6DB33F?style=flat-square&logo=Spring Boot&logoColor=white"/>

<img src="https://img.shields.io/badge/Amazon AWS-232F3E?style=flat-square&logo=Amazon AWS&logoColor=white"/>  

<img src="https://img.shields.io/badge/공공데이터포털-0b70b9?style=flat-square&logoColor=white"/>    


### :bomb: 핵심 기능

✔ 지역(시도, 시군구)과 장소(도서관, 농어촌 체험마을, 휴양림)를 선택하면 정보를 한눈에 확인 가능
   
✔ 공공데이터를 API를 사용했기 때문에 업데이트 반영이 빠르다 
 
✔ 조회수 높은 장소 3개를 배너로 띄워줌

### :computer: 실행 화면
![main](https://user-images.githubusercontent.com/97426772/181582388-011d33b8-5295-4b5f-b543-0b2f3026bb39.JPG)

### :speech_balloon: 이슈
- 이미 존재하는 정보의 경우에도 조회수만 증가시키는 것이 아니라 새로운 정보로 추가가 되는 문제 발생  
  1. bannerRepository.save를 if-else문에 각각 추가  
  2. banner 자체가 null인 경우로 수정  
  
- AWS EC2에서의 Ubuntu환경에서 Springboot로 만든 jar파일이 미리 설치된 MySQL과 연동하는 도중에 오류 발생
  1. 로그인하려는 plugin 변경
  2. root 권한 부여하고 업데이트  

