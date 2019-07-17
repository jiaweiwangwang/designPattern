package FlyweightPattern;

public class WhitePieces implements  ChessPieces{
    @Override
    public void downPieced(Location location) {
        System.out.println("白色棋子的横坐标是："+location.getPosition_x()+
                "纵坐标是："+location.getPosition_y());
    }
}
