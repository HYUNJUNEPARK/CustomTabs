**Chrome Custom Tabs**

<br></br>
-기존 웹 페이지를 보여주는 방식 : 1) 외부 브라우저(ex.크롬앱) 2) internal WebView </br>
1)외부 브라우저(ex.크롬앱) : Context switch 성격이 강하고 커스텀이 어려움 </br>
2)internal WebView  : Context switch 성격이 약하고 커스텀이 쉽지만 state share 불가, standard 를 맞춰 support 하기 어려운 단점이 있음 </br>
**-> 외부 브라우저 만큼 호환성을 갖고 있고 internal WebView 처럼 쓸 수 있는 support library** </br>
**-> 외부 브라우저, internal WebView 보다 2배 빠른 성능** </br>

-자신이 제공하는 컨텐츠를 보여줄 때는 WebView 를 쓰는 것도 좋은 방법이지만 자신이 관리하는 내용이 아닌 외부 link 로 연결하는 경우에는 Chrome Custom Tab 을 추천 </br>

```kotlin
//build.gradle
implementation 'androidx.browser:browser:1.4.0'

//실행
CustomTabsIntent.Builder().build().also { customTabsIntent ->
    customTabsIntent.launchUrl(Context, Uri)
}
```

---
참고링크</br>
https://aroundck.tistory.com/6031</br>