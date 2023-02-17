
class Unit {
    int x,y; // 현재 위치
    void move(int x, int y) {/* 해당 위치로 이동 */}
    void stop() {/* 현재 위치에 정지 */}
}

class Marine extends Unit {
    void stimPack() {/* 스팀팩을 사용한다. */}
}

class Tank extends Marine {
    void changeMode() {/* 공격모드를 변환한다. */}
}

class Dropship {
    void load() {/* 지정한 대상을 태운다. */}
    void unload() {/* 지정한 대상을 내린다. */}
}