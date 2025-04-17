class Solution {
    public String solution (String phone_number) {
        char[] characters = phone_number.toCharArray();
        for (int i = 0; i < characters.length - 4; i++) {
            characters[i] = '*';
        }
        return String.valueOf(characters);
    }
}