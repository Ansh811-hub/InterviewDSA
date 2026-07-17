package LinkedList;
import java.util.Iterator;
import java.util.LinkedList;

    public class MiddleOFLL {
        public static void main(String[] args) {

            LinkedList<Integer> list = new LinkedList<>();

            list.add(10);
            list.add(20);
            list.add(30);
            list.add(40);
            list.add(50);
            list.add(60);

            Iterator<Integer> it = list.iterator();

            int index = 0;
            int middleIndex = list.size() / 2;

            while (it.hasNext()) {
                int value = it.next();

                if (index == middleIndex) {
                    System.out.println(value);
                    break;
                }

                index++;
            }
        }
    }

