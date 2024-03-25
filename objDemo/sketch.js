// Project Title
// Your Name
// Date
//
// Extra for Experts:
// - describe what you did to take this project "above and beyond"



//create array to store ball objects
let ballsArray = [];
let x, y, w;

function setup() {
  createCanvas(windowWidth, windowHeight);
  createBall();
}

function draw() {
  background(30);

  fill(noise(x)*255, noise(y)*255, noise(w)*255);
  fill(255,0,0);
  for (let i = 0; i < ballsArray.length; i++) {
  circle(ballsArray[i].x, ballsArray[i].y, ballsArray[i].diameter)
  ballsArray[i].x += ballsArray[i].dx; //x rate of change
  ballsArray[i].y += ballsArray[i].dy; // y roc 
  }

}

function createBall() {
  //create a temp ball object
   let newBall = {
      x: random(width),
      y: random(height),
      diameter: random(25, 100),
      dx: random(-5, 5),
      dy: random(-5, 5),
  };

  //Copying ball obj into the array
  ballsArray.push(newBall);

}

function mousePressed() {
  createBall();
  ballsArray[ballsArray.length-1].x = mouseX;
  ballsArray[ballsArray.length-1].y = mouseY;
}


