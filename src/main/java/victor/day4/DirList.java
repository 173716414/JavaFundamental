package victor.day4;

/**
 * @Author：Victor_htq
 * @Package：victor.day4
 * @Project：JavaFaundamental
 * @name：DirList
 * @Date：2023/10/10 16:54
 * @Filename：DirList
 */
import java.io.File;

public class DirList {
    public static void main(String args[]) {
        String dirname = "F:\\Learning\\JavaFaundamental";
        File f1 = new File(dirname);
        if (f1.isDirectory()) {
            System.out.println("目录 " + dirname);
            String[] s = f1.list();
            for (int i = 0; i < s.length; i++) {
                File f = new File(dirname + "/" + s[i]);
                if (f.isDirectory()) {
                    System.out.println(s[i] + " 是一个目录");
                } else {
                    System.out.println(s[i] + " 是一个文件");
                }
            }
        } else {
            System.out.println(dirname + " 不是一个目录");
            // Exception
        }
    }
}
