package FlyweightPattern;


import java.util.HashMap;
import java.util.Map;

public class PiecesFactory {
    public static Map<String,ChessPieces> pieces = new HashMap<String,ChessPieces>();
    static{
        ChessPieces whitePieces = new WhitePieces();
        pieces.put("whitePieces",whitePieces);
        ChessPieces blackPieces = new BlackPieces();
        pieces.put("blackPieces",blackPieces);
    }
    public static ChessPieces getPiecesByType(String type){
        if("whitePieces".equalsIgnoreCase(type)){
            return pieces.get("whitePieces");
        }else if("blackPieces".equalsIgnoreCase(type)){
            return pieces.get("blackPieces");
        }else{
            return null;
        }
    }
    public static int getCount(){
        return pieces.size();
    }
}
