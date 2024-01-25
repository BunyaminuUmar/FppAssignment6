import java.util.Arrays;

public class MyTable {

    public static void main(String[] args) {
        MyTable t = new MyTable();
        t.add('a', "Andrew");
        t.add('b', "Billy");
        t.add('w', "Willie");

        t.printEntries();
        // Output:
        // a->Andrew
        // b->Billy
        // w->Willie
    }

    private static class Entry {
        char key;
        String value;

        Entry(char key, String value) {
            this.key = key;
            this.value = value;
        }
        @Override
        public String toString() {
            return key + "->" + value;
        }
    }

    private Entry[] entries = new Entry[26];

    public void add(char key, String value) {
        int index = key - 'a';
        entries[index] = new Entry(key, value);
    }
    public String get(char key) {
        int index = key - 'a';
        if (entries[index] != null) {
            return entries[index].value;
        } else {
            return null;
        }
    }
    public void printEntries() {
        StringBuilder result = new StringBuilder();
        for (Entry entry : entries) {
            if (entry != null) {
                result.append(entry).append("\n");
            }
        }
        System.out.print(result);
    }
}
