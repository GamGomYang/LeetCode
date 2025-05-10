//ltc36
import java.util.HashSet;
import java.util.Set;


public class Solution{


    public boolean isValidSudoku(char[][] board) {

        Set<Character>[] row = new HashSet[9];
        Set<Character>[] column = new HashSet[9];
        Set<Character>[] squ = new HashSet[9];
        
        for(int i=0 ; i< 9 ; i++){

            row[i] = new HashSet<>();
            column[i] = new HashSet<>();
            squ[i] = new HashSet<>();
        }

        for(int i=0 ; i<9 ; i++){

            for(int k =0 ; k<9 ; k++){

                char c = board[i][k];

                if( c == '.'){
                    continue;
                }

                int squ_index = (i/3)*3 +(k/3);

                if( row[i].contains(c)||column[k].contains(c)||squ[squ_index].contains(c)){
                    return false;
                }
                else{
                    row[i].add(c);
                    column[k].add(c);
                    squ[squ_index].add(c);
                }
            }
        }

        return true;

    }


    
}