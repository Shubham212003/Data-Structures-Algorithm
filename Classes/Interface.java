package Classes;

public class Interface {
    public static void main(String[] args) {
        Queen q = new Queen();
        q.moves();
    }
}

interface ChessPlayer {
    void moves();// function blueprint
}

class Queen implements ChessPlayer {
    public void moves() {// defined
        System.out.println("Up , Down , left , right , diagonal , (in all 4 dirns)");
    }
}

class Rook implements ChessPlayer {
    public void moves() {
        System.out.println("up , down , left , right");
    }
}

class King implements ChessPlayer {
    public void moves() {
        System.out.println("up , down , left , right , diagonal-(by 1 steps)");
    }
}