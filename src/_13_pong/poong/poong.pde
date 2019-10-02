int width = 600;
int height = 600;

void setup() {
 size(600, 600);
 background(160, 160, 220);
}

int x = 0;

void draw() {

  if(x == width) {
    for(int i = 0; i < 300; i++) {
      x-=2;
    }
  } else if(x == 0) {
    for(int i = 0; i < 300; i++) {
      x+=2;
    }
  } 
  background(160, 160, 220);
  fill(26, 26, 26);
  stroke(26, 26, 26);
  ellipse(x, 100, 10, 10);
  
}
