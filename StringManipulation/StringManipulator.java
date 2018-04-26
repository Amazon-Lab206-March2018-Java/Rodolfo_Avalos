public class StringManipulator{
    public String trimAndConcat(String first, String second){
        String a = first.trim();
        String b = second.trim();
        String result = a.concat(b);
        return result;
    }

    public Integer getIndexOrNull(String word, char letter){
        Integer result = word.indexOf(letter);
        if (result < 0){
            return null;
        }
        return result;
    }

    public Integer getIndexOrNull(String phrase, String piece){
        Integer result2 = phrase.indexOf(piece);
        if (result2 < 0){
            return null;
        }
        return result2;
    }

    public String concatSubstring(String str, int pos1, int pos2, String add){
        return str.substring(pos1, pos2).concat(add);
    }
}