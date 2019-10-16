import java.util.Random;

void setup() {
  size(600, 600);
  background(7, 7, 7);
}

void draw() {
  
  Random rand = new Random();
  int xPos = rand.nextInt(600);
  int yPos = rand.nextInt(600);
  
  for(int i = 0; i < 300; i++) {
    fill(255, 0, 0);
    ellipse(getWormX(xPos), getWormY(yPos), 10, 10);
  }
}

float frequency = .001;
    float noiseInterval = PI;

    void makeMagical() {
        fill( 0, 0, 0, 10 );
        rect(0, 0, width, height);
        noStroke();
    }

    float getWormX(int i) {
        return map(noise(i*noiseInterval + frameCount * frequency), 0, 1, 0, width);
    }

    float getWormY(int i) {
        return map(noise(i*noiseInterval+1 + frameCount * frequency), 0, 1, 0, height);
    }
