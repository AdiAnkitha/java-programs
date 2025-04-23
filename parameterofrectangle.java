public class perimeterofrectangle {
 static void perameter(int length,int breadth){
    int perameter = 2 * (length + breadth);
    System.out.println("the perameter of a rectangle is " + " length "+length + " and breadth " + breadth +  " = " + perameter );
 } 
 public static void main (String args[]){
    int length = 10;
    int breadth = 20;
    perameter(length,breadth);
 }  
}
