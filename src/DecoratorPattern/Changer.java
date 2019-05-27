package DecoratorPattern;

public class Changer implements Transform{
    protected Transform transform;

    protected void setTransform(Transform transform) {
        this.transform = transform;
    }
    @Override
    public void movie(){
        if(transform!=null){
            transform.movie();
        }
    }

}
