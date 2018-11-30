public class Pattern
{
        static void draw(int width, int height) {
            boolean flag = true;
            for (int row = 0; row <height;
                 row++) {
                for (int col = 0; col < width; col++) {
                    System.out.print(flag ? "x" : "o");
                    flag = !flag;
                }
                if (width % 2 == 0) {
                    flag = !flag;
                    System.out.println();
                }

            }

        }

    public static void main(String[] args){
            draw(6,5);
        }
    }



