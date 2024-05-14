// array of objects
class objectsArray {
    int a;

    void setA(int x) {
        a = x;
    }

    void show() {
        System.out.println(a);
    }
}

class arrayofobject {
    public static void main(String[] args) {
        objectsArray obj[] = new objectsArray[5];
        for (int i = 0; i <= 4; i++) {
            obj[i] = new objectsArray();
            obj[i].setA(i + 10);
        }
        for (int i = 0; i <= 4; i++) {
            obj[i].show();
        }
    }
}