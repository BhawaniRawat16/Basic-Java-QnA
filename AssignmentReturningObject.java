class Time {
    int minut;
    int hour;
    String time;
    int second;

    Time() {
        minut = 0;
        hour = 0;
        time = "00:00";
        second=0;
    }

    Time(int hour, int minut, int second) {

        this.minut = minut;
        this.hour = hour;
        this.second = second;
    }

    void show() {
        System.out.println("Time : " + hour + ":" + minut+" : "+second);
    }

    Time addTime(Time t) {

        Time obj = new Time();
        obj.second = (this.second+t.second)%60;
       obj.minut =(this.minut+t.minut)%60+(this.second+t.second)/60;
       obj.hour = (this.hour+t.hour)+(this.minut+t.minut)/60;

        return obj;
    }
}

public class AssignmentReturningObject {

    public static void main(String[] args) {
        Time t1 = new Time();
        
        Time t2 = new Time(5, 20,90);
        Time t3 = new Time(5, 50,40);
        Time t4 = new Time();

        t1.show();
        t2.show();
        t3.show();
        t4.show();
        System.out.println("=====================================");

        t4 = t2.addTime(t3);

        t1.show();
        t2.show();
        t3.show();
        t4.show();

    }
}
 