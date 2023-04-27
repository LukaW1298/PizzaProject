package omi11.time;

import omi11.exceptions.IllegalTimeSlotException;

public class TimeSlot {
    private Integer fromHour;
    private Integer fromMinute;
    private Integer toHour;
    private Integer toMinute;

    public TimeSlot(Integer fromHour, Integer fromMinute, Integer toHour, Integer toMinute) {
        //old and obsolet code that diesen't Work
//        if (!(fh >= 0 && fh <= 23)) {
//            System.out.println("From Hour must be between 0 and 23!");
//        }else if (!(fm >= 0 && fm <= 59)) {
//            System.out.println("From Minute must be between 0 and 59!");
//        }else if (!(th >= 0 && th <= 23)) {
//            System.out.println("To Hour must be between 0 and 23!");
//        }else if (!(tm >= 0 && tm <= 59)) {
//            System.out.println("To Minute must be between 0 and 59!");
//        }else {
//            this.fromHour = fh;
//            this.toMinute = tm;
//            this.toHour = th;
//            this.fromMinute = fm;
//        }
        assignParameterOfConstructorToObjectVariables(fromHour,fromMinute,toHour,toMinute);
    }

    //input: "hh:mm-hh:mm"
    public TimeSlot(String timeslot) {
        String[] timeslotStringArray = new String[timeslot.length()];

        // put timeslot character for character into a new StringArray(timeslotStringArray)
        for (int i = 0; i <= timeslot.length() -1; i++) {
            timeslotStringArray[i] = timeslot.substring(i,i+1);
        }

        // Define content of parameters for Constructor of TimeSpan wich builds TImeSpan Object based on Integer Inputs
        Integer fromHour   = Integer.parseInt (timeslotStringArray[0] + timeslotStringArray[1]);  //[hh]:mm-hh:mm
        Integer fromMinute = Integer.parseInt (timeslotStringArray[3] + timeslotStringArray[4]);  //hh:[mm]-hh:mm
        Integer toHour     = Integer.parseInt (timeslotStringArray[6] + timeslotStringArray[7]);  //hh:mm-[hh]:mm
        Integer toMinute   = Integer.parseInt (timeslotStringArray[9] + timeslotStringArray[10]); //hh:mm-hh:[mm]

            assignParameterOfConstructorToObjectVariables(fromHour,fromMinute,toHour,toMinute);
        }

        /*
            //Pattern pattern = Pattern.compile("\\d{2}-\\d{2}-\\d{4}");
        ArrayList<Integer> finalTimeValues = new ArrayList();

        try {
            String[] timeSpanArray = timeslot.split("-");
            for (String timeSpan : timeSpanArray) {
                System.out.println(timeSpan);


                String[] time = timeSpan.split(":");

                try {
                    for (int timeElement: finalTimeValues) {
                        System.out.println("TimeElement: " + timeElement);
                    }

                    this.fromHour = finalTimeValues.get(0);
                    this.fromMinute = finalTimeValues.get(1);
                    this.toHour = finalTimeValues.get(2);
                    this.toMinute = finalTimeValues.get(3);

                } catch (Exception e) {
                    System.out.println("An Error occurred assigning the parsed inputstring to objectvalues!\n" + e);
                }
            }
        }
        catch (Exception e) {
            System.out.println("An Error has occurred while parsing the timeSpan from String to TimeSpan-Object!\n" + e.getStackTrace());
        }
    } */

    @Override
    public String toString() {
        //Define String output - change Integer Value to valid TimeFormat (hh:mm-hh:mm)-
        return returnGivenTimeInDoubleDigitFormat(this.fromHour) + ":" + returnGivenTimeInDoubleDigitFormat(this.fromMinute) + "-" + returnGivenTimeInDoubleDigitFormat(this.toHour) + ":" + returnGivenTimeInDoubleDigitFormat(this.toMinute);
    }

    private static String returnGivenTimeInDoubleDigitFormat(Integer inputTime) {

        if (inputTime < 10){
            return switch (inputTime) {
                case 0 -> "00";
                case 1 -> "01";
                case 2 -> "02";
                case 3 -> "03";
                case 4 -> "04";
                case 5 -> "05";
                case 6 -> "06";
                case 7 -> "07";
                case 8 -> "08";
                case 9 -> "09";
                default -> "!!!ERROR!!! - couldn't convert TimeSpan to double digit format";
            };
        } //end if
        return inputTime.toString();
    }

    private void assignParameterOfConstructorToObjectVariables(Integer fromHour, Integer fromMinute, Integer toHour, Integer toMinute) {
        this.fromHour = (fromHour >= 0 && fromHour <= 23) ? fromHour : -1;
        this.fromMinute = (fromMinute >= 0 && fromMinute <= 59) ? fromMinute : -1;
        this.toHour = (toHour >= 0 && toHour <= 23) ? toHour : -1;
        this.toMinute = (toMinute >= 0 && toMinute <= 59) ? toMinute : -1;

        try {
            if (fromHour == -1 || fromMinute == -1 || toHour == -1 || toMinute == -1) {
                throw new IllegalTimeSlotException("Invalid timespan format! the timespan has to be defined in thi Format: \"hh:mm-hh:mm\".");
            }
        }catch(IllegalTimeSlotException e){
            System.out.println(e.getMessage());
        }
    }
}
