package ArtPlatform;

public class Main {
    public static void main(String[] args) {

        // 객체 생성
        ExhibitionRoom exhibitionRoom = new ExhibitionRoom();

        // 작품을 등록
        ArtWork painting = new Painting("별이 빛나는 밤", "고흐", 1889, "후기 인상주의");
        ArtWork sculpture = new Sculpture("다비드", "미켈란젤로", 1504, "르네상스");
        ArtWork installation = new Installation("물 속의 방", "윤예지", 2021, "현대 설치미술");

        exhibitionRoom.addArtWork(painting);
        exhibitionRoom.addArtWork(sculpture);
        exhibitionRoom.addArtWork(installation);

        System.out.println("전시 중인 작품들");
        exhibitionRoom.displayAll();




    }
}
