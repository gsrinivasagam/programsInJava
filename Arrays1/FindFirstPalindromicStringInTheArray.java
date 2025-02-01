public class FindFirstPalindromicStringInTheArray {
    public static void main(String[] args) {
//        String[] words = {"umicrszeaswtfmctwvoogehszwdjrwdcgyxxetbzevxrqphubyqbgpfetguyv","vzdzfwyevkvqhmvqssnvpayihawydzcovzmh","drvqqepesvornphmikbimxennygxisdysssmxjmaaecaqiwdgfxitoopigxauoojsebjmbcrymvpnnfomlkg","vvszfvtykdyfiywxgxmjpcawzdaovbujmexggwczovhspkrdsskxzrpgfaspnbncdspktcyfkkshpyojwwlysizd","epdtgfhgninnwqzztwm","dmhynaogcxyaxsghzjwzyqfuwyinstxoqcdkxeobinpqeplw","ruhxgdrzfyqyqmxclfqosyczqapiizxlzgixdxthhrv","dwcblqnxtrwtqmtqenidhxnifdbmdvobwmcvwjxgbyjzgvrqzlskjbfirauguhyyjhlotuckssrkqzppzbqd","gxdq","paesyowqeguvxozbixjqppeagycjx","glstauwugkidegnllapgzbzchckepmhbameuigsiqywbilwolxuwzzjwzouqknhlkbjzejxtponmkqjlojurxnryxyqy","inyhioiwanafuhsprudtkqztoakxhbmqcmibsxlhycbmqrvtfabsncmiymthcxwkwkq","djknenppuleedpptrfjgqfejcoghnxjlvjalxkyvnujgiiwdbtvgqvgsivkzqcrbfcvooyhqmrlacyiozytmampjwpknrj","zzrpjoogwkdmdxdkdwgwugqtmzryrgtelnvydyqewpdzzptqzvffppgnhhcaiqotmyslntlwjajzuzbawidpxjtyxryg","xmegifttkamzbpjqbghgwdrkvtnuwfmjdmwehdqiyvgpxxlbkcvkemjbmhbyeqyfssytuwaeysvgnidhcgpncxdxxzhrkbvyqfrs"};

        String[] words = {"abc","car","ada","racecar","cool"};
                System.out.println(firstPalindrome(words));
    }

    public static String firstPalindrome(String[] words) {
        for (String word : words) {
            boolean flag = true;
            int left = 0;
            int right = word.length() - 1;

            for (int i = 0; i < words.length/2; i++) {
                if (word.charAt(left) != word.charAt(right)) {
                    flag = false;
                    break;
                }
                left++;
                right--;
            }

            if (flag)
                return word;

        }

        return "";
    }
}
