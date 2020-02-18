import java.util.ArrayList;

public class BookingSystem {
    private ArrayList<Integer> list = new ArrayList<>();
    public ArrayList<Integer> booking(Integer[] hours) {
        for(int n = 0; n < hours.length; n++) {
            if (hours[n] < 0 || hours[n] > 23) throw new IllegalArgumentException("В сутках только 24 часа!");
            if (list.contains(hours[n])) throw new IllegalArgumentException("Номер на этот час уже забронирован");
            list.add(hours[n]);
        }
        return list;
    }
}
