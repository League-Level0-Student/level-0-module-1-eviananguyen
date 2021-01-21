PImage face;
void setup() {
face =loadImage("face.png");
size(500,500);
face.resize(width, height);
image(face, 0,0);
}
void draw(){
  fill(mouseX,mouseX + mouseY, mouseY);
  ellipse( 160,220,60,125);
  ellipse( 285,220,70,125);
  
  
  fill(0);
ellipse(160,220,30,40);
ellipse(285,220,30,40);
  
}
