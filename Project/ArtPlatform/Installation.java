package Project.ArtPlatform;

public class Installation extends ArtWork{
    // Installation 은 ArtWork로부터 상속을 받음
    // ArtWork가 가진 공통 속성을 물려받음

    // 생성자 호출 -> 부모 생성자 그대로 물려받음
    public Installation(String title, String artistName, int year, String style) {
        // 생성자에서 super 호출함
        // ArtWork 클래스에서 생성자가 ArtWork(String title, String artistName, int year, String style) 로 정의되어 있음
        super(title, artistName, year, style);
        // 따라서 Installation 생성자도 이 값을 받아서 부모 생성자에게 넘겨준다
        // 부모클래스(ArtWork)의 생성자를 호출하기
        // 부모가 가진 필드를 초기화함

//        부모 클래스가 기본 생성자(파라미터 없는 생성자)를 제공하지 않고
//        파라미터가 있는 생성자만 있으면
//        자식 클래스는 부모 생성자를 명시적으로 호출해서 초기화를 해줘야 한다.

    }

    // 부모 클래스 ArtWork에서의 추상메서드를 자식클래스에서 반드시 구현을 해주어야 한다


    @Override
    public void display() {
        System.out.println("[설치미술]" + title + " \" by" + artistName +  "( " + year + ", " + style + ")" );
    }
}
