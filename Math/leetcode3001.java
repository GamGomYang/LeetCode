
import java.util.*;

class Solution {
    public int maxBottlesDrunk(int numBottles, int numExchange) {

        int bottles = numBottles;
        int change = numExchange;
        int bottlesDrunk=0;
        int emptyBottles =0;

        while(bottles> 0){
            bottlesDrunk +=1;
            bottles -= 1;
            emptyBottles +=1;

            if(emptyBottles == change){
                emptyBottles =0;
                bottles +=1;
                change++;
            }

        }

        return bottlesDrunk;

        }

        
    }



