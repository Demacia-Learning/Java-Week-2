package src;

class GradeSerialiser {
    String grade;
    
    public GradeSerialiser setGrade() { this.grade = System.console().readLine("Enter your Grade: "); return this; }
    public void gradeSerialiser() {
        String institution;
        switch (this.grade.toLowerCase()) {
            case "a": institution = "primary"; break;
            case "b": institution = "primary"; break;
            case "c": institution = "primary"; break;
            case "d": institution = "primary"; break;
            case "e": institution = "primary"; break;
            case "f": institution = "primary"; break;

            case "g": institution = "middle"; break;
            case "h": institution = "middle"; break;
            case "i": institution = "middle"; break;
            
            case "j": institution = "high"; break;
            case "k": institution = "high"; break;
            case "l": institution = "high"; break;

            default: institution = "What the heck";
        }
        System.out.println(institution);
    }
}
