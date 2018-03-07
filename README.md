# Timing-Utilities
Timing utilities library for Processing. Version 0.1b.

This library has a Stopwatch class right now for keeping time using the PApplet class' millis() method.  
~~Big update coming in a month :)~~

Sorry that the update never came, I'm not sure when I'll be free to work on this again, but when I'm free you can be sure to expect an update with a lot of new features, some of them are already done too.

## Installation 

### Through Contributions Manager  

Open up the Contributions Manager in the Processing IDE and install the Timing-Utilities library.
  
### Manual Install

Download the timing_utils.zip file [from here](https://github.com/Lord-of-the-Galaxy/Timing-Utilities/blob/master/timing_utils.zip).  
  
Unzip and put the extracted timing_utils folder into the libraries folder of your Processing sketches. Reference and examples are included in the timing_utils folder. 

## Example  
  
Minimaistic example. Complete one is enclosed in the timing_utils folder.

```java
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
}
```
## Dependencies

[Processing](https://processing.org/) is required to use this library.  
Update will come soon to use built in Java methods to remove all dependency on Processing for some classes.
