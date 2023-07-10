public class StringCalculator {
    
    int add(String input){

        if(input == null){
            return 0;
        }
        if(input.isEmpty()){
            return 0;
        }

        int res=0;
        
        if(input.contains("//")){
            int a = input.indexOf("//");
            int b = input.indexOf("\\n");
            String temp = input.substring(a+2,b);
            int temp2 = input.length();
            res = addloop(temp, input.substring(b+2, temp2));

        }
        else if(input.contains(":") && input.contains(":")){
            input = input.replace(",",":");
            res = addloop(":", input);
        }
        else if(input.contains(":")){
            res = addloop(":", input);
        }
        else if(input.contains(",")){
            res = addloop(",", input);
        }
        
        return res;
    }

    int addloop(String name,String intput){
        int result = 0;
        String[] splitInput = intput.split(name);
        
        for(int i=0; i < splitInput.length; i++){
            result = result + Integer.parseInt(splitInput[i]);
        }

        return result;
    }

}
