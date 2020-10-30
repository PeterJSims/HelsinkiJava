
public class Statistics {

    private int count;
    private int sum;
    
    public Statistics() {
        this.count = 0;
        this.sum = 0;
    }

    

    public void addNumber(int number) {
       sum += number;
       count++;
    }

    public int getCount() {
        return count;
    }
    
    public int sum(){
        return sum;
    }
    
    public double average(){
        return count != 0 ? sum * 1.0 / count : 0;
    }
}
