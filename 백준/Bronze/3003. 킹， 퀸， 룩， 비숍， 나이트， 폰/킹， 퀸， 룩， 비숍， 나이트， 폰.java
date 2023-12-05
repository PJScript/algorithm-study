import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int king = 1;
        int queen = 1;
        int rook = 2;
        int bishop = 2;
        int knight = 2;
        int pawn = 8;


        int inputKing = scanner.nextInt();
        int inputQueen = scanner.nextInt();
        int inputRook = scanner.nextInt();
        int inputBishop = scanner.nextInt();
        int inputKnight = scanner.nextInt();
        int inputPawn = scanner.nextInt();


        System.out.print(king - inputKing + " ");
        System.out.print(queen - inputQueen + " ");
        System.out.print( rook - inputRook + " ");
        System.out.print(bishop - inputBishop + " ");
        System.out.print( knight - inputKnight + " ");
        System.out.print(pawn - inputPawn  + " ");
        
    }
}