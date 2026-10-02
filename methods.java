class Computer{
    public void playMusic() {
        System.out.println("Playing music...");
    }

    public  String getMeAPen(int cost){
        if(cost>10){
            return "Here is your pen";
        }else{
            return "Sorry, you need to pay more";
        }
    }
}

public class methods {
    public static  void main(String[] args) {
        Computer myComputer = new Computer();
        myComputer.playMusic();
        String penMessage = myComputer.getMeAPen(3);
        System.out.println(penMessage);
    }
}
