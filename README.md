<img src = "https://raw.githubusercontent.com/xss-stage/.github/e5a1bfbfb1882be45ba42c58b27218830015004a/Frame%206.svg" width = "450" height = "auto"/>   

#

xss-stage는 다양한 xss 라이브러리를 통합하고 쉽게 적용하기 위해 탄생한 라이브러리 입니다.   
xss-core는 자유롭게 XssFilter를 등록하고 확장하여 사용할 수 있으며, 요청단에서 xss 필터링을 진행하기 때문에, 응답과정에서 필터링을 진행하는 방식보다 특정 상황(응답이 요청보다 많은 상황)에서 더 효율적일 수 있습니다.   
   
[***Press Star***](https://github.com/xss-stage/xss-core/stargazers)   
   
[![Hits](https://hits.seeyoufarm.com/api/count/incr/badge.svg?url=https%3A%2F%2Fgithub.com%2Fxss-stage&count_bg=%23FF4848&title_bg=%232D2D2D&icon=&icon_color=%23E7E7E7&title=hits&edge_flat=false)](https://hits.seeyoufarm.com) [![made with love](https://camo.githubusercontent.com/c6c5b56fc051557203c6dffa4242b41b09ff22f6303da15e47162a5c1691e8a5/68747470733a2f2f696d672e736869656c64732e696f2f62616467652f4d616465253230776974682d4c6f76652d2d2545322539442541342d726564)](https://camo.githubusercontent.com/c6c5b56fc051557203c6dffa4242b41b09ff22f6303da15e47162a5c1691e8a5/68747470733a2f2f696d672e736869656c64732e696f2f62616467652f4d616465253230776974682d4c6f76652d2d2545322539442541342d726564)  
![needed jdk version](https://img.shields.io/badge/JDK-8-blue)   
![api-version](https://img.shields.io/badge/xss--extension--json-1.1-F29494)   
   
이 라이브러리는 xss-core에 string을 처리할 수 있는 XssFilter구현체를 등록시키며, String 객체에 대해서 Xss filtering을 진행할 수 있습니다.
이 라이브러리를 주입받으면, 다음과 같이 `@Xss`의 value로 `string`을 지정할 수 있습니다.   

``` Java
    @Xss("string")
```

자세한 사용법은 [여기](https://github.com/xss-stage)를 참조하세요.
   
## Extensions
core : [xss-core-1.1](https://github.com/xss-stage/xss-core)    
string-extension : [xss-extension-string-1.1](https://github.com/xss-stage/xss-extension-string)   
json-extension : [xss-extension-json-1.1](https://github.com/xss-stage/xss-extension-json)
