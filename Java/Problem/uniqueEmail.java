class uniqueEmail{
    class Solution {
        public int uniqueNames(String[] emails){
            HashSet<String> uniqueMail=new HashSet();
            for (String email: emails){
                int splitPosition =email.indexOf("@");
                String localeName=email.substring(0,splitPosition);
                String domainName=email.substring(splitPosition);

                if(localeName.contains("+")){
                    int plusIndex=localeName.indexOf("+");
                    localeName=localeName.substring(0,plusIndex);
                }
                localeName=localeName.replaceAll("\\.","");
                String newName=localeName+domainName;
                uniqueMail.add(newName);
            }
        }
    }
    public static void main(String[]args){

    }

}