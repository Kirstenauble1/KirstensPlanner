public class Task implements Comparable<Task>{

    private String Name;
    
    private int monthDue;
    
    private int dayDue;

    private String course;

    private int rating;

    Task(String Name, String dueDate, String course, int rating) {
        this.Name = Name;
        this.course = course;
        this.course = course;
        this.rating = rating;
        this.dayDue = day(dueDate);
        this.monthDue = month(dueDate);
    }

    public int month(String dueDate) {
        String month = "";
        int i = 0;
        boolean isInt = true;
        while(isInt) {
            try {
                Integer.parseInt(String.valueOf(dueDate.charAt(i)));
            }catch(NumberFormatException e) {
                isInt = false;
            }
            if(isInt) {
                month = month.concat(String.valueOf(dueDate.charAt(i)));
                i++;
            }
        }
        return Integer.parseInt(month);
    }

    public int day(String dueDate) {
        int firstDayChar = 1;
        for (int i = 0; i < dueDate.length(); i++) {
            if (dueDate.charAt(i) == '/') {
                firstDayChar = i + 1;
            }
        }
        String day = "";
        int a = firstDayChar;
        boolean isInt = true;
        while(isInt) {
            try {
                Integer.parseInt(String.valueOf(dueDate.charAt(a)));
            }catch(NumberFormatException e) {
                isInt = false;
            }
            if(isInt) {
                day = day.concat(String.valueOf(dueDate.charAt(a)));
                a++;
            }
        }
        return Integer.parseInt(day);
    }

    @Override
    public int compareTo(Task task) {
        if (this.monthDue < task.monthDue) {
            return 1;
        }else if (this.monthDue == task.monthDue) {
            if(this.dayDue < task.dayDue) {
                return 1;
            }else if(this.dayDue == task.dayDue) {
                return 0;
            }
        }
        return -1;
    }

}
