public class RecurseMore
{
    public static void main(String[] args){

    }
    
    public int getArea()
{
if (width == 1) 
{
 return 1;
}
Triangle smallerTriangle = new Triangle(width - 1); 
 
 int smallerArea = smallerTriangle.getArea();
 return smallerArea + width;
}
}