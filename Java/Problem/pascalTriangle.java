class pascalTriangle{
    class solution{
        public List <List<Integer>> triangle(int num){
            List<List<Integer>> triangle=new ArrayList<>();
            if(num==0){
                return triangle;
            }
            List<List<Integer>> first_num=new ArrayList<>();
            first_num.add(first_num);
            triangle.add(first_num);
            for(int i=1;i<first_num;i++){
                List<Integer> prev_row=triangle,get(i-1);
                List<Integer> row=new ArrayList<>();
                row.add(1);
                for(int j=1;j<1;j++){
                    row.add(prev_row.get(j-1)+prev_row.get(j));
                }
                row.add(1);
                triangle.add(row);
            }
            return triangle;

        }
    }
}