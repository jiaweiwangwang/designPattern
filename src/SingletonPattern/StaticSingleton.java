package SingletonPattern;

/**
 * 静态构造函数的单示例类，写法简单、也可工作在多线程环境下
 * 缺点：内存开销大，应用启动代价高
 */
public class StaticSingleton {
    private StaticSingleton(){}

    private static StaticSingleton instance = new StaticSingleton();

    public static StaticSingleton newInstance(){
        return instance;
    }
}
