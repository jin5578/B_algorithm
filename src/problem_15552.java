import java.io.*;

public class problem_15552 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine().trim());

        for(int i = 0; i < num; i++) {
            String str = br.readLine();

            String[] str_array = str.split(" ");

            int a = Integer.parseInt(str_array[0]);
            int b = Integer.parseInt(str_array[1]);

            bw.write((a + b) + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
