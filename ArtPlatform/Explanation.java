package ArtPlatform;

public class Explanation {
    //🎨 미술 전시 플랫폼: 객체지향 미니 프로젝트
//🧩 배경
//당신은 디지털 미술 전시 플랫폼을 설계하는 주니어 백엔드 개발자입니다.
//이 플랫폼은 회화(Painting), 조각(Sculpture), 설치미술(Installation) 등 다양한 작품을 전시할 수 있어야 합니다.
//
//        📌 목표
//다양한 예술 작품을 표현할 수 있는 유연한 클래스 구조를 설계한다.
//
//전시 공간에 작품들을 등록하고 일괄 전시하는 기능을 만든다.
//
//        (심화) 작가명, 제작연도, 예술 스타일 등으로 작품 검색 기능도 구현한다.
//
//📦 요구사항
//1. 추상 클래스 Artwork
//display() 메서드를 추상 메서드로 선언한다.
//
//심화 버전에서는 다음 속성들도 포함한다:
//
//String artistName
//
//int year
//
//String style
//
//2. 하위 클래스
//Painting, Sculpture, Installation 클래스를 만들어 Artwork를 상속한다.
//
//각 클래스는 display() 메서드를 자신의 방식대로 오버라이딩한다.
//
//        3. ExhibitionRoom 클래스
//다양한 Artwork 인스턴스를 보관할 수 있어야 한다.
//
//모든 작품을 순회하며 display()를 실행하는 displayAll() 기능을 제공한다.
//
//        (심화) 다음과 같은 검색 기능을 제공한다:
//
//작가명으로 검색: searchByArtist(String artist)
//
//연도 또는 스타일로 검색: searchByYear(int year), searchByStyle(String style)
//
//        💡 설계 힌트
//책임 분리 원칙 (SRP):
//작품 정보 자체는 Artwork에서, 검색/전시는 ExhibitionRoom에서 담당한다.
//
//객체 배열 활용:
//ExhibitionRoom은 List<Artwork>를 사용해 다양한 작품을 관리한다.
//
//✅ 예시 시나리오
//Painting 클래스 인스턴스를 생성한다:
//        "Starry Night", 작가: Van Gogh, 연도: 1889, 스타일: Post-Impressionism
//
//Sculpture 클래스 인스턴스를 생성한다:
//        "David", 작가: Michelangelo, 연도: 1504, 스타일: Renaissance
//
//ExhibitionRoom에 등록 후 displayAll() 호출 → 두 작품이 출력된다.
//
//searchByArtist("Van Gogh") → 해당 작품만 필터링해 보여준다.
//
//        🧠 학습 포인트 요약
//추상 클래스와 상속 구조 설계
//
//다형성을 활용한 display() 호출
//
//객체 배열(List)과 컬렉션 순회
//
//책임 분리와 역할 위임 개념 훈련




}
