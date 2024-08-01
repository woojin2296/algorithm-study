class Solution {
    public String solution(String letter) {
        String[] morse = letter.split(" ");
        String answer = "";
        for (String str : morse) {
            switch(str) {
                case ".-":
                    answer = answer + "a";
                    break;
                case "-...":
                    answer = answer + "b";
                    break;
                case "-.-.":
                    answer = answer + "c";
                    break;
                case "-..":
                    answer = answer + "d";
                    break;
                case ".":
                    answer = answer + "e";
                    break;
                case "..-.":
                    answer = answer + "f";
                    break;
                case "--.":
                    answer = answer + "g";
                    break;
                case "....":
                    answer = answer + "h";
                    break;
                case "..":
                    answer = answer + "i";
                    break;
                case ".---":
                    answer = answer + "j";
                    break;
                case "-.-":
                    answer = answer + "k";
                    break;
                case ".-..":
                    answer = answer + "l";
                    break;
                case "--":
                    answer = answer + "m";
                    break;
                case "-.":
                    answer = answer + "n";
                    break;
                case "---":
                    answer = answer + "o";
                    break;
                case ".--.":
                    answer = answer + "p";
                    break;
                case "--.-":
                    answer = answer + "q";
                    break;
                case ".-.":
                    answer = answer + "r";
                    break;
                case "...":
                    answer = answer + "s";
                    break;
                case "-":
                    answer = answer + "t";
                    break;
                case "..-":
                    answer = answer + "u";
                    break;
                case "...-":
                    answer = answer + "v";
                    break;
                case ".--":
                    answer = answer + "w";
                    break;
                case "-..-":
                    answer = answer + "x";
                    break;
                case "-.--":
                    answer = answer + "y";
                    break;
                case "--..":
                    answer = answer + "z";
                    break;
            }
        }
        return answer;
    }
}