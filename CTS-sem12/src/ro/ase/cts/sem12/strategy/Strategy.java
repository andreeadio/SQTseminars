package ro.ase.cts.sem12.strategy;

interface TextFormatter {
    String format(String text);
}

class UppercaseFormatter implements TextFormatter {
    public String format(String text){
        return text.toUpperCase();
    }
}

class LowercaseFormatter implements TextFormatter {
    public String format(String text){
        return text.toLowerCase();
    }
}

class CamelCaseFormatter implements TextFormatter {
    public String format(String text ){
        String[] words = text.split(" ");
        StringBuilder result = new StringBuilder(words[0].toLowerCase());
        for (int i=1; i <words.length; i++){
            result.append(words[i].substring(0,1).toUpperCase())
                    .append(words[i].substring(1).toLowerCase());
        }

        return result.toString();
    }
}


class TextEditor {
    private TextFormatter formatter;

    public TextEditor(TextFormatter formatter)
    {
        this.formatter = formatter;
    }

    public void  setFormatter(TextFormatter formatter)
    {
        this.formatter = formatter;
    }

    public String formatText(String text)
    {
        return formatter.format(text);
    }
}

 class StrategyPAtternExample {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor(new UppercaseFormatter());

        String text = "Hello World";
        System.out.println("Original Text: " + text);
        System.out.println("Uppercase: "+ editor.formatText(text));
        editor.setFormatter(new LowercaseFormatter());
        System.out.println("Lowercase: "+ editor.formatText(text));
        editor.setFormatter(new CamelCaseFormatter());
        System.out.println("Lowercase: "+ editor.formatText(text));


    }
}