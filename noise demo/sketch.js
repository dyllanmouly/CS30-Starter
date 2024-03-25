// Project Title
// Your Name
// Date
//
// Extra for Experts:
// - describe what you did to take this project "above and beyond"
let x, y;
let timeX = 0;
let timeY = 0;
let timeW = 0;

function setup() {
  createCanvas(windowWidth, windowHeight);
  //width and height are defined by canvas
  //puts x,y in the corner
  x = width/2;
  y = height/2;
}

function draw() {
  background(220);

  x = noise(timeX) * width;
  y = noise(timeY) * height;
  // w = w+ noise(timeW)

  fill(noise(timeX)*255, noise(timeY)*255, noise(timeW)*255);
  circle(x,y,50);

  timeX += 0.01;
  timeY += 0.02; 
  timeW = timeW+0.0005;
}

