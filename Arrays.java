public class Arrays {

    public static void main(String[] args) {
        int[] p1 = {11,14,15,17,19};
        int[] p2 = {12,16,13,18,17};
        String[] names = {"harshit","mayur"};

        for(int i = 0; i<p1.length; i++){
            System.out.println(p1[i]);
        }

        // for each loop
        for(int var : p1){
            System.out.println(var);
        }

        int[][] matrix = {
                {12,45,67},
                {54,68,85}
        };
        for(int rows=0; rows<=1; rows++){
            for(int cols=0; cols<=2; cols++){
                System.out.print(matrix[rows][cols]+"\t");
            }
            System.out.println();
        }
        System.out.println("FOR EACH LOOP");
        for(int[] row : matrix){
            for(int var : row){
                System.out.println(var);
            }
        }
    }

}
