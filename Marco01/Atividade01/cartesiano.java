public class cartesiano {
    private double x1,x2,y1,y2;
    
    public cartesiano(double x1, double y1, double x2, double y2){
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    } 

    private double getX1 (){
        return x1;
    }

    private double getY1 (){
        return y1;
    }

    private double getX2 (){
        return x2;
    }

    private double getY2 (){
        return y2;
    }

    private void setX1 (double x1){
        this.x1 = x1;
    }

    private void setY1 (double y1){
        this.y1 = y1;
    }

    private void setX2 (double x2){
        this.x2 = x2;
    }

    private void setY2 (double y2){
        this.y2 = y2;
    }

    public double pontocartesiano (){
        return Math.sqrt(Math.pow((getX2() - getX1()),2) + Math.pow((getY2() - getY1()),2));
    }

}
