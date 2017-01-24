import lord_of_galaxy.timing_utils.*;

Stopwatch s;//Declare

void setup(){
  size(640, 360);
  
  //Creating a stopwatch to keep time
  s = new Stopwatch(this);
  
  //Start the stopwatch
  s.start();
}

void draw(){
  background(0);
  fill(255);
  
  textSize(50);
  
  //Use s.time() to get current time in milliseconds
  text(str(s.time()), 50, 100);
  
  //Use these if you want
  text(s.hour() + ":" + nf(s.minute(), 2) + ":" + nf(s.second(), 2) + ":" + nf(s.millis(), 3), 50, 200);
  
  textSize(20);
  text("Press 'P' to pause/resume, 'R' to restart and SPACEBAR to reset", 10, 300);
}

void keyPressed(){
  switch(key){
    case 'p':
    if(!s.isPaused())s.pause();//Check if the stopwatch is paused. Pause the stopwatch
    else s.start();//Resuming the stopwatch is also done by start
    break;
    case 'r':
    s.restart();//Restart the stopwatch
    break;
    case ' ':
    s.reset();//Reset the stopwatch to zero, but don't start it yet
    break;
    default:
    println("Press 'P' to pause/resume, 'R' to restart and SPACEBAR to reset");
  }
}