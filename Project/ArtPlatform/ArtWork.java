package Project.ArtPlatform;
// ArtWork - 추상클래스로 구현
public abstract class ArtWork {
    protected String title;
    protected String artistName;
    protected int year;
    protected String style;
    // protected는 public 과 default 접근 제한의 중간쯤에 해당한다.
    // 같은 패키지에서는 default와 같이 접근 제한이 없지만,
    // 다른 패키지에서는 자식 클래스에서만 접근을 허용한다.


    //AllArgsConstructor
    // 생성자 받아오기
    public ArtWork(String title, String artistName, int year, String style) {
        this.title = title;
        this.artistName = artistName;
        this.year = year;
        this.style = style;
    }

    // display라는 이름의 추상 메서드 정의
    // 구현은 자식클래스에서, 호출은 어디에서나 다 가능함
    public abstract void display();


    // Getter 사용
    public String getArtistName() {
        return artistName;
    }

    public int getYear() {
        return year;
    }

    public String getStyle() {
        return style;
    }


/*
*  ArtWork 추상클래스
*  모든 작품의 공통 속성과 행동을 정의하는 틀
*  상속받는 클래스들이 반드시 가져야 할 기본 속성과 메서드
*
*  이 안에는 속성으로 title, artistName, year, style을 쓰고
*  추상 메서드로서 display를 썻다
*
*  getter 사용함
*  ExhibitionRoom이나
* 다른 자식 클래스 (Installation, Painting, Sculpture)에서 같은 기능 구현하기
*
*
* */
}
