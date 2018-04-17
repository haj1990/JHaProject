/**
 * This class contains class (static) methods
 * that will help you test the Picture class 
 * methods.  Uncomment the methods and the code
 * in the main to test.
 * 
 * @author Barbara Ericson 
 */
public class PictureTester
{
  /** Method to test zeroBlue */
  public static void testZeroBlue()
  {
    Picture beach = new Picture("C:\\Users\\haj1990\\Desktop\\images\\beach.jpg");
    beach.explore();
    beach.zeroBlue();
    beach.explore();
  }
  
  public static void testKeepOnlyBlue()
  {
    Picture beach = new Picture("C:\\Users\\haj1990\\Desktop\\images\\beach.jpg");
    beach.explore();
    beach.KeepOnlyBlue();
    beach.explore();
  }
  
  public static void testKeepOnlyGreen()
  {
    Picture beach = new Picture("C:\\Users\\haj1990\\Desktop\\images\\beach.jpg");
    beach.explore();
    beach.KeepOnlyGreen();
    beach.explore();
  }
  
  public static void testKeepOnlyRed()
  {
    Picture beach = new Picture("C:\\Users\\haj1990\\Desktop\\images\\beach.jpg");
    beach.explore();
    beach.KeepOnlyRed();
    beach.explore();
  }
  
  public static void testNegate()
  {
    Picture beach = new Picture("C:\\Users\\haj1990\\Desktop\\images\\beach.jpg");
    beach.explore();
    beach.Negate();
    beach.explore();
  }
  
  public static void testGrayscale()
  {
    Picture beach = new Picture("C:\\Users\\haj1990\\Desktop\\images\\beach.jpg");
    beach.explore();
    beach.Grayscale();
    beach.explore();
  }
  
  public static void testFixUnderwater()
  {
    Picture beach = new Picture("C:\\Users\\haj1990\\Desktop\\images\\water.jpg");
    beach.explore();
    beach.fixUnderWater();
    beach.explore();
  }
  
  /** Method to test mirrorVertical */
  public static void testMirrorVertical()
  {
    Picture caterpillar = new Picture("C:\\Users\\haj1990\\Desktop\\images\\caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorVertical();
    caterpillar.explore();
  }
  
  /** Method to test mirrorTemple */
  public static void testMirrorTemple()
  {
    Picture temple = new Picture("C:\\Users\\haj1990\\Desktop\\images\\temple.jpg");
    temple.explore();
    temple.mirrorTemple();
    temple.explore();
  }
  
  public static void testMirrorArms()
  {
    Picture temple = new Picture("C:\\Users\\haj1990\\Desktop\\images\\snowman.jpg");
    temple.explore();
    temple.mirrorArms();
    temple.explore();
  }
  
  public static void testMirrorGull()
  {
    Picture temple = new Picture("C:\\Users\\haj1990\\Desktop\\images\\seagull.jpg");
    temple.explore();
    temple.mirrorGull();
    temple.explore();
  }
  
  public static void testMirrorDiagonal()
  {
    Picture temple = new Picture("C:\\Users\\haj1990\\Desktop\\images\\beach.jpg");
    temple.explore();
    temple.mirrorDiagonal();
    temple.explore();
  }
  
  public static void testCopy()
  {
    Picture temple = new Picture("C:\\Users\\haj1990\\Desktop\\images\\temple.jpg");
    Picture seagull = new Picture("C:\\Users\\haj1990\\Desktop\\images\\seagull.jpg");
    temple.explore();
    temple.copy(seagull, 100, 100);
    temple.explore();
  }
  
  
  /** Method to test the collage method */
  public static void testCollage()
  {
    Picture canvas = new Picture("C:\\Users\\haj1990\\Desktop\\images\\640x480.jpg");
    canvas.createCollage();
    canvas.explore();
  }
  
  /** Method to test edgeDetection */
  public static void testEdgeDetection()
  {
    Picture swan = new Picture("C:\\Users\\haj1990\\Desktop\\images\\swan.jpg");
    swan.edgeDetection(10);
    swan.explore();
  }
  
  /** Main method for testing.  Every class can have a main
    * method in Java */
  public static void main(String[] args)
  {
    // uncomment a call here to run a test
    // and comment out the ones you don't want
    // to run
    //testZeroBlue(); 
    //testKeepOnlyBlue(); 
    //testKeepOnlyRed(); 
   //testKeepOnlyGreen(); 
    testNegate(); 
    //testGrayscale();
    //testFixUnderwater(); 
    //testMirrorVertical(); 
    //testMirrorTemple(); 
    //testMirrorArms(); 
    //testMirrorGull(); 
    testMirrorDiagonal();
    testCollage(); 
    //testCopy();
    //testEdgeDetection();
    //testEdgeDetection2();
    //testChromakey();
    //testEncodeAndDecode();
    //testGetCountRedOverValue(250);
    //testSetRedToHalfValueInTopHalf();
    //testClearBlueOverValue(200);
    //testGetAverageForColumn(0);
  }
}