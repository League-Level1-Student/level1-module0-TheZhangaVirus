void setup() {

  size(600, 600);
  background(49, 49, 49);
  
}

  int xPos = 0;

void draw() {


    if(xPos < 600) {
  xPos++;
  }
  background(49, 49, 49);
  fill(150,150,255);
  noStroke();
  ellipse(xPos, 300, 15, 15);



}
