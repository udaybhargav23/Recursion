public static ArrayList<String> powerSet(String s)
{
        // Your code here
        ArrayList<String> x = new ArrayList<>();
        if (s.length()==1){
                x.add(s);
        }else if (s.length()==2){
                x.add(s.substring(0,1));
                x.add(s.substring(1)); 
                x.add(s.substring(0,2)); 
        }else{
                x=powerSet(s.substring(1));
                x.add(s.substring(0,1));
                int i=1;
                int n=x.size();
                while (i<n-1){
                        x.add(s.substring(0,1)+x.get(i));
                        i+=1;
                }
        }
        x.add(0,"");
        while (x.get(1)==""){
               x.remove(1);
        }
        return x;
}
