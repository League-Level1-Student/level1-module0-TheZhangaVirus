//import ddf.minim.*;
//Minim minim;
//AudioSample sound;


int width = 600;
int height = 600;
PImage backgroundImage;

void setup() {
 size(600, 600);
 background(160, 160, 220);
 //minim = new Minim (this);
 //sound = minim.loadSample("pong.wav",128);
 backgroundImage = loadImage("pong.png");
}

int xPos = 52;
int yPos = 30;
int xMove = 2;
int yMove = -2;
int paddleY = 530;

void draw() {
  
  image(backgroundImage, 0, 0);
  image(backgroundImage, 0, 0, width, height);
  //background(160, 160, 220);
  fill(220, 220, 220);
  stroke(220, 220, 220);
  ellipse(xPos, yPos, 10, 10);
  xPos = xPos + xMove;
  yPos = yPos + yMove;
  
  fill(0, 220, 0);
  noStroke();
  rect(mouseX, paddleY, 170, 40);
  

  if(xPos > width) {
    xPos = width;
    xMove = -xMove;
  }

  if(yPos > height) {
    yPos = height;
    yMove = -yMove;
  }  
  
  if(xPos < 0) {
    xPos = 0;
    xMove = -xMove;
  }
  
  if(yPos < 0) {
    yPos = 0;
    yMove = -yMove;
  }
  
//  if(yPos = 0) {
//    sound.trigger(); 
//  }
  
}




//  int v = 1;
//
//  
//  if(x == 0) {
//    v=2;
//      if(x != -100) {
//        x=+v;
//      }
//  } else if(x == 600) {
//    v=-2;
//      if(x != -100) {
//        x=+v;
//      }
//  }
