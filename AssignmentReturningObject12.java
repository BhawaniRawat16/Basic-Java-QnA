class Time1{
    int hour;
    int minut;

    Time1(){
        hour = 0;
        minut = 0;
    }

    Time1(int hour , int minut){
        this.hour = hour;
        this.minut = minut;
    }

    // void setTime(){
    //     this.hour = hour;
    //     this.minut = minut;
    // }

    void showTime()
    {
        System.out.println("Time : "+hour+":"+minut);
    }

    Time1 addTime(Time1 t){
        Time1 obj = new Time1();
        obj.minut = (this.minut+t.minut)%60;
        obj.hour = (this.hour+t.hour)+(this.minut+t.minut)/60;
        return obj;

    }
}

public class AssignmentReturningObject12{
    public static void main(String[] args) {
        Time1 t1 = new Time1(5 , 50);
        Time1 t2 = new Time1(5 , 40);
        Time1 t3 = new Time1();
        
        t1.showTime();
        t2.showTime();
        t3.showTime();
        System.out.println("====================================");
        t3 = t2.addTime(t1);

        t1.showTime();
        t2.showTime();
        t3.showTime();
    }
}