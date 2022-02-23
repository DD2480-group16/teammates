package teammates.logic.core;

import java.util.HashMap;
import java.util.Map;

public class FredCoverage {
    private static Map<Integer, Boolean> flags;

    public void set_flag(int flag_index, Boolean value){
        this.flags.put(flag_index, value);
    }

    public void flags_init(int flag_count){
        flags = new HashMap<Integer, Boolean>();
        for (int i = 0; i < flag_count; i++){
            set_flag(i, false);
        }
    }

    public FredCoverage(int branch_size){
        if (this.flags == null){
            flags_init(branch_size);
        }
    }

    public String print_results(){
        int visited_flags = 0;
        boolean flag_is_met = false;
        String return_string = "";
        String missed_flags_string = "";

        for (int i = 0; i < flags.size(); i++){
            flag_is_met = flags.get(i);
            if (flag_is_met){
                visited_flags += 1;
            } else {
                missed_flags_string += Integer.toString(i) + ", ";
            }

        }
        return_string += "FredCoverage Results: \n";
        return_string += "Total Flags: " + Integer.toString(flags.size()) + ", Visited: "
                + Integer.toString(visited_flags) + ", Missed: "
                + Integer.toString(flags.size() - visited_flags) + "\n";
        return_string +="IDs of Missed Flags: " + missed_flags_string + "\n";


        System.out.println(return_string);
        return return_string;
    }
}