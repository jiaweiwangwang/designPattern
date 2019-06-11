package TemplatePattern;

import org.junit.Test;

public class TemplateDemo {
    @Test
    public void run(){
        Game lol = new LoL();
        lol.playGame();
        Game honorOfKings = new HonorOfKings();
        honorOfKings.playGame();
    }

}
