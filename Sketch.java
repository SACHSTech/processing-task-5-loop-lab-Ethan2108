import processing.core.PApplet;

public class Sketch extends PApplet {
	
	

  public void settings() {
	// put your size call here
    size(1200, 600);
  }


  public void setup() {
    background(45, 150, 207);
  }

  
  public void draw() {
	  

    draw_section_outlines();
    draw_section1();
    draw_section2();
    draw_section3();
    draw_section4();
	  
    draw_section5();
    draw_section6();
    draw_section7();
    draw_section8();

    
  }


  public void draw_section_outlines(){
    stroke(0);
    noFill();

    // draw bottom row boxes
    rect(0,300, 300, 300);
    rect(300, 300, 300, 300);
    rect(600, 300, 300, 300);
    rect(900, 300, 300, 300);

    // draw top row boxes
    rect(0,0, 300, 300);
    rect(300, 0, 300, 300);
    rect(600, 0, 300, 300);
    rect(900, 0, 300, 300);
  }
  
  /**
   * draws the bottom left section
   */
  public void draw_section1(){
    int intX = 0;
    int intY = 0;

    for(int intRow = 0; intRow < 30; intRow++){
      for(int intColumn = 0; intColumn < 30; intColumn++){
        intX = 3 + 0;  //Instead of zero, calculate the proper intX location using 'intRow'
        intY = 300 + 3 + 0; //Instead of zero, calculate the proper intY location using 'intColumn'

        fill(255);
        noStroke();
        rect(intX, intY, 5, 5);

      }
    }
  }

  /**
   * Use the modulus operator and an if statement to select the color
   * Don't loop from 30 to 60 to shift everything over, just add 300 to x.
   */
  public void draw_section2(){

    int sectionTwoX = 0;
    int sectionTwoY = 0;

    for(int sectionTwoRow = 0; sectionTwoRow < 30; sectionTwoRow++){
      for(int sectionTwoColumn = 0; sectionTwoColumn < 30; sectionTwoColumn++){

        sectionTwoX = 3 + 300 + sectionTwoRow * 300 / 30;
        sectionTwoY = 3 + 300 + sectionTwoColumn * 300 / 30;

        if(sectionTwoRow % 2 == 0){

          fill(255);
          noStroke();
          rect(sectionTwoX, sectionTwoY, 5, 5);
        } else {

          fill(0);
          noStroke();
          rect(sectionTwoX, sectionTwoY, 5, 5);
        }
      }
    }

  }

  /**
   * Use the modulus operator and an if/else statement to select the color.
   * Don't use multiple 'if' statements.
   */
  public void draw_section3(){

  }

  /**
   * Use the modulus operator and just one 'if' statement to select the color.
   */
  public void draw_section4(){

  }

  /**
   * Do NOT use 'if' statements to complete 5-8. Manipulate the loops instead
   */
  public void draw_section5(){

  }

  public void draw_section6(){

  }

  public void draw_section7(){

  }
  
  public void draw_section8(){

  }






}
