package FlyweightPattern;

import org.junit.Test;

public class Client {
    @Test
    public void run(){
        //黑方先下棋
        Location location = new Location(2,2);
        //获得棋子
        ChessPieces blackPiecesOne = PiecesFactory.getPiecesByType("blackPieces");
        blackPiecesOne.downPieced(location);
        //白方下棋
        location.setPosition_x(1);
        location.setPosition_y(4);
        //白方获得棋子
        ChessPieces whitePiecesOne = PiecesFactory.getPiecesByType("whitePieces");
        whitePiecesOne.downPieced(location);
        location.setPosition_x(2);
        location.setPosition_y(4);
        //获得棋子
        ChessPieces blackPiecesTwo = PiecesFactory.getPiecesByType("blackPieces");
        blackPiecesTwo.downPieced(location);
        location.setPosition_x(4);
        location.setPosition_y(3);
        //获得棋子
        ChessPieces whitePiecesTwo = PiecesFactory.getPiecesByType("whitePieces");
        whitePiecesTwo.downPieced(location);
        System.out.println("棋子的实例总共有："+PiecesFactory.getCount()+"个");
    }
}
