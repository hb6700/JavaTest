package com.test.java;

public class Ex06_Variable {
	
	public static void main(String[] args) {
		//Ex06_Variable.java
		//목표 : 자료형 + 변수 + 리터럴
		
		/*
		1. 주변의 데이터 검색 ex) 몸무게 -> 저장할 변수 생성 
		2. 형태 + 길이 -> 자료형 결정  ex)정수(int,long)/실수(float,double)/문자 등...
		3. 변수 생성 + 값 대입
		4. 출력
		
		*** 캐멀표기법 
		*/
		
		System.out.println("예시)");
		//1
		double myWeight;
		//2,3
		myWeight = 70.5d;
		//4
		System.out.println("제 몸무게는 " + myWeight +"kg 입니다");
		System.out.println(" ");
		//각 자료형(값 형 8가지 + String) X 10회 = 9*10
		//byte short int long float double char boolean String
		
		//byte
		System.out.println("//byte");
		byte historyScore;
		historyScore = 95;
		System.out.println("제 역사점수는 " + historyScore +"점 입니다.");
		byte myAge;
		myAge = 24;
		System.out.println("제 나이는 만 " + myAge +"살 입니다.");
		byte myBrotherAge;
		myBrotherAge = 18;
		System.out.println("제 남동생의 나이는 만 " + myBrotherAge +"살 입니다.");
		byte crayonShinChanBirthYear;
		crayonShinChanBirthYear = 94;
		System.out.println("짱구는 " + crayonShinChanBirthYear +"년생 입니다.");
		byte crayonShinChanAge;
		crayonShinChanAge = 5;
		System.out.println("짱구는 영원히 " + crayonShinChanAge +"살 입니다.");
		byte numberOfBtsMembers;
		numberOfBtsMembers = 7;
		System.out.println("BTS는 " + numberOfBtsMembers +"명 입니다.");
		byte numberOfTwiceMembers;
		numberOfTwiceMembers = 9;
		System.out.println("TWICE는 " + numberOfTwiceMembers +"명 입니다.");
		byte numberOfNewJeansMembers;
		numberOfNewJeansMembers = 5;
		System.out.println("NEWJEANS는 " + numberOfNewJeansMembers +"명 입니다.");
		byte numberOfIveMembers;
		numberOfIveMembers = 6;
		System.out.println("IVE는 " + numberOfIveMembers +"명 입니다.");
		byte numberOfTheBoysMembers;
		numberOfTheBoysMembers = 11;
		System.out.println("THEBOYS는 " + numberOfTheBoysMembers +"명 입니다.");
		System.out.println(" ");
		
		//short
		System.out.println("//short");
		short myHeight;
		myHeight = 175;
		System.out.println("제 키는 " + myHeight +"cm 입니다.");
		short myKoreanScore;
		myKoreanScore = 80;
		System.out.println("제 국어점수는 " + myKoreanScore +"점 입니다.");
		short myMathScore;
		myMathScore = 70;
		System.out.println("제 수학점수는 " + myMathScore +"점 입니다.");
		short myEnglishScore;
		myEnglishScore = 100;
		System.out.println("제 영어점수는 " + myEnglishScore +"점 입니다.");
		short myScienceScore;
		myScienceScore = 95;
		System.out.println("제 과학점수는 " + myScienceScore +"점 입니다.");
		short overWatchCharacter;
		overWatchCharacter = 22;
		System.out.println("오버워치 캐릭터는 총 " + overWatchCharacter +"개 입니다.");
		short leagueOfLegendCharacter;
		leagueOfLegendCharacter = 163;
		System.out.println("리그오브레전드 캐릭터는 총 " + leagueOfLegendCharacter +"개 입니다.");
		short thisYear;
		thisYear = 2023;
		System.out.println("올해는 " + thisYear +"년 입니다.");
		short thisMonth;
		thisMonth = 7;
		System.out.println("지금은 " + thisMonth + "월 입니다.");
		short thisDay;
		thisDay = 17;
		System.out.println("지금은 " + thisDay + "월 입니다.");
		System.out.println(" ");
		
		//int
		System.out.println("//int");
		int alphabetCount;
		alphabetCount = 26;
		System.out.println("알파벳은 " + alphabetCount + "개로 이루어져 있습니다.");
		int hangulConsonantCount;
		hangulConsonantCount = 19;
		System.out.println("한글 자음은 " + hangulConsonantCount + "개로 이루어져 있습니다.");
		int hangulVowelCount;
		hangulVowelCount = 21;
		System.out.println("한글 모음은 " + hangulVowelCount + "개로 이루어져 있습니다.");
		int hiraganaCount;
		hiraganaCount = 48;
		System.out.println("히라가나는 " + hiraganaCount + "개로 이루어져 있습니다.");
		int katakanaCount;
		katakanaCount = 48;
		System.out.println("가타카나는 " + katakanaCount + "개로 이루어져 있습니다.");
		int universityCount;
		universityCount = 336;
		System.out.println("전국 대학교는 총 " + universityCount + "개로 이루어져 있습니다.");
		int koreaPopulationCount;
		koreaPopulationCount = 51392745;
		System.out.println("2023년 6월 기준 대한민국 총 인구 수는 " + koreaPopulationCount + "명 입니다.");
		int seoulPopulationCount;
		seoulPopulationCount = 9414093;
		System.out.println("2023년 6월 기준 서울 총 인구 수는 " + seoulPopulationCount + "명 입니다.");
		int busanPopulationCount;
		busanPopulationCount = 3306993;
		System.out.println("2023년 6월 기준 부산 총 인구 수는 " + busanPopulationCount + "명 입니다.");
		int koreanSalaryAverage;
		koreanSalaryAverage = 3330000;
		System.out.println("한국 근로자들의 평균월급은 월 " + koreanSalaryAverage + "원 입니다.");
		System.out.println(" ");
		
		
		//long
		System.out.println("//long");
		long airpodsPrice;
		airpodsPrice = 250000;
		System.out.println("에어팟은 " + airpodsPrice +"원 입니다.");
		long cameraPrice;
		cameraPrice = 2800000;
		System.out.println("카메라는 " + cameraPrice +"원 입니다.");
		long macbookPrice;
		macbookPrice = 3000000;
		System.out.println("맥북은 " + macbookPrice +"원 입니다.");
		long appleWatchPrice;
		appleWatchPrice = 600000;
		System.out.println("애플워치는 " + appleWatchPrice +"원 입니다.");
		long bagPrice;
		bagPrice = 2000000;
		System.out.println("가방은 " + bagPrice +"원 입니다.");
		long apartmentPrice;
		apartmentPrice = 1500000000;
		System.out.println("아파트는 " + apartmentPrice + "원 입니다.");
		long carPrice;
		carPrice = 40000000;
		System.out.println("자동차는 " + carPrice + "원 입니다.");
		long ipadPrice;
		ipadPrice = 1800000;
		System.out.println("아이패드는 " + ipadPrice + "원 입니다.");
		long baseballStadiumMaximumPeople;
		baseballStadiumMaximumPeople = 25000;
		System.out.println("잠실야구장의 최대 수용인원은 " + baseballStadiumMaximumPeople + "명 입니다.");
		long soccerStadiumMaximumPerple;
		soccerStadiumMaximumPerple = 70000;
		System.out.println("서울올림픽주경기장의 최대 수용인원은 " + soccerStadiumMaximumPerple + "명 입니다.");
		System.out.println(" ");
		
		//float
		System.out.println("//float");
		float brotherHeight;
		brotherHeight = 172.1f;
		System.out.println("제 동생은 " + brotherHeight + "cm 입니다.");
		float pi;
		pi = 3.14f;
		System.out.println("파이는 " + pi + "입니다.");
		float exchangeRate;
		exchangeRate = 1265.8f;
		System.out.println("오늘의 환율은 " + exchangeRate + "원 입니다.");
		float fertilityRate;
		fertilityRate = 0.84f;
		System.out.println("2020년 기준 한국의 출산율은 " + fertilityRate + "명 입니다.");
		float teenagerRate;
		teenagerRate = 16.2f;
		System.out.println("한국의 청소년 비율은 " + teenagerRate + "%정도 차지합니다.");
		float istjRate;
		istjRate = 9.87f;
		System.out.println("한국에서 가장 많은 MBTI는 ISTJ이며 " + istjRate + "% 입니다.");
		float isfjRate;
		isfjRate = 9.38f;
		System.out.println("한국에서 두 번째로 많은 MBTI는 ISTJ이며 " + isfjRate + "% 입니다.");
		float christianPeopleRate;
		christianPeopleRate = 15.0f;
		System.out.println("한국의 기독교인은 " + christianPeopleRate + "% 입니다.");
		float buddhistRate;
		buddhistRate = 16.3f;
		System.out.println("한국의 불교인은 " + buddhistRate + "% 입니다.");
		float catholicRate;
		catholicRate = 5.1f;
		System.out.println("한국의 천주교인은 " + catholicRate + "% 입니다.");
		System.out.println(" ");
		
		//double
		System.out.println("//double");
		double brotherWeight;
		brotherWeight = 70.1d;
		System.out.println("제 동생의 몸무게는 " + brotherWeight +"입니다.");
		double firstCovidVaccinePeople;
		firstCovidVaccinePeople = 87.95d;
		System.out.println("한국의 코로나백신 1차 접종률은 " + firstCovidVaccinePeople + "% 입니다.");
		double secondCovidVaccinePeople;
		secondCovidVaccinePeople = 87.11d;
		System.out.println("한국의 코로나백신 2차 접종률은 " + secondCovidVaccinePeople + "% 입니다.");
		double thirdCovidVaccinePeople;
		thirdCovidVaccinePeople = 65.72d;
		System.out.println("한국의 코로나백신 3차 접종률은 " + thirdCovidVaccinePeople + "% 입니다.");
		double fourthCovidVaccinePeople;
		fourthCovidVaccinePeople = 14.81d;
		System.out.println("한국의 코로나백신 4차 접종률은 " + fourthCovidVaccinePeople + "% 입니다.");
		double underFifteenPeople;
		underFifteenPeople = 26.3d;
		System.out.println("세계인구의 15세 미만 비율은 " + underFifteenPeople + "% 입니다.");
		double overSixtyFivePeople;
		overSixtyFivePeople = 7.9d;
		System.out.println("세계인구의 65세 이상 비율은 " + overSixtyFivePeople + "% 입니다.");
		double chinesePeopleRate;
		chinesePeopleRate = 17.721d;
		System.out.println("중국의 인구는 전세계 사람들의 " + chinesePeopleRate + "%를 차지한다.");
		double indeaPeopleRate;
		indeaPeopleRate = 17.757d;
		System.out.println("인도의 인구는 전세계 사람들의 " + indeaPeopleRate + "%를 차지한다.");
		double unitedStatesOfAmericaPeopleRate;
		unitedStatesOfAmericaPeopleRate = 4.226d;
		System.out.println("미국의 인구는 전세계 사람들의 " + unitedStatesOfAmericaPeopleRate + "%를 차지한다.");
		System.out.println(" ");
		
		
		//char
		System.out.println("//char");
		char hangulConsonantStartWord;
		hangulConsonantStartWord = 'ㄱ';
		System.out.println("한글 자음은 " + hangulConsonantStartWord + "부터 시작합니다.");
		char hangulConsonantFinishWord;
		hangulConsonantFinishWord = 'ㅎ';
		System.out.println("한글 자음은 " + hangulConsonantFinishWord + "으로 끝납니다.");
		char hangulVowelStartWord;
		hangulVowelStartWord = 'ㅏ';
		System.out.println("한글 모음은 " + hangulVowelStartWord + "부터 시작합니다.");
		char hangulVowelFinishWord;
		hangulVowelFinishWord = 'ㅣ';
		System.out.println("한글 모음은 " + hangulVowelFinishWord + "으로 끝납니다.");
		char englishStartWord;
		englishStartWord = 'A';
		System.out.println("영어는 " + englishStartWord + "부터 시작합니다.");
		char englishFinishWord;
		englishFinishWord = 'Z';
		System.out.println("영어는 " + englishFinishWord + "로 끝납니다.");
		char hiraganaStartWord;
		hiraganaStartWord = 'あ';
		System.out.println("히라가나는 " + hiraganaStartWord + "부터 시작합니다.");
		char hiraganaFinishWord;
		hiraganaFinishWord = 'ゐ';
		System.out.println("히라가나는 " + hiraganaFinishWord + "로 끝납니다.");
		char danceInKoreanWord;
		danceInKoreanWord = '춤';
		System.out.println("Dance는 한글로 " + danceInKoreanWord + "입니다.");
		char bearInKoreanWord;
		bearInKoreanWord = '곰';
		System.out.println("Bear는 한글로 " + bearInKoreanWord + "입니다.");
		System.out.println(" ");
		
		//boolean
		System.out.println("//boolean");
		boolean whaleBabyAnimal;
		whaleBabyAnimal = true;
		System.out.println("고래는 새끼를 낳나요? : " + whaleBabyAnimal);
		boolean dogLeg;
		dogLeg = false;
		System.out.println("개의 다리는 8개일까요? : " + dogLeg);
		boolean monkeyFingerPrint;
		monkeyFingerPrint= true;
		System.out.println("원숭이는 지문이 있을까요? : " + monkeyFingerPrint);
		boolean unitedKingdomCapital;
		unitedKingdomCapital = true;
		System.out.println("영국의 수도는 런던인가요? : " + unitedKingdomCapital);
		boolean whaleIsFish;
		whaleIsFish = false;
		System.out.println("고래는 생선일까요? : " + whaleIsFish);
		boolean antarcticaVisa;
		antarcticaVisa = false;
		System.out.println("남극을 갈때는 비자가 필요할까요? : " + antarcticaVisa);
		boolean badukSize;
		badukSize = true;
		System.out.println("바둑알의 흰색과 검은색의 크기는 다를까요? : " + badukSize);
		boolean intIsNumber;
		intIsNumber= true;
		System.out.println("int는 정수 자료형일까요? : " + intIsNumber);
		boolean floatIsPrimeNumber;
		floatIsPrimeNumber = false;
		System.out.println("float는 실수형 리터럴 자료형인가요? : " + floatIsPrimeNumber);
		boolean originalPizzaFirst;
		originalPizzaFirst = true;
		System.out.println("피자는 이탈리아가 원조일까요? : " + originalPizzaFirst);
		System.out.println(" ");
		
		//String	
		System.out.println("//String");
		String myFavoriteFood;
		myFavoriteFood = "치킨";
		System.out.println("제가 제일 좋아하는 음식은 " + myFavoriteFood + "입니다.");
		String myMostHatedFood;
		myMostHatedFood = "당근";
		System.out.println("제가 제일 싫어하는 음식은 " + myMostHatedFood + "입니다.");
		String myFavoriteGame;
		myFavoriteGame = "League of Legend";
		System.out.println("제가 제일 좋아하는 게임은  " + myFavoriteGame + "입니다.");		
		String myFavoriteAnimation;
		myFavoriteAnimation = "짱구는 못말려";
		System.out.println("제가 제일 좋아하는 애니메이션은 " + myFavoriteAnimation + "입니다.");
		String myFavoriteSubject;
		myFavoriteSubject = "한국사";
		System.out.println("제가 제일 좋아하는 과목은 " + myFavoriteSubject + "입니다.");
		String whereIWantToGo;
		whereIWantToGo = "오키나와";
		System.out.println("제가 제일 가보고 싶은 여행지는 " + whereIWantToGo + "입니다.");		
		String chooseMountainOrSea;
		chooseMountainOrSea = "바다";
		System.out.println("저는 산과 바다중에서 " + chooseMountainOrSea + "를 더 좋아합니다.");
		String myFavoriteIceCreamFlavor;
		myFavoriteIceCreamFlavor = "엄마는외계인";
		System.out.println("저는 배스킨라빈스에서 " + myFavoriteIceCreamFlavor + "맛을 제일 좋아합니다.");
		String myFavoriteEntertainment;
		myFavoriteEntertainment = "지구오락실";
		System.out.println("제 최애 예능은 " + myFavoriteEntertainment + "입니다.");
		String myFavoriteMovie;
		myFavoriteMovie = "부산행";
		System.out.println("제 최애 영화는 " + myFavoriteMovie + "입니다.");
		
	}

}
