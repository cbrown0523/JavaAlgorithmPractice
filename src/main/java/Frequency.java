public class Frequency {
    public static void main(String[] args) {
        int arr[] = {1, 2,3 ,3,1};
        int freq[] = new int[arr.length];
        int visited = -1;
        for (int i = 0; i < arr.length; i++) {
            int count = 1;
            System.out.println("arr[i]" + " " + arr[i]);
            for (int j = i + 1; j < arr.length; j++) {
                System.out.println("arr[j]" + " " + arr[j]);

                if (arr[i] == arr[j]) {
                    count++;
                    freq[j] = visited;
                    System.out.println("freq[j]" + " " + freq[j]);
                    System.out.println("freq[i]" + " " + freq[i]);

                }
                System.out.println("123freq[i]" + " " + freq[i]);
                System.out.println("sdsdfreq[j]" + " " + freq[j]);


                if (freq[i] != visited) {
                    freq[i] = count;
                    System.out.println("freq[i]" + " " + freq[i]);
                }
            }
        }
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] != visited) {
                System.out.println(arr[i] + " " + freq[i]);
            }
        }
    }}

