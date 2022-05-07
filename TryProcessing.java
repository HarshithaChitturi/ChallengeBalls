import processing.core.PApplet;
public class TryProcessing extends PApplet{


        public static final int WIDTH = 640;
        public static final int HEIGHT = 480;
        public static final int DIAME =10;
        int x1,x2,x3,x4;
        public static void main(String[] args) { PApplet.main("TryProcessing",args); }

        @Override
        public void settings() {
            super.settings();
            size(WIDTH,HEIGHT);
        }

        @Override
        public void draw() {
            //paintwhite();
            drawcircle();
        }

        private void drawcircle() {
            ellipse(x1,HEIGHT/5,DIAME,DIAME);
            ellipse(x2,2*HEIGHT/5,DIAME,DIAME);
            ellipse(x3,3*HEIGHT/5,DIAME,DIAME);
            ellipse(x4,4*HEIGHT/5,DIAME,DIAME);
            x1++;
            x2 = x2+2;
            x3 = x3+3;
            x4 = x4+4;

        }

        private void paintwhite() {
            background(255);
        }

        @Override
        public void setup() {
        }


}
