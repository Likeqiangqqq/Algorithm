import java.util.*;

public class CatDogAsylum {
    public ArrayList<Integer> asylum(int[][] ope) {
        ArrayList<Integer> input=new ArrayList<>();
        ArrayList<Integer> output=new ArrayList<>();
        for(int i=0;i<ope.length;i++){
            switch(ope[i][0]){
                    case 1:
                    input.add(ope[i][1]);
                    break;
                case 2:
                    if(ope[i][1]==0){
                        for(int j=0;j<input.size();j++){
                            if(input.get(j)!=0){
                                output.add(input.get(j));
                                input.set(j,0);
                                break;
                            }
                        }
                    }else if(ope[i][1]==1){
                        for(int j=0;j<input.size();j++){
                            if(input.get(j)>0){
                                output.add(input.get(j));
                                input.set(j,0);
                                break;
                            }
                        }
                    }else{
                        for(int j=0;j<input.size();j++){
                            if(input.get(j)<0){
                                output.add(input.get(j));
                                input.set(j,0);
                                break;
                            }
                        }
                    }
            }
            
        }
        return output;
    }
}