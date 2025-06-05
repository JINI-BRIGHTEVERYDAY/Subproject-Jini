package Project.ArtPlatform;

import java.util.ArrayList;
import java.util.List;

public class ExhibitionRoom {

/*
     배열 또는 리스트가 필요함
     작품 개수가 가변적이기 때문에 배열 (ArtWork[])을 사용하지 않았다.
     만약 배열을 사용하였다면, 초기 크기를 미리 정해야 하는데, 그리고 추가할 때마다 크기 조절을 위해서 새 배열을 만들고 복사해야 하므로 불편할 수 있다.
     예를 들어, 작품 10개를 전시하고 싶다면 배열 크기를 10으로 만들고 시작하지만,
     더 많은 작품을 추가하면 다시 배열을 새로 만들어야 하는데, 이건 비효율적이 된다.

     컬렉션은 자동 크기 조절이 가능하고,
     ArrayList 같은 컬렉션은 내부적으로 배열을 쓰지만, 필요에 따라서 크기를 자동으로 늘려주기 때문에 추가, 삭제가 쉽고 유연해진다.

     컬렉션은 다양한 유틸 메서드를 제공한다
     add(), remove(), contains(), size() 같은 편리한 메서드를 쉽게 쓸 수 있어서 코드가 더 간결하고 명확해진다

    컬렉션을 쓰면 확장성 측면에서도 나중에 검색이나 정렬, 필터링 등 기능을 추가하기가 편리해지고
    직접 배열을 관리하면 이런 작업마다 코드가 복잡해지고 오류가 생기기가 쉽다.
*/

    private List<ArtWork> artWorks = new ArrayList<>();
    //이 리스트 안에는 ArtWork를 상속한 모든 자식클래스 객체들이 다 들어올 수 있다.

    //작품을 추가할 메서드를 만들어냄
    public void addArtWork(ArtWork art) {
        artWorks.add(art);
    }

    /*

    [ArtWork] ← (추상 클래스)
   ↑
 ┌────────────┬────────────┬────────────┐
 │Painting    │Sculpture   │Installation│ ← (각각 구현체)
 └────────────┴────────────┴────────────┘

        ↓ (ArtWork를 모아두는 곳)

      [ExhibitionRoom] ← List<ArtWork> 관리
                 ↑
          ArtWork 인스턴스들 add()

    * */


    public void displayAll() {
        for(ArtWork art : artWorks) {
            art.display();
        }

        // 검색 기능 예시
//        public void searchByArtist(String name) {
//            for (ArtWork art : artWorks) {
//                if (art.getArtistName().equalsIgnoreCase(name)) {
//                    art.display();
//                }
//            }
//        }

    }
}
