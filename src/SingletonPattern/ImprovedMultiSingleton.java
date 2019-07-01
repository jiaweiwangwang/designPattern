package SingletonPattern;

/**
 * 双锁结构，将用锁的开销限制在初始化阶段
 */
public class ImprovedMultiSingleton {
    private ImprovedMultiSingleton(){}

    private static ImprovedMultiSingleton instance = null;
    private final static Integer LOCK = 0;

    public static ImprovedMultiSingleton newInstance(){
        if(instance==null){
            synchronized (LOCK){
                if(instance == null){
                    instance = new ImprovedMultiSingleton();
                }
            }
        }
        return instance;
    }
}
