import java.awt.Color;
public class Grass extends Cell{

    int xPos;
    int yPos;
    Color cellColour; 
    int elevation;  

    public Grass(int x, int y, int inElevation) {
        super(x, y);
        xPos = x;
        yPos = y;
        cellColour = Color.green;
        elevation = setElevation(inElevation);
        //TODO Auto-generated constructor stub
    }
    public Color getColour(){
        return elevationPaint(elevation, cellColour);
    }

    public int getElevation(){
        return this.elevation;
    }
    public int setElevation(int inElevation){
        elevation = inElevation;
        return elevation;
    }
    
}
