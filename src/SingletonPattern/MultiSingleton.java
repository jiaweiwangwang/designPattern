package SingletonPattern;

/**
 * 多线程环境下可工作的单实例类
 * 缺点：因为使用了锁，效率不高
 */
public class MultiSingleton {
    private MultiSingleton(){}

    private static MultiSingleton instance = null;
    private final static Integer LOCK = 0;

    public static MultiSingleton newInstance(){
        synchronized (LOCK){
            if(instance == null){
                instance = new MultiSingleton();
            }
        }
        return instance;
    }
}
