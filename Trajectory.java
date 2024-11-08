public class Trajectory {
    double viX;
    double viY;

    public Trajectory(double launchVelocity, double angle){
        viX = launchVelocity * Math.cos(Math.toRadians(angle));
        viY = launchVelocity * Math.sin(Math.toRadians(angle));

    }
    
    public double maxHeight(){
        return (Math.pow(viY, 2))/(2*9.81);
    }

    public double airTime(){
        return 2*viY/9.81;
    }

    public double range(){
        return airTime()*viX;
    }

    public void printInfo(){
        System.out.println("Projectile Info:");
        System.out.println("Range: " + range() + " M");
        System.out.println("Max height: " + maxHeight() + " M");
        System.out.println("Air Time: " + airTime() + " S");

    }
}
