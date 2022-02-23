package account;

public class automob {
	private String colour =null;
	private String make  =null;
	private int speed =0;
    private int gears =0;
    
    public String getcolour () {
    	return colour;
    }    
    public void setcolour (String colour) {
    	this .colour =colour ;
    }
    public String  getmeke() {
    	return make;
    }
    public void setmake (String make ) {
    	this.make=make ;
    }
    public int getspeed () {
    	return speed;
    }
    public void setspeed(int speed) {
    	this.speed=speed;
    }
    public int  getgears() {
    	return gears ;
    }
    public void setgear(int gears) {
    	this.gears =gears;
    }
    public void changGear(int j) {
    
    	switch(gears) {
    	case 0:
			System.out.println("nutral gear" +j);
			    break;

    	case 1:
			System.out.println("speed must be in between 0-40 Gear "+j);
			    break;
    		case 2:
    			System.out.println("speed must be in between 40-60 Gear "+j);
    			break;
    		case 3:
    			System.out.println("speed must be in between 60-70 Gear "+j);
    			break;
    		case 4:
    			System.out.println("speed must be in between 70-80 Gear"+j);
    			break;
    		case 5:
    			System.out.println("full speed top gear"+j);
    			break;
    		default:
    			System.out.println("gear not allowed ");
    		    break;
    	}
    	
    }
    
       public void brack() {
		System.out.println("stop");
	}

}
