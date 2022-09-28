public class IsAnagram {

        static boolean isAnagram(String a, String b) {
            char[] ac = a.toLowerCase().toCharArray();
            char[] bc = b.toLowerCase().toCharArray();
            char temp;
            char btemp;
            for(int i = 0; i< ac.length; i++){
                for(int j = i + 1 ; j < ac.length; j++){
                    if(ac[i] > ac[j]){
                        temp = ac[i];
                        ac[i] = ac[j];
                        ac[j]= temp;
                    }
                }
            }
            for(int i = 0; i< bc.length; i++){
                for(int j = i + 1 ; j < bc.length; j++){
                    if(bc[i] > bc[j]){
                        btemp = bc[i];
                        bc[i] = bc[j];
                        bc[j]= btemp;
                    }
                }
            }
            String acc = new String(ac);
            String bcc = new String(bc);
            return acc.equals(bcc);
        }
    }


