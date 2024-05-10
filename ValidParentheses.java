class ValidParentheses{
    public static void main(String[] args)
    {
        ArrayList<String> parenthesSeries = generateParenthesis(5);

        for (String p : parenthesSeries) {
            System.out.println(p);
        }
    }

  

    private static ArrayList<String> generateParenthesis(int howManyPairs) {
        ArrayList<String> result = new ArrayList<>();
        String initialString = "";

        recurOverParentheses(result, initialString, howManyPairs, howManyPairs);

        return result;
    }

    private static void recurOverParentheses(ArrayList<String> result, String currentString, int opening, int closing)
    {
        if (opening == 0 && closing == 0) result.add(currentString);
        if (opening > closing || opening < 0 || closing < 0) return;

        String stringPlusLeft = currentString + "(";
        recurOverParentheses( result, stringPlusLeft,opening - 1, closing);

        String stringPlusRight = currentString + ")";
        recurOverParentheses(result, stringPlusRight, opening, closing - 1);

    }
}









