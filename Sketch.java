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
    rect(0, 300, 300, 300);
    rect(300, 300, 300, 300);
    rect(600, 300, 300, 300);
    rect(900, 300, 300, 300);

    // draw top row boxes
    rect(0, 0, 300, 300);
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
        intX = 3 + intRow * 300 / 30;  //Instead of zero, calculate the proper intX location using 'intRow'
        intY = 3 + 300 + intColumn * 300 / 30; //Instead of zero, calculate the proper intY location using 'intColumn'

        fill(255, 255, 255);
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

          fill(255, 255, 255);
          noStroke();
          rect(sectionTwoX, sectionTwoY, 5, 5);
        } else {

          fill(0, 0, 0);
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

    int sectionThreeX = 0;
    int sectionThreeY = 0;

    for(int sectionThreeRow = 0; sectionThreeRow < 30; sectionThreeRow++){
      for(int sectionThreeColumn = 0; sectionThreeColumn < 30; sectionThreeColumn++){

        sectionThreeX = 3 + 600 + sectionThreeRow * 300 / 30;
        sectionThreeY = 3 + 300 + sectionThreeColumn * 300 / 30;

        if(sectionThreeColumn % 2 == 0){

          fill(0, 0, 0);
          noStroke();
          rect(sectionThreeX, sectionThreeY, 5, 5);
        } else {

          fill(255, 255, 255);
          noStroke();
          rect(sectionThreeX, sectionThreeY, 5, 5);
        }
      }
    }
  }

  /**
   * Use the modulus operator and just one 'if' statement to select the color.
   */
  public void draw_section4(){
    int sectionFourX = 0;
    int sectionFourY = 0;

    for(int sectionFourRow = 0; sectionFourRow < 30; sectionFourRow++){
      for(int sectionFourColumn = 0; sectionFourColumn < 30; sectionFourColumn++){

        sectionFourX = 3 + 900 + sectionFourRow * 300 / 30;
        sectionFourY = 3 + 300 + sectionFourColumn * 300 / 30;

        if(sectionFourColumn % 2 <= 0 && sectionFourRow % 2 == 0){

          fill(255, 255, 255);
          noStroke();
          rect(sectionFourX, sectionFourY, 5, 5);
        } else {

          fill(0, 0, 0);
          noStroke();
          rect(sectionFourX, sectionFourY, 5, 5);
        }
      }
    }
  }

  /*
   * Do NOT use 'if' statements to complete 5-8. Manipulate the loops instead
   */
  public void draw_section5(){

    int sectionFiveX = 0;
    int sectionFiveY = 0;
    int sectionfiveRows = 0;
    int sectionfiveColumns = 0;

    for(int sectionFiveColumn = 30; sectionFiveColumn > sectionfiveColumns; sectionFiveColumn--){
      for(int sectionFiveRow = 30; sectionFiveRow > sectionfiveRows; sectionFiveRow--){

        sectionFiveX = 3 - 10 + sectionFiveRow * 300 / 30 ;
        sectionFiveY = 3 + sectionFiveColumn * 300 / 30;

        fill(255, 255, 255);
        noStroke();
        rect(sectionFiveX, sectionFiveY, 5, 5);
      }
      sectionfiveRows += 1;
    }
  }

  public void draw_section6(){

    int sectionSixX = 0;
    int sectionSixY = 0;
    int sectionsixRows = 30;
    int sectionsixColumns = 0;

    for(int sectionSixColumn = 30; sectionSixColumn > sectionsixColumns; sectionSixColumn--){
      for(int sectionSixRow = 0; sectionSixRow < sectionsixRows; sectionSixRow++){

        sectionSixX = 3 + 300 + sectionSixRow * 300 / 30;
        sectionSixY = 3 - 10 + sectionSixColumn * 300 / 30;

        fill(255, 255, 255);
        noStroke();
        rect(sectionSixX, sectionSixY, 5, 5);
      }
      sectionsixRows -= 1;
    }
  }

  public void draw_section7(){

    int sectionSevenX = 0;
    int sectionSevenY = 0;
    int sectionsevenRows = 30;
    int sectionsevenColumns = 30;

    for(int sectionSevenColumn = 0; sectionSevenColumn < sectionsevenColumns; sectionSevenColumn++){
      for(int sectionSevenRow = 0; sectionSevenRow < sectionsevenRows; sectionSevenRow++){

        sectionSevenX = 3 + 600 + sectionSevenRow * 300 / 30;
        sectionSevenY = 3 + sectionSevenColumn * 300 / 30;

        fill(255, 255, 255);
        noStroke();
        rect(sectionSevenX, sectionSevenY, 5, 5);
      }
      sectionsevenRows -= 1;
    }
  }
  
  public void draw_section8(){

    
    int sectionEightX = 0;
    int sectionEightY = 0;
    int sectioneightRows = 0;
    int sectioneightColumns = 30;

    for(int sectionEightColumn = 0; sectionEightColumn < sectioneightColumns; sectionEightColumn++){
      for(int sectionEightRow = 30; sectionEightRow > sectioneightRows; sectionEightRow--){

        sectionEightX = 3 - 10 + 900 + sectionEightRow * 300 / 30;
        sectionEightY = 3 + sectionEightColumn * 300 / 30;

        fill(255, 255, 255);
        noStroke();
        rect(sectionEightX, sectionEightY, 5, 5);
      }
      sectioneightRows += 1;
    }
  }






  }