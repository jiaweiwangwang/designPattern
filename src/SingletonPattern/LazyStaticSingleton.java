package SingletonPattern;

/**
 * 懒加载的单实例类，是对静态单实例构造法的改进
 * 理论上来说是最佳的单实例实现方式
 */
public class LazyStaticSingleton {
    private LazyStaticSingleton(){}


    public static LazyStaticSingleton newInstance(){
        return Nested.instance;
    }

    static class Nested{
        public Nested(){}

        final static LazyStaticSingleton instance = new LazyStaticSingleton();
    }

    public static void main(String[] args){
        // 简单测试
        LazyStaticSingleton a = LazyStaticSingleton.newInstance();
        LazyStaticSingleton b = LazyStaticSingleton.newInstance();
        System.out.println(a == b);
    }
}

