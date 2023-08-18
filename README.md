# 🎇목차

1. [💻 프로젝트 소개](#-프로젝트-소개)
2. [📦 개발 환경](#-개발-환경)
3. [✍ 주요 기능 소개](#-주요-기능-소개)
   - [sub menu event](#✔-sub-menu-event)
   - [무한 루프 인기 순위](#✔-무한-루프-인기-순위)
   - [무한 루프 이미지 슬라이드](#✔-무한-루프-이미지-슬라이드)
   - [상품 선택 기능](#✔-상품-선택-기능)
   - [Json data 가져와서 정렬](#✔-json-data-가져와서-정렬)
   - [scroll Top btn](#✔-scroll-top-btn)
4. [✅ 프로젝트 리뷰](#-프로젝트-리뷰)

<br />
<br>

## 💻 프로젝트 소개

<div align="center">

  <img src="https://github.com/future9061/coffeebean-mobile/assets/132829711/41f37a3a-b2f8-4f2b-820a-2ab956492054" width="50%">

![image](https://github.com/future9061/coffeebean-mobile/assets/132829711/ed3b9c00-bbcf-4b03-95ca-e2198a05d721)

사이트 URL : https://musical-daifuku-70205f.netlify.app/

   <p align="start">
    프로젝트 .<br>
    만드는 당시에는 모바일 처럼 보이게만 ui를 구성해놓았는데 이번에 pwa로 변환을 해봤습니다. <br>
    pwa를 선택한 이유는 별도로 앱 스토어 이용 없이 설치할 수 있다는 점. <br> 오프라인 상태에서도 사용 가능하다는 점이 장점으로 다가와서 pwa를 이용하게 되었습니다.
      
   </p>
</div>
<br>
<br>

## 📦 개발 환경

- **editor** : <img src="https://img.shields.io/badge/Spring-6DB33F?style=flat-square&logo=Spring&logoColor=white">
- **language** : <img src="https://img.shields.io/badge/JAVA-007396?style=flat-square&logo=java&logoColor=white"> <img src="https://img.shields.io/badge/HTML5-E34F26?style=flat-square&logo=HTML5&logoColor=white"/> <img src="https://img.shields.io/badge/CSS3-1572B6?style=flat-square&logo=CSS3&logoColor=white"/> <img src="https://img.shields.io/badge/javascript-F7DF1E?style=flat-square&logo=javascript&logoColor=white"/>
- **database** : <img src="https://img.shields.io/badge/oracle-F80000?style=flat-square&logo=oracle&logoColor=white">
- **기타** : <img src="https://img.shields.io/badge/bootstrap-7952B3?style=flat-square&logo=bootstrap&logoColor=white"> <img src="https://img.shields.io/badge/github-181717?style=flat-square&logo=github&logoColor=white"> <img src="https://img.shields.io/badge/aws-232F3E?style=flat-square&logo=aws&logoColor=white"> <img src="https://img.shields.io/badge/apache tomcat-F8DC75?style=flat-square&logo=apachetomcat&logoColor=white">

<br>
<br />

## ✍ 주요 기능 소개

### ✔ sub menu event

#### [코드 보기](#sub-menu)

메인 메뉴에 마우스를 올리면 하단의 sub menu가 바뀌는 이벤트입니다.  
 전에는 메인메뉴와 서브 메뉴의 id를 비교하는 방식을 주로 썼었으나, <br />
이번에는 id 없이 forEach에서 this와 submenu를 비교해 클라스를 추가했습니다. <br />

   <img src="https://github.com/future9061/ohou_future/assets/132829711/69b4842f-26cd-4929-9744-e3d012ffdc0a" width="50%">

<br />
<br />


## ✅ 프로젝트 리뷰

이번 프로젝트를 만들면서 이상한 문제가 생겼었다. <br >
local에선 잘 보이는 background-image가 배포만 하면 안 보이는 것이다. <br >

<img src="https://github.com/future9061/apple_mac_shopping/assets/132829711/93f8304d-f9ce-47a4-baa4-20deecf11453" width="300">
<img src="https://github.com/future9061/apple_mac_shopping/assets/132829711/944dbbe9-829d-4963-afe9-9d08c7093858" width="300">

live server에서는 잘 보였으니 경로 문제라고는 생각 못해서 background 축약형을 잘 못 쓰거나 div 크기 지정을 잘못했나 싶었는데 경로를 잘못 지정한게 맞았다.

<br>
