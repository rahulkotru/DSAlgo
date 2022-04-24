class uniqueEmail{
    class Solution {
        public int uniqueNames(String[] emails){
            HashSet<String> uniqueMail=new HashSet();
            for (String email: emails){
                int splitPosition =email.indexOf("@");
                String localeName=email.substring(0,splitPosition);
                String domainName=email.substring(splitPosition);
            }
        }
    }
    public static void main(String[]args){

    }

}