PImage peppaPig;
PImage simmerSally;
PImage oliveYou;
  void setup() {
  size(600, 600);  

  fill(#DBC780);
  ellipse(300, 300, 500, 500);
  fill(#FA0800);
  ellipse(300, 300, 425, 425);
  fill(#F7F753);
  ellipse(300, 300, 400, 400);

  peppaPig =loadImage("pepperoni.png");
  simmerSally =loadImage("mushroom.png");
  oliveYou =loadImage("olive.png");
}
void draw() {
  
  }


void keyPressed(){
 if (key =='s') {
   int size = (int) random(25, 100);
    image(simmerSally, mouseX - 50, mouseY - 50, size, size);
 }
   if (key =='p') {
   int size = (int) random(25, 100);
    image(peppaPig, mouseX - 50, mouseY - 50, size, size);
   }
  
   if (key =='o'){ 
   int size = (int) random(25, 100);
    image(oliveYou, mouseX - 50, mouseY - 50, size, size);
}
}
