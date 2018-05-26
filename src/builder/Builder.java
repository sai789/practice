package builder;

public class Builder {
    private String name;
    public Builder(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public String makeRow(int n, String s){
        StringBuilder result = new StringBuilder();
        for (int i=1;i<=n;i++){
            result.append(s);
        }
        return result.toString();
    }
    public void makePyramid(int n, String s){
        for (int i=0;i<=n/2;i++){
            String result = "";
            result += makeRow(n/2 - i, "-");
            result += makeRow(i*2 + 1, s);
            result += makeRow(n/2 - i, "-");
            System.out.println(result);
        }
    }
}
