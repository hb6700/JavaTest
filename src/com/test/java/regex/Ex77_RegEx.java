//Ex77_RegEx.java
/*
정규표현식(Regular Expression)
- 특정한 패턴(규칙)을 가지는 문자열의 집합을 표현하는 식
- 특정한 패턴(규칙)을 가지는 문자열을 검색하는 용도
- 자바(X)
- 대다수 환경/프로그래밍 언어 등에서 지원

- EX) 안녕하세요. 제 연락처는 010-1234-5678입니다. 이 번호로 연락이 안되면 010-9876-5432로 연락주세요 > 전화번호 추출
- EX) 주민등록번호 > 951010-2010101
- EX) 이메일 주소 > test@test.com

### 정규표현식 구성요소

1. x
    - x의 임의의 1개 문자
        > EX) “a” > a        
        > EX) “abc” > abc

2. 출현횟수
    - 바로 앞의 문자(집합)의 출현 횟수를 지정
    1. 생략
        - 바로 앞의 대상의 출현 횟수가 1
        - 생략 X,  중복X
        > EX) “abc” > abc
    2. ?
        - 바로 앞의 대상의 출현 횟수가 0~1
        - 생략 O , 중복 X
        > EX) “a?bc” > abc, bc, ac(x), aabc, bbbc
        > EX) "a?b?c" > abc, ac, bc, c
        > EX) "홍?길동" > 안녕~ 홍길동~ 잘가~ 길동아~
        > EX) "(자바)?코드" > 자바코드가 있습니다. 그런데 코드에 에러가 있어요. 자코드
    3. +
        - 바로 앞의 대상의 출현 횟수가 1~무한대
        - 생략 X , 중복 O
        > “a+bc” > bc(x), abc, aabc, aaabc, aaaaaaaaaaaaaaaaaaaaaaaaaaaaaabc
        > EX) "홍+길동" > 안녕~ 홍홍홍홍홍홍홍길동~ 잘가~ 길동아~
        > EX) "(자바)+코드" > 자바코드가 있습니다. 자바자바자바칩자바찹 프라푸치노 코드 자코드
    4. *
        - 바로 앞의 대상의 출현 횟수가 0~무한대
        - 생략 O , 중복 O
        > EX) “a+bc” > bc, abc, aaabc, aaaaaaaaaaaaaaaaaabc 
        
3. 선택(choice)
    - 열거값 중 하나가 나오는 패턴
    1. [열거값]
        > EX) “[12]” > 제 나이는 12살 입니다. 우리 형은 21살입니다. > [1 or 2]
        > EX) “[0123456789]” > 모든 숫자자리(한자리)
        > EX) “[13579]” > 홀수만(한자리)
        > “[0123456789][0123456789][0123456789][0123456789]”
        > EX) ”[0123456789]+”
        > EX) 주민등록번호
        ”[0123456789][0123456789][0123456789][0123456789][0123456789][0123456789]-[0123456789][0123456789][0123456789][0123456789][0123456789][0123456789][0123456789] > 951010-2098765
        > EX) 전화번호 > 010-XXXX-XXXX
        ”010-[0123456789]?[0123456789][0123456789][0123456789]**-**[0123456789][0123456789][0123456789][0123456789][0123456789][0123456789][0123456789]
        > EX) 영어 소문자 > “[abcdefghijklmnopqrwtuvwxyz]+”
        > EX) 영어 대문자 > “[ABCDEFGHIJKLMNOPQRSTUVWXYZ]+”
        > EX) 숫자 > “[0123456789]” > “[0-9]”
        > EX) 영문자 > “[A-Za-z]”
        > EX) 영문자 +숫자 > “[A-Za-z0-9]”
        > EX) 영문자 + 숫자 + 한글 >  “[A-Za-z0-9가-힣]”
        > EX) 식별자로 적합한 문자 > “[A-Za-z0-9_]”
        > EX) 전화번호 > “010-[0-9]?[0-9][0-9][0-9]-[0-9][0-9][0-9][0-9]”
        > EX) ‘홍’씨 사람 이름?  > “홍[가-힣][가-힣]?”
        홍길동 홍순신 홍뭐뭐 홍민
    2. [^열거값]
        > “[^0~9]+” > 숫자를 제외한 나머지 모든 문자
        
4. 출연횟수
    - 바로 앞의 문자(집합)의 출연횟수를 지정
    - ?, +, * : 더 세밀한 패턴 지정이 가능
    1. {n}
        - n : 출연횟수
        > EX) “a{1}bc” > abc
        > EX) “a{2}bc” > aabc
        > EX) “a{3}bc” > aaabc
    2. {n,m}
        - n : 최소 출연횟수
        - m: 최대 출연횟수
        > EX) “a{1,2}bc” > abc, aabc
        > EX) “a{3,5}bc” > aaabc, aaaabc, aaaaabc
        > EX) “a{0,1}bc” > bc, abc > “a?bc”
    3. {n, }
        - n : 최소 출연횟수
        - 무한대로 출력 횟수 지정 > 무한대 : 최대출연횟수
        > EX) “a{2,}bc” > aabc, aaabc, aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaabc
        Ex) 주민등록번호
        “[0-9][0-9][0-9][0-9][0-9][0-9]-[0-9][0-9][0-9][0-9][0-9][0-9][0-9]”
        “[0-9]{6}-[0-9]{7}”
        EX) 전화번호
        “010-[0-9]{3,4}-[0-9]{4}”
        EX) 한글 2~4자
        “[가~힣]{2,4}”
        EX) 영문자 5자 이상
        “[A-Za-z]{5,}”
        EX) 영문자 5자 이상 + 첫문자 대문자(파스칼)
        “[A-Z][A-Za-z]{4}”
        EX) 수업 : 클래스명
        “[A-Z][A-Za-z0-9_]{1,}”
        
5. 처음과 끝
    1. ^
        - 대상이 뒤의 표현으로 시작
        - str.startsWith(”홍”)
        > “^홍길동”
    2. $
        - 대상이 앞의 표현으로 끝
        - str.endsWith(”홍”)
        > “홍길동$”
        
6. 줄임표현
    1. \d or \D
        - Digital > 숫자
        - “[0-9]” == “\d”
        - “[^0-9]” == “\D”
        > “010-\d{3,4}-\d{4}”
    2. \w or \W
        - word > 영어 대소문자 + 숫자 + _
        - “[A-Za-z0-9+_]” == “\w”
    3. \s or \S
        - 공백문자(스페이스,. 탭, 엔터)
        > EX) “홍길동” “\s{2}홍길동\s{2}” “\s{1,}홍길동”
        이름 홍길동 님
        홍길동입니다
        이름홍길동님
*/

package com.test.java.regex;

public class Ex77_RegEx {

}
