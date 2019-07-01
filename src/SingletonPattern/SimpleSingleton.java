package SingletonPattern;

/**
 * 简单的单实例实现
 * 缺点只能运行在单线程环境
 */
public class SimpleSingleton {
    private SimpleSingleton(){}

    private static SimpleSingleton instance = null;
    public static SimpleSingleton newInstance(){
        if(instance == null){
            instance = new SimpleSingleton();
        }
        return instance;
    }
}
