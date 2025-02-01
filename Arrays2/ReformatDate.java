public class ReformatDate {
    public static void main(String[] args) {
        String date = "6th Jun 1933";
        System.out.println(reformatDate(date));
    }

    public static String reformatDate(String date) {
        String[] string = date.split(" ");
        StringBuilder sb = new StringBuilder();
        sb.append(string[2]+"-");
        switch(string[1]){
            case "Jan":
                sb.append("01-");
                break;
            case "Feb":
                sb.append("02-");
                break;
            case "Mar":
                sb.append("03-");
                break;
            case "Apr":
                sb.append("04-");
                break;
            case "May":
                sb.append("05-");
                break;
            case "Jun":
                sb.append("06-");
                break;
            case "Jul":
                sb.append("07-");
                break;
            case "Aug":
                sb.append("08-");
                break;
            case "Sep":
                sb.append("09-");
                break;
            case "Oct":
                sb.append("10-");
                break;
            case "Nov":
                sb.append("11-");
                break;
            case "Dec":
                sb.append("12-");
                break;
        }
        System.out.println("length--- "+string[0]);
        if(string[0].length()==3)
            sb.append("0"+string[0].substring(0,1));
        else
            sb.append(string[0].substring(0,2));

        return sb.toString();
    }
}
