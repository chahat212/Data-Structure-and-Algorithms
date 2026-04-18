package oop;

interface Chess {
    void moves();
}

class Queen implements Chess {
    // method must be public
    public void moves() {
        System.out.println("Queen can move anywhere diagonally, vertically, or horizontally");
    }
}

class Rook implements Chess {
    public void moves() {
        System.out.println("Rook can move only straight");
    }
}

public class Interfcs {
    public static void main(String[] args) {
        Queen q = new Queen();
        q.moves();  // call the method

        Rook r = new Rook();
        r.moves();  // call the method
    }
}
