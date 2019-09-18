import java.util.Random;

void setup() {
  size(600,600);
  background(37, 37, 37);
}

int y = 10;


void draw() {

  Random rand = new Random();
  
  if(y <= 610) {
    y+=4; 
  }
  int x = 300;
  background(37, 37, 37);
  noStroke();
  fill(#00F2F0);
  ellipse(x, y, 10, 10);
  
  if(y >= 610) {
    y = 10;
    x = rand.nextInt(600);
  }
  
  fill(120, 120, 120);
  rect(mouseX-30, 500, 60, 100);
  
  fill(255, 255, 255);
  textSize(16);
  text("Score: " + score, 20, 20);
  
}

int score = 0;

void checkCatch(int x) {
  if(mouseX+30 >= x && x >= mouseX-30) {
   score++; 
  } else if(score > 0) {
   score--; 
  }
  println("Score: " + score);
}
