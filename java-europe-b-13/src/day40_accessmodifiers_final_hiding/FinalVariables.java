package day40_accessmodifiers_final_hiding;

public class FinalVariables {


        public final int ROADSTER_MAX_RANGE = 600;
        public final int MODEL_3_MAXSPEED;
        public final int MODEL_X_PASSENGERS;
        public static final String ADMIN_USERNAME;

    static {
        ADMIN_USERNAME = "Mike";
    }

    public FinalVariables() {

            MODEL_3_MAXSPEED = 200;
        /* ADMIN_USERNAME = "OZZY"; */

        }

        {

            MODEL_X_PASSENGERS = 7;


        }

        public static void main (String[]args){

        FinalVariables finalVars = new FinalVariables();
            System.out.println(finalVars.MODEL_3_MAXSPEED);
            System.out.println(finalVars.MODEL_X_PASSENGERS);
            System.out.println(finalVars.ROADSTER_MAX_RANGE);
            System.out.println(FinalVariables.ADMIN_USERNAME);


        }

    }
